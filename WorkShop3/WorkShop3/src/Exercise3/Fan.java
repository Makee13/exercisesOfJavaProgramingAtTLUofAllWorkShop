package Exercise3;

public class Fan {
    
    private String code;   
    private double price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    
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
