public class RotateImage {
    public static void main(String[] args) {
        int dim = 4;
        int[][] matrix = new int[dim][dim];
        matrix[0] = new int[]{5,1,9,11};
        matrix[1] = new int[]{2,4,8,10};
        matrix[2] = new int[]{13,3,6,7};
        matrix[3] = new int[]{15,14,12,16};
        printArray(matrix);
        Solution solution = new Solution();
        solution.rotate(matrix);
        printArray(matrix);
    }

    public static void printArray(int[][] matrix) {
        for (int[] is : matrix) {
            for (int i : is) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        System.out.println("______________________________________");
    }
}


class Solution {
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        int temp = 0;
        for (int row = 0; row < (size+1)/2; row++) {
            for (int col = 0; col < size/2; col++) {
                temp = matrix[size-1-col][row]; //store current val in temp
                matrix[size-1-col][row] = matrix[size-1-row][size-1-col];
                matrix[size - 1 - row][size - 1 - col] = matrix[col][size - 1 - row];
                matrix[col][size - 1 - row] = matrix[row][col];                
                matrix[row][col] = temp;
            }
            RotateImage.printArray(matrix);
        }
    }
}