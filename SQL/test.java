package SQL;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        String ex = "";
        while(ex.isBlank()){
            // System.out.println("ex");
            System.out.println("hello");
          ex = sc.next();
        };
        sc.close();
    }
}
