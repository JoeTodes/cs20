
/**
 * Goober
 */
public class Goober {

    float r = 255;
    float g = 51;
    float b = 0;

    public Goober() {

    }

    public void show(Canvas p) {
        System.out.println("showing");
        p.fill(r, g, b);
        p.circle(p.width / 2, p.height / 2, 100);

    }

    public void randomColor(float r, float g, float b) {
        this.r = r;
        this.g = g;
        this.b = b;
        // show();
        System.out.println("r=: " + r);
    }

}