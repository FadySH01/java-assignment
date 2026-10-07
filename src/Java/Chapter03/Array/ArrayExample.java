package Java.Chapter03.Array;

 class ArrayExample{
        public static void main(String[] args) {

            // 1. Fixed size with new (default values = 0)
            int[] arr1 = new int[5];
            arr1[0] = 10;
            arr1[1] = 20;
            System.out.println("arr1[0] = " + arr1[0]); // 10

            // 2. Inline initialization
            int[] arr2 = { 1, 2, 3, 4, 5 };
            System.out.println("arr2[2] = " + arr2[2]); // 3

            // 3. Using new with values
            String[] arr3 = new String[] { "Apple", "Banana", "Orange" };
            System.out.println("arr3[1] = " + arr3[1]); // Banana

            // 4. Multidimensional array
            int[][] arr4 = new int[2][3];
            arr4[0][0] = 10;
            arr4[1][2] = 20;
            System.out.println("arr4[1][2] = " + arr4[1][2]); // 20

            // 5. array of arrays
            int[][] arr5 = new int[2][];
            arr5[0] = new int[3]; // first row = 3 cols
            arr5[1] = new int[2]; // second row = 2 cols
            arr5[0][1] = 100;
            System.out.println("arr5[0][1] = " + arr5[0][1]); // 100
        }
    }
