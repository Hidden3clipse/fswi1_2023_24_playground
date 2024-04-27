package views;

import javax.swing.JFrame;
import models.Student;
import services.MeineMethoden;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class MainView {

    private Student[] students = new Student[0];

    public MainView() {

        loadData();
        JFrame frame = new JFrame("Übersicht Studenten");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTable with students as content
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Vorname");
        model.addColumn("Nachname");
        model.addColumn("Geburtsdatum");
        model.addColumn("Klasse");

        for (Student student : students) {
            model.addRow(new Object[]{student.getVorname(), student.getNachname(), student.getGeburtsdatum(), student.getKlasse()});
        }

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }

    private void loadData() {
        students =  MeineMethoden.findAll();
    }
}