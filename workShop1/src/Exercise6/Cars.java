/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise6;

/**
 *
 * @author LENOVO
 */
public class Cars {
    
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

    private String Country;


    public String getCountry() {
        return Country;
    }


    public void setCountry(String Country) {
        this.Country = Country;
    }

    private String Color;


    public String getColor() {
        return Color;
    }


    public void setColor(String Color) {
        this.Color = Color;
    }

    private double Price;


    public double getPrice() {
        return Price;
    }

    
    public void setPrice(double Price) {
        this.Price = Price;
    }

    public Cars(String ID, String Name, String Country, String Color, double Price) {
        this.ID = ID;
        this.Name = Name;
        this.Country = Country;
        this.Color = Color;
        this.Price = Price;
    }

    public Cars() {
    }

    public double Discount()
    {
            if("red".equals(Color))         return Price*0.2;
            else                            return 0;
    }
}
