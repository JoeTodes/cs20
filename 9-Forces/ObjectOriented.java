import processing.core.PApplet;
import processing.core.PVector;

public class ObjectOriented extends PApplet {
    Ball ball;
    Ball ball2;

    public static void main(String[] args) {
        PApplet.main("ObjectOriented");
    }

    public void settings() {
        size(640, 480);
    }

    public void setup() {
        ball = new Ball(this);
        ball2 = new Ball(this);
    }

    public void draw() {
        background(51);
        PVector gravity = new PVector(0, 0.1f);
        ball.applyForce(gravity);
        ball2.applyForce(gravity);

        PVector wind = new PVector(0.1f, 0);
        ball.applyForce(wind);
        ball2.applyForce(wind);

        ball.updatePos();
        ball2.updatePos();
        ball.checkEdges();
        ball2.checkEdges();
        ball.display();
        ball2.display();
    }
}