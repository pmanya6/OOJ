import java.util.Scanner;

abstract class Shape {
    protected int sidea;
    protected int sideb;

    public Shape(int sidea, int sideb) {
        this.sidea = sidea;
        this.sideb = sideb;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

   
    public void printArea() {
        int area = sidea * sideb;
        System.out.println("Area of Rectangle: " + area);
    }
  }

class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

  
    public void printArea() {
        double area = 0.5 * sidea * sideb;
        System.out.println("Area of Triangle: " + area);
    }
  }

class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0); 
    }

  
    public void printArea() {
        double area = Math.PI * sidea * sideb;
        System.out.println("Area of Circle: " + area);
    }
  }

public class Shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length and width for Rectangle: ");
        int rectLength = scanner.nextInt();
        int rectWidth = scanner.nextInt();
        Rectangle rectangle = new Rectangle(rectLength, rectWidth);

        System.out.print("Enter base and height for Triangle: ");
        int triBase = scanner.nextInt();
        int triHeight = scanner.nextInt();
        Triangle triangle = new Triangle(triBase, triHeight);

        System.out.print("Enter radius for Circle: ");
        int circleRadius = scanner.nextInt();
        Circle circle = new Circle(circleRadius);

        scanner.close();

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
   }
