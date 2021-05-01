
package vistas;
import entidades.*;
import java.util.*;

public class ViewMenu1 extends javax.swing.JFrame {

    
    private HashSet <Materia> listaMaterias = new HashSet<>();
    private HashSet <Alumno> listaAlumnos= new HashSet<>();
 
    public ViewMenu1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio1 = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiFormularioInscripcion = new javax.swing.JMenuItem();
        jmiAltaMaterias = new javax.swing.JMenuItem();
        jmiAltaAlumnos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorio1Layout = new javax.swing.GroupLayout(escritorio1);
        escritorio1.setLayout(escritorio1Layout);
        escritorio1Layout.setHorizontalGroup(
            escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorio1Layout.setVerticalGroup(
            escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Operaciones");

        jmiFormularioInscripcion.setText("Formulario Inscripcion");
        jmiFormularioInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioInscripcionActionPerformed(evt);
            }
        });
        jMenu1.add(jmiFormularioInscripcion);

        jmiAltaMaterias.setText("Alta Materias");
        jmiAltaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAltaMateriasActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAltaMaterias);

        jmiAltaAlumnos.setText("Alta Alumnos");
        jmiAltaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAltaAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAltaAlumnos);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Salir");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenu2.add(jmiSalir);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFormularioInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioInscripcionActionPerformed
        // TODO add your handling code here:
        escritorio1.removeAll();
        escritorio1.repaint();
        ViewFormularioInscripcion vfi = new ViewFormularioInscripcion(listaMaterias, listaAlumnos);
        vfi.setVisible(true);
        escritorio1.add(vfi);
        escritorio1.moveToFront(vfi);
        
    }//GEN-LAST:event_jmiFormularioInscripcionActionPerformed

    private void jmiAltaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAltaMateriasActionPerformed
        // TODO add your handling code here:
        escritorio1.removeAll();
        escritorio1.repaint();
        ViewAltaMaterias vfi = new ViewAltaMaterias(listaMaterias);
        vfi.setVisible(true);
        escritorio1.add(vfi);
        escritorio1.moveToFront(vfi);
        
    }//GEN-LAST:event_jmiAltaMateriasActionPerformed

    private void jmiAltaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAltaAlumnosActionPerformed
        // TODO add your handling code here:
        escritorio1.removeAll();
        escritorio1.repaint();
        ViewAltaAlumnos vfi = new ViewAltaAlumnos(listaAlumnos);
        vfi.setVisible(true);
        escritorio1.add(vfi);
        escritorio1.moveToFront(vfi);
        
    }//GEN-LAST:event_jmiAltaAlumnosActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(ViewMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenu1().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jmiAltaAlumnos;
    private javax.swing.JMenuItem jmiAltaMaterias;
    private javax.swing.JMenuItem jmiFormularioInscripcion;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
