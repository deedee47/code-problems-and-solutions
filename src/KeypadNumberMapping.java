import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeypadNumberMapping {

    public static void main(String[] args)
    {
        List<String> validWords = new ArrayList(Arrays.asList("gum", "hum", "mon", "sum"));
        System.out.println(keyPadNumberLetterFormulation("486", validWords));
    }

    //recursion, tree problem - Twitter; Amazon
    //map number to letter on key pad; find all possible letter combinations, check if the combo is in the valid
    //words and return a list of all combinations
    private static String[] keyPadMapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv" ,"wxyz"};

    //correct solution
    public static List<String> keyPadNumberLetterFormulation(String phoneNumber,List<String> validWords){
        List<String> combinedWords = new ArrayList<>();
        combination("", phoneNumber, 0, combinedWords, validWords);

        return combinedWords;
    }

    private static void combination(String combo, String phoneNumber, int phoneNumberIndex, List<String> combinedWords,
                                    List<String> validWords){
        //break recursion here
        if(phoneNumberIndex >= phoneNumber.length()){
             if(validWords.contains(combo)) combinedWords.add(combo);
            return;
        }

        int index = Character.digit(phoneNumber.charAt(phoneNumberIndex), 10);
        String letters = keyPadMapping[index]; //retrieve number mapping

        for(int i = 0; i < letters.length(); i++){
            combination(combo+letters.charAt(i), phoneNumber, phoneNumberIndex + 1,
                    combinedWords, validWords);
        }
    }

}
