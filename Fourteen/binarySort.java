package Fourteen;

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        return bin(nums, target, start, end);

    }

    static int bin(int [] nums, int target, int start, int end){

        if(start > end){
            return -1;
        }

        int m = start + (end - start)/2;

        if(nums[m] == target){
            return m;
        }
        if(target < nums[m]){
            return bin(nums, target, start, m-1);
        }
        return bin(nums, target, m+1, end);
    }
}
