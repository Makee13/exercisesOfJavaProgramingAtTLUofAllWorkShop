package Exercise2;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        MyString s = new MyString();
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Test f1()\n2. Test f2()\nEnter TC(1 or 2): ");
        int selection = scan.nextInt();
        System.out.println("Enter a string:");
        scan.nextLine();String str = scan.nextLine();
        if(selection == 1)
        {
           System.out.println("OUTPUT:\nEnter a string 1: ");
           String s1 = scan.next();
           System.out.println("Enter a string 2");
           String s2 = scan.next();
           System.out.println(s.f1(str,s1,s2));
        }
        else if(selection == 2) 
        {
           System.out.println("OUTPUT:\nEnter a string 1: ");
           String s1 = scan.nextLine();
           System.out.println(s.f2(str, s1));
        }
    }
}
