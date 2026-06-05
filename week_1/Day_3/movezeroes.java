package week_1.Day_3;

public class movezeroes {
    

    public static void moveZeroes(int[] nums) {

        int j = 0;

        // non-zero elements shift karo
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // remaining positions ko zero karo
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.print("After moving zeroes: ");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

