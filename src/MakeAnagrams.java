import java.util.HashSet;
import java.util.Set;

public class MakeAnagrams {
    /*
    find the total number of characters to remove from two strings in order to make them anagrams
     */

    public static void main (String[] args){
        System.out.println(makingAnagrams("cba", "abc"));
        System.out.println(makingAnagrams("cde", "abc"));
        System.out.println(makingAnagrams("", "abc"));
        System.out.println(makingAnagrams("cde", ""));
        System.out.println(makingAnagrams("", ""));
        System.out.println(makingAnagrams("ccccc", "ccddc"));
    }

    public static int makingAnagrams(String s1, String s2) {
        // Write your code here
        if(s1.length() == 0 && s2.length() == 0) return 0;
        if(s1.length() !=0 && s2.length() == 0) return s1.length();
        if(s1.length() ==0 && s2.length() != 0) return s2.length();

        int mutuals = 0;
        Set<Integer> indexesOfS2 = new HashSet<>();

        for(int i = 0; i<s1.length(); i++){
            char item = s1.charAt(i);
            int itemIndexInS2 = s2.indexOf(item);

            if(itemIndexInS2 == -1) continue;

            if(!indexesOfS2.contains(itemIndexInS2)){
                mutuals++;
                indexesOfS2.add(itemIndexInS2);
            }
            else{
                //check for other existing indexes
                int newIndex = s2.indexOf(item, itemIndexInS2+1);

                //get all indexes of the same character
                while(newIndex != -1 && indexesOfS2.contains(newIndex)){
                    newIndex = s2.indexOf(item, newIndex+1);
                }

                if(newIndex != -1){
                    mutuals++;
                    indexesOfS2.add(newIndex);
                }
            }
        }

        return (s1.length() - mutuals) + (s2.length() - mutuals);
    }

}
