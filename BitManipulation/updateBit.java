package BitManipulation;

import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opr = sc.nextInt();
        int n =5;
        int pos =1;

        int bitMAsk = 1<<pos;

        if(opr ==1){
            //set
            int newNumber = bitMAsk|n;
            System.out.println(newNumber);
        }else{
            //clear
            int newBitmask = ~(bitMAsk);
            int newNumber = newBitmask & n ;
            System.out.println(newNumber);
        }
        sc.close();
    }
}
