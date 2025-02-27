public class KaryawanKontrak extends Karyawan {
    double gaji_per_hari;
    int jml_masuk;
   
    public KaryawanKontrak(String nama, double tunjangan){
        super(nama,tunjangan);
        gaji_per_hari = 200000;
    }

    public void setKaryawankontrak(double gph, int jml_masuk){
        gaji_per_hari = gph;
        this.jml_masuk = jml_masuk;
    }
    
    public double getGaji(){
        double total =
        (gaji_per_hari * jml_masuk) + super.getTunjangan();
        return total;
    }

    public void infoKaryawan(){
        System.out.println("Nama: " + super.getNama());
        System.out.println("Gaji/hari : " + gaji_per_hari);
        System.out.println("Jumlah masuk : " + jml_masuk);
        System.out.println("Total Gaji: " + getGaji());
        System.out.println("=====================================");
    }
}
    
