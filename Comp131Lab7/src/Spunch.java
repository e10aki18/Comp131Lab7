import java.awt.Color;
import java.awt.Graphics;

public class Spunch extends GraphicsObject {

    int width;
    int height;
    Color color;

    public Spunch(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height =  height;


        // TODO Auto-generated constructor stub

    }

    @Override
    public void draw(Graphics g) {
        //body
        g.setColor(new Color(240, 240, 0));
        // draw the rectangle
        g.fillRect(this.x, this.y, this.width , this.height);

        //legs
        g.setColor(new Color(0, 0, 0));
        // draw the rectangle
        g.fillRect(this.x + 15, this.y + 60, this.width - 56, this.height - 30);
        g.fillRect(this.x + 45, this.y + 60, this.width - 56, this.height - 30);

        g.fillRect(this.x + 4, this.y + 84, this.width - 45, this.height - 54);
        g.fillRect(this.x + 34, this.y + 84, this.width - 45, this.height - 54);

        //arms
        g.fillRect(this.x - 32, this.y + 30, this.width - 28, this.height - 56);
        g.fillRect(this.x + 60, this.y + 30, this.width - 28, this.height - 56);



        //g.drawPolygon(new int[] {10,20,30}, new int[] {100,20,100}, 3);
        // draw the rectangle
        // g.fillPolygon(this.x, this.y, this.width, this.height);
    }

}
