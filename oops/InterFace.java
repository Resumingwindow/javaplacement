package oops;
abstract class Writer{
    public abstract void write();

}

class Pen extends Writer{
public void write(){
    System.out.println("I am pen");
}
}
class Pencil extends Writer{
public void write(){
    System.out.println("I am pencil");
}
}
class Kit{
    public void doSomething(Writer p){
        p.write();

    }
}
public class InterFace {
public static void main(String args[]){
    Writer p = new Pen();
    Kit k = new Kit();

Writer pc = new Pencil();

    k.doSomething(p);
     k.doSomething(pc);
    }
}