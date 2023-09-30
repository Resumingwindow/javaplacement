package BitManipulation;
public class getBit{
    public static void main(String[] args) {
        int n = 5 ;
        int pos =2;
        int bitMAsk =1<<pos;
        if((bitMAsk & n )==0){
            System.out.println("The bit s 0");
        }else
        System.out.println("bit is one ");
        
    }

}