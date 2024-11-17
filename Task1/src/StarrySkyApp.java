import javax.swing.*;

public class StarrySkyApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Starry Sky");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.add(new StarrySky());
        frame.setVisible(true);
    }
}