/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;
import Exercise3.Product;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of the product");
        int quatity = sc.nextInt();
        Product[] productArr = new Product[quatity];
        for(int i = 0;i < quatity; i++)
        {
            productArr[i] = new Product();
            System.out.println("Enter product " + (i+1));
            System.out.print("Enter ID: ");               productArr[i].setID(sc.next());
            System.out.print("Enter Name: ");             productArr[i].setName(sc.next());
            System.out.print("Enter Company: ");          productArr[i].setCompany(sc.next());
            System.out.print("Enter Color: ");            productArr[i].setColor(sc.next());
            System.out.print("Enter Price: ");            productArr[i].setPrice(sc.nextDouble());
        }
        System.out.println("\nDisplay the products which their color are RED or BlUE");
        for(int i = 0;i < quatity ; i++)
        {
            //  if you use == operator , It will compare address value at Pool in Heap memory.
            //  Equals method compares String value
            //  So I use equals methods to compare 2 String value
            if("BLUE".equals(productArr[i].getColor()) || "RED".equals(productArr[i].getColor()))
            {
                System.out.println("\nPRODUCT " + (i+1));
                System.out.println("ID product: "+ productArr[i].getID());
                System.out.println("Name product: "+ productArr[i].getName());
                System.out.println("Company product: "+ productArr[i].getCompany());
                System.out.println("Color product: "+ productArr[i].getColor());
                System.out.println("Price product: "+ productArr[i].getPrice());
            }
        }
    }
    
}
