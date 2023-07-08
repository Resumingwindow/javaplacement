package function;

import java.util.Scanner;

public class q1FromArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++ ){
            System.out.println("Enter "+i+"th value");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter number you want to search :");
        int search = sc.nextInt();
        for(int i =0 ; i < n ; i++){
            if(arr1[i] == search){
                System.out.println(search+" found at index "+i);
            }
        }
            sc.close();
    }
}
