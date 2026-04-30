import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Введите число 1: ");
            double a = scanner.nextDouble();

            System.out.print("Введите число 2: ");
            double b = scanner.nextDouble();

            System.out.print("Операция (+, -, *, /): ");
            char op = scanner.next().charAt(0);

            switch (op) {
                case '+': System.out.println(a + b); break;
                case '-': System.out.println(a - b); break;
                case '*': System.out.println(a * b); break;
                case '/':
                    if (b != 0) System.out.println(a / b);
                    else System.out.println("Ошибка");
                    break;
            }

            System.out.print("Продолжить? (yes/no): ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("yes"));
    }
}