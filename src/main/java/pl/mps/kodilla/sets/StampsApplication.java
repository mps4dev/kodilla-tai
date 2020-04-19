package pl.mps.kodilla.sets;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("znaczek1", 10, 20, false));
        stamps.add(new Stamp("znaczek1", 10, 20, true));
        stamps.add(new Stamp("znaczek2", 15, 30, false));
        stamps.add(new Stamp("znaczek3", 20, 50, false));
        stamps.add(new Stamp("znaczek1", 10, 20, false));
        stamps.add(new Stamp("znaczek2", 15, 30, false));

        if (stamps.size() == 4) {
            System.out.println("OK - Do kolekcji nie dodano podwójnie tego samego znaczka");
        } else {
            System.out.println("ERROR - Do kolekcji dodano podwójnie ten sam znaczek");
        }
    }
}
