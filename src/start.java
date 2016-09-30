/**
 * Created by Moser Harry on 21.09.2016.
 */
public class start {

    public static void main(String[] args) {
        Student student;

        student = new Student( "Hans Wiwi", 848600, 5, 1976 );

        Student studi = Student.createStudent();
        System.out.println(Student.getZaehler()+" Studenten sind auf der Uni");
        studi.setName("Susi Sorglos");
        studi.setNummer(15843);
        studi.setFach(5);

        System.out.println(Student.PHANTOM);




        System.out.print(studi.toString());
    }

}
