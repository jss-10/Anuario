package Interfaz;
import Clases_auxiliares.Cargar;
import Conexiones_mysql.Conexion0;
import com.mysql.jdbc.PreparedStatement;
import com.sun.awt.AWTUtilities;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Splashscreen extends javax.swing.JFrame {

    Cargar hilo;
    double i=80, j=1;
    public Splashscreen() {
        initComponents();
        iniciar();
    }
    
    public void iniciar()
    {
        setLocationRelativeTo(null);
        hilo=new Cargar(getProgreso());
        hilo.start();
        hilo=null;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progreso = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progreso.setStringPainted(true);
        progreso.setVerifyInputWhenFocusTarget(false);
        progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progresoStateChanged(evt);
            }
        });
        getContentPane().add(progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 197, 31));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/signbot.gif"))); // NOI18N
        jButton1.setBorder(null);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 45, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i19.png"))); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void progresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progresoStateChanged
      if(progreso.getValue()==i){
        if(j!=101){
            AWTUtilities.setWindowOpacity(this, Float.valueOf((100-j)/100+"f"));
            i++;
            j+=5;
        }
    }
    if(progreso.getValue()==100){
        Ventana_principal v=new Ventana_principal();
        v.setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_progresoStateChanged

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splashscreen().setVisible(true);
                
                Conexion0 mysql=new Conexion0();
                Connection cn=mysql.Conectar();
       try
       {
           PreparedStatement pst0=(PreparedStatement) cn.prepareStatement("create database if not exists registrados");
           pst0.execute();
           pst0.close();
           PreparedStatement pst1=(PreparedStatement) cn.prepareStatement("create database if not exists datos_personales");
           pst1.execute();
           pst1.close();
           PreparedStatement pst2=(PreparedStatement) cn.prepareStatement("use registrados");
           pst2.execute();
           pst2.close();
           PreparedStatement pst3=(PreparedStatement) cn.prepareStatement("create table if not exists usuarios(id_usuario int primary key auto_increment not null,nombre varchar(20) not null unique,contrasena varchar(20) not null unique)");
           pst3.execute();
           pst3.close();
           PreparedStatement pst4=(PreparedStatement) cn.prepareStatement("use datos_personales");
           pst4.execute();
           pst4.close();
           PreparedStatement pst5=(PreparedStatement) cn.prepareStatement("create table if not exists alumnos(id_alumno int primary key auto_increment not null,imagen longblob not null,pri_nom varchar(20) not null,seg_nom varchar(20),pri_ap varchar(20) not null,seg_ap varchar(20) not null,sexo varchar(10) not null,carrera varchar(50) not null,a_entrada varchar(4) not null,a_salida varchar(4) not null)");
           pst5.execute();
           pst5.close();
           
       }
       catch(SQLException ex)
               {
                  JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE); 
               }
            }
        });
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables

    
    public javax.swing.JProgressBar getProgreso() {
        return progreso;
    }

    
    public void setProgreso(javax.swing.JProgressBar progreso) {
        this.progreso = progreso;
    }
}
