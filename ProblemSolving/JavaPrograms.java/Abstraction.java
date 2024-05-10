class Abstraction{
    public static void main(String[] args) {
    
    }
}

abstract class shape{
    void calc_area(){};
    void calc_volume(){};
}

class sphare extends shape{
    int radius;
    sphare(int radius){
       this.radius=radius;
    }
    void calc_area(){
        double result=4*3.14*radius*radius;
        System.out.println("Area of share is= "+result);
    }
    void calc_volume(){
        double result=(4/3)*3.14*radius*radius*radius;
        System.out.println("volume of share is= "+result);
       }
}
class cone extends shape{
    int radius,height;
    cone(int radius,int height){
        this.radius=radius;
        this.height=height;
    }
    void calc_area(){
        double result=3.14*radius+3.14*radius*(radius*radius+height*height);
        System.out.println("Area of cone is= "+result);
    }
    void calc_volume(){
        
    }
}