package Exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
//Declare 4 attributes
    private static int n; //n used to store the length of list (0<n<=100)
    private static int k; //k is used to store the number of ColorFan currently on the list.
    private static ArrayList<Car> lex;//lex is used to store the list of ColorFan.
    private static Scanner s = new Scanner(System.in);
    public static boolean checkedColor = false;
    public static String commonHeader = "ID\tName\tColor\tYear\tDiscount\tPrice";
//    Declare methods
    public static void Input()
    {
        Car a = new Car();
        System.out.println("\nEnter Car " + (k+1));
        System.out.print("Enter ID: ");          a.setID(s.next());
        System.out.print("Enter Name: ");        s.nextLine();a.setName(s.nextLine());
        System.out.print("Enter Color: ");       a.setColor(s.nextLine());
        System.out.print("Enter Year: ");        a.setYear(s.nextInt());
        System.out.print("Enter Price: ");       a.setPrice(s.nextFloat());
        lex.add(a);
        k = lex.size();
    }
    public static void Output()
    {   
        System.out.println(commonHeader);
        for(int i=0;i<k;i++)
        {
            lex.get(i).setPrice(lex.get(i).getPrice()-lex.get(i).Discount());
            System.out.println(lex.get(i).toString()+"\t       "+lex.get(i).getPrice());
        }
    }
    public static void Search(String Color)
    {
        System.out.println(commonHeader);
        for(int i=0;i<k;i++)
        {
            if(Color.equals(lex.get(i).getColor()))
            {
                System.out.println(lex.get(i).toString()+"\t       "+lex.get(i).getPrice());
                checkedColor = true;
            }
        }
    }
    public static void main(String[] args) {
        do
        {
            System.out.print("\nEnter n: ");    n=s.nextInt();
        }while (n<0||n>100);
        lex = new ArrayList<Car>(n);
        for(int i=0;i<n;i++)
            Input();
        Output();
        System.out.print("Enter Color of Car to Search: ");         s.nextLine();String Color = s.nextLine();
        Search(Color);
        if(!checkedColor)    System.out.println(Color + " Car" + " hasn't in the List Car");   
    } 
}
