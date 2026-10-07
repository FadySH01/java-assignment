package Java.Pratice.BROCODE.GUI;
import javax.swing.JOptionPane;
public class GUI2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name ");
        JOptionPane.showMessageDialog(null, "Hello" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are" + age + "and");

        String field = JOptionPane.showInputDialog("Enter your favorite Tech field");
        JOptionPane.showMessageDialog(null, "you love" + field);

        System.out.println(name);
        System.out.println(age);
        System.out.println(field);
        System.out.println("Keep going - the world needs you!");

    }
}
