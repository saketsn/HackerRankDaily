package PatternProblem;

import java.util.Scanner;

public class RectangleStarPattern {
    public static void main(String[] args) {

//        for (int i =0; i<4; i++){
//            for(int j=0; j<5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :greater than 4 :\n");
        int num = sc.nextInt();
//        for (int i =0; i<num-1; i++){
//            for(int j=0; j<num; j++){
//                if( i> 0 && i <num-2 && j == 0 || j == num-1) {
//                    System.out.print("*");
//                }else if ( i == 0 || i== num-2){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        for (int i =0; i<4; i++){
//            for(int j=0; j<5; j++){
//                if( i> 0 && i <3 && j == 0 || j == 4) {
//                    System.out.print("*");
//                }else if ( i == 0 || i== 3){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        for (int i =0; i<num-1; i++){
             for(int k = 0 ; k<=i; k++){
                 System.out.print(" ");
             }
            for(int j=0; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
