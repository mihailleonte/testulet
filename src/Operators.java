public class Operators {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int c = 30;
// operatori matematicii
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a % c);

        //System.out.println(++ a);
        //++ a -> prima data incrementeaza si dupa il afiseaza

        System.out.println(a++);
        System.out.println(a);
        // a ++ -> il afiseaza si dupa il incrementeaza;

        System.out.println(-- b);
        System.out.println("-----------------------------------------------------------------------");

///operatori de atribuire
        int d = 10;
        int e = d;

        //d = d + 2;
        d += 2; // echivalent cu d = d + 2;
        System.out.println(d);


        for (int i = 0; i<=10;i+=2){
            System.out.println(i);
        }


        for ( int i = 10; i >= 0; i--){
        System.out.println(i);
        }



        // operatori de comparare

        System.out.println(a>b);
        System.out.println(b>a);
        System.out.println(5 == 5);
        System.out.println(a == b);
        System.out.println(a!=b);

        boolean iLoveJava = false;
        System.out.println(iLoveJava);

        if (iLoveJava){
            System.out.println("Learn Test Automation");}
        else {
            System.out.println("Still Learning");}


        System.out.println("-----------------------operatori logici---------------------------");
        // operatori logici

        System.out.println(d); //d=9
        System.out.println(e); // e=10

        if(d<10 && e<10){
            System.out.println("d si e mai mici decat 10");}

        if(d<10 || e<10){
            System.out.println("d si e mai mici decat 10");}
    }
}

