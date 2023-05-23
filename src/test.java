public class test{
    public static void rotateMatrix(int[] array) {
        if (array.length < 9) {
            System.out.println("Error: Array should contain at least 9 elements.");
            return;
        }

        int[][] matrix = new int[3][3];
        int index = 0;

        // Fill the matrix with array elements in a cyclic manner
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = array[index % array.length];
                index++;
            }
        }

        // Print the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5, 6, 7};
        rotateMatrix(elements);
    }
}
