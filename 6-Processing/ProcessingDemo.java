import processing.core.PApplet;

public class ProcessingDemo extends PApplet {
    private final int WINDOW_WIDTH = 640;
    private final int WINDOW_HEIGHT = 480;

    public static void main(String[] args) {
        PApplet.main("ProcessingDemo");
    }

    public void settings() {
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    public void setup() {
        strokeWeight(3);
        stroke(255, 0, 255);
    }

    public void draw() {
        background(51);
        rect(mouseX, mouseY, 200, 100);
    }

    public void mouseClicked() {
        randomFill();
    }

    public void keyPressed() {
        if (keyCode == ENTER) {
            randomFill();
        }
    }

    public void randomFill() {
        float r = random(255);
        float g = random(255);
        float b = random(255);
        fill(r, g, b);
    }
}