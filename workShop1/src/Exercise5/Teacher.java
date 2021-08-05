/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise5;

/**
 *
 * @author LENOVO
 */
public class Teacher {
    
    private String ID;

    /**
     * Get the value of ID
     *
     * @return the value of ID
     */
    public String getID() {
        return ID;
    }

    /**
     * Set the value of ID
     *
     * @param ID new value of ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    private String Name;

    /**
     * Get the value of Name
     *
     * @return the value of Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Set the value of Name
     *
     * @param Name new value of Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    private String Gender;

    /**
     * Get the value of Gender
     *
     * @return the value of Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * Set the value of Gender
     *
     * @param Gender new value of Gender
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    private String Address;

    /**
     * Get the value of Address
     *
     * @return the value of Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * Set the value of Address
     *
     * @param Address new value of Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    private float Grading;

    /**
     * Get the value of Grading
     *
     * @return the value of Grading
     */
    public float getGrading() {
        return Grading;
    }

    /**
     * Set the value of Grading
     *
     * @param Grading new value of Grading
     */
    public void setGrading(float Grading) {
        this.Grading = Grading;
    }
    public float salary()
    {
        return 1500000*Grading;
    }
}
