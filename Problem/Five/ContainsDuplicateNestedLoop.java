package Problem.Five;

import java.util.Scanner;

public class ContainsDuplicateNestedLoop {
    public static boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Duplicate found
                }
            }
        }
        return false; // No duplicates
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(hasDuplicate(nums)); // Output: true or false

        sc.close();
    }
}
