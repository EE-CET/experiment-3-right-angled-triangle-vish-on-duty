public class Triangle {
    public static void main(String[] args) {
        int height = 3;
        int stars = 1;

        for (int i = 0; i < height; i++) {
            // Print the stars for the current line
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
            // Increment stars by 2 to reach a base of 5 by line 3
            stars += 2;
        }
    }
}
