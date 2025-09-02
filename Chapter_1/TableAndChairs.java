public class TableAndChairs {
    public static void main(String[] args) {
        int rows = 6, cols = 24;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (
                    (j == 0 || j == cols - 1) && i < 3 ||
                    (i == 2 && j >= 7 && j <= 16) ||
                    (i == 3 && (j < 5 || j > 18 || j == 7 || j == 16)) ||
                    (i > 3 && (j < 5 || j > 18 || j == 7 || j == 16))
                ) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}