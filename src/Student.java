/**
 * Created by Moser Harry on 21.09.2016.
 */
public class Student {

    private String name;
    private int nummer=22636;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNummer() {
        return nummer ;
    }

    public void setNummer(int n) {
        int altenummer = nummer;
        if (!validateNummer(n))
            nummer = altenummer;

    }

    public boolean validateNummer() {

        return (nummer >= 10000 && nummer <= 99999 && nummer % 2 != 0);
    }

    @Override
    public String toString() {
        return name + " ( " + nummer + " ) ";
    }
}
