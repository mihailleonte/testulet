public class Loops {
    public static void main(String[] args) {


        for (int i=0;i<8;i++){
            if(i==4){continue;}


            System.out.println("i= " + i);
        }


        String cars [] = {"BMW", "DACIA", "ElBONS", "FIAT", "PORSCHE", };
        for (String c: cars) {

            if(c=="BMW"){
                continue;
//                System.out.println("dar mai bine conduce catalin"); break;
            }
            System.out.println("azi vreau sa conduc un "+ c);
        }
        System.out.println("---------------------------------");

        int i = 0;
        while (i<5) {
           // if(i==3){break;}
            i++;
            if (i==3){continue;}
            System.out.println("i=" + i);
        }

//        int j = 6;
//        do {
//            System.out.println("j= " +j);
//            j++;
//        }
//        while (j>5);

    }
}
