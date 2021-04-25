import java.util.Arrays;

public class PivotIndex {

    /*
    Given an array, return the element (pivot) such that the sum of elements to the left
    is equal to the sum of elements to the right

    Return -1 if such pivot is not found
     */
    public static void main (String[] args){

         System.out.println(pivotIndex(null));
         System.out.println(pivotIndex(new int []{}));
         System.out.println(pivotIndex(new int[]{1,7,3,6,2}));
         System.out.println(pivotIndex(new int[]{2, -3, 2,8, 1}));
         System.out.println(pivotIndex(new int[]{90, 732, 902, 2368, 45271, 8934}));
    }

    public static int pivotIndex(int[] nums) {
        if(nums == null) return -1;

        if(nums.length == 0) return -1;

        int leftSum = 0;

        int rightSum = sumArrayStream(nums);

        for (int counter = 0; counter < nums.length; counter++)
        {
            rightSum -= nums[counter];
            if(rightSum == leftSum)
            {
                return nums[counter];
            }
            else {
                leftSum += nums[counter];
            }
        }
        return -1;
    }

    private static int sumArrayLoop(int[] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    private static int sumArrayStream(int[] array){
        return Arrays.stream(array).sum();
    }

    private static int sumArrayReduce(int[] array){
        return Arrays.stream(array).reduce(0, (a, b) -> a+b);
    }
}
