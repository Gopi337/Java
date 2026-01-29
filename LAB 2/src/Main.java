public class Main {

    public static void main(String[] args) {

        // ===== Задача 1. Переменные и константы =====
        int age = 20;
        double height = 1.75;
        boolean isStudent = true;
        final int MAX_SCORE = 100;

        System.out.println("=== Задача 1 ===");
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Студент: " + isStudent);
        System.out.println("Максимальный балл: " + MAX_SCORE);

        // ===== Задача 2. Примитивные и ссылочные типы =====
        int number = 10;              // примитивный тип
        String text = "Java";         // ссылочный тип

        System.out.println("\n=== Задача 2 ===");
        System.out.println("int: " + number);
        System.out.println("String: " + text);

        // ===== Задача 3. Область видимости =====
        ScopeExample scope = new ScopeExample();
        scope.show();

        // ===== Задачи 4–5. Наследование и полиморфизм =====
        Person person = new Student("Иван", 20, "ИС-2204");

        System.out.println("\n=== Задачи 4–5 ===");
        person.displayInfo(); // полиморфизм
    }
}

// ===== Задача 3 =====
class ScopeExample {
    int classVariable = 100;

    void show() {
        int localVariable = 50;
        System.out.println("\n=== Задача 3 ===");
        System.out.println("Переменная класса: " + classVariable);
        System.out.println("Локальная переменная: " + localVariable);
    }
}

// ===== Задачи 4–5 =====
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

class Student extends Person {
    String group;

    Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Группа: " + group);
    }
}
