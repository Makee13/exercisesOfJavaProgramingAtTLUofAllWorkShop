package Excercise4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    static Process_Student ps = new Process_Student();
    static Scanner s = new Scanner(System.in);
    static ArrayList<Student> lsstudent = new ArrayList<>();

    public static String delStudent(String ID) {
        return ps.delStudent(ID) ? "Xóa thành công" : "Xóa không thành công";
    }

    public static void displayStudent(String ClassID) {
        System.out.println("ID\tName\tGender\tClassID\tMark");
        lsstudent = new ArrayList<Student>(ps.getStudent_byClassID(ClassID));
        for (int i = 0; i < lsstudent.size(); i++) {
            System.out.println(lsstudent.get(i).toString());
        }
    }

    public static String insertStudent(String ID, String Name, boolean Gender, String ClassID, Double Mark) {
        return ps.insertStudent(ID, Name, Gender, ClassID, Mark) ? "Thêm thành công" : "Thêm không thành công";
    }

    public static String updateStudent(String ID, String Name, boolean Gender, String ClassID, Double Mark) {
        return (ps.updateStudent(ID, Name, Gender, ClassID, Mark)) ? "Cập nhật thành công" : "Cập nhật không thành công";
    }

    public static void addData(String ID, String Name, String Gender, String ClassID, String Mark) {
        System.out.println("Nhập dữ liệu để cập nhật dữ liệu trong cơ sở dữ liệu: ID,Name,Gender,ClassID,Mark\nNhập ID");
        ID = s.nextLine();
        System.out.println("Nhập vào tên: ");
        Name = s.nextLine();
        System.out.println("Nhập vào giới tính");
        Gender = s.nextLine();
        System.out.println("Nhập vào lớp: ");
        ClassID = s.nextLine();
        System.out.println("Nhập vào điểm: ");
        Mark = s.nextLine();
        System.out.println(Mark);
    }

    public static void main(String[] args) {
        String ID = "", Name = "", Gender = "", ClassID = "", Mark = "";
        System.out.println("Nhập vào lớp cần hiển thị: ");
        displayStudent(s.nextLine());
        System.out.println("Nhập vào mã sinh viên cần xóa: ");
        System.out.println(delStudent(s.nextLine()));
        addData(ID, Name, Gender, ClassID, Mark);
//      ++++++++++++++++++++++++
        boolean gender = false;
        if ("Nam".equals(Gender)) {
            gender = true;
        } else {
            gender = false;
        }
        double mark = Double.valueOf(Mark);
        System.out.println(insertStudent(ID, Name, gender, ClassID, mark));
//      ++++++++++++++++++++++++

    }
}
