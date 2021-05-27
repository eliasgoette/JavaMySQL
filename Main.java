public class Main{
    public static void main(String[] args){
        System.out.println(Database.selectAll("mb_mysql_example", "partlist"));
        Window.start("Mercedes-Benz Partlist");
    }
}