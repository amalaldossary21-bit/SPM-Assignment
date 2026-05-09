public class Operations {

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static boolean isOdd(int a) {
        return a % 2 != 0;
    }

    public static void main(String[] args) {

        int x = 7;

        System.out.println("Is Even: " + isEven(x));
        System.out.println("Is Odd: " + isOdd(x));
    }
}
