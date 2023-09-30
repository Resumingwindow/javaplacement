package SQL;

import java.sql.*;

public class fetchData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/flipart";
        String uname = "shubh";
        String pass = "2784";
        String querry = "select user_id from users where user_id desc = 1";
        String driverName = "com.mysql.cj.jdbc.Driver";

        Class.forName(driverName);
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(querry);
        int userdata  ;
        while (rs.next()) {
            userdata = rs.getInt("user_id");
            //  + " " + rs.getString("Name") + " " + rs.getString("standerd");
            System.out.println(userdata);
        }
    }
}
