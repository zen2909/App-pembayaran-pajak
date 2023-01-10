package View;

import java.util.Scanner;

public class Viewmain {
    public static void menukendaraan(){
        int i = 1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Dashboard");
            System.out.println("1. Staff");
            System.out.println("2. Non-Staff");
            System.out.println("3. Exit");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = input.nextInt();
            System.out.println("====================");
            switch (pilihan) {
                case 1:
                    ViewSamsat.menu();
                    break;
                case 2:
                    ViewKendaraan.menukendaraan();
                    break;
                case 3:
                    i=0;
                    break;

            }
        } while (i > 0);
    }
}
