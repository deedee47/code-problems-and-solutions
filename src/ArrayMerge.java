import java.util.Arrays;

public class ArrayMerge {
    //merge 2 Sorted arrays
    //AlgoFridays 5
    public static void main(String[] args){

        System.out.println(Arrays.toString(mergeSortedArray(null, null)));
        System.out.println(Arrays.toString(mergeSortedArray(null, new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(mergeSortedArray( new int[]{5,6,7,8}, null)));
        System.out.println(Arrays.toString(mergeSortedArray( new int[]{1}, new int[]{2})));
        System.out.println(Arrays.toString(mergeSortedArray( new int[]{10, 100, 1000, 10000, 100000},
                new int[]{345, 676, 57584, 593009})));
        System.out.println(Arrays.toString(mergeSortedArray( new int[]{}, new int[]{1,4,6})));

//////////////////////////////////
//        System.out.println(Arrays.toString(mergeSortedArray2(null, null)));
//        System.out.println(Arrays.toString(mergeSortedArray2(null, new int[]{1,2,3,4})));
//        System.out.println(Arrays.toString(mergeSortedArray2( new int[]{5,6,7,8}, null)));
        System.out.println(Arrays.toString(mergeSortedArray2( new int[]{1}, new int[]{2})));
        System.out.println(Arrays.toString(mergeSortedArray2( new int[]{10, 100, 1000, 10000, 100000},
                new int[]{345, 676, 57584, 593009})));
        System.out.println(Arrays.toString(mergeSortedArray2( new int[]{}, new int[]{1,4,6})));
    }

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

}
