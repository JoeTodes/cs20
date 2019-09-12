import controlP5.*;
import processing.core.PApplet;

/**
 * Controller
 */
public class Controller extends PApplet {
    ControlP5 cp5;
    Canvas canvas;

    public Controller() {
        canvas = new Canvas();
        canvas.run();

    }

    public void run() {
        PApplet.main("Controller");
    }

    public void settings() {
        size(300, 300);

    }

    public void setup() {
        cp5 = new ControlP5(this);
        cp5.addButton("updateGoob").setPosition(100, 100).setSize(100, 50).setLabel("Change Color").plugTo(canvas);

        surface.setLocation(300, 200);
    }

    public void changeColor() {
        System.out.println("button");
    }

    public void draw() {
        background(0);

    }

}