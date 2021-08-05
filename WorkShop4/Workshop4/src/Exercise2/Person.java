package Exercise2;

public abstract class Person {
    
    protected String ID;
    protected String Name;    
    protected String ClassID;
    
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
    
    public String getClassID() {
        return ClassID;
    }

    public void setClassID(String ClassID) {
        this.ClassID = ClassID;
    }

    public Person(String ID, String Name, String ClassID) {
        this.ID = ID;
        this.Name = Name;
        this.ClassID = ClassID;
    }

    public Person() {
    }
        
    public abstract String Rank();  
    
}
