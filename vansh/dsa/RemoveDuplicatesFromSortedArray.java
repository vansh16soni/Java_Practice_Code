package vansh.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(long[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Remove Duplicates from Sorted Array");
        System.out.println("Enter numbers in sorted order (space-separated OR a continuous string of digits):");
        String inputLine = scanner.nextLine().trim();

        long[] nums;


        if (inputLine.contains(" ")) {
            String[] tokens = inputLine.split("\\s+");
            nums = new long[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                nums[i] = Long.parseLong(tokens[i]);
            }
        } else {
            List<Long> list = new ArrayList<>();
            for (char ch : inputLine.toCharArray()) {
                if (Character.isDigit(ch)) {
                    list.add((long) (ch - '0'));
                }
            }
            nums = new long[list.size()];
            for (int i = 0; i < list.size(); i++) {
                nums[i] = list.get(i);
            }
        }

        boolean isSorted = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                isSorted = false;
                break;
            }
        }
        if (!isSorted) {
            System.out.println("Warning: Input array is not sorted. Results may be incorrect.");
        }

        int newLength = removeDuplicates(nums);
        long[] resultArray = Arrays.copyOf(nums, newLength);

        System.out.println("New length: " + newLength);
        System.out.print("Modified array (first " + newLength + " elements): ");
        System.out.println(Arrays.toString(resultArray));

        scanner.close();
    }
}
