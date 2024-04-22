import javax.swing.JOptionPane;

class MeineMethoden {

    // A1a
    static int getSumme(int a, int b) {
        int summe = a + b;
        return summe;
    }

    // A1a alternative Rückgabe
    static int getSumme2(int a, int b) {
        return a + b;
    }

    // A1b
    static String[] getNamensArray() {
        String[] namen = new String[] { "Müller", "Meier", "Huber" };
        return namen;
    }

    // A1b alternative Rückgabe
    static String[] getNamensArray2() {
        return new String[] { "Müller", "Meier", "Huber" };
    }

    // A2
    static String[] addOneEmptyItem(String[] studentsFromCaller) {
        String[] lokalBuf = new String[studentsFromCaller.length + 1];
        System.arraycopy(studentsFromCaller, 0, lokalBuf, 0, studentsFromCaller.length);
        return lokalBuf;
    }

    // A3
    static String[][] addOneEmptyItem(String[][] studentsFromCaller) {
        String[][] lokalBuf = new String[studentsFromCaller.length + 1][studentsFromCaller[0].length];
        System.arraycopy(studentsFromCaller, 0, lokalBuf, 0, studentsFromCaller.length);
        return lokalBuf;
    }

    static void aufgabenSchleifen() {

        System.out.println("Aufgaben Schleifen");

        // Aufgabe 1 mit Erweiterung, um einen Counter, der nach der Schleife die Anzahl
        // der Durchläufe gespeichert hat
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println("Item " + (i + 1));
            counter++;
        }
        System.out.println(counter);

        // Aufgabe 2
        while (true) {
            break;
        }

        // Aufgabe 3
        double[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Teilaufgabe 1
        for (int i = numbers.length; i > 0; i--) {
            System.out.print(numbers[i - 1]);
        }

        System.out.println("\n----");

        // Teilaufgabe 2
        for (int i = numbers.length; i > 0; i--) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(numbers[i - 1]);
        }

        for (int i = numbers.length; i > 0; i--) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(numbers[i - 1]);
        }

        System.out.println("\n----");

        // Teilaufgabe 3
        for (int i = numbers.length; i > 0; i--) {
            if (!(i % 2 == 0)) {
                continue;
            }
            System.out.print(numbers[i - 1]);
        }

        System.out.println("\n----");

        // Aufgabe 4
        for (double number : numbers) {
            System.out.println(number);
        }
    }

    static void aufgabenFehler() {

        System.out.println("\nAufgaben Fehler");

        int index = -3;
        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // FehlerVERMEIDUNG durch Prüfung, ob index größer 0
        // und kleiner als die Länge des Arrays ist  
        if (index >= 0 && index < numbers.length) {
            System.out.println(numbers[index]);
        } else {
            System.out.println("Es ist ein Fehler aufgetreten!");
        }

        // FehlerBEHANDLUNG, durch try - catch, weil die Methode parseInt
        // angibt, dass sie eine NumberFormatException wirft, wenn der 
        // gegebene String nicht aus NUR Zahlen besteht 
        try {
            String zahlAlsZeichen = "123";
            int zahlAusZeichen = Integer.parseInt(zahlAlsZeichen);
            System.out.println(zahlAusZeichen);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String eingabe = JOptionPane.showInputDialog("Gib was ein?");

        // FehlerVERMEIDUNG, weil der String eingabe null annehmen kann,
        // wenn der Anwender im angezeigten Dialog auf Abbrechen drückt
        if (eingabe != null) {
            System.out.println(eingabe.contains("Hallo"));
        } else {
            System.out.println("Ihre Eingabe: " + eingabe + " war falsch!");
        }
    }
}