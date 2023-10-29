import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class NotARectangle implements Sprite {
    private int width;
    private int height;

    public NotARectangle(int width, int height){
        this.height = height;
        this.width = width;
    }

    public void draw(Graphics surface, int x, int y) {
        // Draw the object
        surface.fillOval(x, y, width, height);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawOval(x, y, width, height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
