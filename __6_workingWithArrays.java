import java.util.Arrays;

public class __6_workingWithArrays {

    public static  void main(String[] args) {

        //Arrays store values in continuous memory

        int[] ages1;
        ages1 = new int[5];
        //the above array has values
        //when an empty array is initialised, it is created with default values
        /* Defaults:
        byte, short, int, long, double, float - 0 or 0.0
        char - \u0000 (unicode null character)
        boolean - false
        reference types (objects and arrays) - null
         */
        for (int age: ages1) {
            System.out.print(age + ", ");
        }

        int[] ages = {31, 2, 73, 42, 53};

        //set value
        ages1[0] = 12;

        //length
        System.out.println("Array length is " + ages1.length);

        //multi-dimensional
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        for (int[] row : matrix) {
            System.out.print("{");
            for (int n : row) {
                System.out.print(n + ", ");
            }
            System.out.println("},");
        }
        //System.out.println(matrix.length);

        //toString() - converts an array into a string with [] brackets
        System.out.println("Array: " + Arrays.toString(matrix));
        System.out.println("Row1: " + Arrays.toString(matrix[0]));
        System.out.println("Row2: " + Arrays.toString(matrix[1]));
        System.out.println("Row3: " + Arrays.toString(matrix[2]));

        //sort affect the original array
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        //binary Search - must be on ordered list
        int index = Arrays.binarySearch(ages, 31);
        System.out.println(index);

        //if a value is not in an array, it returns a negative number, with the index of insertion
        //returns, the number would have been at index 2, but it's not there so returns -2
        index = Arrays.binarySearch(ages, 21);
        System.out.println(index);

        //fill - fills an array with a set value
        int[] myArray = new int[5];
        Arrays.fill(myArray, 12);
        System.out.println("Fill: " + Arrays.toString(myArray));

        //copyOf()
        int[] copiedArray = Arrays.copyOf(myArray, myArray.length);
        int[] copiedArray2 = Arrays.copyOf(myArray, 10);
        System.out.println(Arrays.toString(copiedArray2));

        //.equals() - compares the values of two arrays to see if they are equal
        System.out.println(Arrays.equals(myArray, copiedArray));
    }
}
