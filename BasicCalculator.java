public class BasicCalculator {
    public static void main(String[] args) {
        // Define variables
        double num1 = 10;
        double num2 = 5;
        String operation = "add"; // Change this to "subtract", "multiply", or "divide"

        // Perform the operation
        double result = 0;
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        // Print result
        System.out.println("Result: " + result);

        // Swapping values
        double temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}