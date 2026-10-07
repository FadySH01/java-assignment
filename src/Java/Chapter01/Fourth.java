package Java.Chapter01;

public class Fourth {
    //Variables with all dat types
    byte goodluck = 10;
    short s = 100;
    int i = 1000;
    long l = 100000L;
    float f = 100.5f;
    double d = 99.99;
    char c = '@';
    boolean bool = true;
    String str = "Hello, Java!";

    //Method with return types

    public int getIntValue(){
        return i;
    }
    public char getCharValue(){
        return 7; //Unicode character with code point 7
    }
    public String getStringValue(){
        System.out.println("hey my name is jayjay");
        return "hey mikky";
    }
    public void displayMessage (){
        System.out.println("This method returns nothing (void).");
    }
    public static void main(String[] args){
        //Create an object of MainMethod
        Fourth mainMethod=new Fourth();

        //Call methods
        mainMethod.displayMessage();
        System.out.println(mainMethod.c);

        //Uncomment below to test getStringValue method
        //String val = Java.Chapter01.Fourth.getStringValue();
        //System.out.println(val);


    }
}


