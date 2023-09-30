package function;
import java.util.Scanner;
class Input{
    String s1[]= new String[5];
    public void Stinput(Scanner sc){
        for(int i= 0;i<4;i++){
          if(s1[i]=="0"){
                    break;
                }
            s1[i]=sc.next();
              
            }
   }
    String Num = s1[0];
   public void num(){
   
    for(int i = 0;i<4;i++){
        for(int j = 0;j<4;j++){
        if(s1[i]==null){
            s1[j] ="0";
        }
    }
        String var =s1[i];
        Num=Num+var;
       
    }
    // return num();

}
}


public class additionByString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Input in = new Input();
        
        System.out.println("Enter Frist number till 6 number");
        in.Stinput(sc);
        in.num();
        System.out.println(in.Num);
        int num1 =Integer.parseInt(in.Num);
        System.out.println("Enter Second number till 6 number");
         in.Stinput(sc);
         in.num();
         int num2 =Integer.parseInt(in.Num);
         int result = num1+ num2;
         System.out.println("Addition = "+ result);

    }

}