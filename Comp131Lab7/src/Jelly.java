import java.awt.Color;
import java.awt.Graphics;

public class Jelly extends GraphicsObject {

    int width;
    int height;
    Color color;

    public Jelly(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height =  height;


        // TODO Auto-generated constructor stub

    }

    @Override
    public void draw(Graphics g) {
        //body
        g.setColor(new Color(220, 175, 220));
        // draw the rectangle
        g.fillRect(this.x, this.y, this.width - 30 , this.height - 30);

        //tentacles
        g.setColor(new Color(0, 0, 0));
        // draw the rectangle
        g.fillRect(this.x + 2, this.y + 30, this.width - 57, this.height - 50);
        g.fillRect(this.x + 10, this.y + 30, this.width - 57, this.height - 50);
        g.fillRect(this.x + 18, this.y + 30, this.width - 57, this.height - 50);
        g.fillRect(this.x + 26, this.y + 30, this.width - 57, this.height - 50);




        //g.drawPolygon(new int[] {10,20,30}, new int[] {100,20,100}, 3);
        // draw the rectangle
        // g.fillPolygon(this.x, this.y, this.width, this.height);
    }

}

