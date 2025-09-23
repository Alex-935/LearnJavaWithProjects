import java.sql.SQLOutput;
import java.util.Arrays;

class Cat {
    String name;
    int age;
    int livesRemaining;
    void meow() {
        System.out.println("Meow");
    }

    private static int catCount = 0;

    //constructor
    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }
}

public class __8_classesObjectsEnums {

    public static void main(String[] args) {

        //an object is an in memory representation of a class/
        // default constructors only contain super();

        System.out.println(Cat.getCatCount() + " cats.");
        /*
        Static

        - used to mark a field/method as a class member instead of an instance member.
        non-static attributes/methods apply to individual objects, and not the class itself

        Static methods/attributes are not different per individual cat object
        Static attr/methods are stored once in the Heap, separately from the class objects

        Instance variables are initialised to default values every time an object is created using new
        Class variables are initialised to default values whenever the class is first loaded. Either when new is used or a class member is called.
         */
        //non-static
        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";

        Cat secondCat = new Cat();
        secondCat.meow();
        secondCat.name = "Stella";
        //each cat object can have its onw name and age but the class itself does not have a name and age
        //everything is called through an object.

        //static methods called from the class itself
        int numCats = Cat.getCatCount();
        System.out.println(numCats + " cats.");

        //you can access static attributes/methods from individual objects
        //this is frowned upon and is misleading as it looks like a non-static method to another programmer
        System.out.println(myCat.getCatCount());



        /*
        Default Values for class and instance variables:

        byte, short, int - 0
        long - 0L
        float 0.0f
        double - 0.0d
        char - \u0000 (Unicode Zero)
        String or Object - null
        boolean - false

         */

        //Shadowing is when an identifier has the same identifier as an instance variable.  This needs to be used when shadowing as by default Java will call the local version of an instance;

        /*
        Access modifiers -  determine where a class/field/method is visible.
        The level you are annotating at determines the available access modifiers

        Top Level - Classes, enums, records and interfaces - public or package-private (no keyword)
        Member Level - The access modifiers from most restrictive to least are: private, package-private, protected, public.

        private - accessible only by its own class. Black scope of a class defines the boundary.
        public - is visible anywhere and has no restrictions. Available is class, package, subclass and everywhere.
        package-private - available in class and package.
        protected - Available in class, package, subclass. Access to a protected member from outside the package is not allowed. Outside the package, it becomes private. Children can access their own but not the supers.

        any public classes  must match the file name, you cannot have more than one public class per file.
         */

        /*
        Advanced Encapsulation

        As returning a reference to an object, still allows you to modify it. we need to make sure we return copy of the object and not a reference.
        - refer to Seniors Class
         */


        //instanceOf
        // - enables us to determine the object type that a reference is referring to
        // the objects type and references type are often different.

        /*
        Enumerations
        special types of class where instances are predefined. e.g. days of week
         */

        //simple enums
        /*
        enum Water {
            STILL, SPARKLING;
        }
         */
        Water water = Water.STILL;
        Water sparklingWater = Water.valueOf("SPARKLING");
        //ordinal value of 0 is STILL, ordinal value of 1 is SPARKLING
        for (Water waters : Water.values()) {
            System.out.println(water.ordinal() + " is " + water.name());
        }

        //complex enums

        WorkDay monday = WorkDay.MONDAY;
        System.out.println(monday.getHoursOfWork() + ", " + monday.getWorkLocation());
        System.out.println(WorkDay.SATURDAY.getHoursOfWork() + ", " + WorkDay.SATURDAY.getWorkLocation());


        // Appreciating records
        //public record Person(String name, Integer age) {}
        /*
        Automatically gives:
            - a final class named after the record
            - private final instance variables, one for each component
            - constructor for initialising instance variables
            - accessor methods, one for each component, named after the components
            - custom toString, equals and hashCode methods
        Defaults can be overridden.
        */
    }
}

class Seniors {
    private int[] ages = new int[2];
    private int num;

    //constructor
    Seniors() {
        num = 2;
        ages[0] = 30;
        ages[1] = 40;
    }

    //encapsulation
    public int getNum() {
        return num;
    }

    public int[] getAges() {
        //returns copy so original not affected if modified
        int newArr[] = Arrays.copyOf(ages, 2);
        return newArr;
    }
}

    //simple enums
enum Water {
    STILL, SPARKLING;
}


//complex enums
enum WorkDay {
    //values must be first
    MONDAY("9-5"),//constructor call
    TUESDAY("9-5"),
    WEDNESDAY("9-5"),
    THURSDAY("9-5"),
    FRIDAY("9-5"),
    SATURDAY("10-1") {//overrides getWorkLocation method
        //constant specific class body
        public String getWorkLocation() {return "Home";}
    };// ; required at end

    private String hoursOfWork;
    WorkDay(String hoursOfWork) {//private constructor
        this.hoursOfWork = hoursOfWork;
    }
    public String getHoursOfWork() {
        return hoursOfWork;
    }
    public String getWorkLocation() {
        return "Office";
    }
}


