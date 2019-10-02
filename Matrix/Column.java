/**
 * Column
 */
public class Column {
    int size;
    Letter letters[];
    Matrix p;
    int x;

    public Column(int x, int length, Matrix parent) {
        this.size = length;
        this.p = parent;
        this.x = x;
        letters = new Letter[size + 1];
        for (int i = 0; i < size; i++) {
            letters[i] = new Letter(x, i * (p.spacing), p);
        }
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            letters[i].show();
        }
    }

    public void update() {
        for (int i = 0; i < size; i++) {
            letters[i].update();
        }
    }
}