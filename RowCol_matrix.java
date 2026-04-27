//Searching in a matrix which is sorted row wise as well as col wise
import java.util.Arrays;
public class RowCol_matrix {
    public static void main(String[] args){
        int[][] arr={{10,20,30,40},
        {15,25,35,45},
        {28,29,37,49},
        {33,34,38,50} 
        };
        System.out.println(Arrays.toString(SearchInMatrix(arr,37)));
    }
    static int[] SearchInMatrix(int[][] matrix,int target){
        int row=0;
        int col=matrix.length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[] {row,col};
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{   //if element>target condition
                col--;
            }
        }
        return new int[]{-1,-1};

    }

}
