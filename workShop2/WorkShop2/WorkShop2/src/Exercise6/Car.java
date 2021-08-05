package Exercise6;

public class Car extends Product {
    private int Year;
    private float Price;
    float discountStore;

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public float Discount(){
        discountStore =(Year<2017)?Price*0.1f:0;
        return discountStore;
    }
    
    public String toString()
    {
        return super.toString() + "\t" + Year + "\t" + discountStore;
    }
    public Car(int Year, float Price, String ID, String Name, String Color) {
        super(ID, Name, Color);
        this.Year = Year;
        this.Price = Price;
    }

    public Car() {}
    
}
