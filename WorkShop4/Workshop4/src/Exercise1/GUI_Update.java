package Exercise1;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI_Update extends javax.swing.JFrame {

//  Begin: Declare attributes
    DefaultTableModel dtm = new DefaultTableModel();
    Vector tbHeader = new Vector();
    Vector tbContent = new Vector();
    Process_Student ps = new Process_Student();
    SettingAndUpDataToTable table = new SettingAndUpDataToTable();
    GUI_Student std = new GUI_Student();

//  End: Declare attributes
//  Begin: Declare methods
    public GUI_Update() {
        initComponents();
        table.setHeader(dtm, tbHeader, tbContent, jTB_UpdateAndSearch);
        std.setCombobox(jCB_ClassID);
    }

//  Method searching and Up data to JTable with ID 
    public void RefreshTable(String ID) {
//      Xoa toan bo so dong da tim kiem ra khoi mau
        dtm.setNumRows(0);
        ArrayList<Student> lst = ps.getStudent_byID(ID);
        table.getData(dtm, lst, ps, tbContent, tbHeader, jTB_UpdateAndSearch);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBTGR1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTF_ID = new javax.swing.JTextField();
        jTF_Mark = new javax.swing.JTextField();
        jTF_Name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCB_ClassID = new javax.swing.JComboBox<>();
        jRD_Male = new javax.swing.JRadioButton();
        jRD_Female = new javax.swing.JRadioButton();
        jBT_Search = new javax.swing.JButton();
        jBT_Update = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTB_UpdateAndSearch = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cập nhật sinh viên");

        jTF_ID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTF_Mark.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTF_Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_NameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Mã sinh viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Họ tên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Lớp");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Giới tính");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Điểm");

        jCB_ClassID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCB_ClassID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_ClassIDActionPerformed(evt);
            }
        });

        jBTGR1.add(jRD_Male);
        jRD_Male.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRD_Male.setText("Nam");

        jBTGR1.add(jRD_Female);
        jRD_Female.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRD_Female.setText("Nữ");

        jBT_Search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBT_Search.setText("Tìm kiếm");
        jBT_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_SearchActionPerformed(evt);
            }
        });

        jBT_Update.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBT_Update.setText("Cập nhật");
        jBT_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_UpdateActionPerformed(evt);
            }
        });

        jTB_UpdateAndSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTB_UpdateAndSearch);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBT_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 120, Short.MAX_VALUE)
                                        .addComponent(jTF_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTF_ID)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBT_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRD_Male)
                                                .addGap(137, 137, 137)
                                                .addComponent(jRD_Female))
                                            .addComponent(jTF_Mark, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCB_ClassID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(135, 135, 135)))))))
                .addGap(92, 92, 92))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBT_Search))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTF_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCB_ClassID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRD_Male)
                    .addComponent(jRD_Female))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jBT_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Mark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_NameActionPerformed

    private void jCB_ClassIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_ClassIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCB_ClassIDActionPerformed

    private void jBT_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_SearchActionPerformed
        RefreshTable(jTF_ID.getText());
    }//GEN-LAST:event_jBT_SearchActionPerformed

    private void jBT_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_UpdateActionPerformed
        if (ps.updateStudent(jTF_ID.getText(), jTF_Name.getText(), (jRD_Male.isSelected()) ? true : false, jCB_ClassID.getSelectedItem().toString(), Double.parseDouble(jTF_Mark.getText()))) {
            JOptionPane.showMessageDialog(rootPane, "Updated successfully");
            jBT_SearchActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Didn't Update successfully");
        }
    }//GEN-LAST:event_jBT_UpdateActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI_Update formUpdate = new GUI_Update();
                formUpdate.setVisible(true);
                formUpdate.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup jBTGR1;
    private javax.swing.JButton jBT_Search;
    private javax.swing.JButton jBT_Update;
    private javax.swing.JComboBox<String> jCB_ClassID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRD_Female;
    private javax.swing.JRadioButton jRD_Male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTB_UpdateAndSearch;
    private javax.swing.JTextField jTF_ID;
    private javax.swing.JTextField jTF_Mark;
    private javax.swing.JTextField jTF_Name;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
