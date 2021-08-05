package Exercise5;

public class Product {
    
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    private double Amount;

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    private double Price;

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    public double Total()
    {
        return Amount*Price;
    }

    @Override
    public String toString() {
          return ID + "\t" + Name + "\t" + Amount + "\t" + Price + "\t" + Total();
    }
    public Product(String ID, String Name, double Amount, double Price) {
        this.ID = ID;
        this.Name = Name;
        this.Amount = Amount;
        this.Price = Price;
    }

    public Product() {
    }
}
