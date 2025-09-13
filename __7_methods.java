public class __7_methods {

    public static void main(String[] args) {

        /*
        Method Definition
        [access-modifier] [static] return-type method-name([parameters]) [throw exception] {

        A methods signature is only the name and parameters
         */

        //varargs - used for varying numbers of arguments. represented with (type... name).
        //varargs is treated as an array
        //must be the last parameter
        System.out.println(m1() + ", " + m1(2, 4) + ", " + m1(5, 10, 13, 27));

    }

    public static int m1(int... args) {

        int sum = 0;
        for (int n : args) {
            sum += n;
        }
        return sum;
    }
    //overloading m1 method by giving it new parameters
    public static void m1(int n, String... args) {

    }

    /*
    Call By Value

    When you pass an argument, a copy of the argument is made, when you return a value, a copy is also made.

    System Stack -
    Each time a new method is called, a new frame is pushed onto the stack.
    Frames contain local variables and their values
    Each frame is stacked, if a second method is called, the existing frame is saved and the second frame is pushed onto the stack.
    When the second method finishes, it is popped and the first frame is restored.

    Local variables (primitives and references) are stored on the stack, objects are stored on the heap.

    Heap - area of memory reserved for arrays and objects.
    To access an object, we use a reference.

    References - named identifier used to access an object. Similar to a pointer.

    Call by Value - refers to values in the stack ad are local to the specific method frame. Arguments create a separate version of that value in the methods frame. Affecting one doesn't affect another
    Call by Reference - uses a reference to point to an object in the heap. Only the reference is copied when passing an argument.
    Hence, an argument reference will refer to the exact same object as the parameter reference, so methods will affect the object permanently. There is only ever one object.
     */
}
