package Exercise2;

public class Book {
    private String name;
    private double price;

    public String getName() {
        return name.substring(0,3);
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price*0.9;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Book() {
    }
    
    
}
