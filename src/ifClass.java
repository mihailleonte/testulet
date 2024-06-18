public class ifClass {
    public static void main(String[] args) {
        int time=21;

        if(time>24||time<0){
            System.out.println("incorrect time");}

        else if (time > 18){
            System.out.println("good evening");}

        else if(time>12) {
            System.out.println("good day");}

        else System.out.println("good morning");

        int dayNumber=12;

        switch (dayNumber){
            case 1: System.out.println("Luni"); break;
            case 2: System.out.println("Marti"); break;
            case 3: System.out.println("Miercuri"); break;
            case 4: System.out.println("Joi"); break;
            case 5: System.out.println("Vineri"); break;
            case 6: System.out.println("Sambata"); break;
            case 7: System.out.println("Duminica"); break;
            default:
                System.out.println("ziua nu este valida");



                char gender = 'f';
                boolean married = false;
                if (gender == 'm') {
                    System.out.println("Domnul");
                }
                else if (gender == 'f'){
                    if(married) {
                        System.out.println("Doamna");
                    }
                    else System.out.println("Domnisoara");
                }


                int x = 10;
                int y = 15;

                if (x>y) {
                    System.out.println(x + " este mai mare decat" + y);
                } else if (x<y){
                    System.out.println(y+ " este mai mare decat " +x);
                }
                else System.out.println(x+" este egal c" +y);
        }
    }
}
