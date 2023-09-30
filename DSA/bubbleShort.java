package DSA;
import java.util.Scanner;
public class bubbleShort {

 public static void printArray(int arr[]){
    for(int i = 0;i<arr.length;i++ ){
        System.out.print(arr[i]);
    }
    System.out.println();
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter array");
        for(int i = 0;i<size;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i <size-1;i++){
            for(int j =0;j<size-i-1;j++){
                int temp = a[j];
                if (a[j]>a[j+1]){
                    a[j]= a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        printArray(a);
        sc.close();
    }
}
