package Exercise1;

public class Fan {
    
    private String code;

    public String getCode() {
        return code.toUpperCase();
    }

    public void setCode(String code) {
        this.code = code;
    }

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Fan(String code, double price) {
        this.code = code;
        this.price = price;
    }

    public Fan() {}
    
}
