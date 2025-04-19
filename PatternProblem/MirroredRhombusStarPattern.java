package PatternProblem;

import java.util.Scanner;

public class MirroredRhombusStarPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :greater than 4 :\n");
        int num = sc.nextInt();
        int k = num -1;
        for (int i =0; i<num-1; i++){
            for(int s = k ; s >= 0;s--){
                System.out.print(" ");
            }
            k--;

            for(int j=0; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
