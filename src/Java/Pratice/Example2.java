package Java.Pratice;

    class Example2 {
        private int number;

        public Example2(int number) {
            this.number = number;
        }

        public int getNumber() {
            return this.number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void modifyValue(Example2 example) {
            example.setNumber(500);
        }

        public static void main(String[] args) {
            Example2 example = new Example2(12);
            example.modifyValue(example);
            System.out.println(example.getNumber());
        }
    }

