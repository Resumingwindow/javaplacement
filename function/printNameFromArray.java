package function;

import java.util.Scanner;

public class printNameFromArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        String name[] = new String[size];
        System.out.println("Enter " +size+" names" );
        for(int i =0 ; i<size; i++){
        name[i] =sc.nextLine();
        }
         for(int i =0 ; i<size; i++){
        System.out.println(name[i]);
        }
        sc.close();
    }
}
