import processing.core.PApplet;

/**
 * TenPrint
 */
public class TenPrint extends PApplet {
    int x = 0;
    int y = 0;
    float t = (float) 0.01;

    public static void main(String[] args) {
        PApplet.main("TenPrint");
    }

    public void settings() {
        size(480, 240);
    }

    public void setup() {
        background(0);

    }

    public void draw() {
        loadPixels();
        for (int i = 0; i < 480; i++) {
            for (int j = 0; j < 240; j++) {
                int index = i + (j * 480);
                // pixels[index] = color(random(255));
                /*
                 * float xOff = (float) (i * 0.01); float yOff = (float) (j * 0.01);
                 * pixels[index] = color(noise(xOff + t, yOff + t) * 255);
                 */
            }
        }
        updatePixels();
        t += 0.01;
    }
}