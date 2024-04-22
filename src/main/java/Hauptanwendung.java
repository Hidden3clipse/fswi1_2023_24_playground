class Hauptanwendung {

    public static void main(String[] args) {

        MeineMethoden.aufgabenSchleifen();

        String[][] studenten = new String[1][4]; 
        studenten[0][0] = "Peter"; 
        studenten[0][1] = "Lustig"; 
        studenten[0][2] = "24.12.2001";     
        studenten[0][3] = "FSWI-1";

        studenten = MeineMethoden.addOneEmptyItem(studenten);
        studenten[1][0] = "Petra"; 
        studenten[1][1] = "Lustig"; 
        studenten[1][2] = "01.04.2000";     
        studenten[1][3] = "FSWI-1";

        studenten = MeineMethoden.addOneEmptyItem(studenten);
        studenten[2][0] = "Max"; 
        studenten[2][1] = "Mustermann"; 
        studenten[2][2] = "12.07.2001";     
        studenten[2][3] = "FSWI-1";

        // Zusatzaufgabe Schleife über mehrdim. Array
        for (int i = 0; i < studenten.length; i++) {
            for (int ii = 0; ii < studenten[i].length; ii++) {
                System.out.println(studenten[i][ii]);
            }
        }
    }
}