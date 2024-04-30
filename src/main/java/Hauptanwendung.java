import models.Student;
import services.MeineMethoden;

class Hauptanwendung {

    public static void main(String[] args) {

        Student[] students = MeineMethoden.findAll();

    }