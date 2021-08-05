package Exercise1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyString st = new MyString();
        System.out.print("1.  TC = 1 - test f1()\n1.  TC = 2 - test f2()\nEnter TC: ");
        int n = sc.nextInt();
        System.out.println("Enter a string:");
        String s = sc.next();
        if(n == 1)
            System.out.println("OUTPUT:\n" + st.f1(s));
        else if(n == 2)
            System.out.println("OUTPUT:\n" + st.f2(s));
    }  
}