import processing.core.PApplet;
import processing.core.PVector;

public class Acceleration extends PApplet {

    PVector position;
    PVector velocity;
    PVector acceleration;

    public static void main(String[] args) {
        PApplet.main("Acceleration");
    }

    public void settings() {
        size(640, 480);
    }

    public void setup() {
        position = new PVector(320, 240);
        velocity = new PVector(0, 0);
        acceleration = new PVector(0, 0);
    }

    public void draw() {
        background(51);
        updatePos();
        checkEdges();
        display();
    }

    void updatePos() {
        PVector mouse = new PVector(mouseX, mouseY);
        PVector direction = PVector.sub(mouse, position);
        direction.normalize();
        direction.div(5);

        acceleration = direction;

        velocity.add(acceleration);
        velocity.limit(10);
        position.add(velocity);
    }

    void checkEdges() {
        if (position.x < 0) {
            position.x = 640;
        }
        if (position.x > 640) {
            position.x = 0;
        }
        if (position.y < 0) {
            position.y = 480;
        }
        if (position.y > 480) {
            position.y = 0;
        }
    }

    void display() {
        fill(255);
        stroke(0);
        circle(position.x, position.y, 50);
    }

}