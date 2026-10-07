package Java.Chapter03.Enum;

public enum Season2 {
        SPRING(20), SUMMER(35),
        AUTUMN(15), WINTER(5);

        private final int temperatureInCelsius;

        Season2(int temperatureInCelsius) {
            this.temperatureInCelsius = temperatureInCelsius;
        }

        public int getTemperatureInCelsius() {
            return temperatureInCelsius;
        }

        @Override
        public String toString() {
            return this.name().charAt(0) +
                    this.name().substring(1).toLowerCase() +
                    " (" + temperatureInCelsius + "°C)";
        }


        public static void main(String[] args) {
            System.out.println(Season2.WINTER);
            System.out.println(Season2.SUMMER);
            System.out.println("Winter temperature is: " + Season2.WINTER.getTemperatureInCelsius() + "°C");
        }
    }
