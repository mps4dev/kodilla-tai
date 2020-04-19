package pl.mps.kodilla.leapyear;

public class FirstCalss {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear1(2100);
        if (isLeapYear) {
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is NOT a leap year.");
        }
    }
}
