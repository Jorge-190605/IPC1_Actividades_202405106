/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

public class Calculadora extends javax.swing.JFrame {
    public Calculadora() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numA = new javax.swing.JTextField();
        numB = new javax.swing.JTextField();
        calcSuma = new javax.swing.JButton();
        calcResta = new javax.swing.JButton();
        calcMultiplicacion = new javax.swing.JButton();
        calcDivision = new javax.swing.JButton();
        calcPotencia = new javax.swing.JButton();
        calcRaiz = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        verResultado = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        verNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Calculadora Basica");

        jLabel2.setText("Numero a");

        jLabel3.setText("Numero b");

        jLabel4.setText("Ingrese Dos Numeros");

        numA.setColumns(10);
        numA.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        numA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAActionPerformed(evt);
            }
        });

        numB.setColumns(10);
        numB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        numB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numBActionPerformed(evt);
            }
        });

        calcSuma.setText("Calcular suma");
        calcSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcSumaActionPerformed(evt);
            }
        });

        calcResta.setText("Calcular Resta");
        calcResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcRestaActionPerformed(evt);
            }
        });

        calcMultiplicacion.setText("Calcular multiplicacion");
        calcMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcMultiplicacionActionPerformed(evt);
            }
        });

        calcDivision.setText("Calcular division");
        calcDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcDivisionActionPerformed(evt);
            }
        });

        calcPotencia.setText("Calcular potencia");
        calcPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcPotenciaActionPerformed(evt);
            }
        });

        calcRaiz.setText("Calcular Raiz");
        calcRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcRaizActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel5.setText("Accion a Realizar");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Reultado");

        verResultado.setBorder(new javax.swing.border.MatteBorder(null));

        atras.setText("atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        jLabel8.setText("Usuario:");

        verNombre.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(259, 259, 259))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(42, 42, 42)
                        .addComponent(verResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(numB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(numA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel5)))
                        .addGap(181, 181, 181)
                        .addComponent(verNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calcSuma)
                        .addGap(109, 109, 109)
                        .addComponent(calcResta))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(calcMultiplicacion)
                                .addComponent(calcPotencia))
                            .addGap(62, 62, 62)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(calcRaiz)
                                .addComponent(calcDivision)))
                        .addComponent(jLabel8)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(numA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcResta)
                    .addComponent(calcSuma))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcMultiplicacion)
                    .addComponent(calcDivision))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcPotencia)
                    .addComponent(calcRaiz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(salir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(40, 40, 40)
                        .addComponent(atras)
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numAActionPerformed

    private void calcSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcSumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcSumaActionPerformed

    private void calcRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcRestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcRestaActionPerformed

    private void calcMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcMultiplicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcMultiplicacionActionPerformed

    private void calcDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcDivisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcDivisionActionPerformed

    private void calcPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcPotenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcPotenciaActionPerformed

    private void calcRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcRaizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcRaizActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void numBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numBActionPerformed

     public javax.swing.JTextField getNumA() {
        return numA;
    }

    public javax.swing.JTextField getNumB() {
        return numB;
    }
    
    public javax.swing.JLabel getVerResultado() {
        return verResultado;
    }
    
    public javax.swing.JLabel getVerNombre() {
        return verNombre;
    }
    
    public javax.swing.JButton getCalcSuma() {
        return calcSuma;
    }
    
    public javax.swing.JButton getCalcResta() {
        return calcResta;
    }
    
    public javax.swing.JButton getCalcMultiplicacion() {
        return calcMultiplicacion;
    }
    
    public javax.swing.JButton getCalcDivision() {
        return calcDivision;
    }
    
    public javax.swing.JButton getCalcPotencia() {
        return calcPotencia;
    }
    
    public javax.swing.JButton getCalcRaiz() {
        return calcRaiz;
    }
    
    public javax.swing.JButton getAtras() {
        return atras;
    }
    
    public javax.swing.JButton getSalir() {
        return salir;
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton calcDivision;
    private javax.swing.JButton calcMultiplicacion;
    private javax.swing.JButton calcPotencia;
    private javax.swing.JButton calcRaiz;
    private javax.swing.JButton calcResta;
    private javax.swing.JButton calcSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField numA;
    private javax.swing.JTextField numB;
    private javax.swing.JButton salir;
    private javax.swing.JLabel verNombre;
    private javax.swing.JLabel verResultado;
    // End of variables declaration//GEN-END:variables
}
