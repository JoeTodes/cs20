import processing.core.PApplet;

public class Walker extends PApplet {
    int x;
    int y;

    public static void main(String[] args) {
        PApplet.main("Walker");
    }

    public void settings() {
        size(640, 480);
    }

    public void setup() {
        x = 640 / 2;
        y = 480 / 2;
        stroke(0);
        fill(255);
    }

    public void draw() {
        float r = random(1);
        if (r > 0.75) {
            x++;
        } else if (r > 0.5) {
            x--;
        } else if (r > 0.25) {
            y++;
        } else {
            y--;
        }

        circle(x, y, 5);
    }

}