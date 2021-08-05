package Exercise2;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        System.out.print("1. Test getName()\n2. Test setPrice()\nEnter TC(1 or 2):");
        int Enter = sc.nextInt();
        Book a = new Book(name,price);
        if(Enter == 1)
            System.out.println("OUTPUT:"+ a.getName());
        else
        {
            System.out.print("Enter new price: ");  
            a.setPrice(sc.nextInt());
            System.out.println("OUTPUT:"+ a.getPrice());
        } 
    }
}
