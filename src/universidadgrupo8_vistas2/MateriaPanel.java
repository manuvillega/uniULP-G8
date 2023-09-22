package universidadgrupo8_vistas2;

import javax.swing.JOptionPane;
import universidadgrupo8.accesoADatos.MateriaData;
import universidadgrupo8.entidades.Materia;

/**
 *
 * @author Gonz@_
 */
public class MateriaPanel extends javax.swing.JPanel {
       
        
        private MateriaData materiaData;
    /**
     * Creates new form MateriaPanel
     */
    public MateriaPanel() {
        initComponents();
        materiaData= new MateriaData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_bg_materia = new javax.swing.JPanel();
        jTabbedPane_Alumno = new javax.swing.JTabbedPane();
        jPanel_fondo_alumno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        JTCodigo = new javax.swing.JTextField();
        JTNombre = new javax.swing.JTextField();
        JTAño = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        JBBuscar = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        JBGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(25, 23, 38));
        setForeground(new java.awt.Color(25, 23, 38));
        setMinimumSize(new java.awt.Dimension(912, 500));
        setPreferredSize(new java.awt.Dimension(912, 500));

        jPanel_bg_materia.setBackground(new java.awt.Color(7, 6, 30));
        jPanel_bg_materia.setForeground(new java.awt.Color(25, 23, 38));
        jPanel_bg_materia.setPreferredSize(new java.awt.Dimension(912, 500));

        jTabbedPane_Alumno.setBackground(new java.awt.Color(25, 23, 38));
        jTabbedPane_Alumno.setForeground(new java.awt.Color(25, 23, 38));
        jTabbedPane_Alumno.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jTabbedPane_Alumno.setPreferredSize(new java.awt.Dimension(912, 500));

        jPanel_fondo_alumno.setBackground(new java.awt.Color(7, 6, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Materia");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nombre:");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 40));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Codigo:");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 40));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Año: ");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 40));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Estado:");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 40));

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        JBBuscar.setBackground(new java.awt.Color(18, 29, 64));
        JBBuscar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JBBuscar.setForeground(new java.awt.Color(204, 204, 204));
        JBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo8/vistas/img/lupa.png"))); // NOI18N
        JBBuscar.setText("Buscar ");
        JBBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBBuscar.setPreferredSize(new java.awt.Dimension(120, 40));
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        JBNuevo.setBackground(new java.awt.Color(18, 29, 64));
        JBNuevo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JBNuevo.setForeground(new java.awt.Color(204, 204, 204));
        JBNuevo.setText("Nuevo");
        JBNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBNuevo.setPreferredSize(new java.awt.Dimension(120, 40));
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        JBEliminar.setBackground(new java.awt.Color(18, 29, 64));
        JBEliminar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JBEliminar.setForeground(new java.awt.Color(204, 204, 204));
        JBEliminar.setText("Eliminar");
        JBEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBEliminar.setPreferredSize(new java.awt.Dimension(120, 40));
        JBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarActionPerformed(evt);
            }
        });

        JBGuardar.setBackground(new java.awt.Color(18, 29, 64));
        JBGuardar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JBGuardar.setForeground(new java.awt.Color(204, 204, 204));
        JBGuardar.setText("Guardar");
        JBGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBGuardar.setPreferredSize(new java.awt.Dimension(120, 40));
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_fondo_alumnoLayout = new javax.swing.GroupLayout(jPanel_fondo_alumno);
        jPanel_fondo_alumno.setLayout(jPanel_fondo_alumnoLayout);
        jPanel_fondo_alumnoLayout.setHorizontalGroup(
            jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(318, 318, 318))
            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jSeparator1)
                .addGap(150, 150, 150))
            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(JBNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(175, 175, 175)
                        .addComponent(JBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(177, 177, 177))
                    .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTAño)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTNombre)
                            .addComponent(JTCodigo))
                        .addGap(90, 90, 90)))
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(92, 92, 92))
        );
        jPanel_fondo_alumnoLayout.setVerticalGroup(
            jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110)
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane_Alumno.addTab("Formulario Materia", jPanel_fondo_alumno);

        javax.swing.GroupLayout jPanel_bg_materiaLayout = new javax.swing.GroupLayout(jPanel_bg_materia);
        jPanel_bg_materia.setLayout(jPanel_bg_materiaLayout);
        jPanel_bg_materiaLayout.setHorizontalGroup(
            jPanel_bg_materiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_bg_materiaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane_Alumno, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE))
        );
        jPanel_bg_materiaLayout.setVerticalGroup(
            jPanel_bg_materiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_bg_materiaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane_Alumno, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bg_materia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bg_materia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        int codigoB = Integer.parseInt(JTCodigo.getText());
       
        Materia materiaB = materiaData.getMateriaPorId(codigoB); 
        
        if(materiaB != null){
            
           materiaB.setNombre(JTNombre.getText());
           materiaB.setAnioMateria(Integer.parseInt(JTAño.getText()));
           materiaB.setActivo(jRadioButton1.isSelected());    
            
            materiaData.modificarMateria(materiaB);
        } else{
         String nombre = JTNombre.getText();
         String añoTxt = JTAño.getText();
         int anioMateria = 0;
         try{
             anioMateria = Integer.parseInt(añoTxt);
         } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "El año debe contener solo números.");
         }
         if(!nombre.matches("^[a-zA-Z]+$")){
             JOptionPane.showMessageDialog(this, "El nombre debe contener solo letras.");
         }
         
         boolean activo = jRadioButton1.isSelected();
         
         materiaB.setNombre(nombre);
         materiaB.setActivo(activo);
         materiaB.setAnioMateria(anioMateria);
         materiaData.guardarMateria(materiaB);
        }
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        int idmateriaEliminar = Integer.parseInt(JTCodigo.getText());
        Materia materiaEliminar = materiaData.getMateriaPorId(idmateriaEliminar);
        
        if(materiaEliminar != null){
            
            jRadioButton1.setSelected(false);
            materiaData.eliminarMateria(idmateriaEliminar);
        } else{
            JOptionPane.showMessageDialog(this, "Materia Inexistente.");
        }
    }//GEN-LAST:event_JBEliminarActionPerformed

    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed
        JTAño.setText("");
        JTCodigo.setText("");
        JTNombre.setText("");
        jRadioButton1.setSelected(false);
    }//GEN-LAST:event_JBNuevoActionPerformed

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
       int codigoB = Integer.parseInt(JTCodigo.getText());
       
       Materia materia = materiaData.getMateriaPorId(codigoB);
       
       if(materia != null){
           JTNombre.setText(materia.getNombre());
           JTAño.setText(Integer.toString(materia.getAnioMateria()));
           jRadioButton1.setSelected(materia.isActivo());
       }else {
            JOptionPane.showMessageDialog(this, "Materia no encontrada");
        }
    }//GEN-LAST:event_JBBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JBBuscar;
    public javax.swing.JButton JBEliminar;
    public javax.swing.JButton JBGuardar;
    public javax.swing.JButton JBNuevo;
    public javax.swing.JTextField JTAño;
    public javax.swing.JTextField JTCodigo;
    public javax.swing.JTextField JTNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel_bg_materia;
    private javax.swing.JPanel jPanel_fondo_alumno;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTabbedPane jTabbedPane_Alumno;
    // End of variables declaration//GEN-END:variables
}
