package pl.mps.kodilla.inheritance;

public class JobsApplication {

    public static void main(String[] args) {
        Person john = new Person("John", 28, new Programmer(20000));
        john.printResponsibilities();

        Person ann = new Person("Ann", 43, new Vendor(4500));
        ann.printResponsibilities();

        Person mark = new Person("Mark", 30, new Driver(6300));
        mark.printResponsibilities();
    }
}
