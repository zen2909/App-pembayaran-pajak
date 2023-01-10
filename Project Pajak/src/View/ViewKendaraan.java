package View;

import allobject.modelAll;
import entity.entity_kendaraan;

import java.util.Scanner;

public class ViewKendaraan {

    public static void menukendaraan() {
        int i = 1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu Non - Staff");
            System.out.println("1. Cari Data Kendaraan");
            System.out.println("2. Exit");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = input.nextInt();
            System.out.println("====================");
            switch (pilihan) {
                case 1:
                    ViewKendaraan.cari();
                    break;
                case 2:
                    i=0;
            }
        } while (i > 0);
    }

    public static void cari() {
        Scanner input = new Scanner(System.in);
        int i, nostnk = 0,tanggal = 0, denda = 0;
        System.out.print("Masukkan Nomor STNK  : ");
        nostnk = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Tanggal Sekarang : ");
        tanggal = input.nextInt();
        input.nextLine();
        for (i = 0; i < modelAll.pajak.size(); i++) {
            modelAll.controllerKendaraan.cari(nostnk, i, new entity_kendaraan(nostnk));
            if (modelAll.kendaraan != null) {
                for (i = 0; i < modelAll.kendaraan.size(); i++) {
                    System.out.println("====================");
                    System.out.println("Nomor STNK : " + modelAll.kendaraan.get(i).getNomor_stnk());
                    System.out.println("Jumlah CC : " + modelAll.pajak.get(i).getCc());
                    System.out.println("Biaya Pajak : " + modelAll.pajak.get(i).getBiaya_pajak());
                    System.out.println("Tenggat Pajak : " + modelAll.pajak.get(i).getTenggat());
                    if (tanggal > modelAll.pajak.get(i).getTenggat()) {
                        denda = modelAll.pajak.get(i).getDenda_pajak();
                        System.out.println("Denda : " + denda);
                    } else {
                        denda = 0;
                        System.out.println("Denda : " + denda);
                    }
                    System.out.print("Apakah Anda Mau Melakukan Pembayaran?(y/t)");
                    String pilihan = input.nextLine();
                    switch (pilihan) {
                        case "y":
                            int total = modelAll.pajak.get(i).getBiaya_pajak() + denda;
                            System.out.println("Total : " + total);

                            System.out.println("Pilih Jenis Pembayaran");
                            System.out.println("1. Cash");
                            System.out.println("2. Debit");
                            System.out.print("Pilihan : ");
                            int pilihan2 = input.nextInt();
                            input.nextLine();
                            switch (pilihan2) {
                                case 1:
                                    cetakstruk(i, "Cash", total);
                                    break;
                                case 2:
                                    cetakstruk(i, "Debit", total);
                            }
                            break;
                        case "t":
                            break;
                    }
                }
            }else{
                System.out.println("Data Tidak Ditemukan");
                i++;
            }
        }
    }
    public static void cetakstruk(int i,String jenis,int total){
        System.out.println("==========STRUK PEMBAYARAN=========");
        System.out.println("Nomor STNK : " + modelAll.kendaraan.get(i).getNomor_stnk());
        System.out.println("Jenis Pembayaran : " + jenis);
        System.out.println("Total Pembayaran : " + total);
    }
}