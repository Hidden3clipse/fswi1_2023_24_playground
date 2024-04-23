import java.util.Arrays;

import models.Student;
import services.MeineMethoden;

class Hauptanwendung {

    public static void main(String[] args) {
       Student[] students =  MeineMethoden.findAll();
       Student student = students[0];
       System.out.println(student);
    }
}