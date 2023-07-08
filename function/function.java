package function;
 
public class function {
     public static void printName(){
    System.out.println("Shubham Pandey");
}
public static int sumOf(int a,int b ) {
       int sum = a+b;
    return sum;
}

public static int multipleOf(int a,int b ) {
       int mul = a*b;
    return mul;
}
public static void factorial(int a) {
    int fact =1;
    for(int i = a; i>=1;i--){
        fact=a*fact;
        a=a-1;
    }
    System.out.println(fact);
}

// prime number function
public static void primeNumber(int a) {
    int flag =0;
    int prime = a;
    if(prime==1){
        flag =1;
    }
    for(int i=2;i<prime;i++){
        if(prime % i==0){
            flag =1;
        }
    }
    if(flag==0){
        System.out.println(prime+" is a prime number");
    }else{
        System.out.println(prime+" is not a prime number");
    }
}
public static void evenOrOdd(int a) {
    if(a%2==0){
        System.out.println(a+" is a even number");
    }else{
        System.out.println(a+" is a even number");
    }
    
}
public static void table(int a) {
    for(int i =0 ; i<=10; i++){
        System.out.println(i*a);
    }
}



    public static void main(String args[]) {
        printName();
       System.out.println(sumOf(6, 7)); 
        factorial(5);
       multipleOf(4, 8);
       primeNumber(8);
       evenOrOdd(7);
       table(4);

    }


   
}
