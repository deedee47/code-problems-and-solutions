import java.util.Arrays;

public class AlgoFridays {

    public static void main (String[] args){

        //Algo Friday 1
        System.out.println("Algo Friday 1");
        System.out.println(removeDuplicates(null));
        System.out.println(removeDuplicates(new int[]{}));
        System.out.println(removeDuplicates(new int[]{1, 2, 3, 3, 3, 4, 4, 5}));
        System.out.println();

        //Algo Friday 2
        System.out.println("Algo Friday 2");
        System.out.println(countOfElementsExcludingVal(null, 1));
        System.out.println(countOfElementsExcludingVal(new int[] {0,0,0,0}, 5));
        System.out.println(countOfElementsExcludingVal(new int[]{}, 3));
        System.out.println(countOfElementsExcludingVal(new int[]{1, 2, 3, 3, 3, 4, 4, 5}, 2));
        System.out.println();
        System.out.println("Algo Friday 2 - Optimized");
        System.out.println(countOfElementsExcludingVal(null, 1));
        System.out.println(countOfElementsExcludingVal2(new int[] {0,0,0,0}, 5));
        System.out.println(countOfElementsExcludingVal2(new int[]{}, 3));
        System.out.println(countOfElementsExcludingVal2(new int[]{1, 2, 3, 3, 3, 4, 4, 5}, 2));
        System.out.println();

        //Algo Friday 3
        System.out.println("Algo Friday 3");
        System.out.println(Arrays.toString(getBoundaryIndexesOfVal(new int[]{1, 0, 2, -5, 2, -3, 3, 9, 6, 5, 2}, 2)));
        System.out.println(Arrays.toString(getBoundaryIndexesOfVal2(new int[]{1, 0, 2, -5, 2, -3, 3, 9, 6, 5, 2}, 2)));
        System.out.println(Arrays.toString(getBoundaryIndexesOfVal(new int[]{}, 2)));
        System.out.println(Arrays.toString(getBoundaryIndexesOfVal2(new int[]{}, 2)));
        System.out.println(Arrays.toString(getBoundaryIndexesOfVal(null, 2)));
        System.out.println(Arrays.toString(getBoundaryIndexesOfVal2(null, 2)));
        System.out.println(Arrays.toString(getBoundaryIndexesOfVal(new int[]{0, 0, 0, 0, 0}, 0)));
        System.out.println(Arrays.toString(getBoundaryIndexesOfVal2(new int[]{0, 0, 0, 0, 0}, 0)));
        //-5,-3,0,1,2,2,2,3,5,6,9

        //Algo Friday 4
        System.out.println("Algo Friday 4");
        System.out.println(Arrays.toString(getProducts(new int[]{1, 2, -5, 2, -3, 3, 9, 6, 5, 2})));
        System.out.println(Arrays.toString(getProducts(new int[]{1, 0, 2, -5, 2, -3, 3, 9, 6, 5, 2})));
        System.out.println(Arrays.toString(getProducts(new int[]{10, 29})));
        System.out.println(Arrays.toString(getProducts(new int[]{10})));
        System.out.println(Arrays.toString(getProducts(new int[]{4,5,10, 2})));
        System.out.println(Arrays.toString(getProducts(new int[]{})));
        System.out.println(Arrays.toString(getProducts(null)));
        System.out.println(Arrays.toString(getProducts(new int[]{0, 0, 0, 0, 0})));
        System.out.println(Arrays.toString(getProducts(new int[]{0, 0, 0, 0, 5})));
        System.out.println(Arrays.toString(getProducts(new int[]{4,3, 0})));
    }

    //Algo Friday 1
    //Return new count of unique elements from a sequence of elements
    public static int removeDuplicates(int[] nums)
    {
        if (nums == null) return 0;

        int arrSize = nums.length;
        if (arrSize == 0) return 0;

        int finalCount = 1; // Count the first element by default
        for(int count = 0; count < arrSize; count++)
        {
            if (count != arrSize - 1 && nums[count] != nums[count+1]) finalCount++;
        }
        return finalCount;
    }

    //Algo Friday 2
    //Return new count of elements in an array excluding val
    public static long countOfElementsExcludingVal(int[] nums, int val){
        if(nums == null) return 0;

        //return Arrays.stream(nums).filter(x->x!=val).count();

        int countWithoutVal = nums.length;

        for(int item : nums){

            if (item == val) countWithoutVal--;
        }
        return countWithoutVal;
    }

    //Optimized solution for Algo Friday 2
    public static long countOfElementsExcludingVal2(int[] nums, int val){
        if(nums == null) return 0;

        int start = 0;
        int end = nums.length - 1;
        int countWithoutVal = 0;

        while(start <= end){

            if(start == end){
                //count only one value
                if (nums[start] != val) countWithoutVal++;
            }
            else
            {
                if (nums[start] != val) countWithoutVal++;
                if (nums[end] != val) countWithoutVal ++;
            }

            start++; end--;
        }
        return countWithoutVal;
    }

    //Algo Friday 3
    //Return the start and end index of a given value in a unsorted array
    public static int[] getBoundaryIndexesOfVal(int[] nums, int val){
        if(nums == null) return new int[] {-1, -1};

        if (nums.length == 0) return new int[] {-1, -1};

        Arrays.sort(nums);

        int startIndex = 0;
        int endIndex = nums.length - 1;
        boolean startFound = false;
        boolean endFound = false;

        int[] boundariesOfVal = new int[2];

        while(startIndex <= endIndex){ //if there's only one occurrence, start and end index will be the same

            if(!startFound)
            {
                if(nums[startIndex] == val)
                {
                    boundariesOfVal[0] = startIndex;
                    startFound = true; //stop checking this block
                }
                else
                {
                    startIndex++; //increment only when the first occurrence has not been found
                }
            }

            if(!endFound)
            {
                if(nums[endIndex] == val)
                {
                    boundariesOfVal[1] = endIndex;
                    endFound = true; //stop checking this block
                }
                else
                {
                    endIndex--; //decrement only when the last occurrence has not been found
                }
            }

            if(startFound && endFound) return boundariesOfVal;
        }

        return new int[]{-1, -1};

    }

    public static int[] getBoundaryIndexesOfVal2(int[] nums, int val){
        if(nums == null) return new int[] {-1, -1};

        if (nums.length == 0) return new int[] {-1, -1};

        int startIndex = 0;
        int endIndex = nums.length - 1;
        int preValCount = 0;
        int postValCount = 0;

        while(startIndex <= endIndex){ //if there's only one occurrence, start and end index will be the same

            if(startIndex == endIndex){
                if(nums[startIndex] < val) preValCount++;
                if(nums[startIndex] > val) postValCount++;
            }else
            {
                if(nums[startIndex] < val) preValCount++;
                if(nums[startIndex] > val) postValCount++;
                if(nums[endIndex] < val)  preValCount++;
                if(nums[endIndex] > val) postValCount++;
            }

            startIndex++;
            endIndex--;
        }

        if(preValCount + postValCount == nums.length) return new int[]{-1, -1};

        return new int[]{preValCount, nums.length - 1 - postValCount};
    }

    //Algo Friday 4
    //Return an array of products where product[i] is a product of all other elements in nums array except i
    public static int[] getProducts(int[] nums){

        if(nums == null) return new int[0];
        if(nums.length == 0) return new int[0];
        if(nums.length == 1) return new int[]{0};


        int[] products = new int[nums.length];

        //any number multiplied by 1 is the same number; therefore allProducts cannot be initialized to 0
        int allProducts = 1, start = 0, end = nums.length-1, countOfZeros = 0;

        while(start<=end){

            //if all elements are 0, no product to return
            if(start==end){

                if(nums[start] == 0){
                    countOfZeros++; //ignore 0s in the array, keep a count in case all/some elements are 0;
                }
                else{
                    allProducts *= nums[start];
                }

            }
            else{

                if(nums[start] == 0){
                    countOfZeros++;
                }
                else{
                    allProducts *= nums[start];
                }

                if(nums[end] == 0){
                    countOfZeros++; //ignore 0s in the array, keep a count in case all elements are 0;
                }
                else{
                    allProducts *= nums[end];
                }
            }
            start++; end--;

        }

        if (countOfZeros >  1) return products; //product of any other number including a 0 still results in 0

        // only countOfZeros = 1 can result in the index having a product
        for(int index = 0; index < nums.length; index++){
            products[index] = (countOfZeros == 1) ?
                                    (nums[index] == 0) ? allProducts : 0
                              : allProducts/nums[index];
        }

        return products;
    }

    //AlgoFriday 5 is ArrayMerge Class
}


