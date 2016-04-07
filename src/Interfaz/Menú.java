package Interfaz;
import Imagenes.Fu;
import Clases_auxiliares.cmd;
import Conexiones_mysql.Conexion2;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
/*import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;*/
public class Menú extends javax.swing.JFrame {
cmd sentencia=new cmd();
    
    public Menú() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(800,590);
        this.setResizable(false);
    }
 
    private void abrirReporte(String archivo)
     {
       /*try
       {
           Conexion2 mysql=new Conexion2(); 
           Connection cn=mysql.Conectar(); 
           JasperReport report=JasperCompileManager.compileReport(archivo);
           JasperPrint print=JasperFillManager.fillReport(report,new HashMap(),mysql.Conectar());
           JasperViewer.viewReport(print,false);
       }
       catch(JRException jRException)
       {
          JOptionPane.showMessageDialog(null,jRException,"Error",JOptionPane.ERROR_MESSAGE);
       }*/
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        panel = new javax.swing.JPanel();
        btn_pdf = new javax.swing.JButton();
        btn_bases = new javax.swing.JButton();
        btn_registros = new javax.swing.JButton();
        btn_galeria = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_menu_cambiar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menú principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_pdf.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i4.png"))); // NOI18N
        btn_pdf.setText("Ir a sección de reportes");
        btn_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pdfActionPerformed(evt);
            }
        });

        btn_bases.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_bases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i21.png"))); // NOI18N
        btn_bases.setText("Importar ó exportar bases de datos");
        btn_bases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_basesActionPerformed(evt);
            }
        });

        btn_registros.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_registros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i6.png"))); // NOI18N
        btn_registros.setText("Ir a sección de registros");
        btn_registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrosActionPerformed(evt);
            }
        });

        btn_galeria.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_galeria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i7.png"))); // NOI18N
        btn_galeria.setText("Ir a la galería");
        btn_galeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_galeriaActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i8.png"))); // NOI18N
        btn_salir.setText("\n\nSalir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_pdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_registros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_bases, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_galeria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(btn_salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_bases, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_galeria)
                            .addComponent(btn_registros))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btn_salir)
                .addGap(23, 23, 23))
        );

        jMenu1.setText("Usuario");

        btn_menu_cambiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        btn_menu_cambiar.setText("Cambiar de usuario");
        btn_menu_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_cambiarActionPerformed(evt);
            }
        });
        jMenu1.add(btn_menu_cambiar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Más opciones");

        jMenuItem1.setText("Gestión de bases de datos");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       Fu a=new Fu();
       panel.add( a );
       panel.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void btn_registrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrosActionPerformed
        this.dispose();
        Registros v=new Registros();
        v.setVisible(true);
    }//GEN-LAST:event_btn_registrosActionPerformed

    private void btn_galeriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_galeriaActionPerformed
        this.dispose();
        Galería v=new Galería();
        v.setVisible(true);
    }//GEN-LAST:event_btn_galeriaActionPerformed

    private void btn_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pdfActionPerformed
    abrirReporte(getClass().getResource("/Anuario 1.0/Reportes/report1.jrxml").getPath());     
    }//GEN-LAST:event_btn_pdfActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_menu_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_cambiarActionPerformed
        this.dispose();
        Inicio_sesión v=new Inicio_sesión();
        v.setVisible(true);
    }//GEN-LAST:event_btn_menu_cambiarActionPerformed

    private void btn_basesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_basesActionPerformed
        this.dispose();
        Administración_bases v=new Administración_bases();
        v.setVisible(true);
    }//GEN-LAST:event_btn_basesActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bases;
    private javax.swing.JButton btn_galeria;
    private javax.swing.JMenuItem btn_menu_cambiar;
    private javax.swing.JButton btn_pdf;
    private javax.swing.JButton btn_registros;
    private javax.swing.JButton btn_salir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
