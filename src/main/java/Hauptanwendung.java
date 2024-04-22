class Hauptanwendung {

    public static void main(String[] args) {

        String firstName = "Peter";
        String lastName = "Lustig";

        // V1
        System.out.printf("%s, %s%n", lastName, firstName);

        //V2
        System.out.printf("%s %s%n", firstName, lastName);

        //V3
        System.out.printf("%s, %s%n", lastName.toUpperCase(), firstName);

        //V4
        System.out.printf("%s %s%n", firstName, lastName.toUpperCase());

        //V5
        System.out.printf("%s %s%n", firstName, lastName.toUpperCase().replace("", " "));

        //V6
        System.out.printf("%c. %s%n", firstName.toUpperCase().charAt(0), lastName);

        //V7
        System.out.printf("%c%c%n", firstName.toLowerCase().charAt(0), lastName.toLowerCase().charAt(0));

        String fullName = firstName.concat(" ").concat(lastName);

        fullName = fullName
            .substring(fullName.indexOf(" ") + 1, fullName.length())
            .concat(", ")
            .concat(fullName.substring(0, fullName.indexOf(" ")));
        System.out.println(fullName);
    }
}