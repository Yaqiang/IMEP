/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.meteothink.imep.forms;

import org.meteothink.imep.verification.TimeSelect;
import org.meteothink.imep.verification.VerifyGroup;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yaqiang
 */
public class FrmTimes extends javax.swing.JDialog {

    private VerifyGroup _group;

    /**
     * Creates new form FrmTime
     */
    public FrmTimes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel_Times = new javax.swing.JPanel();
        jButton_UnselectAll = new javax.swing.JButton();
        jButton_UnSelect = new javax.swing.JButton();
        jButton_SelectAll = new javax.swing.JButton();
        jButton_Select = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_SelectedTimes = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_ForecastTimes = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jButton_OK = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_TimeSelect = new javax.swing.JComboBox();
        jTextField_TimeIndices = new javax.swing.JTextField();
        jLabel_TimeIndices = new javax.swing.JLabel();
        jLabel_IndexPrompt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel_Times.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton_UnselectAll.setText("<<");
        jButton_UnselectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UnselectAllActionPerformed(evt);
            }
        });

        jButton_UnSelect.setText("<");
        jButton_UnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UnSelectActionPerformed(evt);
            }
        });

        jButton_SelectAll.setText(">>");
        jButton_SelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectAllActionPerformed(evt);
            }
        });

        jButton_Select.setText(">");
        jButton_Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectActionPerformed(evt);
            }
        });

        jList_SelectedTimes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList_SelectedTimes);

        jLabel2.setText("Selected Times:");

        jList_ForecastTimes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList_ForecastTimes);

        jLabel1.setText("Forecast Times:");

        javax.swing.GroupLayout jPanel_TimesLayout = new javax.swing.GroupLayout(jPanel_Times);
        jPanel_Times.setLayout(jPanel_TimesLayout);
        jPanel_TimesLayout.setHorizontalGroup(
            jPanel_TimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TimesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel_TimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_UnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_UnselectAll, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_TimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton_Select, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_SelectAll, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_TimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        jPanel_TimesLayout.setVerticalGroup(
            jPanel_TimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TimesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel_TimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TimesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_TimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel_TimesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Select)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_SelectAll)
                        .addGap(42, 42, 42)
                        .addComponent(jButton_UnSelect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_UnselectAll)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jButton_OK.setText("OK");
        jButton_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OKActionPerformed(evt);
            }
        });

        jButton_Cancel.setText("Cancel");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jLabel3.setText("Time Select:");

        jComboBox_TimeSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_TimeSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_TimeSelectActionPerformed(evt);
            }
        });

        jLabel_TimeIndices.setText("Time Indices:");

        jLabel_IndexPrompt.setForeground(new java.awt.Color(0, 0, 204));
        jLabel_IndexPrompt.setText("Prompt: Input integer numbers with semicolon as delimiter! (0;1;2)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel_TimeIndices))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_TimeIndices)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox_TimeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_IndexPrompt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel_Times, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jButton_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_TimeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_TimeIndices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TimeIndices))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_IndexPrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel_Times, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Cancel)
                    .addComponent(jButton_OK))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_TimeSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_TimeSelectActionPerformed
        // TODO add your handling code here:
        if (this.jComboBox_TimeSelect.getItemCount() > 0) {
            TimeSelect tSel = (TimeSelect) this.jComboBox_TimeSelect.getSelectedItem();
            switch (tSel) {
                case All:
                    this.jLabel_TimeIndices.setVisible(false);
                    this.jTextField_TimeIndices.setVisible(false);
                    this.jLabel_IndexPrompt.setVisible(false);
                    this.jPanel_Times.setVisible(false);
                    break;
                case TimeIndex:
                    this.jLabel_TimeIndices.setVisible(true);
                    this.jTextField_TimeIndices.setVisible(true);
                    this.jLabel_IndexPrompt.setVisible(true);
                    this.jPanel_Times.setVisible(false);
                    if (this._group.getTimeIndices().size() > 0) {
                        String indexStr = String.valueOf(this._group.getTimeIndices().get(0));
                        if (this._group.getTimeIndices().size() > 1) {
                            for (int i = 1; i < this._group.getTimeIndices().size(); i++) {
                                indexStr = indexStr + ";" + String.valueOf(this._group.getTimeIndices().get(i));
                            }
                        }
                        this.jTextField_TimeIndices.setText(indexStr);
                    }
                    break;
                case TimeValue:
                    this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    this.jLabel_TimeIndices.setVisible(false);
                    this.jTextField_TimeIndices.setVisible(false);
                    this.jLabel_IndexPrompt.setVisible(false);
                    this.jPanel_Times.setVisible(true);
                    List<LocalDateTime> times = this._group.getFcstTimes();
                    DefaultListModel listModel = new DefaultListModel();
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    for (int i = 0; i < times.size(); i++) {
                        listModel.addElement(format.format(times.get(i)));
                    }
                    this.jList_ForecastTimes.setModel(listModel);
                    this.jList_ForecastTimes.setSelectedIndex(0);
                    
                    DefaultListModel selListModel = new DefaultListModel();
                    if (this._group.getTimeNum() > 0) {
                        for (int i = 0; i < this._group.getTimeNum(); i++) {
                            selListModel.addElement(format.format(this._group.getTimes().get(i)));
                        }                        
                    }                    
                    this.jList_SelectedTimes.setModel(selListModel);
                    if (selListModel.getSize() > 0)
                        this.jList_SelectedTimes.setSelectedIndex(0);
                    
                    this.setCursor(Cursor.getDefaultCursor());
                    break;
            }
        }
    }//GEN-LAST:event_jComboBox_TimeSelectActionPerformed

    private void jButton_SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectActionPerformed
        // TODO add your handling code here:
        Object[] selValues = this.jList_ForecastTimes.getSelectedValues();
        DefaultListModel listModel = (DefaultListModel) this.jList_SelectedTimes.getModel();
        for (Object value : selValues) {
            String sel = value.toString();
            if (!listModel.contains(sel)) {
                listModel.addElement(sel);
            }
        }
    }//GEN-LAST:event_jButton_SelectActionPerformed

    private void jButton_SelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectAllActionPerformed
        // TODO add your handling code here:
        DefaultListModel listModel = (DefaultListModel) this.jList_ForecastTimes.getModel();
        DefaultListModel selListModel = (DefaultListModel) this.jList_SelectedTimes.getModel();
        selListModel.clear();
        for (int i = 0; i < listModel.getSize(); i++) {
            selListModel.addElement(listModel.get(i));
        }
    }//GEN-LAST:event_jButton_SelectAllActionPerformed

    private void jButton_UnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UnSelectActionPerformed
        // TODO add your handling code here:
        Object[] selValues = this.jList_SelectedTimes.getSelectedValues();
        for (Object value : selValues) {
            ((DefaultListModel) this.jList_SelectedTimes.getModel()).removeElement(value);
        }
    }//GEN-LAST:event_jButton_UnSelectActionPerformed

    private void jButton_UnselectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UnselectAllActionPerformed
        // TODO add your handling code here:
        ((DefaultListModel) this.jList_SelectedTimes.getModel()).removeAllElements();
    }//GEN-LAST:event_jButton_UnselectAllActionPerformed

    private void jButton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OKActionPerformed
        // TODO add your handling code here:
        TimeSelect tSel = (TimeSelect) this.jComboBox_TimeSelect.getSelectedItem();
        boolean isOK = true;
        switch (tSel) {
            case TimeIndex:
                String indexStr = this.jTextField_TimeIndices.getText().trim();
                if (indexStr.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "The indices can not be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    isOK = false;
                } else {
                    String[] indexStrs = indexStr.split(";");
                    List<Integer> indices = new ArrayList<Integer>();
                    for (String str : indexStrs) {
                        indices.add(Integer.parseInt(str));
                    }
                    this._group.setTimeIndices(indices);
                }
                break;
            case TimeValue:
                DefaultListModel listModel = (DefaultListModel) this.jList_SelectedTimes.getModel();
                if (listModel.getSize() == 0) {
                    JOptionPane.showMessageDialog(null, "The selected times can not be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    isOK = false;
                } else {
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    List<LocalDateTime> times = new ArrayList<>();
                    for (int i = 0; i < listModel.getSize(); i++) {
                        times.add(LocalDateTime.parse(listModel.get(i).toString(), format));
                    }
                    this._group.setTimes(times);
                }
                break;
        }

        if (isOK) {
            this._group.setTimeSelect(tSel);
            this.dispose();
        }
    }//GEN-LAST:event_jButton_OKActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_CancelActionPerformed

    public void setVerifyGroup(VerifyGroup group) {
        _group = group;
        this.jComboBox_TimeSelect.removeAllItems();
        for (TimeSelect tSel : TimeSelect.values()) {
            this.jComboBox_TimeSelect.addItem(tSel);
        }
        this.jComboBox_TimeSelect.setSelectedItem(group.getTimeSelect());
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
            Logger.getLogger(FrmTimes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FrmTimes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FrmTimes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmTimes.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmTimes dialog = new FrmTimes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_OK;
    private javax.swing.JButton jButton_Select;
    private javax.swing.JButton jButton_SelectAll;
    private javax.swing.JButton jButton_UnSelect;
    private javax.swing.JButton jButton_UnselectAll;
    private javax.swing.JComboBox jComboBox_TimeSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_IndexPrompt;
    private javax.swing.JLabel jLabel_TimeIndices;
    private javax.swing.JList jList_ForecastTimes;
    private javax.swing.JList jList_SelectedTimes;
    private javax.swing.JPanel jPanel_Times;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_TimeIndices;
    // End of variables declaration//GEN-END:variables
}
