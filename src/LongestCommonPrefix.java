public class LongestCommonPrefix {
    /*
    This returns the longest prefix found in all elements of an array
     */

    public static void main (String[] args){
        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
        System.out.println(longestCommonPrefix(new String[]{"abba", "abb", "abbbb", "abbaa"}));
    }

    public static String longestCommonPrefix(String[] strs) {

        int strsLength = strs.length;
        if (strsLength == 0) return "";
        if (strsLength == 1) return strs[0];

        StringBuilder result = new StringBuilder();
        int i = 0, j= 1;
        while(i < strs[0].length()){ //the max prefix is as long as the first item in the array

            char letter = strs[0].charAt(i);

            if (j < strsLength && i < strs[j].length() && strs[j].charAt(i) == letter)
            {
                j++;
            }
            else
            {
                break;
            }

            if(j == strs.length) //end of array
            {
                result.append(letter); //letter was found in all elements
                i++; //move on to the next letter
                j = 1; //reset j
            }
        }

        return result.toString();
    }

}
