public class __5_understandingIterations {

    public static void main(String[] args) {

        /*
        Escape sequences

        \t - tab
        \b - backspace
        \n - new line
        \" - double quote       e.g "He calls himself \"Batman\""
        \\ - backslash          e.g "Please input t\\f"
         */

        //enhanced for loop
        int[] list = {1, 2, 3};
        for (int n: list) {
            System.out.println(n);
        }

        //Labelled break

        System.out.println("i, j");
        //You cannot have any code between the label and loop
        OUTERLOOP:
        for (int i = 1; i <= 3; i++) {
            INNERLOOP:
            for (int j = 1; j <= 5; j++) {

                if (j == 3) {
                    break OUTERLOOP;
                }
                System.out.println(i + " " + j);
            }
        }



        //Labelled continue

        System.out.println("i, j");
        //You cannot have any code between the label and loop
        OUTERLOOP:
        for (int i = 1; i <= 3; i++) {
            INNERLOOP:
            for (int j = 1; j <= 5; j++) {

                if (j == 3) {
                    continue OUTERLOOP;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
