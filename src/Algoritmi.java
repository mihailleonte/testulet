public class Algoritmi {
    public static void main(String[] args) {

//        int [] numbers = {1, -25, 34, -2, 67, 5};
//        for (int n: numbers) {
//            System.out.println((n+1) + " "+ (n-1));
//
//        for (int c: numbers){
//            if (c<0) {
//                System.out.println(c);
//            }

        String text = "abracadabra";
        String text2 = "abracadabra";
        System.out.println(text.charAt(3));
        System.out.println(text.compareTo(text2));
        System.out.println(text.contains("cat"));
        System.out.println(text.endsWith("bra"));
        System.out.println(text.length());

        String tari[] = {"Anglia", "Romania", "Albania", "Elvetia", "China", "SUA", "Australia"};

        for (String t : tari) {
            System.out.println(t.charAt(0));
            if (t.charAt(0) == 'A') {
                System.out.println(t);
            }


        }
        System.out.println("--------------------------------------------");
        for (String t : tari) {
            System.out.println(t + " " + t.length());
        }
        System.out.println("--------------------------------------------");

        String longestCountryName = tari[0];
        for (String c : tari) {
            if (c.length() > longestCountryName.length()) {
                longestCountryName = c;
            }
        }
        System.out.println("Tara cu cel mai mare nume este: "+longestCountryName);

        System.out.println("--------------------------------------------");

        String shortestCountryName = tari[0];
        for (String d : tari) {
            if (d.length() < shortestCountryName.length()) {
                shortestCountryName = d;
            }
        }
        System.out.println("Tara cu cel mai mic nume este: "+shortestCountryName);








    }
}

//    }
//}
