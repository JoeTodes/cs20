import processing.core.PApplet;
import processing.core.PImage;

public class Pixels extends PApplet {

    PImage train;

    public static void main(String[] args) {
        PApplet.main("Pixels");
    }

    public void settings() {
        size(800, 416);
    }

    public void setup() {
        train = loadImage("train.jpg");
        image(train, 0, 0);

        loadPixels();

        for (int i = 0; i < pixels.length; i++) {
            float bright = brightness(pixels[i]);
            if (bright > 230) {

                pixels[i] = color(255);
            } else {
                pixels[i] = color(0);
            }
        }

        updatePixels();
    }

    public void draw() {

    }
}