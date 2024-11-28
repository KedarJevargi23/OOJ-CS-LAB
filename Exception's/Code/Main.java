import java.util.Scanner;


class WrongAge extends Exception {
 
    public WrongAge() {
        super("Age Error");
    }

    // Parameterized Constructor
    public WrongAge(String message) {
        super(message);
    }
}


class Father {
    protected int fatherAge;


    public Father() throws WrongAge {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Father's Age: ");
        fatherAge = s.nextInt();
        if (fatherAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }


    public void display() {
        System.out.println("Father's Age: " + fatherAge);
    }
}


class Son extends Father {
    private int sonAge;

  
    public Son() throws WrongAge {
        super(); 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Son's Age: ");
        sonAge = s.nextInt();
        if (sonAge < 0) {
            throw new WrongAge("Age cannot be negative");
        } else if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age");
        }
    }

    // Display Method
    @Override
    public void display() {
        super.display(); // Displays Father's Age
        System.out.println("Son's Age: " + sonAge);
    }
}

// Main Class
public class Main { // Rename to match Main.java
    public static void main(String[] args) {
        try {
            Son son = new Son(); 
            son.display();
        } catch (WrongAge e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
