import models.Student;

class Hauptanwendung {

    public static void main(String[] args) {

        Student student = new Student(
                "Peter",
                "Lustig",
                "24.12.2000",
                "FSWI-1");

        Student student2 = new Student("Lustig", "24.12.2000");
        

        System.out.println(String.format("%s,%s,%s,%s",
                student.getVorname(),
                student.getNachname(),
                student.getGeburtsdatum(),
                student.getKlasse()));
    }
}