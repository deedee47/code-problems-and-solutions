import java.util.*;

class Cell{

    private int row;
    private int col;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return row == cell.row &&
                col == cell.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }
}

public class ChangeColor {
    /*
    Given a Matrix of color codes, change the color of the given cell and all its adjacent cells with the same color

    Given
    1   0   001 001 001 1
    001 1   1   001 001 001
    0   0   0   001 001 001
    1   1   1   001 0   1
    001 001 1   001 001 001

    Solution (row2, col3, 100 change)
    1   0   100 100 100 1
    001 1   1   100 100 100
    0   0   0   100 100 100
    1   1   1   100 0   1
    001 001 1   100 100 100

     */
    final static int MAX_ROW = 5;
    final static int MAX_COL = 6;

    public static void main(String[] args){
        //Example 5x6 matrix
        int[][] matrix =
        {
            {1 ,  0 ,  101, 101, 101, 1},
            {101, 1,   1,   101, 101, 101},
            {0,   0,   0,   101, 101, 101},
            {1,   1,   1,   101, 0,   1},
            {101, 101, 1,   101, 101, 101}
        };

        int[][] newMatrix = changeColor(matrix, 2, 3, 100);
        for(int i = 0; i < MAX_ROW; i++){
            for(int j = 0; j<MAX_COL; j++){
                System.out.print(newMatrix[i][j] + "  ");
            }
            System.out.println();
        }


    }
    //Using DFS
    private static int[][] changeColor(int[][] matrix, int row, int col, int color){

        int initialCol = matrix[row][col];

        Queue<Cell> queue = new LinkedList<>();
        queue.add(new Cell(row, col));
        Cell next;

        while (!queue.isEmpty()){
            Cell c = queue.poll();
            int cRow = c.getRow();
            int cCol = c.getCol();

            matrix[cRow][cCol] = color;

            //check upwards
            next = new Cell(cRow-1, cCol);
            if(cRow-1 >= 0 && cCol < MAX_COL && cCol >=0 && matrix[cRow-1][cCol] == initialCol
                    && !queue.contains(next))
            {
                queue.add(next);
            }

            //check downwards
            next = new Cell(cRow +1, cCol);
            if(cRow+1 < MAX_ROW && cCol < MAX_COL && cCol >=0 && matrix[cRow+1][cCol] == initialCol
                    && !queue.contains(next))
            {
                queue.add(next);
            }

            //check left
            next = new Cell(cRow, cCol-1);
            if(cRow < MAX_ROW && cRow >= 0 && cCol-1 >=0 && matrix[cRow][cCol-1] == initialCol
                    && !queue.contains(next))
            {
                queue.add(next);
            }

            //check Right
            next = new Cell(cRow, cCol+1);
            if(cRow < MAX_ROW && cRow >= 0 && cCol+1 < MAX_COL && matrix[cRow][cCol+1] == initialCol
                    && ! queue.contains(next))
            {
                queue.add(next);
            }
        }

        return matrix;
    }



}
