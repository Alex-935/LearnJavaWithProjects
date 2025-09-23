
import java.util.Date;

class MyDinosaur {

    String name;

    MyDinosaur(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "The dinosaur is " + name;
    }

    @Override
    public boolean equals(Object dino) {
        return super.equals(dino);
    }
}

class MyCarnivore extends MyDinosaur {

    MyCarnivore(String name) {
        super(name);
    }
}

class MyHerbivore extends MyDinosaur {

    MyHerbivore(String name) {
        super(name);
    }
}

class MyOmnivore extends MyDinosaur {

    MyOmnivore(String name) {
        super(name);
    }
}




class MyEmployee {

    String name;

    public MyEmployee(String name) {
        this.name = name;
    }

}

class MyJanitor extends MyEmployee {

    MyJanitor(String name) {
        super(name);
    }
}

class MyResearcher extends MyEmployee {

    MyResearcher(String name) {
        super(name);
    }
}

class MyTechnician extends MyEmployee {

    MyTechnician(String name) {
        super(name);
    }
}



class MyTicket {

    float price = 12.50f;
}

class AnnualTicket extends MyTicket {

    float price = 130.00f;
    Date startDate;
    Date endDate;

    public AnnualTicket(Date starDate, Date endDate) {
        this.startDate = starDate;
        this.endDate = endDate;
    }
}



public class excersises {

    public static void main() {

        MyDinosaur Terry = new MyCarnivore("Terry");
        System.out.println(Terry);
    }
}