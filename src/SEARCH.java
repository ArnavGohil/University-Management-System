/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arnavgohil
 */
import java.sql.* ;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class SEARCH extends javax.swing.JFrame {

    /**
     * Creates new form SEARCH
     */
    public SEARCH() {
        initComponents();
        t1.setVisible(false);
        l1.setVisible(false);
    }
    int flag = Integer.MAX_VALUE;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        b3 = new javax.swing.JRadioButton();
        t1 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("SEARCH");

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        buttonGroup1.add(b1);
        b1.setText("STUDENT");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(b2);
        b2.setText("FACULTY");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(b3);
        b3.setText("MARKS");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b1)
                .addGap(228, 228, 228)
                .addComponent(b2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3))
                .addGap(35, 35, 35))
        );

        jButton2.setText("→");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1", "2", "3", "4", "5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("←");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addComponent(jButton5))
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        t1.setVisible(true);
        l1.setVisible(true);
        l1.setText("Enter Admn No.");
        flag = 0 ;
        
        jTable1.getColumnModel().getColumn(0).setHeaderValue("ADMN NO");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("NAME");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("PHONE NO");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("ADDRESS");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("DOB");
        jTable1.getTableHeader().repaint();        
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        t1.setVisible(true);
        l1.setVisible(true);
        l1.setText("Enter Faculty Id");
        flag = 1 ;
        
        jTable1.getColumnModel().getColumn(0).setHeaderValue("FACULTY ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("NAME");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("PHONE NO");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("ADDRESS");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("DEPARTMENT");
        jTable1.getTableHeader().repaint();        
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:        
        t1.setVisible(true);
        l1.setVisible(true);
        l1.setText("Enter Subject Code (OR) Student Id");
        flag = 2 ;
        
        jTable1.getColumnModel().getColumn(0).setHeaderValue("STUDENT ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("STUDENT NAME");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("SUBJECT NAME");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("MARKS");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("FACULTY");
        jTable1.getTableHeader().repaint();        
    }//GEN-LAST:event_b3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String str = "0" ;
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
     String query = "";
            if(flag == Integer.MAX_VALUE)
            {
                System.exit(0);
            }
            else if(flag == 0)
            {
                str = t1.getText();
                if(str.equals(""))
                    query = "SELECT ADMN_NO,NAME,PHONE_NO,ADDRESS,DOB FROM STUDENTS;";
                else
                    query = "SELECT ADMN_NO,NAME,PHONE_NO,ADDRESS,DOB FROM STUDENTS WHERE ADMN_NO = " + str + ";";
                               
            }
            else if(flag == 1)
            {
                str = t1.getText();
                if(str.equals(""))
                    query = "SELECT F.* , D.DEPT_NAME FROM FACULTY F , DEPT D WHERE F.DEPARTMENT = D.DEPT_CODE;";
                else
                    query = "SELECT F.* , D.DEPT_NAME FROM FACULTY F , DEPT D WHERE F.DEPARTMENT = D.DEPT_CODE AND FAC_ID = " + str + ";";
                
            }
            else if(flag == 2)
            {
                str = t1.getText();                
                if(str.equals(""))
                    query = "SELECT S.ADMN_NO , S.NAME , SB.SUB_NAME , M.MARKS , F.NAME "
                            + " FROM STUDENTS S , MARKS M , SUBJECT SB , FACULTY F "
                            + " WHERE S.ADMN_NO = M.STUD_ID"
                            + " AND M.SUBJECT = SB.SUB_CODE "
                            + " AND F.FAC_ID = SB.FACULTY ;";
                else {
                    char i = str.charAt(0);
                    if (i == 'B') {
                        query = "SELECT S.ADMN_NO , S.NAME , SB.SUB_NAME , M.MARKS , F.NAME "
                                + " FROM STUDENTS S , MARKS M , SUBJECT SB , FACULTY F "
                                + " WHERE S.ADMN_NO = M.STUD_ID"
                                + " AND M.SUBJECT = SB.SUB_CODE"
                                + " AND F.FAC_ID = SB.FACULTY "
                                + " AND S.ADMN_NO = " + str.substring(1) + ";";
                    } else {
                        query = "SELECT S.ADMN_NO , S.NAME , SB.SUB_NAME , M.MARKS , F.NAME "
                                + " FROM STUDENTS S , MARKS M , SUBJECT SB , FACULTY F "
                                + " WHERE S.ADMN_NO = M.STUD_ID"
                                + " AND M.SUBJECT = SB.SUB_CODE"
                                + " AND F.FAC_ID = SB.FACULTY "
                                + " AND SB.SUB_CODE = " + str.substring(1) + ";";
                    }
                }
            }
            
        try { 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "agat9191");
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                String ADMN = rs.getString(1);
                String NAME = rs.getString(2);
                String MARKS = rs.getString(3);
                String SUB = rs.getString(4);
                String DEP = rs.getString(5);
                
                model.addRow(new Object[] {ADMN,NAME,MARKS,SUB,DEP});
              
            }
            
            rs.close();
            stmt.close();
            conn.close();
            
                
        } catch (Exception ex) {
            Logger.getLogger(SEARCH.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SEARCH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SEARCH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SEARCH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SEARCH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEARCH().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel l1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
