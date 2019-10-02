
/**
 * Letter
 */
public class Letter {
    int x, y, alpha;
    char c;
    Matrix p;
    float mutateChance;

    public Letter(int startX, int startY, Matrix parent) {
        x = startX;
        y = startY;
        p = parent;
        alpha = 0;
        mutateChance = p.random(0f, 0.4f);
        c = (char) p.random(33, 127);
    }

    public void show() {
        p.fill(alpha > 245 ? 200 : 0, 225, alpha > 245 ? 200 : 0, alpha);

        p.text(Character.toString(c), x, y, p.textSize, p.textSize);

    }

    public void update() {
        if (alpha > 0) {
            alpha -= 5;
            if (alpha < 0) {
                alpha = 0;
            }
        }

        if (p.random(1) < mutateChance) {
            c = (char) p.random(128);
        }
    }

}