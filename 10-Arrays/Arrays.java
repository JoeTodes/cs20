import processing.core.PApplet;

public class Arrays extends PApplet {

    Ball[] ballArray = new Ball[100];

    public static void main(String[] args) {
        PApplet.main("Arrays");
    }

    public void settings() {
        size(640, 480);
    }

    public void setup() {
        for (int i = 0; i < ballArray.length; i++) {
            ballArray[i] = new Ball(this);
        }
    }

    public void draw() {
        background(51);
        for (int i = 0; i < ballArray.length; i++) {
            Ball temp = ballArray[i];

            temp.updatePos();
            temp.checkEdges();
            temp.display();
        }

    }
}