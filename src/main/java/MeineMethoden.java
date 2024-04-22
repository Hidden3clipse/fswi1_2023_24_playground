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
}