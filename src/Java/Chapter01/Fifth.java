package Java.Chapter01;

public class Fifth {

    //Global Variable (Instance Variable)
    int instanceVar=50;
  //Static Variable (Shared across all objects)
 static int staticVar=100;

  //Method that uses a Local Variable
    public void showLocalVariable() {
       // Local Variable (only accessible inside this method)
       int LocalVar= 25;

       System.out.println("Local Variable:" + LocalVar);
       System.out.println("Instance Variable:"  + instanceVar);
       System.out.println("Static Variable (accessed from instance method):" + staticVar);
    }
    //Static Method accessing static variable
    public static void showStaticVariable () {
        System.out.println("Static Variable (from static method):" + staticVar);
    }
    //Java.Chapter01.Fifth
    public static void main(String []args){
        //Create an object to access instance methods and instance variables
       Fifth demo = new Fifth();
        //Error: calling class object inside static

        System.out.println(demo.instanceVar);

        //Call method with local variable
        demo.showLocalVariable();

        //Call static method directly
        showStaticVariable();
       Fifth.showStaticVariable();

        System.out.println(staticVar);
    }

}




