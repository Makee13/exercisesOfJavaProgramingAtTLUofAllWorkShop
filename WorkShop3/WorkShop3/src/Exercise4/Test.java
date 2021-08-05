package Exercise4;
import java.util.*;

public class Test {
//    Begin: Declare attributes
    private static Scanner scan = new Scanner(System.in);            
    private static MyStudent myPro = new MyStudent();
//    End: Declare attributes
//    Begin: Declare methods
    public static void Input(){
        System.out.print("Add how many students: ");
        int quatity = scan.nextInt();
        for(int i=0;i<quatity;i++)
        {
            Student temp = new Student();
            System.out.print("Input ID: ");       temp.setID(scan.next());scan.nextLine();
            System.out.print("Input Name: ");     temp.setName(scan.nextLine());
            System.out.print("Input Mark: ");     temp.setMark(scan.nextDouble());
            myPro.addStudent(temp);
        }
    }
    public static void Output()
    {
        System.out.println("The list of students");
        myPro.print();
        System.out.println("The list of students with the largest mark:");
        myPro.printMax();
        System.out.print("Input ID: ");
        scan.nextLine();
        String ID = scan.nextLine();
        System.out.println("The list of student by ID");
        myPro.findbyID(ID);
    }
    
    public static void main(String[] args) {
        Input();
        Output();
    }
//    End: Declare methods
}