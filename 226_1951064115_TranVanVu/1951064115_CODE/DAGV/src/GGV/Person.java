package GGV;

public abstract class Person {
    
     protected String MaDD;
     protected String Hoten;
     protected boolean GT;

    public String getMaDD() {
        return MaDD;
    }

    public void setMaDD(String MaDD) {
        this.MaDD = MaDD;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public boolean isGT() {
        return GT;
    }

    public void setGT(boolean GT) {
        this.GT = GT;
    }

    public Person(String MaDD, String Hoten, boolean GT) {
        this.MaDD = MaDD;
        this.Hoten = Hoten;
        this.GT = GT;
    }

    public Person() {
    }

    @Override
    public String toString() {
        String Gioitinh = (GT)?"Nam":"Nữ";
        return MaDD + "\t" + Hoten + "\t" + Gioitinh;
    }
    
    public abstract String Xetthuong();
}
