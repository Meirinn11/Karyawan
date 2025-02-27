public class KaryawanTetap extends Karyawan {
    int bonus;

    public KaryawanTetap(String nama, double gapok, double tunjangan, double bonus){
        super(nama,gapok,tunjangan,bonus);
    }

    public double getGaji(){
        double total = super.getGajiPokok() + super.getTunjangan() + bonus;
        return total;
    }
    
    public void infoKaryawan(){
        System.out.println("Nama: " + super.getNama());
        System.out.println("Gaji pokok : " + super.getGajiPokok());
        System.out.println("Tunjangan: " + super.getTunjangan());
        System.out.println("Total Gaji: " + getGaji());
        System.out.println("=====================================");

    }
}