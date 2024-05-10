class A{
    int x=10;
    
   protected class B{
        int y=20;
        void displayB(){
             System.out.println(y);
        }
    }
    void displayA()
    {
        B obj1=new B();
       obj1.displayB();
       System.out.println(x);
    }
    
}
class nestedClass{
    public static void main(String args[]){
        A obj2=new A();
       obj2.displayA();
    }
}