import java.util.ArrayList;

/**
 * CursorFactory
 */
public class CursorFactory {
    Matrix p;
    ArrayList<Cursor> cursors = new ArrayList<Cursor>();
    int initialCursors = 5;

    CursorFactory(Matrix parent) {
        p = parent;
        for (int i = 0; i < initialCursors; i++) {

            cursors.add(randomCursor());
        }
    }

    public void update() {
        for (Cursor c : cursors) {
            c.update();
        }
        if (p.random(1) < 0.6) {
            cursors.add(randomCursor());
            cursors.add(randomCursor());
            cursors.add(randomCursor());
            cursors.add(randomCursor());
        }

    }

    public Cursor randomCursor() {
        int c = (int) p.random(p.numCols);
        int start = (int) p.random(0, p.cols[c].size);
        int end = (int) p.random(start, p.cols[c].size);
        return new Cursor(p.cols[c], start, end);

    }
}