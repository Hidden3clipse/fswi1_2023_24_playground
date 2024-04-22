class Hauptanwendung {

    public static void main(String[] args) {

        Student student = new Student();
        student.vorname = "Peter";
        student.nachname = "Lustig";
        student.geburtsdatum = "24.12.2000";
        student.klasse = "FSWI-1";

        System.out.println(String.format("%s,%s,%s,%s",
            student.vorname,
            student.nachname,
            student.geburtsdatum,
            student.klasse));
    }
}