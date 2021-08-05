package Exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    
//  Declare 4 attributes
    
//  n used to store the length of list (0<n<=100)
    private static int n = 100; 
//  k is used to store the number of  currently on the list.
    private static int k;
//  lex is used to store the list of Teacher.
    private static ArrayList<Teacher> lex = new ArrayList(n);
    private static Scanner s = new Scanner(System.in);
    private static String commonHeader = "ID\tName\tGender\tAddress\tGrading\tSalary";
    private static boolean commonChecked = false;
    
//  Declare methods

    public static void Input() {
        do {
            System.out.print("How many information teachers do you want to enter?: ");  k = s.nextInt();
        } while (k < 0 || k > 100);
        for (int i = 0; i < k; i++)
        {
            Teacher a = new Teacher();
            System.out.println("\nEnter Teacher " + (i + 1));
            System.out.print("Enter ID: ");          a.setID(s.next());
            System.out.print("Enter Name: ");        s.nextLine();a.setName(s.nextLine());
            System.out.print("Enter Gender: ");      a.setGender(s.next());
            System.out.print("Enter Address: ");     a.setAddress(s.next());
            System.out.print("Enter Grading: ");     a.setGrading(s.nextDouble());
            lex.add(a);
        }
    }

    public static void Output() {
        System.out.println(commonHeader);
        for (int i = 0; i < k; i++)
            System.out.println(lex.get(i).toString());
    }

    public static void Search(String Address) {
        System.out.println(commonHeader);
        for (int i = 0; i < k; i++) {
            if (Address.equals(lex.get(i).getAddress()))
            {
                System.out.println(lex.get(i).toString());
                commonChecked = true;
            }
        }
    }
    public static double findMinSalary()
    {
        double minSalary = lex.get(0).Salary();
        for(int i=0;i<k;i++)
        {
            if(lex.get(i).Salary() < minSalary)
                minSalary = lex.get(i).Salary();                      
        }
        return minSalary;
    }
    public static void printSalaryListMinSalary()
    {
        System.out.println("Print the list with the min salary teachers ");
        double minSalary = findMinSalary();
        System.out.println(commonHeader);
        for(int i=0;i<k;i++)
        {
            if(lex.get(i).Salary() == minSalary)
               System.out.println(lex.get(i).toString());
        }
    }
    public static  void sortTeacherListDESC()
    {
        System.out.println("Sort the list of teachers with DESC");
        for(int i=0;i<k-1;i++)
        {
            for(int j=i+1;j<k;j++)
            {
                if(lex.get(i).Salary() < lex.get(j).Salary())
                {
                    Teacher temp = lex.get(i);
                    lex.set(i, lex.get(j));
                    lex.set(j, temp);
                }
            }
        }
        Output();
    }
//    End section1
    public static void main(String[] args) {
        Input();
        Output();
        System.out.print("Enter address of Teacher to Search: ");       s.nextLine();String Address = s.nextLine();
        Search(Address);
        if(!commonChecked)
            System.out.println("Undefined Teacher with Address has entered");
        printSalaryListMinSalary();
        sortTeacherListDESC();
        
    }       
}
