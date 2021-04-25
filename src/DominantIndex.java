import java.util.Arrays;

public class DominantIndex {
    /*
    Find whether the largest element in the array is at least twice as much as every other number in the array.
    If it is, return the index of the largest element, otherwise, return -1.
     */
    public static void main(String[] args)
    {
        //Impl 1
        System.out.println(dominantIndex(null));
        System.out.println(dominantIndex(new int[]{}));
        System.out.println(dominantIndex(new int[]{0,2,0,1}));
        System.out.println(dominantIndex(new int[]{1,2,3,4}));
        System.out.println();

        //Impl 2 - Optimized 2
        System.out.println(dominantIndex(null));
        System.out.println(dominantIndex(new int[]{}));
        System.out.println(dominantIndex2(new int[]{0,2,0,1}));
        System.out.println(dominantIndex2(new int[]{1,2,3,4}));
    }

    public static int dominantIndex(int[] nums) {
        if(nums == null) return -1;

        if(nums.length == 0) return -1;

        int largestNumberIndex = 0;

        int[] multipliedArray = new int[nums.length];

        for(int i = 0; i<nums.length; i++){

            multipliedArray[i] = 2*nums[i];

            if(nums[largestNumberIndex] < nums[i]) {

                largestNumberIndex = i;
            }
        }

        Arrays.sort(multipliedArray);

        int index = multipliedArray.length -1;
        while(index >= 0 && (2*nums[largestNumberIndex] == multipliedArray[index]))
        {
            index--;
        }
        if(index == -1) return largestNumberIndex;

        return (nums[largestNumberIndex] >= multipliedArray[index]) ? largestNumberIndex : -1;

    }

    public static int dominantIndex2(int[] nums) {
        if (nums == null) return -1;

        if (nums.length == 0) return -1;

        int largestNumberIndex = -1;

        for (int i = 0; i < nums.length; i++) {

            if (largestNumberIndex == -1 || nums[largestNumberIndex] < nums[i]) largestNumberIndex = i;
        }

        for (int j = 0; j < nums.length; j++) {

            if (j != largestNumberIndex && nums[largestNumberIndex] < 2 * nums[j]) return -1;
        }

        return largestNumberIndex;
    }
}
