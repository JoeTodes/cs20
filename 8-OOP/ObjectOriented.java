import processing.core.PApplet;

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
        ball.updatePos();
        ball2.updatePos();
        ball.checkEdges();
        ball2.checkEdges();
        ball.display();
        ball2.display();
    }
}