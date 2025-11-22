public class SimpleTrianglePrinter {

    public static void printEquilateralTriangle(int height) {
        for (int i = 0; i < height; i++) {
            int stars = 2 * i + 1;
            int spaces = height - 1 - i;
            
            String line = " ".repeat(spaces) + "*".repeat(stars);
            
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        printEquilateralTriangle(5);
    }
}