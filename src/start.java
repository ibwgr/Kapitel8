/**
 * Created by Moser Harry on 21.09.2016.
 */
public class start {

    public static void main(String[] args) {

        Student studi = Student.createStudent();
        System.out.println(Student.getZaehler()+" Studenten sind auf der Uni");
        studi.setName("Susi Sorglos");
        studi.setNummer(15843);
        studi.setFach(5);



        System.out.print(studi);
    }

}
