import java.util.Arrays;
import java.util.Random;

public class sortArray {
    public static void main(String[] args) {

        Random rd = new Random(50);
        int[]vetor = {1, 5, 9, 3, 7, 4, 6, 2, 8, 0};
        sortArray(vetor);
        System.out.println("Numero inpar" +  Arrays.toString(vetor));
    }
    public static void sortArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (nums[left] % 2 == 0 && left < right) {
                left++;
            }
            while (nums[right] % 2 != 0 && left < right) {
                right--;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }



}
