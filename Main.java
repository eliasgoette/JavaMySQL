import javax.swing.*;

public class Main{
    public static void main(String[] args){
        System.out.println(Database.selectAll("mb_mysql_example", "partlist"));
        JFrame window = Window.start("Mercedes-Benz Partlist");
        window = Window.loginForm(window);
        System.out.println("Alright");
    }
}