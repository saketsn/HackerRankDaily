package PatternProblem;

import java.util.Scanner;

public class InvertedHollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int no = sc.nextInt();

        int counter = no - 2;
        int counter2 = 1;
        for (int i = 0; i < no; i++) {
            for (int j = 0; j < no; j++) {
                if (i%2 == 0) {
                    if (i == 0) {
                        System.out.print("*");
                    } else {
                        if (j == counter2) {
                            System.out.print("*");
                        }
                        else if (j == counter) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else {
                    System.out.print(" ");
                }
            }
            if (i%2 == 0 && i != 0) {
                counter2++;
                counter--;
            }
            System.out.println();
        }

        sc.close();
    }
}
