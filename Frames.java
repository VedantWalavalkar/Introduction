package AccioProjects.CreateFrames;
import javax.swing.*;
import java.awt.*;

public class Frames {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLocation(350,150);
        frame.setSize(600,500);
        frame.setBackground(Color.cyan);
        frame.getContentPane().setBackground(Color.black);
        frame.setTitle("Introduction");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
