package Main;

import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); 

        Internals[] cieStudents = new Internals[numStudents];
        External[] seeStudents = new External[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

          
            cieStudents[i] = new Internals();
            cieStudents[i].inputStudentDetails();
            cieStudents[i].inputCIEMarks();

     
            seeStudents[i] = new External();
            seeStudents[i].inputSEEMarks();
        }

        System.out.println("\nFinal marks for each student:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nDetails for student " + (i + 1) + ":");
            cieStudents[i].displayStudentDetails();

            int[] cieMarks = cieStudents[i].getCieMarks();
            int[] seeMarks = seeStudents[i].getSeeMarks();
            int[] finalMarks = new int[5];

            System.out.println("Final marks in each subject:");
            for (int j = 0; j < 5; j++) {
                finalMarks[j] = cieMarks[j] + seeMarks[j];
                System.out.println("Subject " + (j + 1) + ": " + finalMarks[j]);
            }
        }

        sc.close();
    }
}
