import java.util.Scanner;

public class LAB5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // -------------------------------
        // Задание 1. Вывод чисел от 1 до N (for)
        // -------------------------------
        System.out.println("Задание 1");
        System.out.print("Введите число N: ");
        int n1 = scanner.nextInt();

        for (int i = 1; i <= n1; i++) {
            System.out.println(i);
        }

        // -------------------------------
        // Задание 2. Сумма чисел от 1 до N (while)
        // -------------------------------
        System.out.println("\nЗадание 2");
        System.out.print("Введите число N: ");
        int n2 = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n2) {
            sum += i;
            i++;
        }

        System.out.println("Сумма чисел от 1 до " + n2 + " равна: " + sum);

        // -------------------------------
        // Задание 3. Факториал числа (for)
        // -------------------------------
        System.out.println("\nЗадание 3");
        System.out.print("Введите число N: ");
        int n3 = scanner.nextInt();

        long factorial = 1;

        for (int j = 1; j <= n3; j++) {
            factorial *= j;
        }

        System.out.println("Факториал числа " + n3 + " равен: " + factorial);

        // -------------------------------
        // Задание 4. Чётные числа от 1 до 100 (while + continue)
        // -------------------------------
        System.out.println("\nЗадание 4");
        int k = 1;

        while (k <= 100) {
            if (k % 2 != 0) {
                k++;
                continue;
            }

            System.out.print(k + " ");
            k++;
        }

        // -------------------------------
        // Задание 5. Ввод чисел до 0 (do-while)
        // -------------------------------
        System.out.println("\n\nЗадание 5");
        int number;
        int totalSum = 0;

        do {
            System.out.print("Введите число (0 для выхода): ");
            number = scanner.nextInt();
            totalSum += number;
        } while (number != 0);

        System.out.println("Сумма введённых чисел: " + totalSum);

        // -------------------------------
        // Дополнительное задание. Таблица умножения 1–5
        // -------------------------------
        System.out.println("\nДополнительное задание. Таблица умножения:");

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print((row * col) + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
