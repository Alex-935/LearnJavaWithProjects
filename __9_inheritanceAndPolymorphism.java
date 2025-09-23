class Vehicle {
    public void move() {
        System.out.println("Vehicle::move");
    }
}
class Car extends Vehicle {
    int numDoors;
    Car(int numDoors) {
        this.numDoors = numDoors;
    }
    @Override
    public void move() {
        System.out.println("Car::move");
    }
    public int getNumDoors() {
        return this.numDoors;
    }

    public void wheels() {
        System.out.println("Car::wheels");
    }
}
class Boat extends Vehicle{
    @Override
    public void move() {
        System.out.println("Boat::move");
    }
}
class Train extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car::move");
    }
}


//super

class Employee {

    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + empId + ", Name: " + name;
    }
}

class Manager extends Employee {

    private String deptName;

    Manager(int empId, String name, String deptName) {
        super(empId, name);
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + deptName;
    }
}


public class __9_inheritanceAndPolymorphism {

    public static void main(String[] args) {

        /*
        Extends - class Sub extends Base
        -base means super or parent, sub means child.

        Private methods and attr will not be inherited as they are class specific.
        You cannot inherit from more than one class at a time.

        Implements:

            Interfaces are classes that hold abstract methods
            Interfaces are allowed to extend from more than one interface at a time.
            interface C extends A, B {}

            Classes implement interfaces using:
                class Dog implements Walkable

         Upcasting:
            Vehicle v = new Car();
            - this is allowed as all Cars are Vehicles.
            - As we are going up the inheritance tree, this is known as upcasting.
            - the compiler looks at the reference type (v) and not the object type, the methods in Vehicle will also be present in Car.
            - A reference can refer to objects of its own type or of the objects of subclasses

        You cannot do the reverse as a child will have additional functionality not present in the base/parent class.


        Polymorphism
            - applies only to instance/non-static methods

        */
        Vehicle v = new Car(2);// behind the scenes is Vehicle v = (Vehicle) new Car();
        //v will take attribute values from vehicle, not car.
        Vehicle w = new Vehicle();
        v.move();
        w.move();


        /*overloading:
            - must have a different method signature
            - free to change return type and access modifier
            - can be overloaded in the same type or sub-type

         overriding
            - polymorphic methods must not behave differently from an existing method.
            - overridden methods cannot be more restrictive with access modifiers.
            - cannot throw a new or broader error exception.

         Covariant returns:
            when overriding a parents method, if the original return type was a primitive, the overriding method must also return that primitive.

            If the return type is non-primitive, you can use a covariant return.
            If a parent returns type X, you can return X and any sub-type of X in the overriding method.
                - If a parent returned Animal, the overriding method could return Animal or a subtype such as Cow.

            Original: public Dog walk() { System.out.println("Dog::Walk") }
            @Override public Terrier walk() { System.out.println("Terrier::Walk") }
            As class Terrier extends Dog.
         */


        /*
        Super:

            - super() is invoking the parent constructor.
            - arguments can be passed in
            - must be first line of constructor.

            Super() is added by default if you write a constructor
            - you can add parameters toa super() call,

            super.
                - allows you to call a parent function
                - allows you to use the parent version (non-overriden)

        This():
            - can be used instead of Super(), you cant have both.
            - this() calls a constructor in the same class.
            - super() will still be called.

         */

        Employee emp1 = new Manager(12, "Simon", "IT");
        System.out.println(emp1);

        /*
        Final:
            - cannot be changed
            - final classes cannot be inherited from
            - final methods cannot be overriden when inherited
            - final values/parameters cannot be changed in value. Objects can still be modified as the final applies to the reference, not the object.
         */


        /*
        Sealed and non-sealed:

        Sealed restricts which classes can inherit from it.
         */


        /*
        Instance Blocks:
            - {} appear outside of methods but inside a class
            - executes after super() but before the constructor
            - allows code to be shared across all compilers without duplicating code
            -

        Static Blocks:
            - has static key word, appears outside of method but in class
            - only executed once when the class is first loaded (first object created or a static member is accessed)
            - parent static blocks execute first
         */


        /*
        Upcasting - going up to a more general type:
            - Vehicle v = new Car()
            - going from car, upto a vehicle

        Downcasting - type becomes more specific
            - Car c = (Car) new Vehicle
            - will throw an error at runtime


         */

    }
}

sealed class MyVehicle permits MyCar, MyTruck {

}
non-sealed class MyTruck extends MyVehicle {}
sealed class MyCar extends MyVehicle permits MySaloon {

}
non-sealed class MySaloon extends MyCar{

}
class MyVolvo extends MySaloon {

}
class MyFord extends MySaloon {

}
