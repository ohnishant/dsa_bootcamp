package com.day07;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement_1 {
    int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };

        NextGreaterElement_1 solution = new NextGreaterElement_1();

        int[] result = solution.nextGreaterElement(nums1, nums2);

        System.out.println("Expected Result: -1 3 -1 ");

        System.out.print("Computed Result: ");
        for (int i : result) {
            System.out.print(i + " ");
        }

    }
}
