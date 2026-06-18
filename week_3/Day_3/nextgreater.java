package week_3.Day_3;

import java.util.*;

public class nextgreater{

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int num : nums2) {

            while (!st.isEmpty() && num > st.peek()) {
                map.put(st.pop(), num);
            }

            st.push(num);
        }

        while (!st.isEmpty()) {
            map.put(st.pop(), -1);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        System.out.println(Arrays.toString(
                nextGreaterElement(nums1, nums2)));
    }
}