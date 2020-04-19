package pl.mps.kodilla.inheritance;

public class OperatingSystem {

    private int releaseYear;

    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void turnOn() {
        System.out.println("Turn on the operating system.");
    }

    public void turnOff() {
        System.out.println("Turn off the operating system.");
    }
}
