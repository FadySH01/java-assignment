package Java.Chapter02.Abstraction;

abstract class Shape {
    abstract void draw ();
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Sqaure extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}

class TestShape{
    public static void main(String[] args) {
        Shape s1 =  new Circle();
        s1.draw();

        Shape s2 = new Sqaure();
        s2.draw();
            }
        }


