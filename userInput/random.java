package userInput;
import java.util.Random;
public class random {
    public static void main(String[] args) {
        
    
    Random rndm = new Random();
    int x = rndm.nextInt(6)+1; // +1 will skip start from 0 will generate number between 1 to 6

    rndm.nextDouble();
    rndm.nextFloat();

    System.out.println(x);
    }

}
