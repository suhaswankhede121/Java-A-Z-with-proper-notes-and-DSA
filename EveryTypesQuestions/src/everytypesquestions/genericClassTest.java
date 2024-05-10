
package everytypesquestions;


class GenericTest<T>{
    T obj;
    
   GenericTest(T r){
    r=obj;  
  }
   void display(){
        System.out.println("Generic Class method "+obj);
    }
}

public class genericClassTest {
    public static void main(String[] args) {
       GenericTest<Integer> obj=new GenericTest<Integer>(20);
        obj.display();
       
    }
}
