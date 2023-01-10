package View;

import allobject.modelAll;
import entity.entity_pajak;

import java.util.Scanner;

public class ViewPajak {
    public static void menupajak() {
        int i = 1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("MENU SAMSAT");
            System.out.println("1. Tambah Data Pajak");
            System.out.println("2. Edit Data Pajak");
            System.out.println("3. Hapus Data Pajak");
            System.out.println("4. Lihat Data Pajak");
            System.out.println("5. Kembali");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = input.nextInt();
            System.out.println("====================");
            switch (pilihan) {
                case 1:
                    insertdatapajak();
                    break;
                case 2:
                    updatepajak();
                    break;
                case 3:
                    hapusdatapajak();
                    break;
                case 4:
                    tampildatapajak();
                    break;
                case 5:
                    i = 0;
                    break;
                case 6:
                    ViewKendaraan.cari();

            }
        } while (i > 0);
    }

    public static void tampildatapajak() {

        for (int i = 0; i < modelAll.pajak.size(); i++) {
            if (modelAll.pajak == null) {
                System.out.println("Data Kosong");
            } else {
                System.out.println("====================");
                System.out.println("No STNK : " + modelAll.pajak.get(i).getId_pajak());
                System.out.println("Jumlah CC : " + modelAll.pajak.get(i).getCc());
                System.out.println("Biaya Pajak : " + modelAll.pajak.get(i).getBiaya_pajak());
                System.out.println("Tenggat Pajak : " + modelAll.pajak.get(i).getTenggat());
                System.out.println("Denda Pajak : " + modelAll.pajak.get(i).getDenda_pajak());
            }
        }
    }

    public static void insertdatapajak() {
        Scanner input = new Scanner(System.in);
        int id_pajak = 0, cc = 0, biaya = 0, denda = 0, tenggat = 0;
        int i = 1;
        do {
            System.out.print("Masukkan Nomer STNK  : ");
            id_pajak = input.nextInt();
            System.out.print("Masukkan jumlah CC Kendaraan :");
            cc = input.nextInt();
            System.out.print("Masukkan Biaya Pajak : ");
            biaya = input.nextInt();
            System.out.print("Masukkan Tenggat : ");
            tenggat = input.nextInt();
            System.out.print("Masukkan Jumlah Denda : ");
            denda = input.nextInt();
            boolean output = modelAll.controllerpajak.tambahpajak(new entity_pajak(id_pajak, cc, biaya, tenggat, denda));
            System.out.println("Data Pajak berhasil ditambahkan");
            input.nextLine();
            System.out.print("Apakah ingin menambah Data lagi? (y/t) ");
            String pilihan = input.nextLine();
            switch (pilihan) {
                case "y":
                    i++;
                    break;
                case "t":
                    i = 0;
                    break;
            }
        } while (i > 0);
    }

    public static void updatepajak() {
        Scanner input = new Scanner(System.in);
        int nomor = 0;
        int i = 0;
        do {
            System.out.println("Masukkan ID Pajak yang ingin diedit : ");
            nomor = input.nextInt();
            input.nextLine();
            if (nomor == modelAll.pajak.get(i).getId_pajak()) {
                boolean output1 = modelAll.controllerpajak.hapuspajak(nomor - 1);
            }
            System.out.print("Masukkan No STNK  : ");
            int idpajak = input.nextInt();
            System.out.print("Masukkan Jumlah CC :");
            int cc = input.nextInt();
            System.out.print("Masukkan Biaya Pajak : ");
            int biaya = input.nextInt();
            System.out.print("Masukkan Tenggat : ");
            int tenggat = input.nextInt();
            System.out.print("Masukkan Jumlah Denda : ");
            int denda = input.nextInt();
            input.nextLine();
            boolean output2 = modelAll.controllerpajak.updatepajak(nomor - 1, new entity_pajak(idpajak, cc, biaya, tenggat, denda));
            System.out.print("Apakah ingin mengupdate lagi? (y/t) ");
            String pilihan = input.nextLine();
            switch (pilihan) {
                case "y":
                    i++;
                    nomor++;
                    break;
                case "t":
                    i = 0;
                    break;
            }
        } while (i > 0);
    }

    public static void hapusdatapajak() {
        Scanner input = new Scanner(System.in);
        int nomor = 0;
        int i = 0;
        do {
            System.out.println("Masukkan ID Pajak yang ingin dihapus : ");
            nomor = input.nextInt();
            input.nextLine();
            if (nomor == modelAll.pajak.get(i).getId_pajak()) {
                boolean output = modelAll.controllerpajak.hapuspajak(nomor - 1);
            }
            System.out.print("Apakah ingin menambah lagi? (y/t) ");
            String pilihan = input.nextLine();
            switch (pilihan) {
                case "y":
                    i++;
                    nomor++;
                    break;
                case "t":
                    i = 0;
                    break;
            }
        } while (i > 0);
    }

}
