public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        // Boundaries
        int topRow = 0;
        int bottomRow = matrix.length - 1;
        int leftCol = 0;
        int rightCol = matrix[0].length - 1;

        
        // While loop to traverse full matrix
        // Loop in spiral order while shifting boundaries to get all elements
        while (topRow <= bottomRow && leftCol <= rightCol) {
            for (int i = leftCol; i <= rightCol; i++) { // Loop thru top row from left to right
                result.add(matrix[topRow][i]);
            }
            topRow++; // Shift boundary down
            for (int i = topRow; i <= bottomRow; i++) { // Loop thru right col from top to bottom
                result.add(matrix[i][rightCol]);
            }
            rightCol--; // Shift boundary left
        if (topRow <= bottomRow) {
            for (int i = rightCol; i >= leftCol; i--) { // Loop thru bottom row from right to left
        result.add(matrix[bottomRow][i]);
            }
        bottomRow--; // Shift boundary up
        }
        if (leftCol <= rightCol) {
            for (int i = bottomRow; i >= topRow; i--) { // Loop thru left col from bottom to top
        result.add(matrix[i][leftCol]);
            }
        leftCol++; // Shift boundary to right
        }
    }
        return result;
        }
    }