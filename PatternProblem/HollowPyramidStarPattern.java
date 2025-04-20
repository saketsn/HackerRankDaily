package PatternProblem;

public class HollowPyramidStarPattern {
    public static void main(String[] args) {

        for(int i =1; i<= 5; i++){
            for(int j = 1; j <=9; j++){
                if(i+j == 6 || j-i == 4 || i == 5){
                    System.out.print(" X");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
