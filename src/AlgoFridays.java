import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class AlgoFridays {

    public static void main (String[] args){
//
//        //Algo Friday 1
//        System.out.println("Algo Friday 1");
//        System.out.println(removeDuplicates(null));
//        System.out.println(removeDuplicates(new int[]{}));
//        System.out.println(removeDuplicates(new int[]{1, 2, 3, 3, 3, 4, 4, 5}));
//        System.out.println();
//
//        //Algo Friday 2
//        System.out.println("Algo Friday 2");
//        System.out.println(countOfElementsExcludingVal(null, 1));
//        System.out.println(countOfElementsExcludingVal(new int[] {0,0,0,0}, 5));
//        System.out.println(countOfElementsExcludingVal(new int[]{}, 3));
//        System.out.println(countOfElementsExcludingVal(new int[]{1, 2, 3, 3, 3, 4, 4, 5}, 2));
//        System.out.println();
//        System.out.println("Algo Friday 2 - Optimized");
//        System.out.println(countOfElementsExcludingVal(null, 1));
//        System.out.println(countOfElementsExcludingVal2(new int[] {0,0,0,0}, 5));
//        System.out.println(countOfElementsExcludingVal2(new int[]{}, 3));
//        System.out.println(countOfElementsExcludingVal2(new int[]{1, 2, 3, 3, 3, 4, 4, 5}, 2));
//        System.out.println();
//
//        //Algo Friday 3
//        System.out.println("Algo Friday 3");
//        System.out.println(Arrays.toString(getBoundaryIndexesOfVal(new int[]{1, 0, 2, -5, 2, -3, 3, 9, 6, 5, 2}, 2)));
//        System.out.println(Arrays.toString(getBoundaryIndexesOfVal2(new int[]{1, 0, 2, -5, 2, -3, 3, 9, 6, 5, 2}, 2)));
//        System.out.println(Arrays.toString(getBoundaryIndexesOfVal(new int[]{}, 2)));
//        System.out.println(Arrays.toString(getBoundaryIndexesOfVal2(new int[]{}, 2)));
//        System.out.println(Arrays.toString(getBoundaryIndexesOfVal(null, 2)));
//        System.out.println(Arrays.toString(getBoundaryIndexesOfVal2(null, 2)));
//        System.out.println(Arrays.toString(getBoundaryIndexesOfVal(new int[]{0, 0, 0, 0, 0}, 0)));
//        System.out.println(Arrays.toString(getBoundaryIndexesOfVal2(new int[]{0, 0, 0, 0, 0}, 0)));
//        //-5,-3,0,1,2,2,2,3,5,6,9
//
//
//        //Algo Friday 4
//        System.out.println("Algo Friday 4");
//        System.out.println(Arrays.toString(getProducts(new int[]{1, 2, -5, 2, -3, 3, 9, 6, 5, 2})));
//        System.out.println(Arrays.toString(getProducts(new int[]{1, 0, 2, -5, 2, -3, 3, 9, 6, 5, 2})));
//        System.out.println(Arrays.toString(getProducts(new int[]{10, 29})));
//        System.out.println(Arrays.toString(getProducts(new int[]{10})));
//        System.out.println(Arrays.toString(getProducts(new int[]{4,5,10, 2})));
//        System.out.println(Arrays.toString(getProducts(new int[]{})));
//        System.out.println(Arrays.toString(getProducts(null)));
//        System.out.println(Arrays.toString(getProducts(new int[]{0, 0, 0, 0, 0})));
//        System.out.println(Arrays.toString(getProducts(new int[]{0, 0, 0, 0, 5})));
//        System.out.println(Arrays.toString(getProducts(new int[]{4,3, 0})));
//
//
//        //Algo Friday 5
//        System.out.println("Algo Friday 5");
//        System.out.println(Arrays.toString(mergeSortedArray(null, null)));
//        System.out.println(Arrays.toString(mergeSortedArray(null, new int[]{1,2,3,4})));
//        System.out.println(Arrays.toString(mergeSortedArray( new int[]{5,6,7,8}, null)));
//        System.out.println(Arrays.toString(mergeSortedArray( new int[]{1}, new int[]{2})));
//        System.out.println(Arrays.toString(mergeSortedArray( new int[]{10, 100, 1000, 10000, 100000},
//                new int[]{345, 676, 57584, 593009})));
//        System.out.println(Arrays.toString(mergeSortedArray( new int[]{}, new int[]{1,4,6})));
//
//        //////////////////////////////////
//        System.out.println("Algo Friday 5 - Optimized");
//        System.out.println(Arrays.toString(mergeSortedArray2(null, null)));
//        System.out.println(Arrays.toString(mergeSortedArray2(null, new int[]{1,2,3,4})));
//        System.out.println(Arrays.toString(mergeSortedArray2( new int[]{5,6,7,8}, null)));
//        System.out.println(Arrays.toString(mergeSortedArray2( new int[]{1}, new int[]{2})));
//        System.out.println(Arrays.toString(mergeSortedArray2( new int[]{10, 100, 1000, 10000, 100000},
//                new int[]{345, 676, 57584, 593009})));
//        System.out.println(Arrays.toString(mergeSortedArray2( new int[]{}, new int[]{1,4,6})));

        //Algo Friday 6
//        System.out.println("Algo Friday 6");
//        System.out.println(Arrays.toString(shuffleLine(new int[]{4,1,3}, -1)));
//        System.out.println(Arrays.toString(shuffleLine(new int[]{8,5,3,7}, -2)));
//        System.out.println(Arrays.toString(shuffleLine(new int[]{8,5,3,7}, -3)));
//        System.out.println(Arrays.toString(shuffleLine(new int[]{8,5,3,7}, -1)));
//        System.out.println(Arrays.toString(shuffleLine(new int[]{8,4,3,7, 5, 2, 1}, -10)));
//
//        System.out.println(Arrays.toString(shuffleLine(new int[]{1,2,3,4,5}, 5)));
//        System.out.println(Arrays.toString(shuffleLine(new int[]{8,5,3,7}, 2)));
//        System.out.println(Arrays.toString(shuffleLine(new int[]{8,5,3,7}, 3)));
//        System.out.println(Arrays.toString(shuffleLine(new int[]{8,4,3,7, 5, 2, 1}, 10)));

        //Algo Friday 7
//        System.out.println("Algo Friday 7");
//        System.out.println(getMinDifferenceInMinutes(new String[]{"16:00","16:15","12:20"}));
//        System.out.println(getMinDifferenceInMinutes(new String[]{"16:00","1615","12:20"}));
//        System.out.println(getMinDifferenceInMinutes(new String[]{"16-00","1615","12/20"}));
//        System.out.println(getMinDifferenceInMinutes(new String[]{"16:00"}));
//        System.out.println(getMinDifferenceInMinutes(new String[0]));
//        System.out.println(getMinDifferenceInMinutes(null));
//        System.out.println(getMinDifferenceInMinutes(new String[]{"08:20","23:55"}));
//        System.out.println(getMinDifferenceInMinutes(new String[]{"08:20","235"}));
//        System.out.println(getMinDifferenceInMinutes(new String[]{"3err", "gt445", "08:20","12:05"}));
//        System.out.println(getMinDifferenceInMinutes(new String[]{"03:12", "10:10", "08:20","12:05","10:10"}));
//
//        System.out.println("Algo Friday 7 Method 2");
//        System.out.println(getMinDifferenceInMinutes2(new String[]{"16:00","16:15","12:20"}));
//        System.out.println(getMinDifferenceInMinutes2(new String[]{"16:00","1615","12:20"}));
//        System.out.println(getMinDifferenceInMinutes2(new String[]{"16-00","1615","12/20"}));
//        System.out.println(getMinDifferenceInMinutes2(new String[]{"16:00"}));
//        System.out.println(getMinDifferenceInMinutes2(new String[0]));
//        System.out.println(getMinDifferenceInMinutes2(null));
//        System.out.println(getMinDifferenceInMinutes2(new String[]{"08:20","23:55"}));
//        System.out.println(getMinDifferenceInMinutes2(new String[]{"08:20","235"}));
//        System.out.println(getMinDifferenceInMinutes2(new String[]{"3err", "gt445", "08:20","12:05"}));
//        System.out.println(getMinDifferenceInMinutes2(new String[]{"03:12", "10:10", "08:20","12:05","10:10"}));

         //Algo Friday 8
//        System.out.println(playNumberLetterCombination("kkjjk"));
//        System.out.println(playNumberLetterCombination("1234"));
//        System.out.println(playNumberLetterCombination("000"));

        //Algo Friday 9
        Map<Character, List<Character>> map = new HashMap<>();
//        map.put('A', new ArrayList<Character>(){{add('B');add('C');}});
//        map.put('B', new ArrayList<Character>(){{add('A');}});
//        map.put('C', new ArrayList<Character>(){{add('B');}});


        map.put('A', new ArrayList<Character>(){{add('B');add('C');}});
        map.put('B', new ArrayList<Character>(){{add('D');}});
        map.put('C', new ArrayList<Character>(){{add('E');}});
        map.put('D', new ArrayList<Character>(){{add('E');}});


        System.out.println(isThereCycle(map));
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
    //merge 2 Sorted arrays
    //AlgoFridays 5
    public static int[] mergeSortedArray(int[] classA, int[] classB){
        if(classA == null && classB == null) return new int[0];
        else if (classA == null) return classB;
        else if (classB == null) return classA;

        int aIndex = 0, bIndex = 0, mergeIndex = 0;
        int[] merged = new int[classA.length + classB.length];

        while(aIndex < classA.length && bIndex < classB.length){
            merged[mergeIndex++] = (classA[aIndex] > classB[bIndex]) ? classB[bIndex++] : classA[aIndex++];
        }

        while (aIndex<classA.length){
            merged[mergeIndex++] = classA[aIndex++];
        }

        while (bIndex<classB.length){
            merged[mergeIndex++] = classB[bIndex++];
        }

        return merged;
    }

    public static int[] mergeSortedArray2(int[] classA, int[] classB){
        if(classA == null && classB == null) return new int[0];
        else if (classA == null) return classB;
        else if (classB == null) return classA;

        int aIndex = 0, bIndex = 0, mergeIndex = 0, classLength = classA.length+classB.length;
        int[] merged = new int[classLength];

        while(mergeIndex < classLength){
            if(aIndex<classA.length && bIndex<classB.length){
                merged[mergeIndex++] = (classA[aIndex] > classB[bIndex]) ? classB[bIndex++] : classA[aIndex++];
            }
            else if(aIndex >= classA.length){
                merged[mergeIndex++] = classB[bIndex++];
            }
            else if(bIndex >= classB.length){
                merged[mergeIndex++] = classA[aIndex++];
            }

        }

        return merged;
    }

    //AlgoFriday 6
    //Rearrange an assembly line of students given the number of students to move
    //-1 move student from front of line to back
    //+1 move student from back of line to front
    //0 no movement
    public static int[] shuffleLine(int[] line, int numberToShuffle){
        if(line == null) return null;

        int lineLength = line.length;
        if(numberToShuffle == 0 || lineLength == 0 || Math.abs(numberToShuffle) == lineLength) return line;

        if(Math.abs(numberToShuffle) > lineLength)
        {
            numberToShuffle = numberToShuffle % lineLength;
            //This is to fine the remaining slots to shuffle
        }

        int[] newLine = new int[lineLength];

        if(numberToShuffle < 0){
            numberToShuffle = Math.abs(numberToShuffle);

            //starting indexes on the new array
            int newLineBackIndex = lineLength - numberToShuffle;

            //starting indexes to copy from old array
            int moveToFrontStartIndex = numberToShuffle;

            System.arraycopy(line,moveToFrontStartIndex,newLine,0,lineLength - moveToFrontStartIndex);
            System.arraycopy(line,0,newLine,newLineBackIndex,numberToShuffle);

        }else {

            //starting indexes on the new array
            int newLineBackIndex = numberToShuffle;

            //starting indexes to copy from old array
            int moveToFrontStartIndex = lineLength - numberToShuffle;

            System.arraycopy(line,moveToFrontStartIndex,newLine,0,numberToShuffle);
            System.arraycopy(line,0,newLine,newLineBackIndex,lineLength - numberToShuffle);
        }

        return newLine;
    }


    //AlgoFriday 7
    //Find the minimum time difference in minutes between a list of time entries (HH:MM)
    public static long getMinDifferenceInMinutes(String[] journal){
        if(journal == null) return 0;

        if(journal.length == 0) return 0;

        //sorting keeps times close together and will eliminate comparing each entry with all other elements
        //no need to sort any array <= 2
        if(journal.length > 2) Arrays.sort(journal);

        return timeDifferenceInMins(journal);
    }

    private static long timeDifferenceInMins(String[] journal){

        //based on requirement, journal entries are in HH:MM - 24hr format
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

        int prevIndex = 0, index = 0;
        long diff = Integer.MIN_VALUE;

        //get previousElement in the array to avoid recomputing the same date when checking adjacent items
        //cant use index 0 as default prev - it might be invalid; hence find first valid date
        long prev = 0;
        while(prevIndex < journal.length){
            try {
                prev = dateFormat.parse(journal[prevIndex]).getTime();
                index = prevIndex+1;
                break;
            } catch (ParseException e) {
                //String is in a wrong format - ignore
                prevIndex++;
            }
        }

        //no valid entries in the list
        if(prev == 0 ) return 0;

        //helps to track if there are any other valid elements after prev
        boolean isValidExists = false;
        while(index < journal.length){
            long nextDate = 0;

            try {
                nextDate = dateFormat.parse(journal[index]).getTime();
                isValidExists = true;
            } catch (ParseException e) {
                //String is in a wrong format - ignore
                index++;
                continue;
            }

           //calculate difference
            long timeDiff = Math.abs(nextDate - prev);
            diff = (diff != Integer.MIN_VALUE) ? Math.min(timeDiff, diff) : timeDiff;

            //next values
            prev = nextDate;
            index++;
        }

        return (isValidExists) ? TimeUnit.MILLISECONDS.toMinutes(diff) : TimeUnit.MILLISECONDS.toMinutes(prev);
    }

    //Second solution with space trace-off
    public static long getMinDifferenceInMinutes2(String[] journal){
        if(journal == null) return 0;

        if(journal.length == 0) return 0;

        //Using a set to store unique and valid entries
        //if any entry is duplicated, it will auto break because that will be the minimum time difference
        //TreeSet stores data in natural order - O(Log N) time complexity - better than sorting array with NLogN
        //sorting keeps times close together and will eliminate comparing each entry with all other elements
        //Tradeoff extra space for faster sort process
        Set<Long> validEntries = new TreeSet<>();

        //based on requirement, journal entries are in HH:MM - 24hr format
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

        //strip out invalid entries and put the rest in the tree set - O(N)
        for(int index = 0; index < journal.length; index++){
            try {
                long timeInMs = dateFormat.parse(journal[index]).getTime();
                if(validEntries.contains(timeInMs)) return 0;
                validEntries.add(timeInMs);
            } catch (ParseException e) {
                //String is in a wrong format - ignore
                continue;
            }
        }

        //no valid entries after the filter
        if(validEntries.size() == 0) return 0;


        //find difference - O(N) worst case
        long prev = Long.MIN_VALUE;
        long diff = Long.MIN_VALUE;
        for(long entry : validEntries){
            if(prev != Long.MIN_VALUE){
                long timeDiff = Math.abs(entry - prev);
                diff = (diff != Long.MIN_VALUE) ? Math.min(timeDiff, diff) : timeDiff;
            }
            prev = entry;
        }

        return (diff!=Long.MIN_VALUE) ? TimeUnit.MILLISECONDS.toMinutes(diff) : TimeUnit.MILLISECONDS.toMinutes(prev);
    }


    //AlgoFriday 8
    //KeypadNumber to letter mapping. Find all combinations of letters given a set of numbers
    //2-9 corresponds to letters on the phone keypad and the same index of the array
    private static String[] keyPadMapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv" ,"wxyz"};
    public static List<String> playNumberLetterCombination(String number){

        List<String> combinedWords = new ArrayList<>();

        //empty or wrong input
        if(number.isEmpty() || !number.matches("\\d+")) return combinedWords;

        combination("", number, 0, combinedWords);

        return combinedWords;
    }

    private static void combination(String combo, String number, int numberIndex, List<String> combinedWords)
    {
        //break recursion here
        if(numberIndex >= number.length()){
           combinedWords.add(combo);
           return;
        }

        //get number
        int index = Character.digit(number.charAt(numberIndex), 10);

        //get corresponding letters
        String letters = keyPadMapping[index]; //retrieve number mapping

        for(int i = 0; i < letters.length(); i++){
            combination(combo+letters.charAt(i), number, numberIndex + 1,
                    combinedWords);
        }
    }

    //Algo Friday 9
    //determine f there's at least one cycle in the given direction
    //a map of starting point and directions, tell if there's a cycle present
    public static boolean isThereCycle(Map<Character, List<Character>> map){
        if(map == null || map.isEmpty()) return false;

        //use each node as starting point
        for(char item : map.keySet()){
            //create new tracking experience for each start point
           Stack<Character> trackPad = new Stack<>();
           List<Character> visitedPoints = new ArrayList<>();

           visitedPoints.add(item);
           trackPad.addAll(map.get(item));

            while(!trackPad.isEmpty()){
                char subItem = trackPad.pop();

                //check if subpath leads back to origin
                //if key is not found, return a default list - handles null exceptions
                if(map.getOrDefault(subItem, new ArrayList<>()).contains(item)) return true;

                //avoid re-processing a path
                if(!visitedPoints.contains(subItem)){
                    trackPad.addAll(map.getOrDefault(subItem, new ArrayList<>()));
                    visitedPoints.add(subItem);
                }

            }
        }
        return false;
    }

}


