import java.util.*;
public class calculator {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);   
    System.out.println("Enter First Number: ");
    int a = sc.nextInt(); 
    System.out.println("Enter Second Number: ");
    int b = sc.nextInt();
    char cal = sc.next().charAt(0);
    switch(cal){
        case '+' :
        System.out.println(a+" + "+b+" = "+(a+b));
        break;
        case '-' :
        System.out.println(a+" - "+b+" = "+(a-b));
        break;
        case '*':
        System.out.println(a+" * "+b+" = "+(a*b));
        break;
        case '/' :
        System.out.println(a+" / "+b+" = "+(a/b));
        break;
        case '%':
        System.out.println(a+" % "+b+" = "+(a%b));
        break;
        default:
        System.out.println("Invalid character");
    }
    sc.close();

    }
}
