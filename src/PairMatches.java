import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Match pairs of the same socks(numbers) and return the total number of pairs in a list of socks(numbers)
 */
public class PairMatches {

    public static void main(String[] args){
        System.out.println(sockMerchant(0, null));
        System.out.println(sockMerchant(5, null));
        System.out.println(sockMerchant(1, new ArrayList<Integer>(){{add(1);}}));
        System.out.println(sockMerchant(9, new ArrayList<Integer>(){{add(10); add(20); add(20); add(10);
                                                    add(10); add(30); add(50); add(10); add(20);}}));
    }
    public static int sockMerchant(int n, List<Integer> ar) {

        if(ar == null || n == 0 || n == 1) return 0;

        int startIndex = 0;
        int endIndex = n-1;
        int pairs = 0;
        Set<Integer> memory = new HashSet<>();

        while(startIndex <= endIndex){
            if(startIndex == endIndex){

                //handle only one index
                if(memory.contains(ar.get(startIndex))){
                    pairs++;
                    memory.remove(ar.get(startIndex));
                }else{
                    memory.add(ar.get(startIndex));
                }

            }else{

                //no need to check memory - count them as a pair
                if(ar.get(startIndex) == ar.get(endIndex)){
                    pairs++;
                    startIndex++;
                    endIndex--;
                    continue;
                }

                //found a match for start index
                if(memory.contains(ar.get(startIndex))){
                    pairs++;
                    memory.remove(ar.get(startIndex));
                }else{
                    memory.add(ar.get(startIndex));
                }

                //found a match for end index
                if(memory.contains(ar.get(endIndex))){
                    pairs++;
                    memory.remove(ar.get(endIndex));
                }else{
                    memory.add(ar.get(endIndex));
                }

            }

            startIndex++;
            endIndex--;
        }

        return pairs;
    }

}

