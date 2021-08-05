package Exercise2;

public class Student extends  Person{
  
    private boolean Gender;    
    private double Mark;

    public boolean getGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public double getMark() {
        return Mark;
    }

    public void setMark(double Mark) {
        this.Mark = Mark;
    }
    
    @Override
    public String Rank()
    {
        if(Mark>=9)              return "Xuất sắc";
        else if(Mark<9&&Mark>=8) return "Giỏi";
        else if(Mark<8&&Mark>=7) return "Khá";
        else if(Mark<7&&Mark>=5) return "Trung bình";
        else                     return "Yếu";
    }
    
    public Student(String ID, String Name, boolean Gender, String ClassID, double Mark) {
        super(ID,Name,ClassID);
        this.Gender = Gender;
        this.Mark = Mark;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", Name=" + Name + ", Gender=" + Gender + ", ClassID=" + ClassID + ", Mark=" + Mark + '}';
    }
    
}
