public class Operations {

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int subtractFromZero(int a) {
        return 0 - a;
    }

    public static void main(String[] args) {
        System.out.println("10 - 4 = " + subtract(10, 4));
        System.out.println("0 - 7 = " + subtractFromZero(7));
    }
}
