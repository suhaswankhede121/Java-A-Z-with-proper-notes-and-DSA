
package everytypesquestions;

 abstract class student{ // Interface is similar to a abtraction 
     // it is denoted by interface keyword, it is used for multiple inheritance and abstraction also
     // abstraction is extends and interface is implements with another class
    void display(){};
 }
 class getvalue extends student{
    void display(){
        System.out.println("This abstraction");
    }
}
public class abstractDemo {
    public static void main(String[] args) {
        student obj=new getvalue();
        obj.display();
    }
   
}

