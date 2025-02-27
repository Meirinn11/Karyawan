public class Karyawan{
    String nama;
    double gaji_pokok;
    double tunjangan;
    double bonus ;

    public Karyawan(String nama, double gapok, double tunjangan, double bonus) {
        this.nama = nama;
        gaji_pokok = gapok;
        this.tunjangan = tunjangan;
        this.bonus= bonus
    }

    public Karyawan(String nama, double tunjangan){
        this.nama = nama; 
        this.tunjangan = tunjangan;
    }

    public void setDataKaryawan(String nama, double gapok, double tunjangan,double bonus){
        this.nama = nama;
        gaji_pokok = gapok;
        this.tunjangan = tunjangan;
        this.bonus = bonus;
    }

    public String getNama(){
        return nama;
    }

    public double getGajiPokok(){
        return gaji_pokok;
    }

    public double getTunjangan(){
        return tunjangan;
    }

    public double getbonus(){
        return bonus;
    }
}
