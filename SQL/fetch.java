package SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class fetch {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        String url ="jdbc:mysql://localhost:3306/shubhdb";
        String uName = "shubh"; 
        String pass = "2784"; 
        String querry = "select Name from student where rollno=1";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uName,pass);
        Statement st = con.createStatement();
        ResultSet rs= st.executeQuery(querry);
        rs.next();
        String name = rs.getString("Name");
        System.out.println(name);
        st.close();
        rs.close();
        
    }
    
}
