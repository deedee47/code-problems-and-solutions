import java.util.HashMap;
import java.util.List;

public class DistinctStairsCombo {
    /*
    calculate the distinct number of ways to climb the stairs to a height h, given a maxhopsize of m
    h-1,h-2,,h-m
     */
    // Recursive function to find total ways to reach the h'th stair from the bottom
    // when a person is allowed to take at most `m` steps at a time
    public static int totalWays(int h, int m)
    {
        // base case: invalid input
        if (h < 0) {
            return 0;
        }

        // base case: 1 way (with no steps)
        if (h == 0) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += totalWays(h - i, m);
        }

        return count;
    }

    //with memoization
    public static int totalWays(int h, int m, HashMap<Integer, Integer> memo)
    {
        // base case
        memo.put(0,0);
        memo.putIfAbsent(1, 1);
        memo.putIfAbsent(2,2);


        int count = 0;
        for (int i = 1; i <= m; i++) {
            if(memo.containsKey(h-i))
            count += 0;
        }

        return count;
    }

    public static void main(String[] args)
    {
        int n = 4, m = 3;

        System.out.printf("Total ways to reach the %d'th stair with at most " +
                "%d steps are %d", n, m, totalWays(n, m));
    }
}
