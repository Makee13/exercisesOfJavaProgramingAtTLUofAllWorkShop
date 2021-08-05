package Exercise6;

public abstract class Product {
    protected String ID;
    protected String Name;
    protected String Color;

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

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Product(String ID, String Name, String Color) {
        this.ID = ID;
        this.Name = Name;
        this.Color = Color;
    }
    
    public String toString()
    {
        return ID + "\t" + Name +  "\t" + Color;
    }
    public abstract float Discount();
    
    public Product() {}
    
}
