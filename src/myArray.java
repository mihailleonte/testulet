import java.io.StringReader;

public class myArray {
    public static void main(String[] args) {
//        int numbers[] ={1,3,4,5,6};
//        String[] cursanti = {"Mihail", "Nicu", "Rebeca"};
//
//        System.out.println(cursanti[0]);
//        System.out.println(cursanti[2]);
//        cursanti[2] = "Raluca";
//        System.out.println(cursanti[2]);
//        System.out.println(cursanti.length);
//
//        System.out.println(numbers.length);
//
//        for(int i=0;i<cursanti.length;i++){
//            System.out.println(cursanti[i]);
//        }
//
//        System.out.println("----------------------------------------------------");
//
//        for(String c:cursanti){
//            System.out.println(c);


        String[] legume = {"mar", "capsuni", "struguri", "banane"};
        System.out.println(legume[1]);
        System.out.println(legume[3]);
        System.out.println(legume.length);

        System.out.println("--------------------ex optionale-----------------------------");

        char[] elemente = {'a', 'b', 'c', 'd'};
        System.out.println(elemente[0]);
        System.out.println(elemente[1]);
        System.out.println(elemente[3]);
        System.out.println("-----------------------------");
        for (int i = 0; i < elemente.length; i++) { // for(start; stop;pas)
            System.out.println(elemente[i]);
        }


            System.out.println("------------------------------sau---------------------");

            for (char c : elemente) {
                System.out.println(c);
            }
        }
    }




