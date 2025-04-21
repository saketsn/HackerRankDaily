package PatternProblem;

import java.util.Scanner;

public class InvertedPyramidStarPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=3; i++){
            for(int k =1; k<=i;k++){
                System.out.print("  ");
            }

            for(int j=1; j<=n; j++){
                System.out.print(" X");
            }
            n= n-2;
            System.out.println();
        }


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hollow Inverted Pyramid Pattern Rows = ");
        int rows = sc.nextInt();

        System.out.println("Hollow Inverted Pyramid Star Pattern");

        for (int i = rows ; i > 0; i-- )
        {
            for (int j = 1 ; j <= rows - i; j++ )
            {
                System.out.print(" ");
            }
            for (int k = 1 ; k <= (2 * i) - 1; k++ )
            {
                if(i == 1 || i == rows || k == 1 || k == (2 * i) - 1)
                {
                    System.out.print("X");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}

