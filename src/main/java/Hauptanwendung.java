class Hauptanwendung {

    public static void main(String[] args) {

        //A1
        double [] numbers = {1.0,2.0,3.0,4.0,5.0};

        //A2
        String[] words = new String[3]; 
        words[0] = "World";
        words[1] = "Hello";
        words[2] = " ";
        System.out.printf("%s%s%s!", words[1], words[2], words[0]);

        //A3
        String beforeCharArray = "JAVA ist cool";
        char[] stringToCharArray = beforeCharArray.toLowerCase().toCharArray();
        System.out.printf("%c", stringToCharArray[2]);

        //A4
        String[] arrayStudenten = {"Studet1","Student2","Student3","Student4","Student5"};
    }
}