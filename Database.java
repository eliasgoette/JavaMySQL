import java.sql.*;

public class Database {
    static String[] selectAll(String db, String table){
        String[] res = {};

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysqli://localhost/" + db, "root", "");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM " + table);
            res[0] = rs.getString(1);
        } catch (Exception e) {
            System.out.println(e);
        }

        return(res);
    }    
}