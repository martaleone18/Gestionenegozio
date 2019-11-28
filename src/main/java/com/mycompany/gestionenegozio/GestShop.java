/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionenegozio;

import Myclasses.Client;
import Myclasses.Commesso;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class GestShop extends javax.swing.JFrame {

    final int MAXCODE = 5;
    Commesso myCommesso;
    Client myCliente;
    private ArrayList<Client> elencoClienti;

    /**
     * Creates new form GestShop
     */
    public GestShop() {
        initComponents();
        elencoClienti = new ArrayList<>();

    }

    public int getcodcliente(int maxvalue) {
        double ris = 0;

        double rand = Math.random();
        ris = rand * maxvalue;

        return (int) ris;
    }

    public int getmatricolaCommesso(int maxxvalue) {
        double ris = 0;

        double rand = Math.random();
        ris = rand * maxxvalue;
        return (int) ris;
    }

    private boolean checkCodNotInElenco(int cod) {
        for (Client e : elencoClienti) {
            if (e.getCodcliente() == cod) {
                System.out.println("codice già usato: " + cod);
                return false;
            }
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tnome = new javax.swing.JTextField();
        tCognome = new javax.swing.JTextField();
        tLuogonascita = new javax.swing.JTextField();
        bNewCommesso = new javax.swing.JButton();
        bNewClient = new javax.swing.JButton();
        tLuogonascita1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lCommesso = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        lCliente = new javax.swing.JTextPane();
        tDatanascita = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnomeActionPerformed(evt);
            }
        });

        tCognome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCognomeActionPerformed(evt);
            }
        });

        tLuogonascita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLuogonascitaActionPerformed(evt);
            }
        });

        bNewCommesso.setText("Nuovo commmesso");
        bNewCommesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewCommessoActionPerformed(evt);
            }
        });

        bNewClient.setText("Nuovo cliente");
        bNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewClientActionPerformed(evt);
            }
        });

        tLuogonascita1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLuogonascita1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ins cognome");

        jLabel2.setText("ins nome");

        jLabel3.setText("ins luogo nascita");

        jScrollPane1.setViewportView(lCommesso);

        jScrollPane2.setViewportView(lCliente);

        jLabel4.setText("ins data nascita");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(tLuogonascita1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tnome, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tCognome, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tLuogonascita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                        .addComponent(tDatanascita, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(bNewClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bNewCommesso, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(530, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tLuogonascita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tDatanascita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(92, 92, 92)
                        .addComponent(bNewCommesso))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bNewClient)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(tLuogonascita1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnomeActionPerformed

    private void tCognomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCognomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCognomeActionPerformed

    private void tLuogonascitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLuogonascitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLuogonascitaActionPerformed

    private void tLuogonascita1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLuogonascita1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLuogonascita1ActionPerformed

    private void bNewCommessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewCommessoActionPerformed
        // TODO add your handling code here:
        String cog = tCognome.getText();
        String nom = tnome.getText();
        String luo = tLuogonascita.getText();
        //recupero info da interfaccia
        LocalDate data = LocalDate.of(ERROR, WIDTH, ABORT);
        int matr = getmatricolaCommesso(20);

        // creare info supplementari
        //creare oggetto commesso
        myCommesso = new Commesso("Leone", "Marta", "Torino", LocalDate.of(12, 3, 1995), 20);

        lCommesso.setText(myCommesso.getInfoCommesso());

//assegnare il nuovo commesso ufficiale del negozio

    }//GEN-LAST:event_bNewCommessoActionPerformed

    private void bNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewClientActionPerformed
        // TODO add your handling code here:
        String cog = tCognome.getText();
        String nom = tnome.getText();
        String luo = tLuogonascita.getText();
        //recupero info da interfaccia
        LocalDate data = LocalDate.now();
        int cod = 1;
        boolean ok = false;
        while (!ok) {
            cod = getcodcliente(MAXCODE);
            ok = checkCodNotInElenco(cod);
        }
        // creare info supplementari
        Client Cli = new Client(cog, nom, luo, data, cod);
        //creare oggetto commesso
        myCliente = Cli;
        lCliente.setText(myCliente.getInfoCliente());

//assegnare il nuovo commesso ufficiale del negozio

    }//GEN-LAST:event_bNewClientActionPerformed

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
            java.util.logging.Logger.getLogger(GestShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestShop().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bNewClient;
    private javax.swing.JButton bNewCommesso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane lCliente;
    private javax.swing.JTextPane lCommesso;
    private javax.swing.JTextField tCognome;
    private javax.swing.JTextField tDatanascita;
    private javax.swing.JTextField tLuogonascita;
    private javax.swing.JTextField tLuogonascita1;
    private javax.swing.JTextField tnome;
    // End of variables declaration//GEN-END:variables

}
