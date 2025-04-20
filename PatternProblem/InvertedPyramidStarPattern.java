package PatternProblem;

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
    }
}
