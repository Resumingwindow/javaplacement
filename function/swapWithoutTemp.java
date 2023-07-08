package function;

import java.util.Scanner;

public class swapWithoutTemp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();
        a=b+a;
        b=a-b;
        a=a-b;
        sc.close();
        System.out.println("first : "+a+" Second : "+b);
    }
}
