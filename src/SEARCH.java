/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arnavgohil
 */
import java.awt.Color;
import java.sql.* ;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class SEARCH extends javax.swing.JFrame {

    /**
     * Creates new form SEARCH
     */
    public SEARCH() {
        initComponents();
        t1.setVisible(false);
        l1.setVisible(false);
        b1.setVisible(false);
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
        t1 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        stBut = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        maBut = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        faBut = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 200, 40));

        l1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 270, 40));

        b1.setText("SEARCH");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 110, 40));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 760, 276));

        jButton5.setText("←");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 40, -1));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SEARCH");

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/arnavgohil/Downloads/dtumini.png")); // NOI18N

        stBut.setBackground(new java.awt.Color(153, 204, 255));
        stBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stButMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/arnavgohil/Desktop/student.png")); // NOI18N
        jLabel3.setText("    STUDENT");

        javax.swing.GroupLayout stButLayout = new javax.swing.GroupLayout(stBut);
        stBut.setLayout(stButLayout);
        stButLayout.setHorizontalGroup(
            stButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stButLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        stButLayout.setVerticalGroup(
            stButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stButLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        maBut.setBackground(new java.awt.Color(153, 204, 255));
        maBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maButMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/arnavgohil/Desktop/marks.png")); // NOI18N
        jLabel5.setText("    MARKS");

        javax.swing.GroupLayout maButLayout = new javax.swing.GroupLayout(maBut);
        maBut.setLayout(maButLayout);
        maButLayout.setHorizontalGroup(
            maButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maButLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        maButLayout.setVerticalGroup(
            maButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maButLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        faBut.setBackground(new java.awt.Color(153, 204, 255));
        faBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faButMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/arnavgohil/Desktop/teacher.png")); // NOI18N
        jLabel4.setText("    FACULTY");

        javax.swing.GroupLayout faButLayout = new javax.swing.GroupLayout(faBut);
        faBut.setLayout(faButLayout);
        faButLayout.setHorizontalGroup(
            faButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faButLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        faButLayout.setVerticalGroup(
            faButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, faButLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(maBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(faBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(stBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(faBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
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
                    } else if(i == 'A' ) {
                        query = "SELECT S.ADMN_NO , S.NAME , SB.SUB_NAME , M.MARKS , F.NAME "
                                + " FROM STUDENTS S , MARKS M , SUBJECT SB , FACULTY F "
                                + " WHERE S.ADMN_NO = M.STUD_ID"
                                + " AND M.SUBJECT = SB.SUB_CODE"
                                + " AND F.FAC_ID = SB.FACULTY "
                                + " AND SB.SUB_CODE = " + str.substring(1) + ";";
                    } else {
                         query = "SELECT S.ADMN_NO , S.NAME , SB.SUB_NAME , M.MARKS , F.NAME "
                                + " FROM STUDENTS S , MARKS M , SUBJECT SB , FACULTY F "
                                + " WHERE S.ADMN_NO = M.STUD_ID"
                                + " AND M.SUBJECT = SB.SUB_CODE"
                                + " AND F.FAC_ID = SB.FACULTY "
                                + " AND M.MARKS " + str.substring(1) + ";";
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
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void stButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stButMouseClicked
        // TODO add your handling code here:
        t1.setVisible(true);
        l1.setVisible(true);
        b1.setVisible(true);
        setColor(stBut);
        resetColor(faBut);
        resetColor(maBut);
        l1.setText("Enter Admn No.");
        flag = 0 ;
        
        jTable1.getColumnModel().getColumn(0).setHeaderValue("ADMN NO");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("NAME");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("PHONE NO");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("ADDRESS");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("DOB");
        jTable1.getTableHeader().repaint(); 
    }//GEN-LAST:event_stButMouseClicked

    private void faButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faButMouseClicked
        // TODO add your handling code here:
        t1.setVisible(true);
        l1.setVisible(true);
        b1.setVisible(true);
        resetColor(stBut);
        setColor(faBut);
        resetColor(maBut);
        l1.setText("Enter Faculty Id");
        flag = 1 ;
        
        jTable1.getColumnModel().getColumn(0).setHeaderValue("FACULTY ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("NAME");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("PHONE NO");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("ADDRESS");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("DEPARTMENT");
        jTable1.getTableHeader().repaint();        
    }//GEN-LAST:event_faButMouseClicked

    private void maButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maButMouseClicked
        // TODO add your handling code here:
        t1.setVisible(true);
        l1.setVisible(true);
        b1.setVisible(true);
        resetColor(stBut);
        resetColor(faBut);
        setColor(maBut);
        l1.setText("Enter Subject Code (OR) Student Id (OR) \n Specific Query");
        flag = 2 ;
        
        jTable1.getColumnModel().getColumn(0).setHeaderValue("STUDENT ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("STUDENT NAME");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("SUBJECT NAME");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("MARKS");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("FACULTY");
        jTable1.getTableHeader().repaint();        
    }//GEN-LAST:event_maButMouseClicked

    void setColor(JPanel panel)
    {
        panel.setBackground(new Color(238,238,238));
    }
    
    void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(153,204,255));
    }
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
    private javax.swing.JButton b1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel faBut;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel l1;
    private javax.swing.JPanel maBut;
    private javax.swing.JPanel stBut;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
