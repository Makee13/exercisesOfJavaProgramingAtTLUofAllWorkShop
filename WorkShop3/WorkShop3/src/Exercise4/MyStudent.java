package Exercise4;

import java.util.ArrayList;

public class MyStudent implements IStudent{
    ArrayList<Student> plist = new ArrayList<>(100);
    private String commonHeader = "ID\tName\tMark\tResult";

    @Override
    public void addStudent(Student s) {
        plist.add(s);
    }

    @Override
    public void findbyID(String ID) {
        System.out.println(commonHeader);
        for(int i=0;i<plist.size();i++)
        {
            if(ID.equals(plist.get(i).getID()))
                System.out.println(plist.get(i).Display());
        }
    }

    @Override
    public double getMax() {
        double maxMark = plist.get(0).getMark();
        for(int i=0;i<plist.size();i++)
        {
            if(maxMark < plist.get(i).getMark())
                maxMark = plist.get(i).getMark();
        }
        return maxMark;
    }   

    @Override
    public void print() {
        System.out.println(commonHeader);
        for(int i=0;i<plist.size();i++)
        {
            System.out.println(plist.get(i).Display());
        }
    }

    @Override
    public void printMax() {
        System.out.println(commonHeader);
        double maxMark = getMax();
        for(int i=0;i<plist.size();i++)
        {
            if(plist.get(i).getMark() == maxMark)
                System.out.println(plist.get(i).Display());
        }
    }
    
    
}
