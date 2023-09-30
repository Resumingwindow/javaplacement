package userInput;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is yor name");
       String name = sc.nextLine();
     
       System.out.println("How old are you ?");
       int age = sc.nextInt();
       sc.nextLine();                   //solution of skipping code scanner
       System.out.println("whats your favourite food");
       String food = sc.nextLine();
         System.out.println("Hello "+name);
       System.out.println("you are "+age+" year old...");
       System.out.println("you like "+food);

       sc.close();
    }
}
