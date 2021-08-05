package Exercise5;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity of the teacher: ");
        int quatity = sc.nextInt();
        Teacher[] teacherElement = new Teacher[quatity];
        for(int i=0;i<quatity;i++)
        {
            teacherElement[i] = new Teacher();
            System.out.println("\nEnter teacher " + (i+1));
            System.out.print("Enter ID: ");             teacherElement[i].setID(sc.next());
            System.out.print("Enter Name: ");           sc.nextLine();teacherElement[i].setName(sc.nextLine());
            System.out.print("Enter Gender: ");         teacherElement[i].setGender(sc.next());
            System.out.print("Enter Address: ");        sc.nextLine();teacherElement[i].setAddress(sc.nextLine());
            System.out.print("Enter Grading: ");        teacherElement[i].setGrading(sc.nextFloat());
        }
        double max = teacherElement[0].salary();
        for(int i=1;i<quatity;i++)
        {
            if(teacherElement[i].salary()> max)
                max = teacherElement[i].salary();
        }
        System.out.println("\nDisplay the pupil which highest Result");
        for(int i=0;i<quatity;i++)
        {
            if(teacherElement[i].salary()== max)
            {
                System.out.println("\nPupil "+(i+1));
                System.out.println("ID: "+teacherElement[i].getID());
                System.out.println("Name: "+teacherElement[i].getName());
                System.out.println("Gender: "+teacherElement[i].getGender());
                System.out.println("Address: "+teacherElement[i].getAddress());
                System.out.println("Grading: "+teacherElement[i].getGrading());
                System.out.println("Salary: "+teacherElement[i].salary()); 
            }
        }
    }
    
}
