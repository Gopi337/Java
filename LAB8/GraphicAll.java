import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicAll extends JFrame {

    GraphicAll() {

        super("Построитель графиков");

        setLayout(new GridLayout(7,1));
        setSize(250,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Button b1 = new Button("y = kx");
        Button b2 = new Button("y = 3x^2");
        Button b3 = new Button("y = -x^2 + x^3");
        Button b4 = new Button("y = x^3 + x^2 + x");
        Button b5 = new Button("y = x^5");
        Button b6 = new Button("y = sin(x)");
        Button b7 = new Button("y = cos(x-1) + x");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);

        b1.addActionListener(e -> new GraphWindow(1));
        b2.addActionListener(e -> new GraphWindow(2));
        b3.addActionListener(e -> new GraphWindow(3));
        b4.addActionListener(e -> new GraphWindow(4));
        b5.addActionListener(e -> new GraphWindow(5));
        b6.addActionListener(e -> new GraphWindow(6));
        b7.addActionListener(e -> new GraphWindow(7));

        setVisible(true);
    }

    public static void main(String[] args) {
        new GraphicAll();
    }
}

class GraphWindow extends JFrame {

    int type;

    GraphWindow(int t) {
        type = t;
        setSize(600,500);
        setVisible(true);
    }

    public void paint(Graphics g) {

        int centerX = 300;
        int centerY = 250;

        g.setColor(Color.LIGHT_GRAY);

        for(int i=0;i<600;i+=20)
            g.drawLine(i,0,i,500);

        for(int i=0;i<500;i+=20)
            g.drawLine(0,i,600,i);

        g.setColor(Color.BLACK);
        g.drawLine(0,centerY,600,centerY);
        g.drawLine(centerX,0,centerX,500);

        g.setColor(Color.RED);

        int x1,y1,x2,y2;

        for(int i=-250;i<250;i++) {

            double x = i/20.0;
            double y = 0;
            double yNext = 0;

            if(type==1){
                y = 0.5*x;
                yNext = 0.5*(x+0.05);
            }

            if(type==2){
                y = 3*x*x;
                yNext = 3*(x+0.05)*(x+0.05);
            }

            if(type==3){
                y = -x*x + x*x*x;
                yNext = -(x+0.05)*(x+0.05) + (x+0.05)*(x+0.05)*(x+0.05);
            }

            if(type==4){
                y = x*x*x + x*x + x;
                yNext = (x+0.05)*(x+0.05)*(x+0.05) + (x+0.05)*(x+0.05) + (x+0.05);
            }

            if(type==5){
                y = Math.pow(x,5);
                yNext = Math.pow(x+0.05,5);
            }

            if(type==6){
                y = Math.sin(x);
                yNext = Math.sin(x+0.05);
            }

            if(type==7){
                y = Math.cos(x-1)+x;
                yNext = Math.cos((x+0.05)-1)+(x+0.05);
            }

            x1 = centerX + i;
            y1 = centerY - (int)(y*40);

            x2 = centerX + i + 1;
            y2 = centerY - (int)(yNext*40);

            g.drawLine(x1,y1,x2,y2);
        }
    }
}