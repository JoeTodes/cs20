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
        PVector mouse = new PVector(parent.mouseX, parent.mouseY);
        PVector direction = PVector.sub(mouse, position);
        direction.normalize();
        direction.div(5);

        acceleration = direction;

        velocity.add(acceleration);
        velocity.limit(10);
        position.add(velocity);
    }

    public void checkEdges() {

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

    public void display() {
        parent.fill(255);
        parent.stroke(0);
        parent.circle(position.x, position.y, 50);
    }
}