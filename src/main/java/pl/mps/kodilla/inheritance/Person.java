package pl.mps.kodilla.inheritance;

public class Person {

    private final String firstName;
    private final int age;
    private final Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void printResponsibilities() {
        System.out.println(String.format("%s is %d years old and is a %s whose responsibilities are %s and gets %d PLN.", firstName, age, job.getClass().getSimpleName(), job.getResponsibilities(), job.getSalary()));
    }
}
