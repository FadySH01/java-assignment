package Java.Pratice.BROCODE.GUI;

import javax.swing.JOptionPane;

public class GraphicUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"hello"+ name);


        int age =  Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are" + age + "years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are "+ height + "cm tall");


        System.out.println(name);
        System.out.println(age);
        System.out.println(height);

    }
}
