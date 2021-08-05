package Exercise3;

public class Candidate extends Person {

    private String ClassID;
    private double Mark;

    public String getClassID() {
        return ClassID;
    }

    public void setClassID(String ClassID) {
        this.ClassID = ClassID;
    }

    public double getMark() {
        return Mark;
    }

    public void setMark(double Mark) {
        this.Mark = Mark;
    }

    public Candidate(String ClassID, double Mark, String ID, String Name, String Gender) {
        super(ID, Name, Gender);
        this.ClassID = ClassID;
        this.Mark = Mark;
    }

    public Candidate() {
    }

    public String Result() {
        return (Mark > 8.5) ? "Pass" : "Slip";
    }

    public String toString() {
        return super.toString() + "ClassID=" + ClassID + ", Mark=" + Mark + ", Result=" + Result();
    }
}
