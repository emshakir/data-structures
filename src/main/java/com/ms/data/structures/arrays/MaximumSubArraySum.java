package com.ms.data.structures.arrays;

public class MaximumSubArraySum {

    // Using prefix array technique
    public int get(int[] input) {

        // create a prefix array
        int[] prefix = new int[input.length];
        prefix[0] = input[0];
        for (int i = 1; i < input.length; i++) {
            prefix[i] = prefix[i - 1] + input[i];
        }

        // Outer loop will have sum till i
        // Inner loop will have sum till j
        // Sum till j - sum till i, will give sum of that subarray.
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                int currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }

    public int kadanes(int[] input) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i : input) {
            sum += i;
            if (sum < 0) {
                sum = 0;
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public int divide(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int mid = left + (right - left) / 2;

        int leftSum = divide(nums, left, mid);
        int rightSum = divide(nums, mid + 1, right);
        int crossSum = conquer(nums, left, mid, right);

        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }

    private int conquer(int[] nums, int left, int mid, int right) {
        int leftMaxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            leftMaxSum = Math.max(leftMaxSum, sum);
        }

        int rightMaxSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            rightMaxSum = Math.max(rightMaxSum, sum);
        }

        return leftMaxSum + rightMaxSum;
    }
}
