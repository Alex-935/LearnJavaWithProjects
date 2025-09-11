import java.util.Scanner;

public class __4_conditionalStatements {

    public static void main(String[] args){

        // Switch Statements
        //use break, don't return a value
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a sport: ");
        String sport = sc.next();

        switch (sport) {

            case "soccer":
                System.out.println("I play soccer");
                break;
            case "rugby":
                System.out.println("I play rugby");
                break;
            default:
                System.out.println("I play " + sport);
                break;
        }

        System.out.print("Please enter a number between 1 and 10: ");
        int number = sc.nextInt();
        switch (number) {

            //when there is no break statement, the code follows through to the next condition and executes that statement
            //this is called fall-through
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("The number is odd.");
                break;
            case 2: case 4: case 6: case 8: case 10:
                System.out.println("The number is even.");
                break;
            default:
                System.out.println("The number is not between 1 and 10.");
                break;
        }



        // Switch Expressions
        //break isn't allowed in switch expressions as they must return a value instead
        // switch expressions do not fall-through
        String name = "Jeff";
        int nletters = switch (name) {

            case "Jane", "Sean", "Alan", "Paul" -> 4;
            case "Janet", "Susan" -> 5;
            case "Maaike", "Alison", "Miriam" -> 6;
            default -> {
                System.out.println("Unrecognised name " + name);
                yield -1;//n letter initialised to -1
            }
        };
        System.out.println(nletters);

        //omitting the variable makes return more flexible
        System.out.println(switch(name) {
            case "Jane", "Sean", "Alan", "Paul" -> 4;
            case "Janet", "Susan" -> 5;
            case "Maaike", "Alison", "Miriam" -> 6;
            case null -> "Is not a name";
            default -> "Unrecognised name " + name;
        });



        /*
        Yield Keyword
        Used to return a value if you want to use a block of statements in your case statement
         */
        int nletters2 = switch (name = "Alan") {

            case "Jane", "Sean", "Alan", "Paul" -> {
                System.out.println("Has 4 letters");
                yield 4;
            }
            case "Janet", "Susan" ->  {
                System.out.println("Has 5 letters");
                yield 5;
            }
            case "Maaike", "Alison", "Miriam" ->  {
                System.out.println("Has 6 letters");
                yield 6;
            }
            default -> {
                System.out.println("Unrecognised name " + name);
                yield -1;//n letter initialised to -1
            }
        };
        System.out.println(nletters2);
    }
}
