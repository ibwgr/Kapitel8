package Aufgabe8_10;

/**
 * Created by Moser Harry on 28.09.2016.
 */
public class TestStrecke {

    public static void main(String[] args) {
        Punkt ursprung = new Punkt(0.0,0.0);
        Punkt endpunkt = new Punkt(4.0,3.0);
        Strecke s = new Strecke(ursprung,endpunkt);
        System.out.println("Die Laenge der Strecke " + s +
                " betraegt " + s.getLaenge() + ".");
        System.out.println();
        System.out.println("Strecke s eingeben:");
        s.read();
        System.out.println();
        System.out.println("Die Laenge der Strecke " +
                " betraegt " + s.getLaenge() + ".");
    }
}
