package Exercise1;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter fan code: ");
        String codeFan = scan.next();
        System.out.print("Enter fan price: ");
        double priceFan = scan.nextDouble();
        System.out.print("1. TC = 1 - test getCode()\n1. TC = 2 - test setPrice()\nEnter TC: ");
        Fan a = new Fan(codeFan,priceFan);
        int TC = scan.nextInt();
        if(TC == 1)
            System.out.println("OUTPUT:\n"+a.getCode());
        else if(TC == 2)
        {
             System.out.print("Enter new fan price: ");
             double priceChange = scan.nextDouble();
             a.setPrice(priceChange);
             System.out.println("OUTPUT:\n"+a.getPrice());
        }     
    }
}
