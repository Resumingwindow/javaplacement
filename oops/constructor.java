package oops;
class student{
    String name;
    int rollNo;
   public static String standerd;

    // student(){
    //     name = "Shubham";
    //     rollNo = 10;
    //     standerd = "B.tch";
    //     }

    //     student(int i){

    //         name = "Shikha";
    //         rollNo = 9;
    //         standerd = "B.tec";

        // }
        public class Shikha{
            String name;
            String loc;
            int id;
        }
    }

public class constructor{
    public static void main(String args[]){
        student s1 = new student();
       student.standerd = "b.tech";
         System.out.println(student.standerd);
    
         student.Shikha s2 = new student().new Shikha() ;
         s2.name = "ARTU";
         System.out.println(s2.name);
        student.Shikha s3 = new s1. Shikha() ;

    }
}