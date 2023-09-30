package SQL;

import java.sql.*;
import java.util.Scanner;

public class daoFetch {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rollno. : ");
        int input = sc.nextInt();
        dao.connect();
        Student s1 = dao.getStudent(input);
        System.out.println(s1.sname);

        Student s2 = new Student();
        System.out.println("Enter rollno : ");
        s2.rollno =sc.nextInt();
        System.out.println("Enter name ");
        s2.sname = sc.nextLine();
        System.out.println("Enter Standerd ");
        s2.standerd = sc.nextLine();

        sc.close();
    }
}
class StudentDao{                       
    Connection con = null;
 public void connect(){     //getting connection
    String url = "jdbc:mysql://localhost:3306/shubhdb";
        String uname = "sqluser";
        String pass = "password";
      
        String driverName = "com.mysql.cj.jdbc.Driver";
    try {
        Class.forName(driverName);
        con = DriverManager.getConnection(url,uname,pass);

    } catch (Exception e) {
        System.out.println(e);
    }
 }


    public Student getStudent(int rollno){              //getting s.name using  roll no 
        try {
              String Querry = "select * from student where rollno ="+rollno;
            Student s = new Student();
            s.rollno = rollno;
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery(Querry);
            rs.next();
            String name = rs.getString("Name");
            s.sname = name;
            st.close();
            con.close();
            return s;
            
        } catch (Exception e) {
           System.out.println(e);
        }
        return null;
    }
}



class Student{

    int rollno ;
    String sname;
    String standerd;
}