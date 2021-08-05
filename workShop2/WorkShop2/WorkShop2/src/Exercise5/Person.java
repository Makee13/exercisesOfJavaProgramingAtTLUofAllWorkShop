package Exercise5;

public abstract class Person {
//   Begin Attributes-section

    protected String ID;
    protected String Name;
    protected String Gender;

//   End Attributes-section
//    Begin Methods-section
    
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

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    public abstract double Salary();
    
    public String toString() {
        return ID + "\t" + Name + "\t" + Gender + "\t";
    }
     
    public Person(String ID, String Name, String Gender) {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
    }

    public Person() {
    }


}
