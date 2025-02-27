import java.util.Scanner;

public class KaryawanBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("1.Karyawan Tetap");
        System.out.println("2.Karyawan Kontrak");

        System.out.print("Isikan Pilihan");
        int pilihan = sc.nextInt();
        System.out.print("Nama :");
        String nama = sc.next();
        System.out.println("Tunjangan :");
        double tunjangan = sc.nextDouble();
        if(pilihan==1){
            System.out.print("Gaji Pokok :");
            double gapok = sc.nextDouble();
            KaryawanTetap k1 =
            new KaryawanTetap(nama, gapok, tunjangan);
            k1.infoKaryawan();
        }

    }
    
}