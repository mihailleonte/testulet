public class MyFirstClass {
    public static void main(String[] args) {
        // Ex. 1
        int day = 16;
        int month = 1;
        System.out.println("sum = " + (day + month));
        System.out.println("product = " + (day * month));
        // Ex.2
        String name = "Mihail Leonte";
        System.out.println(name);
        System.out.println( name + ", invata Java!");
        // Ex. 3
        int year = 2000;
        String city = " Botosani";
        System.out.println(year + city);
        // Exemple la curs
        String country = "Romania";
        System.out.println(country);
        country = "Germania";
        System.out.println(country);
        // Exercitii optionale
        //Ex. 1
        String limbaj = "Java ";
        String text1 = "Este usor sa inveti ";
        // Ex. 2
        System.out.println(limbaj + text1);
        limbaj = "Python";
        System.out.println(text1 + limbaj);
        // Ex. 3
        limbaj = "orice limbaj de programare ";
        System.out.println(text1 + limbaj);
        // Ex. 4
        String text2 = "atat timp cat iti dai silinta ";
        System.out.println(text1 + limbaj + text2);
        // Ex. 5
        System.out.println(text2 + limbaj + text1);

    }
}
