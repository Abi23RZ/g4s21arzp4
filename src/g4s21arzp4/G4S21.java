/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21arzp4;

import g4s21arz_2.JIF_suma;

/**
 *
 * @author ABITA
 */
public class G4S21 extends javax.swing.JFrame {

    /**
     * Creates new form G4S21
     */
    public G4S21() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        d_p_contenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        m_i_raiz_cubica = new javax.swing.JMenu();
        m_i_suma = new javax.swing.JMenuItem();
        m_i_resta = new javax.swing.JMenuItem();
        m_multiplicacion = new javax.swing.JMenuItem();
        m_i_division = new javax.swing.JMenuItem();
        m_i_potencia = new javax.swing.JMenuItem();
        m_raiz_cubica = new javax.swing.JMenuItem();
        m_i_raiz_cuadrada = new javax.swing.JMenuItem();
        m_i_factorial = new javax.swing.JMenuItem();
        m_i_logaritmo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        d_p_contenedor.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout d_p_contenedorLayout = new javax.swing.GroupLayout(d_p_contenedor);
        d_p_contenedor.setLayout(d_p_contenedorLayout);
        d_p_contenedorLayout.setHorizontalGroup(
            d_p_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        d_p_contenedorLayout.setVerticalGroup(
            d_p_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        m_i_raiz_cubica.setText("Operaciones");

        m_i_suma.setText("Suma");
        m_i_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_sumaActionPerformed(evt);
            }
        });
        m_i_raiz_cubica.add(m_i_suma);

        m_i_resta.setText("Resta");
        m_i_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_restaActionPerformed(evt);
            }
        });
        m_i_raiz_cubica.add(m_i_resta);

        m_multiplicacion.setText("Multiplicacion");
        m_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_multiplicacionActionPerformed(evt);
            }
        });
        m_i_raiz_cubica.add(m_multiplicacion);

        m_i_division.setText("Division");
        m_i_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_divisionActionPerformed(evt);
            }
        });
        m_i_raiz_cubica.add(m_i_division);

        m_i_potencia.setText("Potencia");
        m_i_potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_potenciaActionPerformed(evt);
            }
        });
        m_i_raiz_cubica.add(m_i_potencia);

        m_raiz_cubica.setText("Raiz Cubica");
        m_raiz_cubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_raiz_cubicaActionPerformed(evt);
            }
        });
        m_i_raiz_cubica.add(m_raiz_cubica);

        m_i_raiz_cuadrada.setText("Raiz Cuadrada");
        m_i_raiz_cuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_raiz_cuadradaActionPerformed(evt);
            }
        });
        m_i_raiz_cubica.add(m_i_raiz_cuadrada);

        m_i_factorial.setText("Factorial");
        m_i_factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_factorialActionPerformed(evt);
            }
        });
        m_i_raiz_cubica.add(m_i_factorial);

        m_i_logaritmo.setText("Logaritmo");
        m_i_logaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_logaritmoActionPerformed(evt);
            }
        });
        m_i_raiz_cubica.add(m_i_logaritmo);

        jMenuBar1.add(m_i_raiz_cubica);

        jMenu2.setText("salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(d_p_contenedor)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(d_p_contenedor)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_i_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_sumaActionPerformed
        // TODO add your handling code here:
        JIF_suma objsuma = new JIF_suma();
                objsuma.setVisible(true);
                d_p_contenedor.add(objsuma);
    }//GEN-LAST:event_m_i_sumaActionPerformed

    private void m_i_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_restaActionPerformed
        // TODO add your handling code here:
        JIF_resta objresta = new JIF_resta();
                objresta.setVisible(true);
                d_p_contenedor.add(objresta);
    }//GEN-LAST:event_m_i_restaActionPerformed

    private void m_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_multiplicacionActionPerformed
        // TODO add your handling code here:
        JIF_multiplicacion objmultiplicacion = new JIF_multiplicacion();
                objmultiplicacion.setVisible(true);
                d_p_contenedor.add(objmultiplicacion);
    }//GEN-LAST:event_m_multiplicacionActionPerformed

    private void m_i_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_divisionActionPerformed
        // TODO add your handling code here:
        JIF_division objdivision = new JIF_division();
                objdivision.setVisible(true);
                d_p_contenedor.add(objdivision);
    }//GEN-LAST:event_m_i_divisionActionPerformed

    private void m_i_potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_potenciaActionPerformed
        // TODO add your handling code here:
        JIF_potencia objpotencia = new JIF_potencia();
                objpotencia.setVisible(true);
                d_p_contenedor.add(objpotencia);
    }//GEN-LAST:event_m_i_potenciaActionPerformed

    private void m_raiz_cubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_raiz_cubicaActionPerformed
        // TODO add your handling code here:
        JIF_raiz_cubica objraiz_cubica = new JIF_raiz_cubica();
                objraiz_cubica.setVisible(true);
                d_p_contenedor.add(objraiz_cubica);
    }//GEN-LAST:event_m_raiz_cubicaActionPerformed

    private void m_i_raiz_cuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_raiz_cuadradaActionPerformed
        // TODO add your handling code here:
        JIF_raiz_cuadrada objraiz_cuadrada = new JIF_raiz_cuadrada();
                objraiz_cuadrada.setVisible(true);
                d_p_contenedor.add(objraiz_cuadrada);
    }//GEN-LAST:event_m_i_raiz_cuadradaActionPerformed

    private void m_i_factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_factorialActionPerformed
        // TODO add your handling code here:
        JIF_factorial objfactorial = new JIF_factorial();
                objfactorial.setVisible(true);
                d_p_contenedor.add(objfactorial);
    }//GEN-LAST:event_m_i_factorialActionPerformed

    private void m_i_logaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_logaritmoActionPerformed
        // TODO add your handling code here:
        JIF_logaritmico objlogaritmico = new JIF_logaritmico();
                objlogaritmico.setVisible(true);
                d_p_contenedor.add(objlogaritmico);
    }//GEN-LAST:event_m_i_logaritmoActionPerformed

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
            java.util.logging.Logger.getLogger(G4S21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G4S21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G4S21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G4S21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new G4S21().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane d_p_contenedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem m_i_division;
    private javax.swing.JMenuItem m_i_factorial;
    private javax.swing.JMenuItem m_i_logaritmo;
    private javax.swing.JMenuItem m_i_potencia;
    private javax.swing.JMenuItem m_i_raiz_cuadrada;
    private javax.swing.JMenu m_i_raiz_cubica;
    private javax.swing.JMenuItem m_i_resta;
    private javax.swing.JMenuItem m_i_suma;
    private javax.swing.JMenuItem m_multiplicacion;
    private javax.swing.JMenuItem m_raiz_cubica;
    // End of variables declaration//GEN-END:variables
}
