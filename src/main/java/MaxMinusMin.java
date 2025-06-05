
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        if (nums.size() == 0) {
            return 0;
        }
        int maxval = nums.get(0);
        int minval = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            maxval = Math.max(maxval, nums.get(i));
            minval = Math.min(minval, nums.get(i));
        }
        return maxval - minval;
    }
}
