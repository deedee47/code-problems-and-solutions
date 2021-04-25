import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    /*
    This Code generates the pascal triangle based on the number of levels given.
    It sums up the internal numbers
    The boundaries are always 1
    The first level is always 1

    Given a level 4 ; the triangle is as follows
            1
          1   1
        1   2   1
      1   3   3   1
     */

    public static void main (String[] args){

        System.out.println(generate(6));
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>(new ArrayList<>());

        if(numRows <= 0) return  result;

        List<Integer> innerResult = new ArrayList<>();

        int row = 0;
        while (row < numRows){

            innerResult = new ArrayList<>();

            //insert the left edge 1 by default
            innerResult.add(1);

            if( row == 1)
            {
                innerResult.add(1); //insert the right edge
            }
            else if(row > 1)
            {
                //get previous List
                List<Integer> previous = result.get(row-1);
                int innerRow = 0;
                while (innerRow < previous.size() - 1)
                {
                    innerResult.add(previous.get(innerRow) + previous.get(innerRow+1));
                    innerRow++;
                }

                innerResult.add(1); //insert the right edge
            }

            result.add(innerResult);
            row++;
        }

        return result;
    }
}

