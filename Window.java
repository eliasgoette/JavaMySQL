import javax.swing.*;
import java.awt.*;

public class Window {
    public static void start(String windowTitle){
        JFrame jf = new JFrame(windowTitle);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setSize(800, 600);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
