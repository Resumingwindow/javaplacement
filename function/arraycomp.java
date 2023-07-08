package function;
import java.util.*;

public class arraycomp {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<size;i++){
            System.out.println("Enter "+i+ " value");
            arr[i] = sc.nextInt();
        }
        if(size==1){
            System.out.println("No duplicate data found");
        }
        for(int i =0 ; i<size-1;i++){
            for(int j = i+1; j<size;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate found @ index "+ j +" value " + arr[j]);
                }
            }
        }
        sc.close();
    }
}
