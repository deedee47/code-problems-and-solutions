import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalOrderMatrix {

    /*
    In a 2D Matrix, return a diagonal traversal of the matrix
    1   2   3
    4   5   6
    7   8   9
    returns [1, 2, 4, 7, 5, 3, 6, 8, 9]

    spiral order traversal
    1   2   3
    4   5   6
    7   8   9
    returns [1, 2, 3, 6, 9, 8, 7, 4, 5]
     */

    public static void main (String[] args){

        System.out.println("Diagonal Order");
        System.out.println(Arrays.toString(findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
        System.out.println(Arrays.toString(findDiagonalOrder(new int[][]{{ 2, 3}})));
        System.out.println(Arrays.toString(findDiagonalOrder(new int[][]{{2,5}, {8,4}, {0, -1}})));
        System.out.println(Arrays.toString(findDiagonalOrder(new int[][]{{ 3},{ 2}})));
        System.out.println(Arrays.toString(findDiagonalOrder(new int[][]{{2,5,8},{4,0, -1}})));

        System.out.println("Spiral Order");

        System.out.println(spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(spiralOrder(new int[][]{{2,5,8},{4,0, -1}}));

    }

    public static int[] findDiagonalOrder(int[][] mat) {

        int boundaryRowUp = 0;
        final int boundaryColUp = mat[0].length -1;

        final int boundaryRowDown = mat.length -1;
        int boundaryColumnDown = 0;

        int[] result = new int[mat.length * mat[0].length];
        int resultIndex = 0;

        int row = 0;
        int col = 0;

        boolean diagDirectionUp = true; //starts with up

        while(row <= boundaryRowDown && col <= boundaryColUp && resultIndex < result.length){

            //insert the current number
            result[resultIndex] = mat[row][col];
            resultIndex++;

            //continue in direction up
            if (diagDirectionUp && row > boundaryRowUp && col < boundaryColUp)
            {
                row--; col++;
                continue;
            }

            //continue in direction down
            if (!diagDirectionUp && col > boundaryColumnDown && row < boundaryRowDown)
            {
                row++; col--;
                continue;
            }

            //determine next direction -
            if(diagDirectionUp && row == boundaryRowUp && col < boundaryColUp)  //if up already
            {
                col++;
                diagDirectionUp = false; // going down
                continue;
            }

            //determine next direction -
            if(!diagDirectionUp && col == boundaryColumnDown && row != boundaryRowDown)  //if down already
            {
                row++;
                diagDirectionUp = true; // going up
                continue;
            }

            //check corner here -- only when there's no where to go
            if(diagDirectionUp && col == boundaryColUp) //up,corner already;
            {
                row++;
                diagDirectionUp = false; // going down

            }
            else{
                col++;
                diagDirectionUp = true; // going up
            }

            //move boundaries
            if(boundaryRowUp < boundaryRowDown && boundaryColumnDown == boundaryColUp) boundaryRowUp++;
            if(boundaryColumnDown < boundaryColUp  && boundaryRowDown == boundaryRowUp) boundaryColumnDown++;
        }

        return result;

    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        int boundaryRowUp = 0;
        int boundaryColumnRight = matrix[0].length -1;

        int boundaryRowDown = matrix.length -1;
        int boundaryColumnLeft = 0;

        List<Integer> result = new ArrayList<>();

        int row = 0;
        int col = 0;

        boolean directionRight = true; //starts at 0,0 at the top and move right
        boolean directionLeft = false;
        boolean directionDown = false;
        boolean directionUp = false;

        while(boundaryRowUp <= boundaryRowDown && boundaryColumnLeft <= boundaryColumnRight){

            //insert item
            result.add(matrix[row][col]);

            //determine next direction
            if(directionRight && col < boundaryColumnRight){
                col++;
                continue;
            }

            if(directionDown && row < boundaryRowDown){
                row++;
                continue;
            }

            if(directionLeft && col > boundaryColumnLeft){
                col--;
                continue;
            }

            if(directionUp && row > boundaryRowUp){
                row--;
                continue;
            }

            //check all corners and move boundaries after completing a traversal
            if(row == boundaryRowUp && directionUp)
            {
                col++;
                directionRight = true;
                directionUp = false;
                boundaryColumnLeft++;
                continue;
            }

            if(col == boundaryColumnLeft && directionLeft){
                row--;
                directionUp = true;
                directionLeft = false;
                boundaryRowDown--;
                continue;
            }

            if(row == boundaryRowDown && directionDown){
                col--;
                directionLeft = true;
                directionDown = false;
                boundaryColumnRight--;
                continue;
            }

            if(col == boundaryColumnRight && directionRight){
                row++;
                directionDown = true;
                directionRight = false;
                boundaryRowUp++;
                continue;
            }


        }
        return result;
    }


}
