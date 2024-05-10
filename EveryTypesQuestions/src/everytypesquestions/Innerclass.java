public class Innerclass {
    public static void main(String[] args) {
        Outerclass obj=new Outerclass();
        obj.display();
    }
}

class Outerclass{
    int x=20;
    class Innerclass{
        int y=10;
        void display(){
            System.out.println("Y="+y);
        }
    }
    void display(){
        Innerclass obj=new Innerclass();
        obj.display();
        System.out.println("X="+x);
    }

}
