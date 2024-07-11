package com.ms.data.structures.arrays;

public class ReverseArray {

    public void reverse(int[] input, int si, int ei) {
        while (si < ei) {
            swap(input, si++, ei--);
        }
    }

    private void swap(int[] input, int first, int last) {
        int temp = input[first];
        input[first] = input[last];
        input[last] = temp;
    }
}
