import javax.swing.*;
import java.awt.*;

public class Window {
    public static JFrame start(String windowTitle){
        JFrame jf = new JFrame(windowTitle);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800, 600);
        jf.getContentPane().setLayout(new FlowLayout());
        jf.setVisible(true);

        return(jf);
    }

    public static JFrame loginForm(JFrame frame){
        JLabel titleJlabel = new JLabel("Log in");
        frame.add(titleJlabel);

        JLabel usernameJLabel = new JLabel("Username: ");
        frame.add(usernameJLabel);

        JTextField usernameJTextField = new JTextField();
        frame.add(usernameJTextField);
        
        JLabel passwordJLabel = new JLabel("Password: ");
        frame.add(passwordJLabel);
        
        JPasswordField passwordJPasswordField = new JPasswordField();
        frame.add(passwordJPasswordField);
        
        frame.setSize(200, 200);
        return(frame);
    }
}
