package frame;

import panel.Panel;

import javax.swing.*;

public class Frame extends JFrame {
    Frame(String title) {
        add(new Panel());


        //Set prioperties;
        setSize(230, 400);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setTitle(title);
        setIconImage(new ImageIcon(this.getClass().getResource("/Calc.png")).getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Frame("Calculator");
    }
}
