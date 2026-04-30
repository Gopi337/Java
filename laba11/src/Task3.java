public class Task3 {

    public static double add(double a, double b) { return a + b; }
    public static double sub(double a, double b) { return a - b; }
    public static double mul(double a, double b) { return a * b; }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(sub(5, 2));
        System.out.println(mul(3, 4));
        System.out.println(div(10, 2));
    }
}