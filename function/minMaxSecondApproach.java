package function;
import java.util.*;
public class minMaxSecondApproach {
            public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int numbers []= new int [size];
                  int min = numbers[0];
                  int max = numbers[0];
            // input
            for (int i=0; i<size; i++){
                  numbers[i]  =  sc.nextInt();
            }
          
            for(int i =0; i<size-1;i++){
                        if(numbers[i]>numbers[i+1]){
                              min = numbers[i+1];    
                  }
                    if(numbers[i]<numbers[i+1]){
                              min = numbers[i+1];
                              
                        
                  }
            }
            
          
            System.out.println("Largest num is : " + max);
            System.out.println("Smallest num is : "  + min);
sc.close();
      }
}

