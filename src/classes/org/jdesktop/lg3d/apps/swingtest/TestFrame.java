/**
 * Project Looking Glass
 *
 * $RCSfile: TestFrame.java,v $
 *
 * Copyright (c) 2004, Sun Microsystems, Inc., All Rights Reserved
 *
 * Redistributions in source code form must reproduce the above
 * copyright and this condition.
 *
 * The contents of this file are subject to the GNU General Public
 * License, Version 2 (the "License"); you may not use this file
 * except in compliance with the License. A copy of the License is
 * available at http://www.opensource.org/licenses/gpl-license.php.
 *
 * $Revision: 1.8 $
 * $Date: 2006-05-04 05:48:51 $
 * $State: Exp $
 */

package org.jdesktop.lg3d.apps.swingtest;

import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JDialog;

/**
 *
 * @author  paulby
 */
public class TestFrame extends javax.swing.JFrame {
    
    private boolean windowMoved = false;
    
    /** Creates new form TestFrame */
    public TestFrame() {
        
//        System.out.println("L&F "+ new UIManager().getLookAndFeel());
//        System.out.println("Default Toolkit "+Toolkit.getDefaultToolkit());
        initComponents();
        jComboBox1.addItem("Test 1");
        jComboBox1.addItem("Test 2");
        jComboBox1.addItem("Test 3");
        
        screenSizeTF.setText(Toolkit.getDefaultToolkit().getScreenSize().width+", "+Toolkit.getDefaultToolkit().getScreenSize().height);
        
//        jTextField1.addCaretListener(new CaretListener() {
//            public void caretUpdate(CaretEvent evt) {
//                System.out.println(evt);
//            }
//        });
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        showDialogB = new javax.swing.JButton();
        outsideLG = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        updateLocationButton = new javax.swing.JButton();
        jLabel1 = jLabel1 = new MyLabel("test");
        moveWindowB = new javax.swing.JButton();
        testCB = new javax.swing.JCheckBox();
        testTF = new MyTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        screenSizeTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        windowLocationTF = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        messageTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SwingTest");
        setName("SwingTest");
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        showDialogB.setText("Show Dialog");
        showDialogB.setToolTipText("Show Dialog");
        showDialogB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDialogBActionPerformed(evt);
            }
        });

        jPanel2.add(showDialogB);

        outsideLG.setText("Show Outside LG");
        outsideLG.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        outsideLG.setEnabled(false);
        outsideLG.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(outsideLG);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        jPanel3.add(jPanel2, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        updateLocationButton.setText("Show Location");
        updateLocationButton.setToolTipText("Displays windows location");
        updateLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLocationButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(updateLocationButton, gridBagConstraints);

        jLabel1.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 1, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        moveWindowB.setText("Move Window");
        moveWindowB.setToolTipText("Move Window Not Implemented");
        moveWindowB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveWindowBActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel1.add(moveWindowB, gridBagConstraints);

        testCB.setText("jCheckBox1");
        testCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testCBActionPerformed(evt);
            }
        });

        jPanel1.add(testCB, new java.awt.GridBagConstraints());

        testTF.setText("jTextField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(testTF, gridBagConstraints);

        jComboBox1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jComboBox1, gridBagConstraints);

        jLabel2.setText("Screen Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(jLabel2, gridBagConstraints);

        screenSizeTF.setColumns(10);
        screenSizeTF.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        jPanel1.add(screenSizeTF, gridBagConstraints);

        jLabel3.setText("Location");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(jLabel3, gridBagConstraints);

        windowLocationTF.setColumns(10);
        windowLocationTF.setEditable(false);
        windowLocationTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windowLocationTFActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        jPanel1.add(windowLocationTF, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel3.add(jPanel1, gridBagConstraints);

        jTabbedPane1.setToolTipText("Text Area test");
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTabbedPane1.addTab("Text Area", null, jScrollPane1, "Text Area");

        jPanel4.add(jTabbedPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel3.add(jPanel4, gridBagConstraints);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel4.setText("Last Event :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        jPanel5.add(jLabel4, gridBagConstraints);

        messageTF.setColumns(15);
        messageTF.setEditable(false);
        messageTF.setToolTipText("Event from last UI action");
        jPanel5.add(messageTF, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        jPanel3.add(jPanel5, gridBagConstraints);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showDialogBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDialogBActionPerformed
// TODO add your handling code here:
        messageTF.setText("Show Dialog");
        JDialog dialog = new JDialog(this);
        dialog.add(new DialogPanel(dialog));
        dialog.pack();
        dialog.setSize(100,50);
        dialog.setLocation(100,100);
        dialog.setVisible(true);        
    }//GEN-LAST:event_showDialogBActionPerformed

    private void updateLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLocationButtonActionPerformed
// TODO add your handling code here:
        messageTF.setText("Update Location");
        Point loc = getLocation();
        windowLocationTF.setText(loc.x+", "+loc.y);     
    }//GEN-LAST:event_updateLocationButtonActionPerformed

    private void moveWindowBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveWindowBActionPerformed
// TODO add your handling code here:
        messageTF.setText("Move Window");
        if (!windowMoved)
            setLocation(50,50);
        else
            setLocation(0,0);
        windowMoved = !windowMoved;
    }//GEN-LAST:event_moveWindowBActionPerformed

    private void testCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testCBActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_testCBActionPerformed

    private void windowLocationTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_windowLocationTFActionPerformed
// TODO add your handling code here:
        Point loc = getLocation();
        windowLocationTF.setText(loc.x+", "+loc.y);
    }//GEN-LAST:event_windowLocationTFActionPerformed
        
    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
// TODO add your handling code here:
        //System.out.println(evt);
    }//GEN-LAST:event_jPanel1FocusGained
                    
    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
// TODO add your handling code here:
        //System.out.println(evt);
    }//GEN-LAST:event_jPanel1MouseMoved
            
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField messageTF;
    private javax.swing.JButton moveWindowB;
    private javax.swing.JRadioButton outsideLG;
    private javax.swing.JTextField screenSizeTF;
    private javax.swing.JButton showDialogB;
    private javax.swing.JCheckBox testCB;
    private javax.swing.JTextField testTF;
    private javax.swing.JButton updateLocationButton;
    private javax.swing.JTextField windowLocationTF;
    // End of variables declaration//GEN-END:variables
    
}
