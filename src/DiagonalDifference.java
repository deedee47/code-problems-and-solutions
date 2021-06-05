import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main (String[] args){
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<Integer>(){{add(1); add(2); add(9);}});
        arr.add(new ArrayList<Integer>(){{add(4); add(5); add(6);}});
        arr.add(new ArrayList<Integer>(){{add(7); add(8); add(9);}});
        System.out.println(diagonalDifference(arr));
        System.out.println(diagonalDifference(null));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        if (arr == null) return 0;
        if (arr.size() == 0) return 0;
        if (arr.get(0).size() == 0) return 0;

        //check if arr is square matrix - what to return if not
        int boundaryRow = arr.size();
        int boundaryCol = arr.get(0).size();

        //get diagonal value from left to right
        int rowIndex = 0, colIndex = 0, diagResult = 0;
        while (rowIndex < boundaryRow && colIndex < boundaryCol) {
            diagResult += arr.get(rowIndex).get(colIndex);
            rowIndex++;
            colIndex++;
        }


        rowIndex = 0;
        colIndex = boundaryCol - 1;
        while (rowIndex < boundaryRow && colIndex >= 0){
            diagResult -= arr.get(rowIndex).get(colIndex);
            rowIndex++;
            colIndex--;
        }
        return Math.abs(diagResult);
    }
}
