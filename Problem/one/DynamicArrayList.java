package Problem.one;

import java.util.*;

public class DynamicArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int D = scanner.nextInt();
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int j = 0; j < D; j++) {
                tempList.add(scanner.nextInt());
            }
            list.add(tempList);
        }

        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            int X = scanner.nextInt() - 1;
            int Y = scanner.nextInt() - 1;

            if (X >= 0 && X < list.size() && Y >= 0 && Y < list.get(X).size()) {
                System.out.println(list.get(X).get(Y));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
