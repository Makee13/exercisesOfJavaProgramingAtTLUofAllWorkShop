package Exercise4;

//import Exercise4.Person;

public class Student extends Person {
//   Begin Attributes-section
    
    private String ClassID;
    private float Mark;
    
//   End Attributes-section
    
//    Begin Methods-section

    public String getClassID() {
        return ClassID;
    }

    public void setClassID(String ClassID) {
        this.ClassID = ClassID;
    }

    public float getMark() {
        return Mark;
    }

    public void setMark(float Mark) {
        this.Mark = Mark;
    }
//  The Method is returning result of Student with mark
    public String Result() {
        return (Mark > 5) ? "Pass" : "Slip";
    }
        
    public String toString() {
        return super.toString() + ClassID + "\t" + Mark + "\t" + Result();
    }
    
    public Student(String ClassID, float Mark, String ID, String Name, String Gender) {
        super(ID, Name, Gender);
        this.ClassID = ClassID;
        this.Mark = Mark;
    }

    public Student() {
    }

}
