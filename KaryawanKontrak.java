public class KaryawanKontrak extends Karyawan{
    double gajiHarian;
    int hariMasuk;
    public KaryawanKontrak(String nama, double tunjangan){
        super(nama, tunjangan);
        gajiHarian = 200000;

    }
    //membuat setter
    public void setKaryawanKontrak(double gajiHarian, int hariMasuk) {
        this.gajiHarian = gajiHarian;
        this.hariMasuk = hariMasuk;

    }

    public double getGaji(){
        double total = (gajiHarian + hariMasuk) + super.getTunjangan();
        return total;
    }

    public double getGajiHarian() {
        return gajiHarian;
    }

    public void infoKaryawan(){
        System.out.println("Nama: " + super.getNama());
        System.out.println("Gaji/hari: " + getGajiHarian());
        System.out.println("Jumlah masuk: " + hariMasuk);
        System.out.println("Total gaji: " + getGaji());
        System.out.println("============================");

    }
}
