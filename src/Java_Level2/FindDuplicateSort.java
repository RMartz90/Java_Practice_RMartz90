package Java_Level2;

import java.util.Arrays;

public class FindDuplicateSort {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2};

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            // Comparamos con el anterior
            if (nums[i] == nums[i - 1]) {
                System.out.println("Duplicado: " + nums[i]);
                return;
            }
        }

        System.out.println("No hay duplicados");
    }
}
