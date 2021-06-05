import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FunWithThreads {
    /*
    use java threads to process large files
    Method 1 - Create Custom classes to extend threads
    Method 2 - Create Custom classes to implement runnable interface and pass them into java threads
    Method 3 - Use lambda expressions to create runnable into threads
    Method 4 - Use Executor service with fixed number of threads
     */

    private long[][] array;
    public FunWithThreads(long[][] array){
       this.array = array;
    }

    public BigInteger ThreadMethodOne() {
        List<SampleThread> workers = new ArrayList<SampleThread>();
        int numWorkers = 10;

        //give each tread a boundary
        int lenOneWorker = array.length / numWorkers;
        for (int i = 0; i < numWorkers; i++) {
            int start = i * lenOneWorker;
            int end = (i + 1) * lenOneWorker;

            // make the last worker take up all the excess.
            if (i == numWorkers - 1) end = array.length;
            SampleThread worker = new SampleThread(start, end, array);
            workers.add(worker);
            worker.start();
        }

        waitForThreadsToFinish(workers);

        BigInteger sum = BigInteger.valueOf(0);
        for(SampleThread thread : workers){
            sum = sum.add(thread.getSum());
        }

        return sum;
    }
    public void waitForThreadsToFinish(List<SampleThread> threads) {
        try {
            for (SampleThread thread : threads) {
                thread.join();
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//Method 1
class SampleThread extends Thread{
    private int rowStart;
    private int rowEnd;
    private BigInteger sum;
    private long[][] array;

    public SampleThread(int rowStart, int rowEnd, long[][] array){
        this.rowStart = rowStart;
        this.rowEnd = rowEnd;
        this.array = array;
        sum = BigInteger.valueOf(0);
    }
    @Override
    public void run() {
        int colEnd = array[0].length;
        for(int i = rowStart; i < rowEnd; i++){
            for(int j = 0; j < colEnd; j++){
                sum = sum.add(BigInteger.valueOf(array[i][j]));
            }
        }
    }

    public BigInteger getSum(){
        return this.sum;
    }
}
