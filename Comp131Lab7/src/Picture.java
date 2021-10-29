// utility stuff
import java.util.ArrayList;
import java.util.Random;

// graphics stuff
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Picture extends JPanel {
    private int canvasWidth;
    private int canvasHeight;

    private ArrayList<GraphicsObject> objects;

    /* Constructor for a window/canvas of a specified size
     *
     * @param width  The width of the canvas.
     * @param height The height of the canvas.
     */
    public Picture(int width, int height) {
	this.canvasWidth = width;
	this.canvasHeight = height;
	this.objects = new ArrayList<GraphicsObject>();
    }

    /* Creates the window and shows it
     */
    public void showCanvas() {
	JFrame frame = new JFrame("Picture");
	frame.getContentPane().add(this, BorderLayout.CENTER);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Dimension dim = new Dimension(this.canvasWidth, this.canvasHeight);
	frame.getContentPane().setPreferredSize(dim);
	frame.pack();
	frame.setVisible(true);
    }

    /* Convenience function to paint all objects.
     */
    public void paint() {
	this.paint(this.getGraphics());
    }

    /* Paint/Draw the canvas.
     *
     * This function overrides the paint function in JPanel. This function is
     * automatically called when the panel is made visible.
     *
     * @param g The Graphics for the JPanel
     */
    @Override
    public void paint(Graphics g) {
	// use a for-each loop to draw each object
	for (GraphicsObject obj : this.objects) {
	    obj.draw(g);
	}
    }

    /* Add an object to be draw.
     *
     * @param obj The object to draw.
     */
    public void addObject(GraphicsObject obj) {
	this.objects.add(obj);
    }

    public static void main(String[] args) {
	// make a picture that is 560x560 pixels
	Picture pic = new Picture(560, 560);

	// FIXME add the objects for your picture here

        pic.addObject(new Rectangle(0, 0, 560, 560, new Color(250, 250, 125)));

        for (int i = 0; i < 35; i++) {
        pic.addObject(new Rectangle(((int) (Math.random()*555)), ((int) (Math.random()*555)), 2, 2, new Color(0, 0, 0)));
        }

        pic.addObject(new Rectangle(0, 0, 560, 165, new Color(52, 222, 235)));

        for (int i = 0; i < 8; i++) {
            pic.addObject(new Tree(((int) (Math.random()*525 - 15)), ((int) (Math.random()*525 + 165)), new Color(5, 135, 5)));
        }

        pic.addObject(new Spunch(300, 300, 60, 60));

        pic.addObject(new Patty(200, 200,)); 
	//pic.addObject(new Rectangle(100, 150, 50, 50, new Color(154, 8, 178)));
	//pic.addObject(new Rectangle(300, 300, 150, 100, new Color(255, 255, 255)));

	// for something more complicated, uncomment the next line
	//pic.addObject(new Mondrian(0, 0));

	pic.showCanvas();
	pic.paint();
    }

}