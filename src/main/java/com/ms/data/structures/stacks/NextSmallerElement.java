package com.ms.data.structures.stacks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {

    //4, 5, 2, 10, 8
    public int[] nextSmallerForwardIteration(int[] A) {
        int[] R = new int[A.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.length; i++) {

            while (!stack.isEmpty() && A[stack.peek()] > A[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                R[i] = -1;
            } else {
                R[i] = A[stack.peek()];
            }
            stack.push(i);
        }
        return R;
    }

    public int[] nextSmallerReverseIteration(int[] A) {
        int[] R = new int[A.length];
        Stack<Integer> stack = new Stack();
        Arrays.fill(R, -1);
        // 4 5 2 10 8
        for (int i = A.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[i] < A[stack.peek()]) {
                R[stack.pop()] = A[i];
            }
            stack.push(i);
        }
        return R;
    }

    public int[] nextSmallerCircle(int[] A) {
        int[] R = new int[A.length];
        Stack<Integer> stack = new Stack();
        Arrays.fill(R, -1);
        // 4 5 2 10 8
        for (int i = (A.length * 2) - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[i % A.length] < A[stack.peek()]) {
                R[stack.pop()] = A[i % A.length];
            }
            stack.push(i % A.length);
        }
        return R;
    }
}
