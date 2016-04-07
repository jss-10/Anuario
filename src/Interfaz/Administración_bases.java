package Interfaz;

import Conexiones_mysql.Conexion1;
import Imagenes.Fu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Administración_bases extends javax.swing.JFrame {
    String path;          
    
   
    public Administración_bases() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(650,550);
        this.setResizable(false);
        
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btn_importar = new javax.swing.JButton();
        btn_exportar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_menu_menu = new javax.swing.JMenuItem();
        btn_menu_galeria = new javax.swing.JMenuItem();
        btn_menu_registros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_importar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_importar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i25.png"))); // NOI18N
        btn_importar.setText("Importar");
        btn_importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_importarActionPerformed(evt);
            }
        });

        btn_exportar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_exportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i23.png"))); // NOI18N
        btn_exportar.setText("Exportar");
        btn_exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel2.setText("Dirección");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_importar)
                            .addComponent(btn_exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 96, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(btn_exportar)
                .addGap(39, 39, 39)
                .addComponent(btn_importar)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 490));

        jMenu1.setText("Ventanas");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        btn_menu_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        btn_menu_menu.setText("Regresar al menú");
        btn_menu_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_menuActionPerformed(evt);
            }
        });
        jMenu1.add(btn_menu_menu);

        btn_menu_galeria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        btn_menu_galeria.setText("Ir a la galería");
        btn_menu_galeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_galeriaActionPerformed(evt);
            }
        });
        jMenu1.add(btn_menu_galeria);

        btn_menu_registros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        btn_menu_registros.setText("Ir a registros");
        btn_menu_registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_registrosActionPerformed(evt);
            }
        });
        jMenu1.add(btn_menu_registros);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       Fu a=new Fu();
       panel.add( a );
       panel.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void btn_importarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_importarActionPerformed
       Conexion1 mysql=new Conexion1();
       Connection cn=mysql.Conectar();   
       
        try
             {
             path=txt_direccion.getText(); 
             PreparedStatement pst1=(PreparedStatement) cn.prepareStatement("truncate table usuarios");
             pst1.execute();
             pst1.close();
             PreparedStatement pst2=(PreparedStatement) cn.prepareStatement("LOAD DATA INFILE"+path+"INTO TABLE USUARIOS");
             pst2.execute();
             pst2.close();
             }
             catch(SQLException ex)
             {
                 JOptionPane.showMessageDialog(null, ex);
             } 
                    
    }//GEN-LAST:event_btn_importarActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
      
    }//GEN-LAST:event_jMenu1MouseClicked

    private void btn_menu_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_menuActionPerformed
       this.dispose();
       Menú v=new Menú();
       v.setVisible(true);
    }//GEN-LAST:event_btn_menu_menuActionPerformed

    private void btn_menu_galeriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_galeriaActionPerformed
       this.dispose();
       Galería v=new Galería();
       v.setVisible(true); 
    }//GEN-LAST:event_btn_menu_galeriaActionPerformed

    private void btn_menu_registrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_registrosActionPerformed
       this.dispose();
       Registros v=new Registros();
       v.setVisible(true);
    }//GEN-LAST:event_btn_menu_registrosActionPerformed

    private void btn_exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportarActionPerformed
      Conexion1 mysql=new Conexion1();
       Connection cn=mysql.Conectar();   
       
        try
             {
             path=txt_direccion.getText();
             PreparedStatement pst=(PreparedStatement) cn.prepareStatement("SELECT*FROM usuarios INTO OUTFILE"+path);
             pst.execute();
             pst.close();
             }
             catch(SQLException ex)
             {
                 JOptionPane.showMessageDialog(null, ex);
             } 
    }//GEN-LAST:event_btn_exportarActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administración_bases().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exportar;
    private javax.swing.JButton btn_importar;
    private javax.swing.JMenuItem btn_menu_galeria;
    private javax.swing.JMenuItem btn_menu_menu;
    private javax.swing.JMenuItem btn_menu_registros;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txt_direccion;
    // End of variables declaration//GEN-END:variables
}
