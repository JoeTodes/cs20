import processing.core.PApplet;

/**
 * TenPrint
 */
public class TenPrint extends PApplet {
    int res = 20;
    int w = 640;
    int h = 480;
    int x = 0;
    int y = 0;

    public static void main(String[] args) {
        PApplet.main("TenPrint");
    }

    public void settings() {
        size(w, h);
    }

    public void setup() {
        background(0);
    }

    public void draw() {
        stroke(255, 0, 255);
        strokeWeight(2);
        if (random(1) > 0.5) {
            line(x * res, y * res, x * res + res, y * res + res);
        } else {
            line(x * res + res, y * res, x * res, y * res + res);
        }
        x++;
        if (x >= w / res) {
            x = 0;
            y++;
        }
    }

}