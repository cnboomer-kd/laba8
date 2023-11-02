import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
class MySecondGUI
{
    public static void second()
    {
        JFrame frame = new JFrame("Мое второе GUI приложение");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label1 = new JLabel("Первая панель");
        JLabel label2 = new JLabel("Вторая панель");
        label1.setForeground(Color.RED);
        label2.setForeground(Color.BLUE);
        label1.setFont(new Font("Arial", Font.BOLD, 20));
        label2.setFont(new Font("Arial", Font.BOLD, 20));
        panel1.add(label1);
        panel2.add(label2);
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}