public class ___helloWorld {

    public static void main(String[] args) {

        String greeting = "Hello World";
        System.out.println(greeting);

        int number = 5;
        int doubled = doubleNumber(number);
        System.out.println("The doubled number is " + doubled);
    }

    static int doubleNumber(int n) {
        return n * 2;
    }
}