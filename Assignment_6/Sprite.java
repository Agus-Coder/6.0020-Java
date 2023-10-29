import java.awt.Graphics;

public interface Sprite {

    void draw(Graphics surface, int leftX, int topY);

    int getWidth();

    int getHeight();
}