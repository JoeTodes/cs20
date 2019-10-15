import processing.core.PApplet;
import processing.core.PVector;

public class BouncingBallV extends PApplet {

    PVector position;
    PVector velocity;

    public static void main(String[] args) {
        PApplet.main("BouncingBallV");
    }

    public void settings() {
        size(640, 480);
    }

    public void setup() {
        position = new PVector(320, 240);
        velocity = new PVector(20, 15);
    }

    public void draw() {
        background(51);
        updatePos();
        checkEdges();
        display();
    }

    void updatePos() {
        position.add(velocity);
    }

    void checkEdges() {
        if (position.x <= 0 || position.x >= 640) {
            velocity.x = velocity.x * -1;
        }
        if (position.y <= 0 || position.y >= 480) {
            velocity.y = velocity.y * -1;
        }
    }

    void display() {
        fill(255);
        stroke(0);
        circle(position.x, position.y, 50);
    }

}