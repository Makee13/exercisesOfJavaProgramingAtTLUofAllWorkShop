package Exercise1;

public class Fan {
//    Declare 2 attributes code and price
    protected String code;
    protected double price;
//    End
    
//    Begin getter and setter of code attribute 
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
//    End getter and setter of code attribute 
    
//    Begin getter and setter of price attribue 
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
//    End getter and setter of price attribue 
    
//    Begin Constructor explaining and default
    public Fan(String code, double price) {
        this.code = code;
        this.price = price;
    }

    public Fan() {}
//    toString methods
    public String toString() {
        return "code=" + code + ", price=" + price;
    }
    
}
