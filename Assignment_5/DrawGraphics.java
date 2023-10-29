import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.lang.Math;

public class DrawGraphics {
    BouncingBox box;
    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
        box.setMovementVector(8, 6);

        boxes.add(new BouncingBox(200, 50, Color.GREEN));
        boxes.add(new BouncingBox(200, 50, Color.BLACK));
        boxes.add(new BouncingBox(200, 50, Color.YELLOW));

        int i = 1;

        for (BouncingBox boxie : boxes) {
            boxie.setMovementVector(3 * i * (int) Math.pow(-1, i), 5 * i * (int) Math.pow(-1, i));
            i++;
        }

    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawRoundRect(100, 100, 40, 40, 50, 25);
        surface.drawOval(100, 50, 80, 40);
        box.draw(surface);
        for (BouncingBox boxie : boxes) {
            boxie.draw(surface);
        }
    }
}
