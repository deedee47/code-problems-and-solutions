import java.util.Random;

public class UseFunWithThreads {

    public static void main(String[] args){
        FunWithThreads funWithThreads = new FunWithThreads(generateData());

        System.out.println("Method 1 - Extending Threads");
        System.out.println(funWithThreads.ThreadMethodOne());
    }
    private static long[][] generateData(){
        long[][] array = new long[1000][10000];
        Random random = new Random();
        for(int i = 0; i < 1000; i++){
            for(int j = 0; j < 10000; j++){
                array[i][j] = random.nextLong();
            }
        }

        return array;
    }


}
