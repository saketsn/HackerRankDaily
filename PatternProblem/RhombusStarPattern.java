package PatternProblem;

public class RhombusStarPattern {
    public static void main(String[] args) {

        for (int i = 0; i< 4; i++){
            if(i> 0 && i< 4){
                for(int k = 1; k <=i; k++){
                    System.out.print(" ");
                }
            }
            for(int j = 0 ; j< 4; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
