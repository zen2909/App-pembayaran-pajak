package View;

import allobject.modelAll;
import entity.entity_pajak;
import entity.entity_samsat;

import java.util.Scanner;

public class ViewSamsat {
    public static void menu(){
        int i=1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("1. Register Samsat");
            System.out.println("2. Login Samsat");
            System.out.println("3. Exit ");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = input.nextInt();
            System.out.println("====================");
            switch (pilihan) {
                case 1:
                    insertsamsat();
                    break;
                case 2:
                    login();
                    ViewPajak.menupajak();
                    break;
                case 3:
                    i=0;
                    break;

            }

        }while(i>0);
    }

    public static void insertsamsat() {
        Scanner input = new Scanner(System.in);
        String nama = "";
        int pin = 0;
        System.out.print("Masukkan username  : ");
        nama = input.nextLine();
        System.out.print("Masukkan pin :");
        pin = input.nextInt();
        boolean output = modelAll.controllersamsat.tambahsamsat(new entity_samsat(nama, pin));
        System.out.println("Data Berhasil Dibuat");
    }

    public static void login() {
        Scanner input = new Scanner(System.in);
        String nama;
        int kode;
        boolean output;
        do{
            System.out.print("Masukkan Username: ");
            nama = input.next();
            System.out.print("Masukkan Pin: ");
            kode = input.nextInt();
            output = modelAll.controllersamsat.cekLogin(nama, kode);
            if (output == true) {
                System.out.println("Berhasil Masuk");
            } else {
                System.out.println("Data Salah");
            }
        }while(output==false);
    }








}
