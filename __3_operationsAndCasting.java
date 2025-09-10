public class __3_operationsAndCasting {

    public static void main(String[] args) {

        byte x = 4;
        short y = 7;

        //when performing addition with anything shorter than an int, it converts the addition to an int
        int z = x + y;
        byte zz = (byte) (x + y);

        System.out.println(z);
        System.out.println(zz);

        /*
        Implicit Promotion
        Java will implicitly promote ints to doubles to perform calculations.

        If two variables are of different types when being added or equated etc, java will convert one temporarily in
        main memory under a new address space and then complete the operation with variables as the same type.
         */

        //Short-circuiting operators
        // if the left hand of an && statement is false, the right hand won't be evaluated.
        // || also short circuits if the left hand side is true.

        /*
        Bitwise Operators: &,|, ^ (XOR)

        work with boolean and integrals: byte, short, int, long, char
        Do not short Circuit.

        For integrals:

        And: both bits must be 1 for that bit to be 1
        6 & 8 (in binary) = 0110 & 1000 = 0000 = 0

        Or: either bit must be 1 for that bit to be 1
        7 | 9 (in binary) = 0111 | 1001 = 1111 = 15

        Xor: exactly one bit must be 1 for that bit to be 1
        5 ^ 4 (in binary) = 0101 ^ 0100 = 0001 = 1
         */

        System.out.print("And: ");
        System.out.println(10 & 9);

        System.out.print("Or: ");
        System.out.println(10 | 9);

        System.out.print("Xor: ");
        System.out.println(10 ^ 3);


        //Ternary Operator
        // expression ? True Statement : False Statement;
        String s = 3 % 2 == 1 ? "This is an odd number" : "This is an even number";
        System.out.println(s);

        //ignores operator presidence, groups everything on right hand side.
        x = 4;
        x *= 2 + 5;
        System.out.println(x);//gives 4 * (2+5), or 28


        /*
        Casting:

        widening is done automatically without need for a cast.
        byte -> short/char -> int -> long -> float -> double

        As float uses the scientific calculation for value (1.4E-45), it has a wider value range than a long
        therefore it can hold all long values despite only taking 4 bytes of storage.
         */

        double d1 = 120_000_000;
        double d2 = 1.2e+8;
        System.out.println(d1 == d2);//prints true

        char c = 'a';
        int i = c;
        System.out.println(i);//prints 97

        /*
        narrowing
         */
        int myByte = 157;
        byte b = (byte) myByte;//max range is -128 to 127 so out of range. Wraps around
        byte b2 = (byte) -159;//anything less than -128 becomes -128
        float f = (float) 3.2;//decimals are by default double.
        System.out.println("Byte: " + b + ",  Mod: " +  (myByte%127) + " " + ", Addition of -128 + Mod: " + (-128 + (myByte%127)) + ", Byte2: " + b + " " + ", Float: " + f);

        /*
        Narrowing a bytes results in an overflow;
        Bytes are represented by an overflow bit + 7 value bits.
        Adding 1 to 1111_1111 (-128) gives 1_0000_0000 = 128
        A byte can only hold 8 bits so anything more is truncated, and we get 0000_0000 = 0;
         */

        //Using final to set a value means you can get away with assigning values to other as long as they are within the types range.
        final char ch = 12;
        final int in = 6;

        short sh = ch;
        byte by = in;
    }

}
