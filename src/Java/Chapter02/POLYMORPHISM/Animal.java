package Java.Chapter02.POLYMORPHISM;

public class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat sound");
    }
}

class OverridingExample{
    public static void main(String[] args) {
        Dog a1 = new Dog();
        Animal a2 = new Cat();//upcasting

        a1.sound();
        a2.sound();
    }
}