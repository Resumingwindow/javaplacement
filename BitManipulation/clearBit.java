package BitManipulation;

public class clearBit {
    public static void main(String[] args) {
        int n = 5 ;
        int pos =2;
        int bitMAsk =1<<pos;
        int notBitMAsk = ~(bitMAsk);
        int newNumber = notBitMAsk & n;
        System.out.println(newNumber);
    }
}
