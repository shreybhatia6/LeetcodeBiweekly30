import java.util.ArrayList;
import java.util.Collections;

public class Question2 {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int sum = 0;
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        int j = i;
        while (i != n) {

            if (j == n) {
                i++;
                j = i;
            }
            if (i == n){
                break;
            }
            al.add(helperFunction(nums, i, j));
            j++;
        }

        Collections.sort(al);

        while (left <= right) {
            sum += al.get(left - 1);
            left++;
        }
        return sum;
    }

    private static int helperFunction(int[] nums, int i, int j) {
        int sum = 0;
        while (i <= j) {
            sum += nums[i];
            i++;
        }
        return sum;
    }
}













