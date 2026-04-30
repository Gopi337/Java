import javax.swing.*;

public class Task4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Калькулятор");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b = new JButton("=");
        JLabel res = new JLabel("Ответ:");

        t1.setBounds(50, 40, 100, 30);
        t2.setBounds(50, 80, 100, 30);
        b.setBounds(50, 120, 100, 30);
        res.setBounds(50, 160, 200, 30);

        b.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double c = Double.parseDouble(t2.getText());
            res.setText("Ответ: " + (a + c));
        });

        f.add(t1); f.add(t2); f.add(b); f.add(res);

        f.setSize(250, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}