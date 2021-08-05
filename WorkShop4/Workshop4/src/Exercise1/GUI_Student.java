package Exercise1;

import java.sql.*;
import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI_Student extends javax.swing.JFrame {

//  Begin: Declare attributes
    DefaultTableModel dtm = new DefaultTableModel();
    Vector tbHeader = new Vector();
    Vector tbContent = new Vector();
    Process_Student ps = new Process_Student();
    SettingAndUpDataToTable table = new SettingAndUpDataToTable();

//  End: Declare attributes
//  Begin: Declare methods
    public GUI_Student() {
        initComponents();
        setCombobox(jCB_ClassID);
        table.setHeader(dtm, tbHeader, tbContent, jTB_Student);
        RefreshTable();
    }

//  Method searching and Up data to JTable with ClassID 
    public void RefreshTable() {
//  Xoa toan bo so dong da tim kiem ra khoi mau
        dtm.setNumRows(0);
        ArrayList<Student> lst = ps.getListStudent();
        table.getData(dtm, lst, ps, tbContent, tbHeader, jTB_Student);
    }

    public void setCombobox(JComboBox JCB) {
        JCB.addItem("61CNTT");        
        JCB.addItem("61CK");
        JCB.addItem("61KTQL");
        JCB.addItem("61TNC");
        JCB.addItem("61ĐT");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBTGR_Gender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTF_ID = new javax.swing.JTextField();
        jTF_Name = new javax.swing.JTextField();
        jTF_Mark = new javax.swing.JTextField();
        jRD_Male = new javax.swing.JRadioButton();
        jRD_Female = new javax.swing.JRadioButton();
        jCB_ClassID = new javax.swing.JComboBox<>();
        jBT_Addstudent = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTB_Student = new javax.swing.JTable();
        jLB_Result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm mới sinh viên");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Mã sinh viên");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Họ tên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText(" Lớp");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Giới tính");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Điểm");

        jTF_ID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTF_Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTF_Mark.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBTGR_Gender.add(jRD_Male);
        jRD_Male.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRD_Male.setText("Nam");

        jBTGR_Gender.add(jRD_Female);
        jRD_Female.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRD_Female.setText("Nữ");

        jCB_ClassID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCB_ClassID.setToolTipText("");

        jBT_Addstudent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBT_Addstudent.setText("Thêm sinh viên");
        jBT_Addstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_AddstudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTB_Student.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTB_Student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTB_Student);

        jLB_Result.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLB_Result.setText("Danh sách sinh viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTF_Name)
                            .addComponent(jTF_ID)
                            .addComponent(jCB_ClassID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jRD_Male, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jRD_Female, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTF_Mark)
                            .addComponent(jBT_Addstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(283, 283, 283))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLB_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTF_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCB_ClassID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRD_Male)
                    .addComponent(jRD_Female))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Mark, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBT_Addstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLB_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBT_AddstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_AddstudentActionPerformed
        if (ps.insertStudent(jTF_ID.getText(), jTF_Name.getText(), (jRD_Male.isSelected()) ? true : false, jCB_ClassID.getSelectedItem().toString(), Double.parseDouble(jTF_Mark.getText()))) {
            jLB_Result.setText("Thêm thành công");
        } else {
            jLB_Result.setText("Thêm không thành công");
        }
        RefreshTable();
    }//GEN-LAST:event_jBT_AddstudentActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI_Student formStudent = new GUI_Student();
                formStudent.setVisible(true);
                formStudent.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup jBTGR_Gender;
    private javax.swing.JButton jBT_Addstudent;
    private javax.swing.JComboBox<String> jCB_ClassID;
    private javax.swing.JLabel jLB_Result;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRD_Female;
    private javax.swing.JRadioButton jRD_Male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTB_Student;
    private javax.swing.JTextField jTF_ID;
    private javax.swing.JTextField jTF_Mark;
    private javax.swing.JTextField jTF_Name;
    // End of variables declaration//GEN-END:variables
}
