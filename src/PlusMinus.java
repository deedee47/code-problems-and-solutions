import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    /*
    print the ratio of positive, negative and zero from a given list of number
     */
    public static void main(String[] args){
        List<Integer> sample = new ArrayList<>();
        sample.add(1);
        sample.add(2);
        sample.add(0);
        sample.add(-4);
        plusMinus(sample);
    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        if(arr == null)
        {
            System.out.printf("%.6f", 0.0);
        }

        if(arr.size() == 0){
            System.out.printf("%.6f", 0.0);
        }
        else{
            float preZero = 0, zeros = 0, postZero = 0;
            for(int i = 0; i < arr.size(); i++){
                if(arr.get(i) < 0){
                    preZero+=1;
                }

                if(arr.get(i) == 0){
                    zeros+=1;
                }

                if(arr.get(i) > 0){
                    postZero+=1;
                }
            }

            System.out.println(String.format("%.6f",(postZero/arr.size())));
            System.out.println(String.format("%.6f",(preZero/arr.size())));
            System.out.println(String.format("%.6f",(zeros/arr.size())));
        }
    }
}
