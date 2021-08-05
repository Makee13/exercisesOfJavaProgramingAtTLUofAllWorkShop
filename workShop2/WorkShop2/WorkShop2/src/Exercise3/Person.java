package Exercise3;

public abstract class Person {

    protected String ID;
    protected String Name;
    protected String Gender;

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

    public Person(String ID, String Name, String Gender) {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
    }

    public Person() {
    }

    public abstract String Result();

    public String toString() {
        return "ID=" + ID + ", Name=" + Name + ", Gender=" + Gender;
    }

}
