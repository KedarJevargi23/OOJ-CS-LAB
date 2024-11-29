import java.util.Scanner;

abstract class Shape {
    double dim1;
    double dim2;

    abstract void printarea();
}

class Rectangle extends Shape {
    Rectangle(double d1, double d2) {
        this.dim1 = d1;
        this.dim2 = d2;
    }

    @Override
    void printarea() {
        double area = dim1 * dim2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    Triangle(double base, double height) {
        this.dim1 = base;
        this.dim2 = height;
    }

    @Override
    void printarea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    Circle(double radius) {
        this.dim1 = radius;
    }

    @Override
    void printarea() {
        double area = 3.14 * dim1 * dim1;
        System.out.println("Area of Circle: " + area);
    }
}

public class area {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter length and breadth of Rectangle:");
            double rl = sc.nextDouble();
            double rb = sc.nextDouble();
            Rectangle r1 = new Rectangle(rl, rb);
            r1.printarea();

            System.out.println("Enter base and height of Triangle:");
            double base = sc.nextDouble();
            double height = sc.nextDouble();
            Triangle t1 = new Triangle(base, height);
            t1.printarea();

            System.out.println("Enter the Radius:");
            double radius = sc.nextDouble();
            Circle c1 = new Circle(radius);
            c1.printarea();
        }

        System.out.println("USN: 1BM23CS147");
        System.out.println("Name: Kedar Jevargi");
    }
}
