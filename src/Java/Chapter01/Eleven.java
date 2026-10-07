package Java.Chapter01;

public class Eleven {
    public static void main(String [] args){
        // Java.Chapter01.Eleven as  Bitwise operator
        // Bitwise Example
        int a = 5, b =3;
        System.out.println("AND: " + (a & b)); //1
        System.out.println("OR: " + (a | b)); // 7
        System.out.println("XOR: " + (a ^ b)); // 6
        System.out.println("Complement: " + (~a)); // -6
        System.out.println("Left shift: " + (a <<1)); // 10
        System.out.println("Right shift: " + (a >>1)); // 2
        System.out.println("Unsigned Right shift: " + (-5>>>1));


    }
}
