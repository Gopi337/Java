import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 +\n2 -\n3 *\n4 /");
        int ch = sc.nextInt();

        double a = 5, b = 2;

        switch (ch) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4: System.out.println(a / b); break;
        }
    }
}