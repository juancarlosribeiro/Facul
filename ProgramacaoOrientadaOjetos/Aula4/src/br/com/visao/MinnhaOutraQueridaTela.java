/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.visao;

import br.com.controle.Calculos;

/**
 *
 * @author gustavo.santos2023
 */
public class MinnhaOutraQueridaTela extends javax.swing.JFrame {

    /**
     * Creates new form MinnhaOutraQueridaTela
     */
    public MinnhaOutraQueridaTela() {
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

        jLabel1 = new javax.swing.JLabel();
        jTvalor1 = new javax.swing.JTextField();
        jTvalor2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBsoma = new javax.swing.JButton();
        jBsub = new javax.swing.JButton();
        jBdiv = new javax.swing.JButton();
        jBmult = new javax.swing.JButton();
        jLresult = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("valor 1: ");

        jTvalor1.setColumns(7);
        jTvalor1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTvalor2.setColumns(7);
        jTvalor2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("valor 2: ");

        jBsoma.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jBsoma.setText("+");
        jBsoma.setToolTipText("");
        jBsoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsomaActionPerformed(evt);
            }
        });

        jBsub.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jBsub.setText("-");
        jBsub.setToolTipText("");
        jBsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsubActionPerformed(evt);
            }
        });

        jBdiv.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jBdiv.setText("/");
        jBdiv.setToolTipText("");
        jBdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdivActionPerformed(evt);
            }
        });

        jBmult.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jBmult.setText("*");
        jBmult.setToolTipText("");
        jBmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmultActionPerformed(evt);
            }
        });

        jLresult.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        jLresult.setForeground(new java.awt.Color(51, 0, 51));
        jLresult.setText("0.00");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBsoma)
                        .addGap(18, 18, 18)
                        .addComponent(jBsub)
                        .addGap(18, 18, 18)
                        .addComponent(jBmult)
                        .addGap(18, 18, 18)
                        .addComponent(jBdiv))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLresult, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTvalor1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jTvalor2))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsoma)
                    .addComponent(jBdiv)
                    .addComponent(jBsub)
                    .addComponent(jBmult))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLresult)
                    .addComponent(jLabel4))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Calculos c = new Calculos();

    private void getValues() { //herança?? *with*
        c.setValor(Double.valueOf(jTvalor1.getText()));
        c.setValor2(Double.valueOf(jTvalor2.getText()));
    }

    private void jBsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsubActionPerformed
        // TODO add your handling code here:
        getValues();
        jLresult.setText(String.valueOf(c.subtrair()));
    }//GEN-LAST:event_jBsubActionPerformed

    private void jBmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmultActionPerformed
        // TODO add your handling code here:
        getValues();
        jLresult.setText(String.valueOf(c.multiplicar()));
    }//GEN-LAST:event_jBmultActionPerformed

    private void jBdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdivActionPerformed
        // TODO add your handling code here:
        getValues();
        jLresult.setText(String.valueOf(c.dividir()));
    }//GEN-LAST:event_jBdivActionPerformed

    private void jBsomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsomaActionPerformed
        // TODO add your handling code here:
        getValues();
        jLresult.setText(String.valueOf(c.somar()));
    }//GEN-LAST:event_jBsomaActionPerformed

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
            java.util.logging.Logger.getLogger(MinnhaOutraQueridaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinnhaOutraQueridaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinnhaOutraQueridaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinnhaOutraQueridaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinnhaOutraQueridaTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBdiv;
    private javax.swing.JButton jBmult;
    private javax.swing.JButton jBsoma;
    private javax.swing.JButton jBsub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLresult;
    private javax.swing.JTextField jTvalor1;
    private javax.swing.JTextField jTvalor2;
    // End of variables declaration//GEN-END:variables
}
