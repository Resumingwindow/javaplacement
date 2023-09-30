package practice;

import java.util.Scanner;

public class balencePar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s1 = sc.nextLine();
        char c1[] = {'(','{','['},c2[] ={')','{','['};
        int count = 0;
       
        for(int i =0; i<s1.length();i++){
            for(int j =0;j<c1.length;j++){
            if(s1.charAt(i)==c1[j])
                count++;
            
            }
             for(int j =0;j<c1.length;j++){
            if(s1.charAt(i)==c2[j])
                count--;   
             }
        }
        String res = (count==0)?"balance":"not balance";
        System.out.println(res);

    sc.close();
        
    }
    
}
