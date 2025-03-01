import java.util.Scanner;

public class KaryawanBANK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak");

        System.out.println("Isikan Pilihan");
        int pilihan = sc.nextInt();
        System.out.println("Nama: ");
        String nama = sc.next();
        System.out.println("Tunjangan");
        double tunjangan = sc.nextDouble();
        if (pilihan==1){
            System.out.println("Gaji Pokok: ");
            double gapok = sc.nextDouble();
            KaryawanTetap k1 = new KaryawanTetap(nama, gapok, tunjangan);

            k1.infoKaryawan();


        }
        else if (pilihan==2){
            System.out.println("Gaji Harian: ");
            double gajiHarian = sc.nextDouble();
            KaryawanKontrak k2 = new KaryawanKontrak(nama, tunjangan);
            k2.infoKaryawan();



        }
    }
}
