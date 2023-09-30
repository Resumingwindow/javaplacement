package SQL;
 import java.sql.*;
    import java.util.Scanner;
public class inserintouDetail {
        public static void main(String[] args) throws SQLException, ClassNotFoundException {
           Scanner sc =  new Scanner(System.in);   
            String url = "jdbc:mysql://localhost:3306/flipart";
            String uname = "shubh";
            String password = "2784";
               
                
            String querry ="select phone from users";
            
            String Querry = "insert into userdetails (FirstName, LastName, phone , email , address) values(?,?,?,?,?)";
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(url,uname,password);
            Statement st = con.createStatement();
            PreparedStatement pst = con.prepareStatement(Querry);
             ResultSet rs = st.executeQuery(querry);
            rs.next();
            rs.next();
            rs.next();
            while(rs.next()){

                 System.out.println("Enter first name");
            String fname = sc.nextLine();
             System.out.println("Enter last name");
            String lname = sc.nextLine();
              System.out.println("Enter user email");
            String email =sc.nextLine();
             System.out.println("Enter user address");
            String address = sc.nextLine();
            // System.out.println("Enter user id");
            //  int id = sc.nextInt();
            int phone= rs.getInt("phone");
            
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setInt(3, phone);
             pst.setString(4, email);
              pst.setString(5, address);
            int count= pst.executeUpdate();  //update querry update and return affected row
            System.out.println(count+" rows affected");
           
        
           
         }
          pst.close();
            con.close();
            sc.close();
        }
    }
    
        
    
    
