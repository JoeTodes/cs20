import processing.core.PApplet;

/**
 * Matrix
 */
public class Matrix extends PApplet {
    int w = 640;
    int h = 490;
    int textSize = 20;
    int textOffset = 7;
    int spacing;
    // Column c, c2;
    Column cols[];
    CursorFactory cursors;
    int numCols;

    public static void main(String[] args) {
        PApplet.main("Matrix");
    }

    public void settings() {
        size(w, h);
    }

    public void setup() {
        frameRate(15);
        spacing = textSize - textOffset;
        // c = new Column(0, h / (spacing), this);
        // c2 = new Column(spacing, h / (spacing), this);
        numCols = w / (spacing);
        cols = new Column[numCols];
        for (int i = 0; i < numCols; i++) {
            cols[i] = new Column(i * (spacing), h / (spacing), this);
        }
        cursors = new CursorFactory(this);
    }

    public void draw() {
        background(0);
        // c.show();
        // c2.show();

        for (Column c : cols) {
            c.update();
            c.show();
        }
        cursors.update();
    }

}