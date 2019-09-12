import processing.core.PApplet;

/**
 * Canvas
 */
public class Canvas extends PApplet {
    public Goober goob;

    public Canvas() {
        goob = new Goober();
    }

    public void run() {
        PApplet.main("Canvas");
    }

    public void settings() {
        size(300, 300);
    }

    public void setup() {
       

    }

    public void draw() {
        background(0);
        goob.show(this);
        System.out.println(goob.r);
    }

    public void updateGoob() {
        System.out.println("updating");
        goob.randomColor(random(255), random(255), random(255));

    }
}