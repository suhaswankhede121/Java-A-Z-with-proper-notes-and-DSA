public class Interfacedemo {
    public static void main(String[] args) {
        B obj=new B();
        obj.printB();
    }
}
// interface  A{
//     void printA();
// }
// class B implements A{
//      public void printA(){System.out.println("This is A in B");}
// }

abstract class A
{
   abstract public void printA();
   abstract public void printB();
}

class B extends A{
   public void printA(){System.out.println("Class A in B");}
   public void printB(){System.out.println("Class B in B");}

}