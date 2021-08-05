package Exercise4;

public class Student {

    protected String ID;
    protected String Name;
    protected double Mark;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getMark() {
        return Mark;
    }

    public void setMark(double Mark) {
        this.Mark = Mark;
    }

    public String Display() {
        return ID + "\t" + Name + "\t" + Mark + "\t" + Result();
    }

    public String Result() {
        return (Mark >= 5) ? "Pass" : "Slip";
    }

    public Student(String ID, String Name, double Mark) {
        this.ID = ID;
        this.Name = Name;
        this.Mark = Mark;
    }

    public Student() {
    }

}
