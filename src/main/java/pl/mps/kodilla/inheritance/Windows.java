package pl.mps.kodilla.inheritance;

public class Windows extends OperatingSystem {

    public Windows(int releastYear) {
        super(releastYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on the Windows system.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the Windows system.");
    }
}
