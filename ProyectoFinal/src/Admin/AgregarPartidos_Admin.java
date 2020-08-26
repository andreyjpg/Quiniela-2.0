/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
 */
package Admin;

import Estructuras.Estructuras;
import Inicio_Sesion.Inicio;
import javax.swing.JOptionPane;


public class AgregarPartidos_Admin extends javax.swing.JFrame {
    private Usuarios.Dato usuarioActivo;
    private Estructuras estructurasDatosObject;
    /**
     * Creates new form AñadirPartidos_Admin
     */
    public AgregarPartidos_Admin() {
        initComponents();
    }
    
    public AgregarPartidos_Admin(Estructuras objeto, Usuarios.Dato usuarioActivo) {
        initComponents();
        setLocationRelativeTo(null);
        this.usuarioActivo = usuarioActivo;
        this.estructurasDatosObject = objeto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelAgregarPartidos = new javax.swing.JLabel();
        uiAtras = new javax.swing.JButton();
        uiEquipoLoc = new javax.swing.JTextField();
        uiEquipoVis = new javax.swing.JTextField();
        labelVS = new javax.swing.JLabel();
        labelEquipoLoc = new javax.swing.JLabel();
        labelEquipoLoc1 = new javax.swing.JLabel();
        uiGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelAgregarPartidos1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        labelAgregarPartidos.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        labelAgregarPartidos.setForeground(new java.awt.Color(255, 255, 255));
        labelAgregarPartidos.setText("Agregar Partidos");

        uiAtras.setBackground(new java.awt.Color(0, 0, 0));
        uiAtras.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        uiAtras.setForeground(new java.awt.Color(255, 255, 255));
        uiAtras.setText("Atrás");
        uiAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiAtrasActionPerformed(evt);
            }
        });

        uiEquipoLoc.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        uiEquipoLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiEquipoLocActionPerformed(evt);
            }
        });

        uiEquipoVis.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        labelVS.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        labelVS.setText("VS.");

        labelEquipoLoc.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        labelEquipoLoc.setForeground(new java.awt.Color(255, 255, 255));
        labelEquipoLoc.setText("Equipo Local");

        labelEquipoLoc1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        labelEquipoLoc1.setForeground(new java.awt.Color(255, 255, 255));
        labelEquipoLoc1.setText("Equipo Vistante");

        uiGuardar.setBackground(new java.awt.Color(0, 0, 0));
        uiGuardar.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        uiGuardar.setForeground(new java.awt.Color(255, 255, 255));
        uiGuardar.setText("Guardar Cambios");
        uiGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estado de Partido:");

        labelAgregarPartidos1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        labelAgregarPartidos1.setForeground(new java.awt.Color(255, 255, 255));
        labelAgregarPartidos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAgregarPartidos1.setText("¿Todo listo?");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel2.setText("PROGRAMADO");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("*Nota: Todo partido creado quedara en estado \"Programado\" automáticamente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelEquipoLoc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelEquipoLoc1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(uiAtras)
                                .addGap(124, 124, 124)
                                .addComponent(labelAgregarPartidos)
                                .addGap(0, 156, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(uiEquipoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelVS)
                                .addGap(18, 18, 18)
                                .addComponent(uiEquipoVis))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uiGuardar)
                                    .addComponent(labelAgregarPartidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAgregarPartidos)
                    .addComponent(uiAtras))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEquipoLoc)
                    .addComponent(labelEquipoLoc1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(uiEquipoVis)
                    .addComponent(labelVS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uiEquipoLoc, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(labelAgregarPartidos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uiGuardar)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    private void uiGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiGuardarActionPerformed
        String equipoL = uiEquipoLoc.getText();
        String equipoV = uiEquipoVis.getText();
        if(!equipoL.equals("") && !equipoV.equals("")){
            PartidosCreados.Dato partido = new PartidosCreados.Dato(equipoL, equipoV);
            
            estructurasDatosObject.getColaPartidos().encolar(partido);
            JOptionPane.showMessageDialog(null, "Partido agregado");
            uiEquipoVis.setText("");
            uiEquipoLoc.setText("");
            partidosUsuarios(partido);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese valores en las casillas");
        }
    }//GEN-LAST:event_uiGuardarActionPerformed

    
    private void partidosUsuarios(PartidosCreados.Dato partido){
        int cont = estructurasDatosObject.getListaSimple_marcadoresUsuario().cuentaElementos();
        estructurasDatosObject.getListaUsuarios().agregarPartidosXUsario(partido, cont, estructurasDatosObject);        
    }
    
    private void uiAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiAtrasActionPerformed
        // TODO add your handling code here:
        MenúAdmin atras = new MenúAdmin(estructurasDatosObject, usuarioActivo);
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_uiAtrasActionPerformed

    private void uiEquipoLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiEquipoLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uiEquipoLocActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPartidos_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPartidos_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPartidos_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPartidos_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPartidos_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAgregarPartidos;
    private javax.swing.JLabel labelAgregarPartidos1;
    private javax.swing.JLabel labelEquipoLoc;
    private javax.swing.JLabel labelEquipoLoc1;
    private javax.swing.JLabel labelVS;
    private javax.swing.JButton uiAtras;
    private javax.swing.JTextField uiEquipoLoc;
    private javax.swing.JTextField uiEquipoVis;
    private javax.swing.JButton uiGuardar;
    // End of variables declaration//GEN-END:variables
}
