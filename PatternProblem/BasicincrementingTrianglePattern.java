package PatternProblem;

import java.util.Scanner;

public class BasicincrementingTrianglePattern {

    public static void main(String[] args) {

        int k = 3;
        for(int i = 0; i<4; i++){
            for(int j = 0; j <=i; j++){
                System.out.print(k);
            }
            System.out.println();
            k++;
        }




           Scanner sc = new Scanner(System.in);
            System.out.println("Enter no");
            int no = sc.nextInt();
//            int count = no-2;
//
//            for (int i = 1; i <= no; i++) {
//                for (int j = 1; j <= i; j++)
//                    System.out.print(count);
//                count++;
//                System.out.println();
//            }
//            for (int i = no; i>=1 ; i--) {
//                count--;
//                for (int j = 1; j <=i; j++)
//                    System.out.print(count);
//                System.out.println();
//            }
         int a = 0;
        for (int i = no; i>=1 ; i--) {

            for (int j = 1; j <=i; j++) {
                a = (i * (i - 1)) / 2 + 1;
                System.out.print(a++ + "*");
            }
            System.out.println();
        }



        }
}
