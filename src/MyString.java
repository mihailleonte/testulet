public class MyString {
    public static void main(String[] args) {
        String text = "Hello";
        String nume = "Mihail";
        System.out.println(text + ", sunt " + nume + "!");

        String numeMare = nume.toUpperCase();
        System.out.println(numeMare);

        String numeMic = nume.toLowerCase();
        System.out.println(numeMic);

        String prop = "Ana are mere";
        int lungime = prop.length();
        System.out.println(prop.length());
        System.out.println(lungime);

        char primaLitera = prop.charAt(0);
        System.out.println(primaLitera);

        //String filmulPreferat = "Filmul meu preferat este 'Harry Potter'";
        String filmulPreferat = "Filmul meu preferat este \n\"Harry Potter\"";
        System.out.println(filmulPreferat);

        System.out.println("---------------------------------------------");

        String tara = "Romania";
        System.out.println(tara.length());


        System.out.println("-----------------ex optionale-----------------");

        String myFavouriteMovie = "My favourite movie is \"John Wick\"";
        System.out.println(myFavouriteMovie);
        System.out.println(myFavouriteMovie.length());
    }
}
