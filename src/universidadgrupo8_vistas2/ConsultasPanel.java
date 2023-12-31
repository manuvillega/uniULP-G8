package universidadgrupo8_vistas2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import universidadgrupo8.accesoADatos.InscripcionData;
import universidadgrupo8.accesoADatos.MateriaData;
import universidadgrupo8.entidades.Alumno;
import universidadgrupo8.entidades.Materia;

/**
 *
 * @author Gon@_
 */
public class ConsultasPanel extends javax.swing.JPanel {
 private DefaultTableModel modelo;
 private MateriaData materia;
 private InscripcionData inscripcionData;/**
* Creates new form ConsultasPanel
     */
 //private jTable2 Tabla;
    public ConsultasPanel() {
        initComponents();
        modelo=(DefaultTableModel)jTable2.getModel();
        materia = new MateriaData();
        inscripcionData = new InscripcionData();
        materia.listarMateria().forEach(m->jComboBox_inscripciones_alumnos2.addItem(m.getIdMateria()+" "+m.getNombre()));
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_bg_materias = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane_Alumno = new javax.swing.JTabbedPane();
        jPanel_fondo_alumno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_inscripciones_alumnos2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(25, 23, 38));
        setMinimumSize(new java.awt.Dimension(912, 505));

        jPanel_bg_materias.setBackground(new java.awt.Color(7, 6, 30));

        jPanel1.setBackground(new java.awt.Color(7, 6, 30));

        jTabbedPane_Alumno.setBackground(new java.awt.Color(7, 6, 30));
        jTabbedPane_Alumno.setForeground(new java.awt.Color(7, 6, 30));
        jTabbedPane_Alumno.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jPanel_fondo_alumno.setBackground(new java.awt.Color(7, 6, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de Alumnos por Materia");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Selecciones un Materia:");

        jComboBox_inscripciones_alumnos2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jComboBox_inscripciones_alumnos2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Materias" }));
        jComboBox_inscripciones_alumnos2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox_inscripciones_alumnos2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox_inscripciones_alumnos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_inscripciones_alumnos2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel_fondo_alumnoLayout = new javax.swing.GroupLayout(jPanel_fondo_alumno);
        jPanel_fondo_alumno.setLayout(jPanel_fondo_alumnoLayout);
        jPanel_fondo_alumnoLayout.setHorizontalGroup(
            jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jSeparator1)
                .addGap(155, 155, 155))
            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addGap(255, 255, 255))
            .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, Short.MAX_VALUE)
                            .addGap(88, 88, 88)
                            .addComponent(jComboBox_inscripciones_alumnos2, 0, 255, Short.MAX_VALUE)
                            .addGap(127, 127, 127))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE))
                    .addGap(65, 65, 65)))
        );
        jPanel_fondo_alumnoLayout.setVerticalGroup(
            jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(414, Short.MAX_VALUE))
            .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_inscripciones_alumnos2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(44, 44, 44)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(89, Short.MAX_VALUE)))
        );

        jTabbedPane_Alumno.addTab("Alumnos por Materias", jPanel_fondo_alumno);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane_Alumno, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jTabbedPane_Alumno, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        javax.swing.GroupLayout jPanel_bg_materiasLayout = new javax.swing.GroupLayout(jPanel_bg_materias);
        jPanel_bg_materias.setLayout(jPanel_bg_materiasLayout);
        jPanel_bg_materiasLayout.setHorizontalGroup(
            jPanel_bg_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
            .addGroup(jPanel_bg_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_bg_materiasLayout.setVerticalGroup(
            jPanel_bg_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
            .addGroup(jPanel_bg_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bg_materias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bg_materias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_inscripciones_alumnos2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox_inscripciones_alumnos2PopupMenuWillBecomeInvisible
       
    }//GEN-LAST:event_jComboBox_inscripciones_alumnos2PopupMenuWillBecomeInvisible

    private void jComboBox_inscripciones_alumnos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_inscripciones_alumnos2ActionPerformed
        String elementoSeleccionado = (String) jComboBox_inscripciones_alumnos2.getSelectedItem();
        if(elementoSeleccionado != null){
        int IDSeleccionado = obtenerIDSeleccionado(elementoSeleccionado);
               if(IDSeleccionado != -1){
                   List<Alumno> materiasCursadas = inscripcionData.obtenerAlumnosXMateria(IDSeleccionado);
                   borrarFilas();
                   for(Alumno alumn:materiasCursadas){
                       if(!alumn.isActivo()){
                           continue;
                       } else{
                        modelo.addRow(new Object[]{
                        alumn.getIdAlumno(),
                        alumn.getDni(),
                        alumn.getApellido(),
                        alumn.getNombre()
                    });
                       } 
                   }
                  
            
            
        }
        }
    }//GEN-LAST:event_jComboBox_inscripciones_alumnos2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox_inscripciones_alumnos2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_bg_materias;
    private javax.swing.JPanel jPanel_fondo_alumno;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTabbedPane jTabbedPane_Alumno;
    public javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    
    private void cabecera(){
     modelo.addColumn("ID");
     modelo.addColumn("DNI");
     modelo.addColumn("Apellido");
     modelo.addColumn("Nombre");
     jTable2.setModel(modelo);
     
 } 
    
    
private void borrarFilas(){
    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0);
    }


    private int obtenerIDSeleccionado(String elementoSeleccionado) {
    String[] partes = elementoSeleccionado.split(" ");
    if (partes.length > 0) {
        try {
            return Integer.parseInt(partes[0]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
    return -1;
}

}
