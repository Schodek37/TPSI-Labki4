package helloworld;

import java.util.Arrays;
import java.util.Collections;

enum GatunekPiwa {

    LAGER, PILZNER, PORTER, STOUT, PIWO_Z_BIEDRONKI
}

public class Main {

    public static void main(String[] args) {
        double x = 3.5, y = 0;
        int m = 3, n = 7;

        double z = x * y;
        int k = m + n;

       // System.out.println(z);
        // System.out.println(k);
        System.out.println("Liczby podzielne przez 3:");
        for (int i = 1; i <= 10; i++) {

            int r = i % 3;

            if (r == 0) {
                int kw = i * i;
                System.out.println(i + " - " + kw);
            }

        }

        double LiczbyR[] = new double[10];
        int LiczbyC[] = new int[10];

        for (int i = 0; i < 10; i++) {
            LiczbyR[i] = Math.random();
            LiczbyC[i] = (int) (Math.floor(Math.random() * 100));
        }

        System.out.println("Liczby całkowite:");
        for (int i = 0; i < 10; i++) {
            System.out.println(LiczbyC[i]);
        }

        System.out.println("Liczby rzeczywiste:");
        for (int i = 0; i < 10; i++) {
            System.out.println(LiczbyR[i]);
        }

        Arrays.sort(LiczbyR);
        Arrays.sort(LiczbyC);
        String sC = Arrays.toString(LiczbyC);
        String sR = Arrays.toString(LiczbyR);

        System.out.println("\nPosortowane Tablice ");
        System.out.println(sC);
        System.out.println(sR);

        int LC[] = new int[6];

        System.out.println("\nZadanie 1 na int\nLosowe 6 liczb z zakresu od 1 do 49");
        for (int i = 0; i < 6; i++) {
            LC[i] = (int) (Math.floor(Math.random() * 49)+1);

        }

        Arrays.sort(LC);
        String Sorted = Arrays.toString(LC);
        System.out.println(Sorted);

        int a = 3;
        double b = 2.3;
        char c = 'a';

        Integer duzyInt = new Integer(17);
        Double duzyDouble = new Double(3.14159);
        Character duzyChar = new Character('b');

        duzyInt = 3;
        duzyDouble = 666.666;
        duzyChar = 'c';

        // a=DuzyInt; not working
        b = duzyDouble;
        c = duzyChar;

        Integer LC2[] = new Integer[6];

        System.out.println("\nZadanie2 na Integer\nLosowe 6 liczb z zakresu od 1 do 49");
        for (int i = 0; i < 6; i++) {
            LC2[i] = (int) (Math.floor(Math.random() * 49) + 1);
        }

        Arrays.sort(LC2);
        String Sorted2 = Arrays.toString(LC2);
        System.out.println(Sorted2);

        GatunekPiwa piwkoNaDzisWieczor = GatunekPiwa.PIWO_Z_BIEDRONKI;
        System.out.println("\n" + piwkoNaDzisWieczor);

        for (GatunekPiwa dir : GatunekPiwa.values()) {
            System.out.println(dir);
        }

        System.out.println(GatunekPiwa.values()[1]);

        GatunekPiwa Tab[] = new GatunekPiwa[3];
        Integer[] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));

        System.out.println("\n\n3 piwa na impreze:");
        for (int i = 0; i < 3; i++) {
            Tab[i] = GatunekPiwa.values()[arr[i]];

            System.out.println(Tab[i]);

        }

        GatunekPiwa[] piwo = GatunekPiwa.values();

        for (int i = 0; i < 3; i++) {

            switch (Tab[i]) {
                case LAGER:
                case PILZNER:

                    System.out.println(Tab[i] + " to piwo jasne");
                    break;

                case PORTER:
                case STOUT:
                    System.out.println(Tab[i] + " to piwo ciemne");
                    break;
                case PIWO_Z_BIEDRONKI:
                    System.out.println(Tab[i] + " to piwo tanie");
                    break;

            }

        }

        /*for (int i = 0 ; i < 5 ; i++){
         int test =  (int) (Math.floor(Math.random()*5)+1);
         System.out.println(test);
         }*/
        //System.out.println(Arrays.toString(arr));
    }

}
