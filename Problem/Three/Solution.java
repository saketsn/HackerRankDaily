package Problem.Three;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Read list size
        List<Integer> list = new ArrayList<>();

        // Read initial elements
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int Q = sc.nextInt(); // Read number of queries
        sc.nextLine(); // Consume the newline properly

        for (int i = 0; i < Q; i++) {
            if (!sc.hasNextLine()) break; // Check if input is available
            String query = sc.next(); // Read query type

            if (query.equals("Insert") && sc.hasNextInt()) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if (query.equals("Delete") && sc.hasNextInt()) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }

        // Print the modified list
        for (int num : list) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
