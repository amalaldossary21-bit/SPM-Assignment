public class Operations {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {

        System.out.println("Multiply: " + multiply(4,5));
        System.out.println("Divide: " + divide(20,5));

    }
}