package Interfaz;
import Conexiones_mysql.Conexion1;
import Imagenes.Fu;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Inicio_sesión extends javax.swing.JFrame {

   
    public Inicio_sesión() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(550,450);
        this.setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_contrasena = new javax.swing.JPasswordField();
        btn_ingresar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btn_menu_contrasena = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicio de sesión");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel1.setText("Nombre de usuario:");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel2.setText("Contraseña:");

        btn_ingresar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i14.png"))); // NOI18N
        btn_ingresar.setText("Iniciar sesión");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_regresar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i9.png"))); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(81, 81, 81)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(txt_contrasena))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btn_ingresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(btn_regresar)
                .addGap(102, 102, 102))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_contrasena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar)
                    .addComponent(btn_regresar))
                .addGap(75, 75, 75))
        );

        jMenu2.setText("Ayuda");

        btn_menu_contrasena.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        btn_menu_contrasena.setText("¿Olvidaste la contraseña?");
        btn_menu_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_contrasenaActionPerformed(evt);
            }
        });
        jMenu2.add(btn_menu_contrasena);

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

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        Conexion1 mysql=new Conexion1(); 
            Connection cn=mysql.Conectar();
            String nombre,contrasena;
            nombre=txt_usuario.getText();
            contrasena=txt_contrasena.getText();
            
     try
        {
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("SELECT * FROM usuarios  WHERE nombre=? AND contrasena= ?");
            pst.setString(1,nombre);
            pst.setString(2,contrasena);
              ResultSet res=pst.executeQuery();
               pst.execute();
              
             
             if (res.next()){
                  
                 if (res.getString("nombre").compareTo(nombre)==0 && res.getString("contrasena").compareTo(contrasena)==0 )
                 
                     JOptionPane.showMessageDialog(null, "Bienvenido","Enhorabuena",JOptionPane.INFORMATION_MESSAGE);
                     this.dispose();
                     Menú v=new Menú();
                     v.setVisible(true);
                                          
             }   
             else
             {
                 JOptionPane.showMessageDialog(null,"El usuario o contraseña son incorrectos","Error",JOptionPane.ERROR_MESSAGE);
             }
 pst.close(); 
 
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
       this.dispose();
       Ventana_principal v=new Ventana_principal();
       v.setVisible(true);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_menu_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_contrasenaActionPerformed
         new Recuperar_contraseña(this,true).setVisible(true);
            
    }//GEN-LAST:event_btn_menu_contrasenaActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_sesión().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JMenuItem btn_menu_contrasena;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField txt_contrasena;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
