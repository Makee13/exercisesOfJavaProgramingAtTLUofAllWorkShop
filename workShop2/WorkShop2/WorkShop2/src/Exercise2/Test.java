package Exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
//Declare 4 attributes
    private static int n; //n used to store the length of list (0<n<=100)
    private static int k; //k is used to store the number of ColorFan currently on the list.
    private static ArrayList<VNCar> lex;//lex is used to store the list of ColorFan.
    private static Scanner s = new Scanner(System.in);
//    Declare methods
    public static void Input()
    {
        VNCar a = new VNCar();
        System.out.println("\nEnter VNCar " + (k+1));
        System.out.print("Enter Name: ");         a.setName(s.next());
        System.out.print("Enter price: ");        a.setPrice(s.nextDouble());
        System.out.print("Enter series: ");       a.setSeries(s.nextInt());
        lex.add(a);
        a.setPrice(a.getSalePrice());
        k = lex.size();
    }
    public static void Output()
    {
        for(int i=0;i<k;i++)
        {
            System.out.println(lex.get(i).toString());
        }
    }
    public static int Search(String Name)
    {
        for(int i=0;i<k;i++)
            if(Name.equals(lex.get(i).getName()))   return i;
        return -1;
    }
    public static void main(String[] args) {
        do
        {
            System.out.print("\nEnter n: ");n=s.nextInt();
        }while (n<0||n>100);
        lex = new ArrayList<VNCar>(n);
        for(int i=0;i<n;i++)
            Input();
        Output();
        System.out.print("Enter name of VNCar to Search: ");         String Name = s.next();
        if(Search(Name) != -1) System.out.println(lex.get(Search(Name)).toString());
        else                   System.out.println("VNCar "+ Name + " hasn't in the List VnCar");
        
    } 
}
