package Java.Chapter03.Enum;
    public enum Season{

        SPRING, SUMMER, AUTUMN, WINTER;

        @Override
        public String toString() {
            // Capitalize only the first letter, rest lowercase
            return this.name().charAt(0) +
                    this.name().substring(1);
        }


        public static void main(String[] args) {
            System.out.println(Season.WINTER);
            System.out.println(Season.SPRING);
            System.out.println(Season.SUMMER);
            System.out.println(Season.AUTUMN);

        }
    }

