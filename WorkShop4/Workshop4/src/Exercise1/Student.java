package Exercise1;

public class Student {
    
    private String ID;    
    private String Name;    
    private boolean Gender;    
    private String ClassID;    
    private double Mark;

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

    public boolean getGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

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
    
    public String Rank()
    {
        if(Mark>=9)              return "Xuất sắc";
        else if(Mark<9&&Mark>=8) return "Giỏi";
        else if(Mark<8&&Mark>=7) return "Khá";
        else if(Mark<7&&Mark>=5) return "Trung bình";
        else                     return "Yếu";
    }
    
    public Student(String ID, String Name, boolean Gender, String ClassID, double Mark) {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
        this.ClassID = ClassID;
        this.Mark = Mark;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", Name=" + Name + ", Gender=" + Gender + ", ClassID=" + ClassID + ", Mark=" + Mark + '}';
    }
    
}
