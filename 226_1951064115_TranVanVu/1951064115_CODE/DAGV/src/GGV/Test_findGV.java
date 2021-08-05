/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GGV;

import java.util.*;

/**
 *
 * @author LENOVO
 */
public class Test_findGV {
    static XLGV xl = new XLGV();
    static void dogetGV(String Donvi, int Soct) {
        ArrayList<Giangvien> lsgiangvien = xl.getGV(Donvi, Soct);
        System.out.println("Mã định danh\tHọ tên\tGiới tính\tĐơn vị\tSố công trình\tThưởng?\n-----------------------------------------------------------------------------------------------------------");
        for(int i=0;i<lsgiangvien.size();i++)
        {
            System.out.println(lsgiangvien.get(i).toString());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số đơn vị: ");        String Donvi = sc.nextLine();        
        System.out.println("Nhập vào số công trình: ");        int Soct = sc.nextInt();
        
        dogetGV(Donvi, Soct);


    }
}
