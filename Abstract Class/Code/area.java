import java.util.Scanner;

abstract class Shape{
    double dim1;
    double dim2;

    abstract void printarea();
}

class Rectangle extends Shape{
    Rectangle(double d1,double d2){
        this.dim1=d1;
        this.dim2=d2;
    }
    @Override
    void printarea() {
        double area=dim1*dim2;
        System.out.println("Area of Rectangle:"+area);
    }
}

class Triangle extends Shape{
    Triangle(double lenght,double breath){
        this.dim1=lenght;
        this.dim2=breath;
    }
    @Override
    void printarea() {
        double area=0.5*dim1*dim2;
        System.out.println("Area of Tringle:"+area);
    }
}


class Circle extends Shape{
    Circle(double lenght){
        this.dim1=lenght;
    }
    @Override
    void printarea() {
        double area=3.14*dim1*dim1;
        System.out.println("Area of Circle:"+area);
    }
}





public class area {
    public static void main(String[] args) {
      
       
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter lenght and Breath of Rectangle:");
            double rl=sc.nextDouble();
            double rb=sc.nextDouble();
            Rectangle r1=new Rectangle(rl, rb);
            r1.printarea();

            System.out.println("Enter lenght and Breath of Triangle:");
            double tl=sc.nextDouble();
            double tb=sc.nextDouble();
            Triangle t1=new Triangle(tl, tb);
            t1.printarea();

            System.out.println("Enter the Radius:");
            double r=sc.nextDouble();
            Circle c1=new Circle(r);
            c1.printarea();
        }

    }
}
