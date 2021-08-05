package Exercise2;

import Exercise2.Car;

public class VNCar extends Car {
    private int series;

    public int getSeries() {
        return series;
    }
    public void setSeries(int series) {
        this.series = series;
    }
    public VNCar(int series, String name, double price) {
        super(name, price);
        this.series = series;
    }
    public VNCar() {}
    @Override
    public String toString() {
        return super.toString() + " series=" + series;
    }
    public double getSalePrice()
    {
        return (series < 300) ? super.price*0.1 + super.price : super.price;
    }
}

