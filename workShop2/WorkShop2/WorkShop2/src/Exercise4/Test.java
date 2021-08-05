package Exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
//  Declare 4 attributes
    
//  n used to store the length of list (0<n<=100)
    private static int n; 
//  k is used to store the number of  currently on the list.
    private static int k;
//  lex is used to store the list of Student.
    private static ArrayList<Student> lex;
    private static Scanner s = new Scanner(System.in);
    
//  Declare methods

    public static void Input() {
        Student a = new Student();
        System.out.println("\nEnter Student " + (k + 1));
        System.out.print("Enter ID: ");          a.setID(s.next());
        System.out.print("Enter Name: ");        s.nextLine();a.setName(s.nextLine());
        System.out.print("Enter Gender: ");      a.setGender(s.next());
        System.out.print("Enter ClassID: ");     a.setClassID(s.next());
        System.out.print("Enter Mark: ");        a.setMark(s.nextFloat());
        lex.add(a);
        k = lex.size();
    }

    public static void Output() {
        System.out.println("ID\tName\tGender\tClassID\tMark\tResult");
        for (int i = 0; i < k; i++)
            System.out.println(lex.get(i).toString());
    }

    public static int Search(String ClassID) {
        for (int i = 0; i < k; i++) {
            if (ClassID.equals(lex.get(i).getClassID()))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        do {
            System.out.print("\nEnter n: ");
            n = s.nextInt();
        } while (n < 0 || n > 100);
        lex = new ArrayList<Student>(n);
        for (int i = 0; i < n; i++)
            Input();
        Output();
        System.out.print("Enter name of Student to Search: ");      s.nextLine();String ClassID = s.nextLine();
        if (Search(ClassID) != -1)
            System.out.println("ID\tName\tGender\tClassID\tMark\tResult\n"+lex.get(Search(ClassID)).toString());
        else
            System.out.println("Undefined Student with Name has entered");
    }
}
