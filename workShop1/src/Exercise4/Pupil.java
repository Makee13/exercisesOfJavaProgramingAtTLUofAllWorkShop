/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise4;

/**
 *
 * @author LENOVO
 */
public class Pupil {
    
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

    private String ClassID;

    /**
     * Get the value of ClassID
     *
     * @return the value of ClassID
     */
    public String getClassID() {
        return ClassID;
    }

    /**
     * Set the value of ClassID
     *
     * @param ClassID new value of ClassID
     */
    public void setClassID(String ClassID) {
        this.ClassID = ClassID;
    }

    private float Literature;

    /**
     * Get the value of Literature
     *
     * @return the value of Literature
     */
    public float getLiterature() {
        return Literature;
    }

    /**
     * Set the value of Literature
     *
     * @param Literature new value of Literature
     */
    public void setLiterature(float Literature) {
        this.Literature = Literature;
    }

    private float Math;

    /**
     * Get the value of Math
     *
     * @return the value of Math
     */
    public float getMath() {
        return Math;
    }

    /**
     * Set the value of Math
     *
     * @param Math new value of Math
     */
    public void setMath(float Math) {
        this.Math = Math;
    }

    public Pupil() {
    }

    public Pupil(String ID, String Name, String ClassID, float Literature, float Math) {
        this.ID = ID;
        this.Name = Name;
        this.ClassID = ClassID;
        this.Literature = Literature;
        this.Math = Math;
    }
//    Method gives overall Result of Literature and Math
    public double Result()
    {
        return (Literature+Math)/2;
    }
}
