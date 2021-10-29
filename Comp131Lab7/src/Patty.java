import java.awt.Color;
import java.awt.Graphics;

public class Patty extends GraphicsObject {

    int width;
    int height;


    public Patty(int x, int y) {
        super(x, y);
        this.width = width;
        this.height =  height;

        // TODO Auto-generated constructor stub

    }


    @Override
    public void draw(Graphics g) {
        // change the color of the pen

        g.setColor(new Color(80, 35, 25));

        int xpoints[] = {this.x,this.x + 15, this.x + 45, this.x + 20, this.x + 30, this.x, this.x + 30, this.x + 20,
        this.x + 45, this.x + 15};
        int ypoints[] = {this.y, this.y + 30, this.y + 30, this.y + 45, this.y + 60, this.y + 50, this.y + 60,
                this.y + 45, this.y + 30, this.y + 30};
        int npoints = xpoints.length;
        g.drawPolygon(xpoints,ypoints,npoints);
        g.fillPolygon(xpoints,ypoints,npoints);




        //g.drawPolygon(new int[] {10,20,30}, new int[] {100,20,100}, 3);
        // draw the rectangle
        // g.fillPolygon(this.x, this.y, this.width, this.height);
    }

}
