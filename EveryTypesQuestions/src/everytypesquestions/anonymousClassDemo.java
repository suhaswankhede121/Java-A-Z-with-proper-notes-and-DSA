
package everytypesquestions;


abstract class anonymousDemo{
    void display(){};
}
public class anonymousClassDemo {
    public static void main(String[] args) {
       anonymousDemo obj=new anonymousDemo(){
          void display(){
              System.out.println("This is anonymous Class with abstarction");
          } 
       };
       obj.display();
    }
}
