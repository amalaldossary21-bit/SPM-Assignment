public class Operations {

    public static int square(int a) {
        return a * a;
    }

    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    public static void main(String[] args) {

        System.out.println("Square of 5: " + square(5));
        System.out.println("Average of 10 and 20: " + average(10, 20));

    }
}
