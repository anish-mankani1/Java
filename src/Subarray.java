import java.util.*;

public class Subarray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -2, 3};
        int target = 3;

        int result = countSubarraysWithSum(arr, target);
        System.out.println("Count = " + result);
    }


    public static int countSubarraysWithSum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // prefix sum zero appears once

        int sum = 0;
        int count = 0;

        for (int x : arr) {

            sum += x;   // running prefix sum

            // Check if sum - target exists
            if (map.containsKey(sum - target)) {
                count += map.get(sum - target);
            }

            // Store current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
