package PatternProblem;

import java.util.Scanner;

class SquareStarPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();
        if (rows < 1 || columns < 1) {
            System.out.println("Invalid Input");
        } else if (rows != columns) {
            System.out.println("Invalid Input");
        } else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= columns; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }

}