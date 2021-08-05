package Exercise1;

public class ColorFan extends Fan {
    
    private int series;

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public ColorFan(int series, String code, double price) {
        super(code, price);
        this.series = series;
    }
    
    public ColorFan(){}

    public double getPrice() {
        return (series < 300)? (super.getPrice()+(super.getPrice()*0.1)) : super.getPrice();
    }
    
    public String toString() {
        super.setPrice(getPrice());
        return super.toString() + " series=" + series;
    }
    
}
