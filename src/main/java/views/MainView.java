package views;

import javax.swing.JFrame;
import models.Student;
import services.MeineMethoden;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class MainView extends JFrame {

    private Student[] students = new Student[0];

    public MainView() {
        // Aufruf des Konstruktor der Klasse JFrame
        super("Übersicht Studenten");

        // Methode loadDate, die die Studenten aus der CSV dem Array zuweist
        loadData();

        // this = JFrame-Instanz; Verhalten, wenn das Fenster geschlossen wird
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTable with students as content
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Vorname");
        model.addColumn("Nachname");
        model.addColumn("Geburtsdatum");
        model.addColumn("Klasse");

        for (Student student : students) {
            model.addRow(new Object[]{student.getVorname(), student.getNachname(), student.getGeburtsdatum(), student.getKlasse()});
        }

        // Insatnz der Klasse JTable = Tabellen-Ansicht
        JTable table = new JTable(model);

        // Zum Scrollen, falls der Inhalt größer als die Ansicht ist
        JScrollPane scrollPane = new JScrollPane(table);

        // ScrollPane zum Frame hinzufügen
        this.add(scrollPane);

        // Fenster zusammenpacken, dass die Größe stimmt
        this.pack();

        // Fenster sichtbar schalten
        this.setVisible(true);
    }

    private void loadData() {
        // Ruft die statische Methode findAll() der Klasse MeineMethoden auf 
        students =  MeineMethoden.findAll();
    }
}