public class Karyawan {
    String nama;
    double gajiPokok;
    double tunjangan;

    public Karyawan(String nama, double gapok, double tunjangan){
        this.nama = nama;
        gajiPokok = gapok;
        this.tunjangan = tunjangan;

    }
    public Karyawan(String nama, double tunjangan){
        this.nama = nama;
        this.tunjangan = tunjangan;

    }

    //membuat sub class dengan tujuan untuk menghitung gaji karyawan kontrak

    //membuat class setter
    public void setDataKaryawan(String nama, double gapok, double tunjangan){
        this.nama = nama;
        gajiPokok = gapok;
        this.tunjangan = tunjangan;

    }

    //membuat getter
    public String getNama(){
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }


}
