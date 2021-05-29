import java.sql.*;

public class Database {
    private static String[] executeQuery(String query){
        String[] res = {};
        String db = "mb_java_test";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysqli://localhost/" + db, "root", "");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
        }

        return(res);
    }

    public static String[] selectAll(String table){
        String query = "SELECT * FROM " + table;
        return executeQuery(query);
    }

    public static String selectWhere(String table, String condition){
        String query = "SELECT `password_hash` FROM " + table + " WHERE " + condition;
        return executeQuery(query)[0];
        //return "-1520863110";
    }
}