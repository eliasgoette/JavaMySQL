import javax.swing.*;

public class Main{
    public static void main(String[] args){
        System.out.println(Database.selectAll("partlist"));
        JFrame window = Window.start("Mercedes-Benz Partlist");
        window = Window.loginForm(window);
        Login.login("EliasGoette", "Password1");
    }
}