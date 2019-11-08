import processing.core.PApplet;
import processing.core.PVector;

public class Ball {
    private PVector position;
    private PVector velocity;
    private PVector acceleration;
    private PApplet parent;

    public Ball(PApplet p) {
        parent = p;
        position = new PVector(parent.random(640), parent.random(480));
        velocity = new PVector(0, 0);
        acceleration = new PVector(0, 0);
    }

    public void updatePos() {
        velocity.add(acceleration);
        acceleration.mult(0);
        velocity.limit(10);
        position.add(velocity);
    }

    public void checkEdges() {

        if (position.x <= 0) {
            velocity.x *= -1;
        }
        if (position.x >= 640) {
            velocity.x *= -1;
        }
        if (position.y <= 0) {
            velocity.y *= -1;
        }
        if (position.y >= 480) {
            velocity.y *= -1;
        }
    }

    public void display() {
        parent.fill(255);
        parent.stroke(0);
        parent.circle(position.x, position.y, 50);
    }

    public void applyForce(PVector force) {
        acceleration.add(force);

    }
}