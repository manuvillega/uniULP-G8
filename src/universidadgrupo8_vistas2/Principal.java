package universidadgrupo8_vistas2;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author Gonz@_
 */
public class Principal extends javax.swing.JFrame {

       
    public Principal() {
         initComponents();
         setLocationRelativeTo(null);
         jPanel_botones_principal.setVisible(true);
        jD_desktop.setVisible(true);
         
         /*AlumnoPanel alumnoP = new AlumnoPanel();
         alumnoP.setSize(941, 500);
         alumnoP.setLocation(0, 0);
         jPanel_desktop.removeAll();
         jPanel_desktop.add(alumnoP, BorderLayout.CENTER);
         alumnoP.setVisible(false);
         
         MateriaPanel materaP = new MateriaPanel();
         materaP.setSize(941, 500);
         materaP.setLocation(0, 0);
         jPanel_desktop.removeAll();
         jPanel_desktop.add(materaP, BorderLayout.CENTER);
         alumnoP.setVisible(false);
         
          AdministracionPanel administracionP = new AdministracionPanel();
         administracionP.setSize(941, 500);
         administracionP.setLocation(0, 0);
         jPanel_desktop.removeAll();
         jPanel_desktop.add(administracionP, BorderLayout.CENTER);
         administracionP.setVisible(false);
         
         ConsultasPanel consulltasPanel = new ConsultasPanel();
         consulltasPanel.setSize(941, 500);
         consulltasPanel.setLocation(0, 0);
         jPanel_desktop.removeAll();
         jPanel_desktop.add(consulltasPanel, BorderLayout.CENTER);
         administracionP.setVisible(false);*/
         
         
        }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_fondo = new javax.swing.JPanel();
        jPanel_botones_principal = new javax.swing.JPanel();
        jLabel1_logo_ulp = new javax.swing.JLabel();
        jButton_materia = new javax.swing.JButton();
        jButton_alumno = new javax.swing.JButton();
        jButton_consultas = new javax.swing.JButton();
        jButton_salir = new javax.swing.JButton();
        jButton_administracion = new javax.swing.JButton();
        jPanel_titulo_ulp = new javax.swing.JPanel();
        jL_titulo_sist_ulp = new javax.swing.JLabel();
        jPanel_desktop = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/universidadgrupo8/vistas/img/Ventana_Portada.png"));
        Image image = icon.getImage();
        jD_desktop = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1070, 581));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel_fondo.setForeground(new java.awt.Color(232, 242, 208));

        jPanel_botones_principal.setBackground(new java.awt.Color(25, 23, 38));
        jPanel_botones_principal.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel1_logo_ulp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo8/vistas/img/logo-ulp.png"))); // NOI18N

        jButton_materia.setBackground(new java.awt.Color(18, 29, 64));
        jButton_materia.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton_materia.setForeground(new java.awt.Color(232, 242, 208));
        jButton_materia.setText("Materia");
        jButton_materia.setAlignmentY(0.0F);
        jButton_materia.setBorder(null);
        jButton_materia.setBorderPainted(false);
        jButton_materia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_materia.setDefaultCapable(false);
        jButton_materia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_materia.setIconTextGap(0);

        jButton_alumno.setBackground(new java.awt.Color(18, 29, 64));
        jButton_alumno.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton_alumno.setForeground(new java.awt.Color(232, 242, 208));
        jButton_alumno.setText("Alumno");
        jButton_alumno.setAlignmentY(0.0F);
        jButton_alumno.setBorder(null);
        jButton_alumno.setBorderPainted(false);
        jButton_alumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_alumno.setDefaultCapable(false);
        jButton_alumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_alumno.setIconTextGap(0);

        jButton_consultas.setBackground(new java.awt.Color(18, 29, 64));
        jButton_consultas.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton_consultas.setForeground(new java.awt.Color(232, 242, 208));
        jButton_consultas.setText("Consultas");
        jButton_consultas.setAlignmentY(0.0F);
        jButton_consultas.setBorder(null);
        jButton_consultas.setBorderPainted(false);
        jButton_consultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_consultas.setDefaultCapable(false);
        jButton_consultas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_consultas.setIconTextGap(0);

        jButton_salir.setBackground(new java.awt.Color(18, 29, 64));
        jButton_salir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton_salir.setForeground(new java.awt.Color(232, 242, 208));
        jButton_salir.setText("Salir");
        jButton_salir.setAlignmentY(0.0F);
        jButton_salir.setBorder(null);
        jButton_salir.setBorderPainted(false);
        jButton_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_salir.setDefaultCapable(false);
        jButton_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_salir.setIconTextGap(0);

        jButton_administracion.setBackground(new java.awt.Color(18, 29, 64));
        jButton_administracion.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton_administracion.setForeground(new java.awt.Color(232, 242, 208));
        jButton_administracion.setText("Administración");
        jButton_administracion.setAlignmentY(0.0F);
        jButton_administracion.setBorder(null);
        jButton_administracion.setBorderPainted(false);
        jButton_administracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_administracion.setDefaultCapable(false);
        jButton_administracion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_administracion.setIconTextGap(0);

        javax.swing.GroupLayout jPanel_botones_principalLayout = new javax.swing.GroupLayout(jPanel_botones_principal);
        jPanel_botones_principal.setLayout(jPanel_botones_principalLayout);
        jPanel_botones_principalLayout.setHorizontalGroup(
            jPanel_botones_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton_administracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_materia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_alumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_consultas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_botones_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_botones_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_logo_ulp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_botones_principalLayout.setVerticalGroup(
            jPanel_botones_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_botones_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_logo_ulp, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton_alumno, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jButton_materia, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jButton_administracion, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jButton_consultas, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(72, 72, 72)
                .addComponent(jButton_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(61, 61, 61))
        );

        jPanel_titulo_ulp.setBackground(new java.awt.Color(18, 29, 64));
        jPanel_titulo_ulp.setMinimumSize(new java.awt.Dimension(0, 0));

        jL_titulo_sist_ulp.setBackground(new java.awt.Color(51, 51, 51));
        jL_titulo_sist_ulp.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 26)); // NOI18N
        jL_titulo_sist_ulp.setForeground(new java.awt.Color(232, 242, 208));
        jL_titulo_sist_ulp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_titulo_sist_ulp.setText("Sistema de gestión Universidad de La Punta");

        javax.swing.GroupLayout jPanel_titulo_ulpLayout = new javax.swing.GroupLayout(jPanel_titulo_ulp);
        jPanel_titulo_ulp.setLayout(jPanel_titulo_ulpLayout);
        jPanel_titulo_ulpLayout.setHorizontalGroup(
            jPanel_titulo_ulpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 941, Short.MAX_VALUE)
            .addGroup(jPanel_titulo_ulpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_titulo_ulpLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jL_titulo_sist_ulp, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel_titulo_ulpLayout.setVerticalGroup(
            jPanel_titulo_ulpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanel_titulo_ulpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_titulo_ulpLayout.createSequentialGroup()
                    .addContainerGap(14, Short.MAX_VALUE)
                    .addComponent(jL_titulo_sist_ulp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel_desktop.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel_desktop.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jD_desktopLayout = new javax.swing.GroupLayout(jD_desktop);
        jD_desktop.setLayout(jD_desktopLayout);
        jD_desktopLayout.setHorizontalGroup(
            jD_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jD_desktopLayout.setVerticalGroup(
            jD_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel_desktop.add(jD_desktop, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel_fondoLayout = new javax.swing.GroupLayout(jPanel_fondo);
        jPanel_fondo.setLayout(jPanel_fondoLayout);
        jPanel_fondoLayout.setHorizontalGroup(
            jPanel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_fondoLayout.createSequentialGroup()
                .addGroup(jPanel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_titulo_ulp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jPanel_botones_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_fondoLayout.setVerticalGroup(
            jPanel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_fondoLayout.createSequentialGroup()
                .addComponent(jPanel_titulo_ulp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addComponent(jPanel_botones_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized


    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton_administracion;
    public javax.swing.JButton jButton_alumno;
    public javax.swing.JButton jButton_consultas;
    public javax.swing.JButton jButton_materia;
    public javax.swing.JButton jButton_salir;
    private javax.swing.JDesktopPane jD_desktop;
    private javax.swing.JLabel jL_titulo_sist_ulp;
    private javax.swing.JLabel jLabel1_logo_ulp;
    private javax.swing.JPanel jPanel_botones_principal;
    private javax.swing.JPanel jPanel_desktop;
    private javax.swing.JPanel jPanel_fondo;
    private javax.swing.JPanel jPanel_titulo_ulp;
    // End of variables declaration//GEN-END:variables
}