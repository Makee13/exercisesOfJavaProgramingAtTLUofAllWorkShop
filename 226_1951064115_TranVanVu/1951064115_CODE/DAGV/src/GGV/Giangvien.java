package GGV;

public class Giangvien extends  Person{

    private String Donvi;

    public String getDonvi() {
        return Donvi;
    }

    public void setDonvi(String Donvi) {
        this.Donvi = Donvi;
    }

    private int Soct;

    public int getSoct() {
        return Soct;
    }

    public void setSoct(int Soct) {
        this.Soct = Soct;
    }

    public Giangvien(String Donvi, int Soct, String MaDD, String Hoten, boolean GT) {
        super(MaDD, Hoten, GT);
        this.Donvi = Donvi;
        this.Soct = Soct;
    }

    public Giangvien() {
    }

    @Override
    public String Xetthuong() {
        return (Soct>10)?"Khen thưởng":"";
    }

    @Override
    public String toString() {
        return super.toString() + "\t" +  Donvi + "\t" + Soct + "\t" + Xetthuong();
    }
    
    
}
