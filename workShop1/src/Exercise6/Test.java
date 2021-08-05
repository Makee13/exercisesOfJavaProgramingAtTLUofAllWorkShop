/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise6;
import Exercise6.Cars;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Input
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quatity of cars: ");
        int quatity = sc.nextInt();
        Cars[] cars = new Cars[quatity];
        System.out.print("Enter the list of cars");
        for(int i=0;i<quatity;i++)
        {
           System.out.println("\nEnter 5 attributes of car " + (i+1));
           cars[i] = new Cars();
           System.out.print("Enter ID of car: ");             cars[i].setID(sc.next());
           System.out.print("Enter Name of car: ");           cars[i].setName(sc.next());
           System.out.print("Enter Country of car: ");        cars[i].setCountry(sc.next());
           System.out.print("Enter Color of car: ");          cars[i].setColor(sc.next());
           System.out.print("Enter Price of car: ");          cars[i].setPrice(sc.nextDouble());
        }
        //2.Processes and Displays
        //Displays the list of cars
        System.out.println("\nDisplays the list of cars");
        System.out.println("ID\tName\tCountry\t Color\tPrice");   
        for(int i=0;i<quatity;i++)
        {
           System.out.println(cars[i].getID() + "\t" + cars[i].getName() + "\t" + cars[i].getCountry() 
                   + "\t " + cars[i].getColor() + "\t" + (cars[i].getPrice() - cars[i].Discount()));
        }
        // Ends
        // Displays the list of cars which have Country = Japan
        System.out.println("\nDisplays the list of cars which have Country = Japan");
        System.out.println("ID\tName\tCountry\t Color\tPrice");
        for(int i=0;i<quatity;i++)
        {
            if("Japan".equals(cars[i].getCountry()))
            {
                System.out.println(cars[i].getID() + "\t" + cars[i].getName() + "\t" + cars[i].getCountry() 
                   + "\t " + cars[i].getColor() + "\t" + (cars[i].getPrice() - cars[i].Discount()));
            }
        }
        // Ends
        //Displays the list of cars the smallest price
        System.out.println("\nDisplays the list of cars the smallest price");
        double min = cars[0].getPrice() - cars[0].Discount();
        for(int i=1;i<quatity;i++)
        {
            if(cars[i].getPrice() - cars[i].Discount() < min)
                min = cars[i].getPrice() - cars[i].Discount();
        }
        System.out.println("ID\tName\tCountry\t Color\tPrice");
        for(int i=0;i<quatity;i++)
        {
            if(cars[i].getPrice() - cars[i].Discount() == min)
            {   
                System.out.println(cars[i].getID() + "\t" + cars[i].getName() + "\t" + cars[i].getCountry() 
                   + "\t " + cars[i].getColor() + "\t" + (cars[i].getPrice() - cars[i].Discount()));
            }
        }
        // Ends
        //Display the number of cars that have Price less than  Price of the first car in the list
        System.out.print("\nThe number of cars that have Price less than  Price of the first car in the list: ");
        double priceCar1 = cars[0].getPrice() - cars[0].Discount();
        int count=0;
        for(int i=1;i<quatity;i++)
        {
            if((cars[i].getPrice() - cars[i].Discount()) < priceCar1)  count++;
        }
        System.out.println(count);
        //Display the list cars which doesnt have Color = red
        System.out.println("Display the list cars dont have Color = red");
        System.out.println("ID\tName\tCountry\t Color\tPrice");
        for(int i=0;i<quatity;i++)
        {
            if(!"red".equals(cars[i].getColor()))
                System.out.println(cars[i].getID() + "\t" + cars[i].getName() + "\t" + cars[i].getCountry() 
                + "\t " + cars[i].getColor() + "\t" + (cars[i].getPrice() - cars[i].Discount()));
        }
        //Display the list cars which are sorted DESC
        for(int i=0;i<quatity-1;i++)
        {
            for(int j=i;j<quatity;j++)
            {
                if((cars[j].getPrice()-cars[j].Discount()) > (cars[i].getPrice()-cars[i].Discount()))
                {
                    Cars med = new Cars();
                    med = cars[j];
                    cars[j] = cars[i];
                    cars[i] = med;
                }
            }
        }
        System.out.println("\nDisplay the list cars which are sorted DESC ");
        System.out.println("ID\tName\tCountry\t Color\tPrice");   
        for(int i=0;i<quatity;i++)
        {
           System.out.println(cars[i].getID() + "\t" + cars[i].getName() + "\t" + cars[i].getCountry() 
                   + "\t " + cars[i].getColor() + "\t" + (cars[i].getPrice() - cars[i].Discount()));
        }
    }
    
}
