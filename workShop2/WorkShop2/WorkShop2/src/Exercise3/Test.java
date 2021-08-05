package Exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
//  Declare 4 attributes
    
//  n used to store the length of list (0<n<=100)
    private static int n; 
//  k is used to store the number of Candidate currently on the list.
    private static int k;
//  lex is used to store the list of Candidate.
    private static ArrayList<Candidate> lex;
    private static Scanner s = new Scanner(System.in);
    
//  Declare methods

    public static void Input() {
        Candidate a = new Candidate();
        System.out.println("\nEnter Candidate " + (k + 1));
        System.out.print("Enter ID: ");          a.setID(s.next());
        System.out.print("Enter Name: ");        s.nextLine();a.setName(s.nextLine());
        System.out.print("Enter Gender: ");      a.setGender(s.next());
        System.out.print("Enter ClassID: ");     a.setClassID(s.next());
        System.out.print("Enter Mark: ");        a.setMark(s.nextDouble());
        lex.add(a);
        k = lex.size();
    }

    public static void Output() {
        for (int i = 0; i < k; i++)
            System.out.println(lex.get(i).toString());
    }

    public static int Search(String Name) {
        for (int i = 0; i < k; i++) {
            if (Name.equals(lex.get(i).getName()))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        do {
            System.out.print("\nEnter n: ");
            n = s.nextInt();
        } while (n < 0 || n > 100);
        lex = new ArrayList<Candidate>(n);
        for (int i = 0; i < n; i++)
            Input();
        Output();
        System.out.print("Enter name of Candidate to Search: ");     s.nextLine();

        String Name = s.nextLine();
        if (Search(Name) != -1)
            System.out.println(lex.get(Search(Name)).toString());
        else
            System.out.println("Undefined Candidate with Name has entered");
    }
}
