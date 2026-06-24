
abstract class Shape {
    abstract double area();
    abstract double perimeter();
    
}

class Circle extends Shape{
    private final double radius;

    public Circle(double radius){      //constructor
        this.radius=radius;
    }
    public double getradius(){       //getter to get the value 
        return radius;
    }

    @Override
    double area() {
        return Math.PI *radius*radius;
    }
    @Override
    double perimeter(){
        return 2*Math.PI*radius;
    }

}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    @Override
    double area(){
        return length*width;
    }

    @Override
    double perimeter(){
        return 2*(length+width);
    }   
}

class Triangle extends Shape{
    private double a,b,c;
    
    public Triangle(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    double perimeter(){
        return a+b+c;
    }

    @Override
    double area(){
        double s= perimeter()/2;
        return Math.sqrt( s * (s - a) * (s - b) * (s - c));
    }
}

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4, 5)
        };

        System.out.println("AREA REPORT");

        for (Shape s : shapes) {

            System.out.println(
                    s.getClass().getSimpleName()
                            + " -> Area: "
                            + String.format("%.2f", s.area())
                            + " | Perimeter: "
                            + String.format("%.2f", s.perimeter())
            );
        }
    }
}