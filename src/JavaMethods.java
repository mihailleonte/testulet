public class JavaMethods {
    public static void main(String[] args) {
        afiseazaCeva();
        calculeazaSuma(5,8);
        calculeazaDiferenta(10,9);
        calculeazaProdus(5,9);
        calculeazaSuma(2.5,8.0);
        learning2Code("java");
        learning2Code("python");
        learning2Code("C++");
        aflaNumarulMaiMare(123123123,231232123);
        lungimeCuvantul("enciclopedie");
        vocalaSauConsoana("alexandru");
        vocalaSauConsoana("Rebeca");
        varsta(99);
        varsta(18);
        varsta(19);
        sum(5, 3);
        System.out.println(sum(5, 3));
        System.out.println(concatenateTwoStribgs("string a "," string b"));
        System.out.println(aDouaLitera("maricica"));
        calculeazaSuma(4,8);



    }


    private static void afiseazaCeva() {
        System.out.println("Hello World");
    }


    private static void calculeazaSuma(int x, int y) {
        System.out.println(x + y);
    }

    private static void calculeazaDiferenta(int x, int y){
        System.out.println(x-y);
    }

    private static void calculeazaProdus(int x, int y){
        System.out.println(x*y);
    }
    private static void calculeazaSuma(double x, double y){
        System.out.println(x+y);
    }

//    private static void metoda1() {
//        System.out.println("metoda1");
//    }
//
//    private static void metoda1(String nume){
//        System.out.println("metoda1 cu nume");
//    }
//
//    private static void metoda1(String nume1, String nume2) {
//        System.out.println("metoda1 cu nume1 si nume2");
//    }
    //Ex 2


    private static void learning2Code(String limbajProgramare){
        System.out.println(" It's easy to learn"+ limbajProgramare);
    }


    private static void aflaNumarulMaiMare(int a, int b){

        int nrMaiMare;
        if (a>b){nrMaiMare=a;}
        else nrMaiMare=b;
//        if (x>y){
//            System.out.println(x);}
//        else System.out.println(y);
//        }
        System.out.println("Numarul mai mare este: " +nrMaiMare );
    }
    private static void lungimeCuvantul(String cuvant){

        int lungime = cuvant.length();
        System.out.println("lungimea cuvantului este: " + lungime);
    }

    private static void vocalaSauConsoana(String cuvant) {
        String cuvantCuLitereMici = cuvant.toLowerCase();
        if (cuvant.charAt(0) == 'a' ||
                cuvantCuLitereMici.charAt(0) == 'e' ||
                cuvantCuLitereMici.charAt(0) == 'i' ||
                cuvantCuLitereMici.charAt(0) == 'o' ||
                cuvantCuLitereMici.charAt(0) == 'u' ) {
            System.out.println(cuvant + " incepe cu vocala");
        } else System.out.println(cuvant + " incepe cu consoana");
    }
    //ex 6

    private static void varsta(int varsta){
        if (varsta < 18) {
            System.out.println("too young");
        }
        else if (varsta>=18 && varsta>66){
            System.out.println("too old");
        }
    }
    // metode cu return

    private static int sum(int a, int b){
        int sum=a+b;
        return sum;
    }

    private static String concatenateTwoStribgs(String a, String b){
        String concat =a+b;
        return concat;
    }
    private static  char aDouaLitera(String cuvant){
        return cuvant.charAt(1);
    }



    }

