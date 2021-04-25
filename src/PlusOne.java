import java.util.Arrays;

public class PlusOne {
    /*
    Return an array after adding 1 to the current array

    each element takes only one number from 0-9
    [1,2,3] returns [1,2,4]
    [9] returns [1,0]
    [9,9] returns [1,0,0]
    The array cannot be null or empty

     */

    public static void main (String[] args){

        System.out.println(Arrays.toString(plusOne(new int[]{1,4,9,9})));
    }

    public static int[] plusOne(int[] digits)
    {

        if(digits[digits.length - 1] == 9)
        {
            return extendArray(digits);
        }

        digits[digits.length - 1] += 1;
        return digits;
    }

    private static int[] extendArray(int[] array){

        int counter = array.length - 2;
        while(counter >= 0 && array[counter] == 9)
        {
            array[counter] = 0;
            counter--;
        }

        if (counter < 0) // needs extention
        {
            int[] newArray = new int[array.length + 1];
            newArray[0] = 1;
            return newArray;
        }

        array[counter] += 1;
        return array;
    }
}
