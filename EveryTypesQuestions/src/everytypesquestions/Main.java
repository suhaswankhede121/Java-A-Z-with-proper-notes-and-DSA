interface Shape {
    double area();
}
class Circle implements Shape {
    final double PI = 3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }
}

class Sphere implements Shape {
    final double PI = 3.14159;
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 4 * PI * radius * radius;
    }
}
class Main{
public static void main(String[] args) {
    Circle c = new Circle(5);
System.out.println("Area of Circle: " + c.area());

Sphere s = new Sphere(5);
System.out.println("Area of Sphere: " + s.area());

 }
}