
package everytypesquestions;

class OuterClass {
    private class innerClass{
    void printMessage(){
        System.out.println("this is inner class called");
      }
    }
    void displayInnerClass(){
        innerClass obj1=new innerClass();
       obj1.printMessage();
    }
}

class Main{
    public static void main(String[] args) {
        OuterClass obj2=new OuterClass();
        obj2.displayInnerClass();
    }
}