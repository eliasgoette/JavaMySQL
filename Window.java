import javax.swing.*;
//import java.awt.*;

public class Window {
    public static JFrame start(String windowTitle){
        JFrame jf = new JFrame(windowTitle);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800, 600);
//        jf.getContentPane().setLayout(new BorderLayout());
        ImageIcon img = new ImageIcon("./Mercedes-Benz-Logo.jpg");
        jf.setIconImage(img.getImage());
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
        

        GroupLayout groupLayout = new GroupLayout(frame);
        frame.setLayout(groupLayout);


//        groupLayout.setAutoCreateGaps(true);
//        groupLayout.setAutoCreateContainerGaps(true);

        groupLayout.setHorizontalGroup(
            groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(usernameJLabel)
                    .addComponent(usernameJTextField)
                )
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(passwordJLabel)
                    .addComponent(passwordJPasswordField)
                )
        );

        groupLayout.setVerticalGroup(
            groupLayout.createSequentialGroup()
            .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(usernameJLabel)
                .addComponent(usernameJTextField)
            )
            .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(passwordJPasswordField)
                .addComponent(passwordJLabel)
            )
        );

        return(frame);
    }
}
