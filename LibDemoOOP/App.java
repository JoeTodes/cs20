import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import processing.core.PApplet;

public class App extends JFrame {

    JButton changeColor;
    private Canvas canvas;

    public App() {
        setTitle("Color Changer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        canvas=new Canvas();
        canvas.init();

        JPanel controller = new JPanel();
        controller.setLayout(new FlowLayout());

        changeColor = new JButton("Change Color");
        controller.add(changeColor);
        add(controller, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        App frame = new App();
        frame.pack();
        frame.setVisible(true);

    }
}