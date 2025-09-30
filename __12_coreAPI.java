import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class __12_coreAPI {

    public static void main(String[] args) {

        Scanners scan = new Scanners();
//        System.out.println(scan.validateInput());
        //scan.readFile();
        scan.byString();

        System.out.println("Barry".compareTo("Ace"));
    }
}

class Scanners {

    /*
    Scanner() can have an IO source, file source or string source in the brackets.

    token - Scanner breaks inputs into tokens and converts them into various types

    String next() - returns next token
    boolean hasNextDouble() - returns true or false depending on whether the next input is a double. Can be other data type
    double nextDouble() - scans next token as a double. Can be other data type
    String nextLine() - returns rest of line
    Scanner useDelimiter(String pattern) - changes delimiter from default of whitespace.
     */

    Scanner sc = new Scanner(System.in);

    int validateInput() {

        System.out.print("Please enter an int: ");
        if (sc.hasNextInt()) {
            int age = sc.nextInt();
            return age;
        }

        return -1;
    }

    void readFile() {

        try (Scanner file = new Scanner(new File("input.txt"))) {
            while (file.hasNextInt()) {
                int age = file.nextInt();
                System.out.println(age);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    void byString() {
        String input = "Miku, Miku,   Teto,  Joestar";
        Scanner string = new Scanner(input).useDelimiter("\\s*,\\s*");
        // \s means white space, * means one or more, \\ means treat it as a backslash, not a string
        while (string.hasNext()) {
            System.out.println(string.next());
        }
    }
}


class Strings {

    // Strings are immutable while StringBuilder objects are muteable
    //Strings are stored in the String Pool (String Constant Pool) in the heap.
    //If another string with the same character sequence is encountered, then the string is reused.
    // If new is used, the string is stored in the heap outside of the string pool

    boolean sameCaseInsensitive(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    //StringBuilder and StringBuffer do the same thing
    //  - use StringBuilder in single threaded environments
    //  - use StringBuffer in multi-threaded environments


}

// All wrapper classes are immutable, you can change what the reference points to but not the object itself.

/*
To make a custom immutable object:
    - do not provide a setter
    - make all fields private and final
    - prevent sub-classing (class final, constructor private and provide a public static factory method such as createNewInstance)
    - make sure mutable objects pass a copy and do not share a reference
 */

// Private Class
final class Farm {// cannot subclass this class and all methods are final
    // Private final instance variables
    private final String name;
    private final int numAnimals;
    private final List<String> animals;

    // Private constructor
    private Farm(final String name, final int numAnimals, final List<String> animals) {
        this.name = name;
        this.numAnimals = numAnimals;
        this.animals = new ArrayList<String>(animals);// create new arrayList, this is so we get a new reference
    }

    // Factory method top create a Farm
    public static Farm createNewInstance(String name, int numAnimals, List<String> animals) {
        return new Farm(name, numAnimals, animals);
    }

    // no 'set' methods, only 'get' methods
    public String getName() { return name; }
    public int getNumAnimals() { return numAnimals; }
    public List<String> getAnimals() { return new ArrayList<String>(animals); }// return copy, not reference

    @Override
    public String toString() {
        return "Farm{ name = " + name + ", numAnimals = " + numAnimals + ", animals = " + animals + " }";
    }
}


/* ArrayLists
    - List is implemented by ArrayList, but it is good practice to use the interface reference (List) as it allows future List implementations such as LinkedList

   Methods:
        - void add (int index, E element) -Adds element at index
        - boolean add(E e) - Adds element to end of list
        - void clear () - removes all elements in list
        - boolean contains ( Object o) - returns true if object is in list
        - E get (int index) - returns element at specified index
        - boolean isEmpty() - returns true if list is empty
        - int indexOf (Object o) - returns index of the first occurrence  of specified element, or -1 if not in list
        - E remove( Object o) - remove element as specified index
        - boolean remove (Object o) - removes first instance of object from list
        - E set(int index, E element) - replace element at specified index with given element
        - int size() - returns length of list
*/

/*
    Date classes
        - Instant: numeric timestamp -
        - LocalDate: date without time - YYYY-MM-DD
        - LocalTime: time without a date - HH:MM
        - LocalDateTime: has T as separator - yyyy-mm-ddThh:mm e.g. 2025-09-30T09:30
        - zonedDateTime: full date/time with time zone and UTC offset.
            - 2023-02-14T16:45+01:00[Europe/Zurich]

        - Duration: amount of time in seconds/nanoseconds
        - Period: amount of time in more human useful units - years, months, days

        - Month - JANUARY
        - DayOfWeek - FRIDAY
        - YearMonth - 2025-12
        - MonthDay - --08-31
        - ZoneOffset - +2:00

        Method prefixes:
            - .of - creates instance e.g. LocalDate ld1 = LocalDate.of(2023, 3, 17);
            - .parse - LocalDate ld2 = LocalDate.parse("2023-03-17");
            - .get - int dayOfMonth = ld2.getDayOfMonth();
            - .is - boolean isLeapYear = ld2.isLeapYear();
            - .with - LocalDate ld3 = ld2.wthDayOfMonth(25);
            - .plus - LocalDate ld4 = ld3.plusDays(2);
            - .minus - LocalDate ld5 = ld4.minusMonths(2);
            - .at - LocalDateTime ldt = ld5.atTime(13, 45, 10);  //output: 2023-04-27T13:45:10

       Date formatting:
            - String text = date.format(formatter);
            - LocalDate parsedDate = LocalDate.parse(text, formatter);

            Predefined Formatters: from DateTimeFormatter class

 */