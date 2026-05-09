public class Operations {

    // Find the maximum of two numbers
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Calculate modulus (remainder)
    public static int modulus(int a, int b) {
        return a % b;
    }

    // Main method to run the program
    public static void main(String[] args) {
        int x = 10, y = 3;
        System.out.println("Maximum: " + findMax(x, y));
        System.out.println("Modulus (remainder): " + modulus(x, y));
    }
}
