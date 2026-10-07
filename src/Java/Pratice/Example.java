package Java.Pratice;
    class Example {
        public void modifyValue(int number) {
            number = 30;
            System.out.println(number);
        }
        public static void main(String[] args) {
            Example a=new Example();
            int number = 1;
            a.modifyValue(number);
            System.out.println(number);
        }
    }

