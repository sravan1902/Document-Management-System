/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import javax.swing.JOptionPane;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.print.attribute.standard.DocumentName;
import static miniproject.SearchBy.idOfT;
import static miniproject.handlerClass.*;
/**
 *
 * 
 */

public class Delete extends javax.swing.JFrame {

    /**
     * Creates new form SearchBy
     */
    public Delete() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        documentButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        categoryButton = new javax.swing.JRadioButton();
        topicButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete A Document");

        jTable1.setBackground(new java.awt.Color(255, 255, 153));
        jTable1.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setToolTipText("");
        jTable1.setSelectionBackground(new java.awt.Color(153, 255, 153));
        jScrollPane2.setViewportView(jTable1);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        documentButton.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(documentButton);
        documentButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        documentButton.setForeground(new java.awt.Color(0, 0, 0));
        documentButton.setText("Document");
        documentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("AnjaliOldLipi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Select Item to Delete");

        categoryButton.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(categoryButton);
        categoryButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        categoryButton.setForeground(new java.awt.Color(0, 0, 0));
        categoryButton.setText("Category");
        categoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryButtonActionPerformed(evt);
            }
        });

        topicButton.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(topicButton);
        topicButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        topicButton.setForeground(new java.awt.Color(0, 0, 0));
        topicButton.setText("Topic");
        topicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topicButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topicButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(documentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(documentButton)
                .addGap(33, 33, 33)
                .addComponent(categoryButton)
                .addGap(35, 35, 35)
                .addComponent(topicButton)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryButtonActionPerformed
        
    ArrayList<String> found = new ArrayList<>();
        for(int i=0;i<categoryList.size();i++)
        {
            found.add(categoryList.get(i).getCategoryName());
        }
        
        if(found.isEmpty()) JOptionPane.showMessageDialog(null, "No Categories to Display!");
        String[][] toDisplay = new String[found.size()][1];
        for(int i=0;i<found.size();i++)
        {
            toDisplay[i][0] = found.get(i);
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            toDisplay,
            new String [] {
                "Name"
            }
        ));
    }//GEN-LAST:event_categoryButtonActionPerformed

    private void topicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topicButtonActionPerformed
        ArrayList<String> found = new ArrayList<>();
        for(int i=0;i<topicList.size();i++)
        {
            found.add(topicList.get(i).getTopicName());
        }
        
        if(found.isEmpty()) JOptionPane.showMessageDialog(null, "No Topics to Display!");
        String[][] toDisplay = new String[found.size()][1];
        for(int i=0;i<found.size();i++)
        {
            toDisplay[i][0] = found.get(i);
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            toDisplay,
            new String [] {
                "Name"
            }
        ));
    }//GEN-LAST:event_topicButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(documentButton.isSelected())
        {
            int selected = jTable1.getSelectedRow();
            String toDeleteName = (String)jTable1.getValueAt(selected,0);
            String toDeleteFrom = (String)jTable1.getValueAt(selected,1);
            String[] split = toDeleteFrom.split("/");
            toDeleteFrom = split[split.length - 1];
            int topicIdd = idOfT(toDeleteFrom);
            deleteDocument(toDeleteName, topicIdd);
            
            ArrayList<String> found = new ArrayList<>();
            ArrayList<String> found2 = new ArrayList<>();
            for(int i=0;i<documentList.size();i++)
            {
                found.add(documentList.get(i).getDocumentName());
                found2.add(pathOfTopic(documentList.get(i).getTopicId()));
            }

            if(found.isEmpty()) JOptionPane.showMessageDialog(null, "No Documents to Display!");
            String[][] toDisplay = new String[found.size()][2];
            for(int i=0;i<found.size();i++)
            {
                toDisplay[i][0] = found.get(i);
                toDisplay[i][1] = found2.get(i);
            }

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                toDisplay,
                new String [] {
                    "Name","Path"
                }
            ));
            exportData();
            importData();
        }
        else if(categoryButton.isSelected())
        {
            deleteCategory((String)jTable1.getValueAt(jTable1.getSelectedRow(),0));
            
            ArrayList<String> found = new ArrayList<>();
            for(int i=0;i<categoryList.size();i++)
            {
                found.add(categoryList.get(i).getCategoryName());
            }

            if(found.isEmpty()) JOptionPane.showMessageDialog(null, "No Categories to Display!");
            String[][] toDisplay = new String[found.size()][1];
            for(int i=0;i<found.size();i++)
            {
                toDisplay[i][0] = found.get(i);
            }

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                toDisplay,
                new String [] {
                    "Name"
                }
            ));
        }
        else if(topicButton.isSelected())
        {
            deleteTopic((String)jTable1.getValueAt(jTable1.getSelectedRow(),0));
            
            ArrayList<String> found = new ArrayList<>();
            for(int i=0;i<topicList.size();i++)
            {
                found.add(topicList.get(i).getTopicName());
            }

            if(found.isEmpty()) JOptionPane.showMessageDialog(null, "No Topics to Display!");
            String[][] toDisplay = new String[found.size()][1];
            for(int i=0;i<found.size();i++)
            {
                toDisplay[i][0] = found.get(i);
            }

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                toDisplay,
                new String [] {
                    "Name"
                }
            ));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void documentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentButtonActionPerformed
        
        ArrayList<String> found = new ArrayList<>();
        ArrayList<String> found2 = new ArrayList<>();
        for(int i=0;i<documentList.size();i++)
        {
            found.add(documentList.get(i).getDocumentName());
            found2.add(pathOfTopic(documentList.get(i).getTopicId()));
        }
        
        if(found.isEmpty()) JOptionPane.showMessageDialog(null, "No Documents to Display!");
        String[][] toDisplay = new String[found.size()][2];
        for(int i=0;i<found.size();i++)
        {
            toDisplay[i][0] = found.get(i);
            toDisplay[i][1] = found2.get(i);
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            toDisplay,
            new String [] {
                "Name","Path"
            }
        ));
    }//GEN-LAST:event_documentButtonActionPerformed

    
    public static int idOfC(String str)
    {
        for(int i = 0;i<categoryList.size();i++)
        {
            if(categoryList.get(i).getCategoryName().equals(str)) return categoryList.get(i).getCategoryId();
        }
        return -1;
    }
    
    public static int idOfT(String str)
    {
        for(int i = 0;i<topicList.size();i++)
        {
            if(topicList.get(i).getTopicName().equals(str)) return topicList.get(i).getTopicId();
        }
        return -1;
    }
    
    public static String pathOfTopic(int id)
    {
        for(int i=0;i<topicList.size();i++)
        {
            if(topicList.get(i).getTopicId() == id) return topicList.get(i).getFolderPath();
        }
        return "null";
    }
    
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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton categoryButton;
    private javax.swing.JRadioButton documentButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton topicButton;
    // End of variables declaration//GEN-END:variables
}
