public class Oval implements Sprite {
    private int height, width;
    private Color color;

    public Oval(int width, int height, Color color){
        // here we set the fields for the constructer
    }

    public void draw (Graphics surface, int x, int y){
        surface.setColot(color);
        surface.fillOval(x, y, width, height);
        surface.drawOval(x, y, width, height);
    }

    // and much more...
}