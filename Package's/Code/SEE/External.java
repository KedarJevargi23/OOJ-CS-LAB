package SEE;

import CIE.Student;
import java.util.Scanner;

public class External extends Student {
    protected int[] seeMarks = new int[5];

    public void inputSEEMarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter SEE marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            seeMarks[i] = s.nextInt();
        }
    }

    public int[] getSeeMarks() {
        return seeMarks;
    }
}
