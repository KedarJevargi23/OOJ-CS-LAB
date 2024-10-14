import java.util.Scanner;

class Student {
    private String name;
    private String usn;
    private double total_credit;
    private double[] marks;  
    private Scanner sc = new Scanner(System.in); 

    void getInfo() {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        
        System.out.print("Enter USN: ");
        usn = sc.nextLine();
        
        System.out.print("Enter Total Credits: ");
        total_credit = sc.nextDouble();
        sc.nextLine(); 
    }

    double grade(double mark) {   
        if (mark <= 39) {
            return 0;
        } else if (mark >= 40 && mark <= 49) {
            return 4;
        } else if (mark >= 50 && mark <= 54) {
            return 5;
        } else if (mark >= 55 && mark <= 59) {
            return 6;
        } else if (mark >= 60 && mark <= 69) {
            return 7;
        } else if (mark >= 70 && mark <= 79) {
            return 8;
        } else if (mark >= 80 && mark <= 89) {
            return 9;
        } else {
            return 10;
        }
    }

    void getMarks() {
        marks = new double[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter the marks for subject " + (i + 1) + ": ");
            double mark = sc.nextDouble();
            
            System.out.println("Enter the credit for subject " + (i + 1) + ": ");
            double credit = sc.nextDouble();
            
            double grade = grade(mark);  
            marks[i] = grade * credit;  
        }
        sc.nextLine(); 
    }

    void calSgpa() {
        double totalMarks = 0;
        for (int i = 0; i < 8; i++) {
            totalMarks += marks[i];
        }
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("SGPA: " + (totalMarks / total_credit));
    }
}

public class Main {
    public static void main(String args[]) {
        boolean cond = true;
        Scanner sc = new Scanner(System.in); 
        while (cond) {
            Student s1 = new Student();
        
           
            s1.getInfo();
            s1.getMarks();
            s1.calSgpa();
            
            System.out.println("Do you want to calculate SGPA for another student? (yes/no): ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("yes")) {
                continue;
            } else {
                cond = false;
            }
        }
        sc.close(); 
    }
}
