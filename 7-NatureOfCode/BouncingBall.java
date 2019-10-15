import processing.core.PApplet;

public class BouncingBall extends PApplet {
    float x;
    float y;

    float xSpeed = 1;
    float ySpeed = 1.5f;

    public static void main(String[] args) {
        PApplet.main("BouncingBall");
    }

    public void settings() {
        size(640, 480);
    }

    public void setup() {
        x = 640 / 2;
        y = 480 / 2;
    }

    public void draw() {
        background(51);
        updatePos();
        checkEdges();
        display();
    }

    void updatePos() {
        x = x + xSpeed;
        y = y + ySpeed;
    }

    void checkEdges() {
        if (x <= 0 || x >= 640) {
            xSpeed = xSpeed * -1;
        }
        if (y <= 0 || y >= 480) {
            ySpeed = ySpeed * -1;
        }
    }

    void display() {
        fill(255);
        stroke(0);
        circle(x, y, 50);
    }

}