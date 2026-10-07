package Java.Chapter02;

abstract class Shape {

    abstract void draw();

    void display(){
        System.out.println("Display Shape...");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing a rectangle");
    }

    public static void main(String[] args) {
        Shape p1 = new Circle();
        Rectangle p2 = new Rectangle();

        p1.draw();
        p1.display();
        p2.draw();
        p2.display();
    }
}
