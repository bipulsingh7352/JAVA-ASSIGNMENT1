public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Swapping without using a temporary variable using arithmetic
        a = a + b; // Now a holds the sum of a and b
        b = a - b; // b becomes the original value of a
        a = a - b; // a becomes the original value of b

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
