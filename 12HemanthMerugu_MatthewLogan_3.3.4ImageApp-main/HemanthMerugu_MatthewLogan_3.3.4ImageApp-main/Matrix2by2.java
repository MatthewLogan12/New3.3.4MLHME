public class Matrix2by2 {

    private double[][] matrix;

    // Constructor to initialize the matrix
    public Matrix2by2(double a, double b, double c, double d) {
        matrix = new double[][] {
            {a, b},
            {c, d}
        };
    }

    // Rotate the matrix by 180 degrees
    public void rotate180() {
        double temp = matrix[0][0];
        matrix[0][0] = matrix[1][1];
        matrix[1][1] = temp;

        temp = matrix[0][1];
        matrix[0][1] = matrix[1][0];
        matrix[1][0] = temp;
    }

    // Rotate the matrix by 90 degrees clockwise
    public void rotate90() {
        double temp = matrix[0][0];
        matrix[0][0] = matrix[1][0];
        matrix[1][0] = matrix[1][1];
        matrix[1][1] = matrix[0][1];
        matrix[0][1] = temp;
    }

    // Rotate the matrix by 270 degrees clockwise (or 90 degrees counterclockwise)
    public void rotate270() {
        double temp = matrix[0][0];
        matrix[0][0] = matrix[0][1];
        matrix[0][1] = matrix[1][1];
        matrix[1][1] = matrix[1][0];
        matrix[1][0] = temp;
    }

    // Method to display the matrix
    public void display() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix2by2 matrix = new Matrix2by2(1, 2, 3, 4);

        System.out.println("Original Matrix:");
        matrix.display();

        matrix.rotate180();
        System.out.println("After 180-degree rotation:");
        matrix.display();

        matrix.rotate90();
        System.out.println("After 90-degree rotation:");
        matrix.display();

        matrix.rotate270();
        System.out.println("After 270-degree rotation:");
        matrix.display();
    }
}
