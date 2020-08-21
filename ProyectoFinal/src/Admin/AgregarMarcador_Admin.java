/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
    Ericson Tames Quesada  

temas
    Base de datos: mysql
    SWING GUI
    Colecciones
    Excepciones
*/
package Admin;

import Estructuras.Estructuras;
import Inicio_Sesion.Inicio;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AgregarMarcador_Admin extends javax.swing.JFrame {
    private Usuarios.Dato usuarioActivo;
    private Estructuras estructurasDatosObject;
    
    
    private LinkedList<Marcadores> PuntosUsuario;

    /**
     * Creates new form AgreagarMarcador
     */
    public AgregarMarcador_Admin() {
        initComponents();
        CargarTabla();
    }

        public AgregarMarcador_Admin(Estructuras objeto, Usuarios.Dato usuarioActivo) {
        initComponents();
        this.usuarioActivo = usuarioActivo;
        this.estructurasDatosObject = objeto;
        setLocationRelativeTo(null);
        CargarTabla();
    }
    
    
    private void UpdateTable(){
        
    }

    private void CargarTabla() {
        
    }

    private void RefrescarTabla() {
        DefaultTableModel estructura = (DefaultTableModel) uiTablaMarcadores.getModel();
        //Limpia Jtable
        estructura.setRowCount(0);
        int fila = 0;
            /*while (true) {
                estructura.insertRow(fila, new Object[]{resultados.getBoolean("iniciado"), resultados.getBoolean("finalizado"), resultados.getString("equipoL"), resultados.getString("equipoV"), resultados.getString("marcadorV"), resultados.getString("marcadorL"), resultados.getInt("idPartido")});
                fila++;
            }
            uiTablaMarcadores.getModel();
            System.out.println(e);
*/
    }
    
    private void sumaPuntos(){
            TableModel tabla = uiTablaMarcadores.getModel();
            PuntosUsuario = new LinkedList<>();
            
            for(int row = 0; row < tabla.getRowCount(); row ++){ // recorrer los partidos
                if(Boolean.parseBoolean(String.valueOf(tabla.getValueAt(row, 1))) ||Boolean.parseBoolean(String.valueOf(tabla.getValueAt(row, 0)))){ // si el partido esta finalizado o iniciado entonces
                    int idPT = Integer.parseInt(String.valueOf(tabla.getValueAt(row, 6))); // tomar valor de idPartido de la tabla
                    /*
                    while(marcadores.next()){ // buscar todos los marccadores ingresados
                        int puntos = 0;
                        int idPM = marcadores.getInt("idPartido"); //tomar el valor idPartido de los marcadores

                        if(idPM == idPT){ // si el idPartido tanto de marcadores como de la tabla es igual entonces
                            int mL = marcadores.getInt("marcadorL"); 
                            int mV = marcadores.getInt("marcadorV"); // marcador visitante y Local de la tabla marcadores

                            int tML = Integer.parseInt(String.valueOf(tabla.getValueAt(row, 4)));
                            int tMV = Integer.parseInt(String.valueOf(tabla.getValueAt(row, 5))); // marcadores en la tabla del Frame

                            boolean d1 = mL > mV && tML > tMV; // Si el usuario acertó que el ganador fue el local
                            boolean d2 = mL < mV && tML < tMV; // Si el usuario acertó que el visitante fue el ganador
                            boolean d3 = mL == mV && tML == tMV; // si acertó que habia un empate

                            if (mL == tML && mV == tMV){ // si los marcadores del usuario son iguales a los de la tabla del admin entonces
                                PreparedStatement ps = cn.prepareStatement(updateMarcador);
                                ps.setBoolean(1, Boolean.parseBoolean(String.valueOf(tabla.getValueAt(row, 0))));
                                ps.setInt(2, 3);
                                ps.setInt(3, marcadores.getInt("idUsuario"));
                                ps.setInt(4, marcadores.getInt("idPartido"));   
                                ps.executeUpdate();
                                ps.close();
                                PuntosUsuario.add(new Marcadores(marcadores.getInt("idUsuario"), 3));
                            } else if(d1 || d2 || d3) {
                                PreparedStatement ps = cn.prepareStatement(updateMarcador);
                                ps.setBoolean(1, Boolean.parseBoolean(String.valueOf(tabla.getValueAt(row, 0))));
                                ps.setInt(2, 1);
                                ps.setInt(3, marcadores.getInt("idUsuario"));
                                ps.setInt(4, marcadores.getInt("idPartido"));  
                                ps.executeUpdate();
                                ps.close();
                                PuntosUsuario.add(new Marcadores(marcadores.getInt("idUsuario"), 1));
                            } else {
                                PreparedStatement ps = cn.prepareStatement(updateMarcador);
                                ps.setBoolean(1, Boolean.parseBoolean(String.valueOf(tabla.getValueAt(row, 0))));
                                ps.setInt(2, 0);
                                ps.setInt(3, marcadores.getInt("idUsuario"));
                                ps.setInt(4, marcadores.getInt("idPartido"));  
                                ps.executeUpdate();
                                ps.close();
                                PuntosUsuario.add(new Marcadores(marcadores.getInt("idUsuario"), 0));
                            }
                            
                        }
                    }*/
                }
                
            sumaUsuario();
        }   
    }
    
    private void sumaUsuario(){
      /*
            int puntos;
            try{
                
                while(usuarios.next()){
                    puntos  = 0;
                    for (Marcadores obj : PuntosUsuario){
                        if(obj.getIdUsuario().equals(usuarios.getInt("idUsuario"))){
                            puntos += obj.getPuntos();
                        }
                    }
                    PreparedStatement ps = cn.prepareStatement(UpdateUsuario);
                    ps.setInt(1, puntos);
                    ps.setInt(2, usuarios.getInt("idUsuario"));  
                    ps.executeUpdate();
                    ps.close();

                }
                usuarios.close();
            } catch(SQLException e){
                System.out.println(e);
            }
            */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAgregarPartidos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        uiAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        uiTablaMarcadores = new javax.swing.JTable();
        uiGuardarCambios = new javax.swing.JButton();
        uiCargarResul = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        labelAgregarPartidos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelAgregarPartidos.setText("Partidos Registrados");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        uiAtras.setBackground(new java.awt.Color(0, 0, 0));
        uiAtras.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        uiAtras.setForeground(new java.awt.Color(255, 255, 255));
        uiAtras.setText("Atrás");
        uiAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiAtrasActionPerformed(evt);
            }
        });

        uiTablaMarcadores.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        uiTablaMarcadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iniciado", "Finalizado", "Equipo Local", "Equipo Visitante", "Marcador Local", "Marcador Visitante", "idPartido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        uiTablaMarcadores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        uiTablaMarcadores.setName(""); // NOI18N
        jScrollPane1.setViewportView(uiTablaMarcadores);

        uiGuardarCambios.setBackground(new java.awt.Color(0, 0, 0));
        uiGuardarCambios.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        uiGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        uiGuardarCambios.setText("Guardar Cambios");
        uiGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiGuardarCambiosActionPerformed(evt);
            }
        });

        uiCargarResul.setBackground(new java.awt.Color(0, 0, 0));
        uiCargarResul.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        uiCargarResul.setForeground(new java.awt.Color(255, 255, 255));
        uiCargarResul.setText("Refrescar tabla");
        uiCargarResul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiCargarResulActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿Todo listo?");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar Marcadores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(uiAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(92, 92, 92)
                        .addComponent(uiCargarResul))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(uiGuardarCambios))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiCargarResul)
                    .addComponent(jLabel2)
                    .addComponent(uiAtras))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(uiGuardarCambios))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uiAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiAtrasActionPerformed

        MenúAdmin atras = new MenúAdmin(estructurasDatosObject, usuarioActivo);
        atras.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_uiAtrasActionPerformed

    private void uiGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiGuardarCambiosActionPerformed
        // TODO add your handling code here:
        UpdateTable();
        sumaPuntos();
        JOptionPane.showMessageDialog(null, "¡Valores Actualizados exitosamente!");
    }//GEN-LAST:event_uiGuardarCambiosActionPerformed

    private void uiCargarResulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiCargarResulActionPerformed
        JOptionPane.showMessageDialog(null, "Tabla Actualizada Correctamente");
        CargarTabla();
    }//GEN-LAST:event_uiCargarResulActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarMarcador_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarMarcador_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarMarcador_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarMarcador_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarMarcador_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAgregarPartidos;
    private javax.swing.JButton uiAtras;
    private javax.swing.JButton uiCargarResul;
    private javax.swing.JButton uiGuardarCambios;
    private javax.swing.JTable uiTablaMarcadores;
    // End of variables declaration//GEN-END:variables

}
