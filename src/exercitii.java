public class exercitii {
    public static void main(String[] args) {
        System.out.println("ex1----");
        int var1 = 4;
        int var2 = 13;
        int var3 = 23;
        int var4 = 65;
        System.out.println(var1 + var2 + var3 + var4);
        System.out.println(var1 * var2 * var3 * var4);
        System.out.println(var4 % var2);

        System.out.println("ex2------");

        var1++;
        var1++;
        var1++;
        System.out.println(var1);

        System.out.println("ex3-----");
        var2--;
        var2--;
        System.out.println(var2);


        System.out.println("ex4-----");

        int sum1 = (var1 + var2 + var3 + var4);
        int prod1 = (var1 * var2 * var3 * var4);
        boolean cond1 = sum1>100;
        System.out.println(cond1);
//        if (sum1 > 100) {
//            System.out.println("cond1=" + cond1);
//    }
        boolean cond2 = prod1>1000;
        System.out.println(cond2);
//        if (prod1 > 1000) {
//            System.out.println("cond2=" + cond2);
//        }
        boolean ambeleTrue = cond1&&cond2;
        boolean celPutinUna = cond1||cond2;

        System.out.println(ambeleTrue);
        System.out.println(celPutinUna);

        System.out.println("ex5-------");
        if (sum1 > 100 || prod1 > 1000) {
            System.out.println("Ambele sunt true");
        }
        if (sum1 > 100 && prod1 > 1000) {
            System.out.println("Cel putin una este true");


            int numar1 =5;
            int numar2 =4;
            int sum = numar1 + numar2;

            if(sum>=10){
                System.out.println("suma mai mare decat 10");}

            else {
                System.out.println("suma mai mica decat 10");
            }


            if (sum%2==0){
                System.out.println("suma este numar par");}
            else{
                System.out.println("suma esete numar impar");}
        }
    }
}



