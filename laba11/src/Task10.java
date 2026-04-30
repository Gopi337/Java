import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> history = new ArrayList<>();

        history.add("2 + 2 = 4");
        history.add("5 * 3 = 15");

        for (String s : history) {
            System.out.println(s);
        }
    }
}