package PatternProblem;

import java.util.Scanner;

public class PyramidStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :greater than 4 :\n");
        int num = sc.nextInt();
//        int k = num -1;
//        for (int i =0; i<num; i+=2){
//            for(int s = k ; s >= 0;s--){
//                System.out.print("  ");
//            }
//            k--;
//
//            for(int j=0; j<= i; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//
        for (int i=0; i<num; i++)
        {
            for (int j=num-i; j>1; j--)
                System.out.print(" ");
            for (int j=0; j<=i; j++ )
                System.out.print(" *");
            System.out.println();
        }

       
    }
}
