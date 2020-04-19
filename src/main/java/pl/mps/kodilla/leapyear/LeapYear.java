package pl.mps.kodilla.leapyear;

public class LeapYear {

    int yearCheck;

    public LeapYear() {
        this.yearCheck = yearCheck;
    }

    public boolean isLeapYear1(int yearCheck) {
        return ((yearCheck % 4 == 0) || (yearCheck % 400 == 0)) && (yearCheck % 100 != 0);
    }
}
