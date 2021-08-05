/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

/**
 *
 * @author LENOVO
 */
public class Product {
    
    private String ID;
    private String Company;
    private String Name;
    private String Color;
    private double Price;
    
//  Begin Getter and setter of ID
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
//  End Getter and setter of ID
    
//  Begin Getter and setter of Company
    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }
//  End Getter and setter of Company

//  Begin Getter and setter of Name
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
//  End Getter and setter of Name

//  Begin Getter and setter of Color

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color.toUpperCase();
    }
    
//  End Getter and setter of Color
    
//  Begin Getter and setter of Price
    
    public double getPrice() {
        return Price*0.8;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
//  End Getter and setter of Price

    public Product() {
    }

    public Product(String ID, String Company, String Name, String Color, double Price) {
        this.ID = ID;
        this.Company = Company;
        this.Name = Name;
        this.Color = Color;
        this.Price = Price;
    }

}
