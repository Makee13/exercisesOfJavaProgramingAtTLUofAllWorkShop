package Exercise1;

import java.util.*;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class GUI_Finding extends javax.swing.JFrame {

//  Begin: Declare attributes
    DefaultTableModel dtm = new DefaultTableModel();
    Vector tbHeader = new Vector();
    Vector tbContent = new Vector();
    Process_Student ps = new Process_Student();
    SettingAndUpDataToTable table = new SettingAndUpDataToTable();
    GUI_Student std = new GUI_Student();

//  End: Declare attributes
//  Begin: Declare methods
    public GUI_Finding() {
        initComponents();
        table.setHeader(dtm, tbHeader, tbContent, jTB_Student);
        std.setCombobox(jCB_ClassID);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBT_Search = new javax.swing.JButton();
        jCB_ClassID = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTB_Student = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tra cứu sinh viên");
        setBackground(new java.awt.Color(255, 204, 51));
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Chọn lớp");

        jBT_Search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBT_Search.setText("Tìm kiếm");
        jBT_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_SearchActionPerformed(evt);
            }
        });

        jCB_ClassID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTB_Student.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTB_Student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTB_Student);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Danh sách sinh viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(jCB_ClassID, 0, 148, Short.MAX_VALUE)
                        .addGap(37, 37, 37)
                        .addComponent(jBT_Search)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(248, 248, 248))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jCB_ClassID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jBT_Search)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//  Method searching and Up data to JTable with ClassID 

    public void RefreshTable(String ClassID) {
//      Xoa toan bo so dong da tim kiem ra khoi mau
        dtm.setNumRows(0);
        ArrayList<Student> lst = ps.getStudent_byClass(ClassID);
        table.getData(dtm, lst, ps, tbContent, tbHeader, jTB_Student);
    }

    private void jBT_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_SearchActionPerformed
        String ClassID = jCB_ClassID.getSelectedItem().toString();
        RefreshTable(ClassID);
    }//GEN-LAST:event_jBT_SearchActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Finding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Finding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Finding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Finding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI_Finding formFinding = new GUI_Finding();
                formFinding.setVisible(true);
                formFinding.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBT_Search;
    private javax.swing.JComboBox<String> jCB_ClassID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTB_Student;
    // End of variables declaration//GEN-END:variables
}
