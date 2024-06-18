public class exReturn {
    public static void main(String[] args) {
        invers(2);
        System.out.println(invers(2));
        System.out.println(invers(-8));
        System.out.println(sumaAritm(4,5,7));
        System.out.println(maxim(4,9));
        System.out.println(lungime("Dornic"));
        //ex 6
        String text = "Pitoresc";
        String textInversat=inverseazaString(text);
        System.out.println("textul inversat este: " + textInversat);
///ex opt
        afiseazaCeva();


    }

//ex 1
    public static int invers(int x){
        int invers = x*(-1);
        return invers;
    }

    public static int maxim( int a, int b){
        return (a>b) ? a:b;
    }

//ex 3
    public static double sumaAritm( int a, int b, int c){
         double suma = (a+b+c)/3.0;
         return suma;
    }
//ex 4
    public static int lungime(String word){
        return word.length();
    }
//ex 6 !!!!
    public static String inverseazaString(String cuv) {
        return new StringBuilder(cuv).reverse().toString();}

    //ex opt 1

    public static void afiseazaCeva() {
        System.out.println("Insfarsit e vreme buna");
    }


sssss


    }




////
////    public static boolean nrPar(int x){
////


