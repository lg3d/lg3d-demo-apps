/**
 * Project Looking Glass
 *
 * $RCSfile: TestPanel.java,v $
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
 * $Revision: 1.1 $
 * $Date: 2006-04-04 00:47:12 $
 * $State: Exp $
 */
package org.jdesktop.lg3d.apps.swingnode;

import java.awt.event.MouseMotionAdapter;



import javax.swing.JWindow;
import javax.swing.JFrame;

/**
 *
 * @author  Paul
 */
public class TestPanel extends javax.swing.JPanel {
    
    /** Creates new form TestPanel */
    public TestPanel() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        styleBumpShaderRB = new javax.swing.JRadioButton();
        styleNormalRB = new javax.swing.JRadioButton();

        setLayout(new java.awt.GridBagLayout());

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel1.setText("My Label");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 8);
        add(jLabel1, gridBagConstraints);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        add(jButton1, gridBagConstraints);

        jTextField1.setColumns(8);
        jTextField1.setText("jTextField1");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        add(jTextField1, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Rendering Style"));
        buttonGroup1.add(styleBumpShaderRB);
        styleBumpShaderRB.setText("Bump Shader");
        styleBumpShaderRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                styleBumpShaderRBActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(styleBumpShaderRB, gridBagConstraints);

        buttonGroup1.add(styleNormalRB);
        styleNormalRB.setText("Normal");
        styleNormalRB.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        styleNormalRB.setMargin(new java.awt.Insets(0, 0, 0, 0));
        styleNormalRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                styleNormalRBActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(styleNormalRB, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jPanel1, gridBagConstraints);

    }// </editor-fold>//GEN-END:initComponents

    private void styleNormalRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_styleNormalRBActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_styleNormalRBActionPerformed

    private void styleBumpShaderRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_styleBumpShaderRBActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_styleBumpShaderRBActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
// TODO add your handling code here:
        System.out.println("TF Focus gained");
    }//GEN-LAST:event_jTextField1FocusGained

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
// TODO add your handling code here:
        System.out.println("Panel focus Gained");
    }//GEN-LAST:event_formFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("******** button press");
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton styleBumpShaderRB;
    private javax.swing.JRadioButton styleNormalRB;
    // End of variables declaration//GEN-END:variables
    
    public static void main(String args[]) {
        //JFrame j = new JFrame();
        JWindow j = new JWindow();
//        j.addMouseMotionListener(new MouseMotionAdapter() {
//           public void mouseMoved(java.awt.event.MouseEvent evt) {
//                System.out.println(evt);
//            }
//        });
        System.out.println(j.getLayout());
        j.add(new TestPanel());
        j.pack();
        j.setVisible(true);
    }
}