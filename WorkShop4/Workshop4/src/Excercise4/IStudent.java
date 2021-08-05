package Excercise4;

import Exercise3.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public interface IStudent {

    Connection getCon() ;

    ArrayList<Student> prepareAndReturn(ArrayList<Student> lsstudent, String sql);

    boolean prepareAndUpdate(String sql);

    ArrayList<Student> getListStudent();

    ArrayList<Student> getStudent_byClassID(String ClassID);

    ArrayList<Student> getStudent_byID(String ID);

    boolean insertStudent(String ID, String Name, boolean Gender, String ClassID, Double Mark);

    boolean updateStudent(String ID, String Name, boolean Gender, String ClassID, Double Mark);

    boolean delStudent(String ID);
}
