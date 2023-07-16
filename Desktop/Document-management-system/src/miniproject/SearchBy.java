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
import static miniproject.handlerClass.*;
/**
 *
 *
 */

public class SearchBy extends javax.swing.JFrame {

    /**
     * Creates new form SearchBy
     */
    public SearchBy() {
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
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NameButton = new javax.swing.JRadioButton();
        categoryButton = new javax.swing.JRadioButton();
        topicButton = new javax.swing.JRadioButton();
        tagButton = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search ");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 255, 153));
        jTable1.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
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
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("AnjaliOldLipi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Search By :");

        NameButton.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(NameButton);
        NameButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NameButton.setForeground(new java.awt.Color(0, 0, 0));
        NameButton.setText("Name");
        NameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameButtonActionPerformed(evt);
            }
        });

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

        tagButton.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(tagButton);
        tagButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tagButton.setForeground(new java.awt.Color(0, 0, 0));
        tagButton.setText("Tag");
        tagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagButtonActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tagButton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(NameButton)
                .addGap(18, 18, 18)
                .addComponent(categoryButton)
                .addGap(18, 18, 18)
                .addComponent(topicButton)
                .addGap(18, 18, 18)
                .addComponent(tagButton)
                .addGap(26, 26, 26)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        
        String searchQuery = jTextField1.getText().trim();
        ArrayList<String> found = new ArrayList<>();
        ArrayList<String> found2 = new ArrayList<>();
        
        if(categoryButton.isSelected())
        {
            ArrayList<Integer> categoryId = listOfIdOfC(searchQuery);
            if(!categoryId.isEmpty())
            {
                for(int i=0;i<documentList.size();i++)
                {
                    if(categoryId.contains(documentList.get(i).getCategoryId()))
                    {
                        found.add(documentList.get(i).getDocumentName());
                        found2.add(pathOfTopic(documentList.get(i).getTopicId()));
                    }
                }
            }
            else JOptionPane.showMessageDialog(null, "Category Not Found!");
        }
        else if(tagButton.isSelected())
        {
            for(int i = 0;i<documentList.size();i++)
            {
                for(int j=0;j<documentList.get(i).getDocumentTags().tagList.size();j++)
                {
                    if(documentList.get(i).getDocumentTags().tagList.get(j).contains(searchQuery))
                    {
                        found.add(documentList.get(i).getDocumentName());
                        found2.add(pathOfTopic(documentList.get(i).getTopicId()));
                    }
                }
            }
            if(found.isEmpty()) JOptionPane.showMessageDialog(null, "No Matching Tags!");
        }
        else if(topicButton.isSelected())
        {
            ArrayList<Integer> topicId = listOfIdOfT(searchQuery);
            if(!topicId.isEmpty())
            {
                for(int i=0;i<documentList.size();i++)
                {
                    if(topicId.contains(documentList.get(i).getTopicId()))
                    {
                        found.add(documentList.get(i).getDocumentName());
                        found2.add(pathOfTopic(documentList.get(i).getTopicId()));
                    }
                }
            }
            else JOptionPane.showMessageDialog(null, "No Matched Topics!");
        }
        else if(NameButton.isSelected())
        {
            printDocumentList();
            for(int i=0;i<documentList.size();i++)
            {
                if(documentList.get(i).getDocumentName().contains(searchQuery))
                {
                    found.add(documentList.get(i).getDocumentName());
                    found2.add(pathOfTopic(documentList.get(i).getTopicId()));
                }
            }
            if(found.isEmpty()) JOptionPane.showMessageDialog(null, "No Matching Documents!");
        }
        String[][] toDisplay = new String[found.size()][2];
        for(int i=0;i<found.size();i++)
        {
            toDisplay[i][0] = found.get(i);
            toDisplay[i][1] = found2.get(i);
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            toDisplay,
            new String [] {
                "Name", "Path"
            }
        ));
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        int selected = jTable1.getSelectedRow();
        String toOpenName = (String)jTable1.getValueAt(selected,0);
        String toOpenPath = (String)jTable1.getValueAt(selected,1);
        Runtime ob = Runtime.getRuntime();
        try
        {
            ob.exec("gedit "+toOpenPath+"/"+toOpenName);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void categoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryButtonActionPerformed
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
    }//GEN-LAST:event_categoryButtonActionPerformed

    private void topicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topicButtonActionPerformed
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
    }//GEN-LAST:event_topicButtonActionPerformed

    private void tagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagButtonActionPerformed
       jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
    }//GEN-LAST:event_tagButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int selected = jTable1.getSelectedRow();
        String toDeleteName = (String)jTable1.getValueAt(selected,0);
        String toDeleteFrom = (String)jTable1.getValueAt(selected,1);
        String[] split = toDeleteFrom.split("/");
        toDeleteFrom = split[split.length - 1];
        int topicIdd = idOfT(toDeleteFrom);
        deleteDocument(toDeleteName, topicIdd);
//        int toDeleteIndex = -1;
//        for(int i=0;i<documentList.size();i++)
//        {
//            if(documentList.get(i).getTopicId() == topicId && documentList.get(i).getDocumentName().equals(toDeleteFrom))
//            {
//                toDeleteIndex = i;
//                break;
//            }
//        }
//        documentList.remove(toDeleteIndex);
        
        String searchQuery = jTextField1.getText().trim();
        ArrayList<String> found = new ArrayList<>();
        ArrayList<String> found2 = new ArrayList<>();
        
        if(categoryButton.isSelected())
        {
            ArrayList<Integer> categoryId = listOfIdOfC(searchQuery);
            if(!categoryId.isEmpty())
            {
                for(int i=0;i<documentList.size();i++)
                {
                    if(categoryId.contains(documentList.get(i).getCategoryId()))
                    {
                        found.add(documentList.get(i).getDocumentName());
                        found2.add(pathOfTopic(documentList.get(i).getTopicId()));
                    }
                }
            }
            else JOptionPane.showMessageDialog(null, "Category Not Found!");
        }
        else if(tagButton.isSelected())
        {
            for(int i = 0;i<documentList.size();i++)
            {
                for(int j=0;j<documentList.get(i).getDocumentTags().tagList.size();j++)
                {
                    if(searchQuery.equals(documentList.get(i).getDocumentTags().tagList.get(j)))
                    {
                        found.add(documentList.get(i).getDocumentName());
                        found2.add(pathOfTopic(documentList.get(i).getTopicId()));
                    }
                }
            }
            if(found.isEmpty()) JOptionPane.showMessageDialog(null, "No Matching Tags!");
        }
        else if(topicButton.isSelected())
        {
            ArrayList<Integer> topicId = listOfIdOfT(searchQuery);
            if(!topicId.isEmpty())
            {
                for(int i=0;i<documentList.size();i++)
                {
                    if(topicId.contains(documentList.get(i).getTopicId()))
                    {
                        found.add(documentList.get(i).getDocumentName());
                        found2.add(pathOfTopic(documentList.get(i).getTopicId()));
                    }
                }
            }
            else JOptionPane.showMessageDialog(null, "No Matched Topics!");
        }
        else if(NameButton.isSelected())
        {
            for(int i=0;i<documentList.size();i++)
            {
                if(documentList.get(i).getDocumentName().contains(searchQuery))
                {
                    found.add(documentList.get(i).getDocumentName());
                    found2.add(pathOfTopic(documentList.get(i).getTopicId()));
                }
            }
            if(found.isEmpty()) JOptionPane.showMessageDialog(null, "No Matching Documents!");
        }
        String[][] toDisplay = new String[found.size()][2];
        for(int i=0;i<found.size();i++)
        {
            toDisplay[i][0] = found.get(i);
            toDisplay[i][1] = found2.get(i);
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            toDisplay,
            new String [] {
                "Name", "Path"
            }
        ));    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void NameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
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
    
    public static ArrayList<Integer> listOfIdOfT(String str)
    {
        ArrayList<Integer> ret = new ArrayList<>();
        for(int i = 0;i<topicList.size();i++)
        {
            if(topicList.get(i).getTopicName().contains(str))
            {
                ret.add(topicList.get(i).getTopicId());
            }
        }
        return ret;
    }
    
    public static ArrayList<Integer> listOfIdOfC(String str)
    {
        ArrayList<Integer> ret = new ArrayList<>();
        for(int i = 0;i<categoryList.size();i++)
        {
            if(categoryList.get(i).getCategoryName().contains(str))
            {
                ret.add(categoryList.get(i).getCategoryId());
            }
        }
        return ret;
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
            java.util.logging.Logger.getLogger(SearchBy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new SearchBy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton NameButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton categoryButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton tagButton;
    private javax.swing.JRadioButton topicButton;
    // End of variables declaration//GEN-END:variables
}
