package SQL;
import java.sql.*;
public class insertData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/shubhdb";
        String uname = "sqluser";
        String pass = "password";
        String Querry = "insert into student values(3,'mukti','bachlor of art') ";
        String driverName = "com.mysql.cj.jdbc.Driver";
        Class.forName(driverName);
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        int count= st.executeUpdate(Querry);  //update querry update and return affected row
        System.out.println(count+" rows affected");
        st.close();
        con.close();
        
    }
}
