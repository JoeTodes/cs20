import processing.core.PApplet;
import controlP5.*;

public class Hello extends PApplet {
    ControlP5 cp5;

    int myColor = color(255);

    float n;

    public static void main(String[] args) {
        PApplet.main("Hello");
    }

    public void settings() {
        size(400, 500);
    }

    public void setup() {
        noStroke();
        cp5 = new ControlP5(this);

        cp5.addButton("random").setPosition(100, 100).setSize(200, 19);

    }

    public void draw() {
        background(myColor);

    }

    // function colorA will receive changes from
    // controller with name colorA
    public void random() {

        myColor = color(random(255), random(255), random(255));
    }

}