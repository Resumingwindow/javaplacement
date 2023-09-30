package BitManipulation;

public class setBit {
    public static void main(String args[]){
        int n = 5 ;
        int pos =1;
        int bitMAsk =1<<pos;
        int newNumber =bitMAsk|n;

        System.out.println(newNumber);
    }
    
}
