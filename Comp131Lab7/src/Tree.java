import java.awt.Color;
import java.awt.Graphics;

public class Tree extends GraphicsObject {

    int width;
    int height;
    Color color;

    public Tree(int x, int y, Color color) {
        super(x, y);
        this.width = width;
        this.height =  height;
        this.color = color;

    // TODO Auto-generated constructor stub
    
  }

    //public void Tree(Graphics g){
        //int xValues[] = {x, x + 50, x + 25, x};
        //int yValues[] = {y, y, 145, y};
        //int points = 4;
    //  g.drawPolygon(new int[] {10,20,30}, new int[] {10,20,30}, 3);
   // }


    /* Draw the rectangle
     *
     * @param g The Graphics for the JPanel
     */
    @Override
    public void draw(Graphics g) {
        // change the color of the pen
        g.setColor(this.color);
        
        int xpoints[] = {this.x,this.x + 30, this.x + 60};
        int ypoints[] = {this.y, this.y - 60, this.y};
        int npoints = xpoints.length;
        g.drawPolygon(xpoints,ypoints,npoints);
        g.fillPolygon(xpoints,ypoints,npoints);

        int xpoints2[] = {this.x,this.x + 30, this.x + 60};
        int ypoints2[] = {this.y - 25, this.y - 85, this.y - 25};
        int npoints2 = xpoints.length;
        g.drawPolygon(xpoints2,ypoints2,npoints2);
        g.fillPolygon(xpoints2,ypoints2,npoints2);

        g.setColor(new Color(80, 35, 25));
        // draw the rectangle
        g.fillRect(this.x + 20, this.y, this.width + 20, this.height + 40);
        
        //g.drawPolygon(new int[] {10,20,30}, new int[] {100,20,100}, 3);
        // draw the rectangle
       // g.fillPolygon(this.x, this.y, this.width, this.height);
    }

}