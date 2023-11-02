import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
class MyThirdGUI
{
    public static void third()
    {
        JFrame frame = new JFrame("Мое третье GUI приложение");
        JPanel panel = new JPanel();
        ImageIcon image1 = new ImageIcon("img1.jpg");
        ImageIcon image2 = new ImageIcon("img2.jpg");
        JLabel label1 = new JLabel("Первое изображение", image1, JLabel.LEFT);
        JLabel label2 = new JLabel("Второе изображение", image2, JLabel.RIGHT);
        label1.setHorizontalTextPosition(JLabel.LEFT);
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label2.setHorizontalTextPosition(JLabel.RIGHT);
        label2.setVerticalTextPosition(JLabel.BOTTOM);
        panel.add(label1);
        panel.add(label2);
        frame.add(panel);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}