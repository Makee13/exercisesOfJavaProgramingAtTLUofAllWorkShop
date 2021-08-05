package Exercise2;

public class Car {
    protected String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    protected double price;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Car() {
    }
    @Override
    public String toString() {
        return "Name=" + name + ", price=" + price;
    }
}
