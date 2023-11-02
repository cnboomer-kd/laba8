import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
class MyFirstGUI {
    public static void first()
    {
        JFrame frame = new JFrame("Мое первое GUI приложение");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Привет МИР!");
        panel.add(label);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}