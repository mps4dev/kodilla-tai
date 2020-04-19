package pl.mps.kodilla.inheritance;

public class Linux extends OperatingSystem {

    public Linux(int releastYear) {
        super(releastYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on the Linux system.");;
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the Linux system.");
    }
}
