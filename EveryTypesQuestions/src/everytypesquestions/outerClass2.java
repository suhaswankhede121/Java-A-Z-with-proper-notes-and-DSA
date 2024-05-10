
package everytypesquestions;


public class outerClass2 {
    int outer_x=20;
     class innerClass{
    int inner_y=10;
     void display(){
        System.out.println(outer_x+inner_y);
     }
    }
}
class Main{
    public static void main(String[] args) {
        outerClass2 obj2=new outerClass2();
        outerClass2.innerClass obj=obj2.new innerClass();
        obj.display();
        
    }
}
