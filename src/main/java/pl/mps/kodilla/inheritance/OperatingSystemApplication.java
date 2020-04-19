package pl.mps.kodilla.inheritance;

public class OperatingSystemApplication {

    public static void main(String[] args) {
        OperatingSystem windows = new Windows(1985);
        windows.turnOn();
        printReleaseYear(windows);
        windows.turnOff();

        OperatingSystem linux = new Linux(1991);
        linux.turnOn();
        printReleaseYear(linux);
        linux.turnOff();
    }

    private static void printReleaseYear(OperatingSystem operatingSystem) {
        System.out.println("Release year: " + operatingSystem.getReleaseYear());
    }
}
