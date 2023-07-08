package oops;
// class Outer{
//     int a;
//     public void  show(){

//     }
//     class Inner{
//         public void display(){
//             System.out.println("In Display");
//         }
//     }
// }

public class maxOccuranceInString {
    public static void main(String args[]){

 

        String str = "mynameisshubham";
        int counter[] = new int[str.length()];   // array of char
        for(int i =0 ;i<str.length()-1;i++){
            for(int j=0;j<str.length();j++){
                char c1= str.charAt(j);
                if(c1==str.charAt(i)){
                    
                    counter[i]=counter[i]+1;
                }
            }

        }
         int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for( int i=0; i<counter.length; i++){
                  if(counter[i] < min){
                        min=counter[i];
                  }
                   if (counter[i]>max){
                         max=counter[i];
                   }
            }
            System.out.println(max);
      
    //     Outer obj = new Outer();
    //    Outer.Inner obj1 = obj.new Inner();
    }   
}

