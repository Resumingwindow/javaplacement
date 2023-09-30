package SQL;
import java.sql.*;
import java.util.Scanner;
public class insertDataWithVariable {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       Scanner sc =  new Scanner(System.in);
       String ex ="";
     while(ex.isBlank()){
       System.out.println("Enter user name");
        String user_name = sc.nextLine();
          System.out.println("Enter user password");
        String pass =sc.nextLine();
         System.out.println("Enter user phone");
        int phone = sc.nextInt();
        // System.out.println("Enter user id");
        //  int id = sc.nextInt();


        String url = "jdbc:mysql://localhost:3306/flipart";
        String uname = "shubh";
        String password = "2784";
        // String Querry = "insert into student values("+rollno+",'"+Name+"','"+standred+"')";
       
        // System.out.println("insert into table name ");
        // String querry1 = "select user_Name from (select user_id from users order by rownum desc) as st where user_id = 1 ";
        
        String Querry = "insert into users (User_Name, phone ,password) values(?,?,?)";
        String driverName = "com.mysql.cj.jdbc.Driver";
        Class.forName(driverName);
        Connection con = DriverManager.getConnection(url,uname,password);
        // Statement st = con.createStatement();
        PreparedStatement pst = con.prepareStatement(Querry);
        // ResultSet rs = st.executeQuery(querry1);
        // rs.next();
      //  String user_Name = rs.getString("User_Name");
      //  String query2 = "Select user_id from users where User_Name = "+user_Name;
      //  ResultSet rs2 = st.executeQuery(query2);
      //  rs2.next();
      //  id = rs2.getInt("user_id"); 
        // id ++; 
        // System.out.println(id);
        // pst.setInt(1, id);
        pst.setString(1, user_name);
        pst.setInt(2, phone);
        pst.setString(3, pass);
        int count= pst.executeUpdate();  //update querry update and return affected row
        System.out.println(count+" rows affected");
        pst.close();
        con.close();
        System.out.println("To exit program press any character and hit Enter");
        ex= sc.nextLine();
     }
        sc.close();
    }
}

    

