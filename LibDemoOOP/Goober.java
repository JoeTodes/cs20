import processing.core.PApplet;

/**
 * Goober
 */
public class Goober {
    Canvas p;
    float r = 255;
    float g = 51;
    float b = 0;

    public Goober(Canvas parent) {
        p = parent;
        randomColor();
    }

    public void show() {
        System.out.println("showing");
        p.fill(r, g, b);
        p.circle(p.width / 2, p.height / 2, 100);

    }

    public void randomColor() {
        this.r = p.random(255);
        this.g = p.random(255);
        this.b = p.random(255);
        // show();
        System.out.println("r=: " + r);
    }

}