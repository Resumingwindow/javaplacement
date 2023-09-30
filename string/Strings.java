package string;
import java.util.Scanner;
public class Strings {
    public static void main(String args[]) {
        String firstname = "Shubham";
        String lastName = "Pandey";
        String fullName = firstname+" "+lastName;
        String sentence = "My name is Shubham";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        // String nameIn = sc.next();
         System.out.println("Enter your name 2 ");
        // String nameInln = sc.nextLine();
        System.out.println(fullName+"\n"+sentence);

        //length
        int length = fullName.length();
        System.out.println(length);
        // charAt
        for(int i =0; i<length;i++){
            System.out.println(fullName.charAt(i));
        }
        // String compare
        // String name1 = "Tony";
        String name2 = "Tony";
        // if(name1.compareTo(name2)==0)
        //     System.out.println("Strings are equal");
        //     else
        //     System.out.println("strings are not equal");
        //  if(name1==name2)
        //     System.out.println("Strings are equal");
        //     else
        //     System.out.println("strings are not equal");
        //  if(new String("Tony")==new String("Tony"))
        //     System.out.println("Strings are equal");
        //     else
        //     System.out.println("strings are not equal");
                   if(new String("Tony")==name2)
            System.out.println("Strings are equal");
            else
            System.out.println("strings are not equal");

            // substring
            String name3 = sentence.substring(11,sentence.length());
            System.out.println(name3);
            // parsing
            // Strins are immutable



        sc.close();
    }
}
