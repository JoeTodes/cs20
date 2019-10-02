/**
 * Cursor
 */
public class Cursor {
    Column col;
    int start, end, pos;
    boolean isActive = true;
    int duration = 5;
    int count = 0;

    public Cursor(Column col, int start, int end) {
        this.col = col;
        this.start = start;
        this.end = end;
        this.pos = this.start;
    }

    public void update() {
        if (isActive) {
            col.letters[pos].alpha = 255;
            count += 1;
            if (count >= duration) {
                count = 0;
                pos += 1;
            }
            if (pos > end) {
                isActive = false;
            }
        }
    }
}