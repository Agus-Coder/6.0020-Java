import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    Bouncer movingBox;
    Bouncer movingOval;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        NotARectangle oval = new NotARectangle(15, 15);
        movingOval = new Bouncer(200, 70, oval);
        movingBox = new Bouncer(100, 170, box);
        movingBox.setMovementVector(3, 1);
        movingOval.setMovementVector(3, -7);

    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        movingBox.draw(surface);
        movingOval.draw(surface);
    }
}