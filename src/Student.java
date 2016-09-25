/**
 * Created by Moser Harry on 21.09.2016.
 */
public class Student {

    public Student(){
        this  (1970);
    }

    public Student(int geburtsjahr){
        zaehler++;
        this.geburtsjahr = geburtsjahr;
    }

    private static final int MATEHEMATIKSTUDIUM = 1;

    private static final int INFORMATIKSTUDIUM = 2;

    private static final int ARCHITEKTURSTUDIUM = 3;

    private static final int WIRTSCHAFTLICHESSTUDIUM = 4;

    private static final int BIOLOGIESTUDIUM = 5;

    private static final int GESCHICHTSSTUDIUM = 6;

    private static final int GERMANISTIGSTUDIUM = 7;

    private static final int POLITOLOGIESTUDIUM = 8;

    private static final int PHYSIKSTUDIUM = 9;

    public static final Student PHANTOM;

    private static int zaehler = 0;

    private String name; //= "DummyStudent";
    private int nummer = 22636;
    private int fach;
    private int geburtsjahr;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =  name;  //"namenlos";
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int n) {
        int altenummer = nummer;
        nummer = n;
        if (!validateNummer())
            nummer = altenummer;
    }

    public int getFach() {
        return fach;
    }

    public void setFach(int fach) {
        this.fach = fach;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public boolean validateNummer() {

        return (nummer >= 10000 && nummer <= 99999 && nummer % 2 != 0);
    }

    @Override
    public String toString() {
        String res = name + " (MatNr. " + nummer + "  ) " + "Geburtsjahr:" + getGeburtsjahr();

        switch (fach){

            case MATEHEMATIKSTUDIUM:
                return res + "(ein Mathe Student)";

            case INFORMATIKSTUDIUM:
                return res + " (ein Informatik Student)";

            case ARCHITEKTURSTUDIUM:
                return res +"(a Häuse bauer)";

            case WIRTSCHAFTLICHESSTUDIUM:
                return res + " (Ein Wirtschaftwissenschaftler)";

            case BIOLOGIESTUDIUM:
                return res + " (Ein Biologe) ";

            case GESCHICHTSSTUDIUM:
                return res + " (Kennt den Napoleon persöndlich)";

            case GERMANISTIGSTUDIUM:
                return res + " (wird mal Germanist)";

            case POLITOLOGIESTUDIUM:
                return res + " (Wird mal Bundesrat)";

            case PHYSIKSTUDIUM:
                return res + " (Produziert in Cern mal ein schwarzes Loch)";

            default:
               return res + " (Kein Ahnung was der Student macht)";
        }
    }



    public static int getZaehler() {
        return zaehler;
    }

    public static Student createStudent(){
        zaehler++;
        return new Student(1982);
    }
    static {
        PHANTOM = new Student(1973);
        PHANTOM.name = "Erik le phant";
        PHANTOM.nummer = -12345;
        zaehler = 0;

    }
}
