package Exercise1;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SettingAndUpDataToTable {

    public void setHeader(DefaultTableModel dtm, Vector tbHeader, Vector tbContent, JTable jTB) {
        tbHeader.add("Mã sinh viên");
        tbHeader.add("Họ tên");
        tbHeader.add("Lớp");
        tbHeader.add("Giới tính");
        tbHeader.add("Điểm");
        tbHeader.add("Xếp loại");
        dtm.setDataVector(tbContent, tbHeader);
        jTB.setModel(dtm);
    }

    public void getData(DefaultTableModel dtm, ArrayList<Student> lst, Process_Student ps, Vector tbContent, Vector tbHeader, JTable jTB) {
        for (int i = 0; i < lst.size(); i++) {
            Vector tbRow = new Vector();
            tbRow.add(lst.get(i).getID());
            tbRow.add(lst.get(i).getName());
            tbRow.add(lst.get(i).getClassID());
            if (lst.get(i).getGender()) {
                tbRow.add("Nam");
            } else {
                tbRow.add("Nữ");
            }
            tbRow.add(lst.get(i).getMark());
            tbRow.add(lst.get(i).Rank());
            tbContent.add(tbRow);
        }
        dtm.setDataVector(tbContent, tbHeader);
        jTB.setModel(dtm);
    }
}
