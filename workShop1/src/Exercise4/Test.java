/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise4;
import Exercise4.Pupil;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity of the pupil: ");
        int quatity = sc.nextInt();
        Pupil[] pupilElement = new Pupil[quatity];
        for(int i=0;i<quatity;i++)
        {
            pupilElement[i] = new Pupil();
            System.out.println("\nEnter pupil " + (i+1));
            System.out.print("Enter ID: ");             pupilElement[i].setID(sc.next());
            System.out.print("Enter Name: ");           pupilElement[i].setName(sc.next());
            System.out.print("Enter ClassID: ");        pupilElement[i].setClassID(sc.next());
            System.out.print("Enter Literature: ");     pupilElement[i].setLiterature(sc.nextFloat());
            System.out.print("Enter Math: ");           pupilElement[i].setMath(sc.nextFloat());
        }
        double max = pupilElement[0].Result();
        for(int i=1;i<quatity;i++)
        {
            if(pupilElement[i].Result() > max)
                max = pupilElement[i].Result();
        }
        System.out.println("\nDisplay the pupil which highest Result");
        for(int i=0;i<quatity;i++)
        {
            if(pupilElement[i].Result() == max)
            {
                System.out.println("\nPupil "+(i+1));
                System.out.println("ID: "+pupilElement[i].getID());
                System.out.println("Name: "+pupilElement[i].getName());
                System.out.println("ClassID: "+pupilElement[i].getClassID());
                System.out.println("Result: "+pupilElement[i].Result());
            }
        }
    }
    
}
