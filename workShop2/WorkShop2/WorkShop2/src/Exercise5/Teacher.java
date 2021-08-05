package Exercise5;

public class Teacher extends Person {

    private String Address;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    private double Grading;

    public double getGrading() {
        return Grading;
    }

    public void setGrading(double Grading) {
        this.Grading = Grading;
    }

    @Override
    public double Salary() {
        return 1500000 * Grading;
    }

    public String toString() {
        return super.toString() + Address + "\t" + Grading + "\t" + Salary();
    }

    public Teacher(String Address, double Grading, String ID, String Name, String Gender) {
        super(ID, Name, Gender);
        this.Address = Address;
        this.Grading = Grading;
    }

    public Teacher() {}

}
