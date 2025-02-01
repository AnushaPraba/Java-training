import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
        ScientificCalculator calculator = new ScientificCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("******WELCOME TO MATH WORLD******");
        System.out.println();
        while (true) {
            System.out.println("Select operation:");
            System.out.println("-----------------------------------");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("===================================");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Log");
            System.out.println("===================================");
            System.out.println("8. Sine");
            System.out.println("9. Cosine");
            System.out.println("10. Tangent");
            System.out.println("11. Exit");
            System.out.println("------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of values to add: ");
                    int n = scanner.nextInt();
                    double[] addNumbers = new double[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter value " + (i + 1) + ": ");
                        addNumbers[i] = scanner.nextDouble();
                    }
                    System.out.println("Result: " + calculator.add(addNumbers));
                    System.out.println("********************************");
                    break;

                case 2:
                    System.out.print("Enter the number of values to subtract: ");
                    n = scanner.nextInt();
                    double[] subNumbers = new double[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter value " + (i + 1) + ": ");
                        subNumbers[i] = scanner.nextDouble();
                    }
                    System.out.println("Result: " + calculator.subtract(subNumbers));
                    System.out.println("********************************");
                    break;

                case 3:
                    System.out.print("Enter the number of values to multiply: ");
                    n = scanner.nextInt();
                    double[] mulNumbers = new double[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter value " + (i + 1) + ": ");
                        mulNumbers[i] = scanner.nextDouble();
                    }
                    System.out.println("Result: " + calculator.multiply(mulNumbers));
                    System.out.println("********************************");
                    break;

                case 4:
                    System.out.print("Enter the number of values to divide: ");
                    n = scanner.nextInt();
                    double[] divNumbers = new double[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter value " + (i + 1) + ": ");
                        divNumbers[i] = scanner.nextDouble();
                    }
                    try {
                        System.out.println("Result: " + calculator.divide(divNumbers));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("********************************");
                    break;

                case 5:
                    System.out.print("Enter the base value: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent value: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + calculator.power(base, exponent));
                    System.out.println("********************************");
                    break;

                case 6:
                    System.out.print("Enter the value: ");
                    double value = scanner.nextDouble();
                    System.out.println("Result: " + calculator.squareRoot(value));
                    System.out.println("********************************");
                    break;

                case 7:
                    System.out.print("Enter the value: ");
                    value = scanner.nextDouble();
                    System.out.println("Result: " + calculator.log(value));
                    System.out.println("********************************");
                    break;

                case 8:
                    System.out.print("Enter the angle in degrees: ");
                    double angle = scanner.nextDouble();
                    System.out.println("Result: " + calculator.sine(angle));
                    System.out.println("********************************");
                    break;

                case 9:
                    System.out.print("Enter the angle in degrees: ");
                    angle = scanner.nextDouble();
                    System.out.println("Result: " + calculator.cosine(angle));
                    System.out.println("********************************");
                    break;

                case 10:
                    System.out.print("Enter the angle in degrees: ");
                    angle = scanner.nextDouble();
                    System.out.println("Result: " + calculator.tangent(angle));
                    System.out.println("********************************");
                    break;

                case 11:
                    System.out.println("Exiting...");
                    System.out.println("Thank You!!!");
                    scanner.close();
                    System.out.println("********************************");
                    return;

                default:
                    System.out.println("OOPS!!! Invalid choice! Please try again.");
                    System.out.println("-------------------------------");
            }
        }

}
}
