package Interfaz;
import Imagenes.*;
import Clases_auxiliares.*;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import Conexiones_mysql.Conexion2;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.table.DefaultTableModel;

public class Registros extends javax.swing.JFrame {
DefaultTableModel modelo;
    public Registros() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(700,580);
        this.setResizable(false);
        
    }
Convertir_I c=new Convertir_I();
String path;
void CargarTabla()
    {
        String[] titulos = { "Id_alumno","Primer nombre","Segundo nombre","Primer apellido","Segundo apellido","Sexo","Carrera","Año de entrada","Año de salida"};
        String[] registro = new String[9];
        String sSQL = "";
       DefaultTableModel modelo;
        modelo = new DefaultTableModel(null, titulos);

        Conexion2 mysql = new Conexion2();
        Connection cn = mysql.Conectar();

        sSQL = "SELECT  Id_alumno,Pri_nom,Seg_nom,Pri_ap,Seg_ap,Sexo,Carrera,A_entrada,A_salida FROM Alumnos";
        try
        {
           PreparedStatement pst = cn.prepareStatement(sSQL); 
            ResultSet rs = pst.executeQuery();

            while(rs.next())
            {
               
                registro[0] = rs.getString("Id_alumno");
                registro[1] = rs.getString("Pri_nom");
                registro[2] = rs.getString("Seg_nom");
                registro[3] = rs.getString("Pri_ap");
                registro[4] = rs.getString("Seg_ap");
                registro[5] = rs.getString("Sexo");
                registro[6] = rs.getString("Carrera");
                registro[7] = rs.getString("A_entrada");
                registro[8] = rs.getString("A_salida");
                modelo.addRow(registro);
            }
            tabla1.setModel(modelo);

        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

public void modificarimagen () throws FileNotFoundException
  {
         Conexion2 mysql=new Conexion2();
    Connection cn= mysql.Conectar();
        FileInputStream fis = null;
            try {
                File file = new File(path);
                fis = new FileInputStream(file);
             PreparedStatement pst = cn.prepareStatement("update Alumnos " +
            "set  Imagen = ? " +
            "where Id_Alumno =? ");
         pst.setString(2,txt_cargar.getText());
         pst.setBinaryStream(1, fis,(int) file.length());
         int res=pst.executeUpdate();
                   
      }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
        }
  }
    
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        btn_seleccionar_imagen = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        txt_primer_nombre = new javax.swing.JTextField();
        txt_segundo_nombre = new javax.swing.JTextField();
        txt_primer_apellido = new javax.swing.JTextField();
        txt_segundo_apellido = new javax.swing.JTextField();
        cbo_sexo = new javax.swing.JComboBox();
        txt_anio_entrada = new javax.swing.JTextField();
        txt_anio_salida = new javax.swing.JTextField();
        cbo_carrera = new javax.swing.JComboBox();
        btn_cargar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_cargar = new javax.swing.JTextField();
        panel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btn_actualizar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();
        btn_busqueda = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_eliminar = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_menu_menu = new javax.swing.JMenuItem();
        btn_menu_galeria = new javax.swing.JMenuItem();
        btn_menu_rar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administración de registros");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel1.setText("Primer nombre");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel2.setText("Segundo nombre");

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel3.setText("Apellido paterno");

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel4.setText("Apellido materno");

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel5.setText("Sexo");

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel6.setText("Carrera");

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel7.setText("Año de entrada");

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel8.setText("Año de salida");

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i3.png"))); // NOI18N
        lblFoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btn_seleccionar_imagen.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_seleccionar_imagen.setText("Seleccionar imagen");
        btn_seleccionar_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionar_imagenActionPerformed(evt);
            }
        });

        btn_guardar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i12.png"))); // NOI18N
        btn_guardar.setText("Guardar registro");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_modificar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i15.png"))); // NOI18N
        btn_modificar.setText("Modificar registro");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        txt_primer_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_primer_nombreKeyTyped(evt);
            }
        });

        txt_segundo_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_segundo_nombreKeyTyped(evt);
            }
        });

        txt_primer_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_primer_apellidoKeyTyped(evt);
            }
        });

        txt_segundo_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_segundo_apellidoKeyTyped(evt);
            }
        });

        cbo_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Femenino", "Masculino" }));

        txt_anio_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_anio_entradaActionPerformed(evt);
            }
        });
        txt_anio_entrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_anio_entradaKeyTyped(evt);
            }
        });

        txt_anio_salida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_anio_salidaKeyTyped(evt);
            }
        });

        cbo_carrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administración industrial", "Ciencias de la informática", "Ingeniería industrial", "Ingeniería en informática", "Ingeniería en transporte" }));

        btn_cargar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i20.png"))); // NOI18N
        btn_cargar.setText("Cargar registro");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel11.setText("Id del alumno a modificar:");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(45, 45, 45)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbo_sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_segundo_apellido)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(57, 57, 57)
                                .addComponent(txt_primer_nombre))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(55, 55, 55)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbo_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_anio_entrada)
                                    .addComponent(txt_anio_salida)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(45, 45, 45)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_primer_apellido)
                                    .addComponent(txt_segundo_nombre)))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btn_guardar)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(btn_seleccionar_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txt_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_primer_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_segundo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_primer_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_segundo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_seleccionar_imagen)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_anio_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_cargar))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_anio_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(14, 14, 14)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_guardar)
                            .addComponent(btn_modificar)))
                    .addComponent(txt_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nuevo ó Modificar", panel);

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        btn_actualizar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i16.png"))); // NOI18N
        btn_actualizar.setText("Actualizar tabla");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel10.setText("Ingresa el apellido paterno de la persona a buscar:");

        btn_busqueda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i17.png"))); // NOI18N
        btn_busqueda.setText("Consultar");
        btn_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btn_busqueda))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btn_actualizar))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btn_actualizar)
                .addGap(31, 31, 31)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_busqueda))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", panel2);

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel9.setText("Ingresa el Id del registro a eliminar:");

        btn_eliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i18.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel9)
                        .addGap(32, 32, 32)
                        .addComponent(txt_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(btn_eliminar)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_eliminar))
                .addGap(70, 70, 70)
                .addComponent(btn_eliminar)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar", panel3);

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
        btn_menu_galeria.setText("Ir a galería");
        btn_menu_galeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_galeriaActionPerformed(evt);
            }
        });
        jMenu1.add(btn_menu_galeria);

        btn_menu_rar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        btn_menu_rar.setText("Generar rar");
        btn_menu_rar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_rarActionPerformed(evt);
            }
        });
        jMenu1.add(btn_menu_rar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       Fr1 a=new Fr1();
       panel.add( a );
       panel.repaint();
       Fr2 b=new Fr2();
       panel2.add( b );
       panel2.repaint();
       Fr3 c=new Fr3();
       panel3.add( c );
       panel3.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
     Conexion2 mysql=new Conexion2(); 
     Connection cn=mysql.Conectar(); 
     String Pri_nom = txt_primer_nombre.getText();
     String Seg_nom = txt_segundo_nombre.getText();
     String Pri_ap = txt_primer_apellido.getText();
     String Seg_ap = txt_segundo_apellido.getText();
     String Sexo = cbo_sexo.getSelectedItem().toString();
     String Carrera = cbo_carrera.getSelectedItem().toString();
     String A_entrada=txt_anio_entrada.getText();
     String A_salida=txt_anio_salida.getText();
     
     
            FileInputStream fis = null;
            try {
                File file = new File(path);
                fis = new FileInputStream(file);

     
                PreparedStatement pstm = cn.prepareStatement("insert into " + 
                        " alumnos(Imagen,Pri_nom,Seg_nom,Pri_ap,Seg_ap,Sexo,Carrera,A_entrada,A_salida) " + 
                        " values(?,?,?,?,?,?,?,?,?)");
                pstm.setBinaryStream(1, fis,(int) file.length());
                pstm.setString(2, Pri_nom);
                pstm.setString(3, Seg_nom);
                pstm.setString(4, Pri_ap);
                pstm.setString(5, Seg_ap);
                pstm.setString(6, Sexo);
                pstm.setString(7, Carrera);
                pstm.setString(8, A_entrada);
                pstm.setString(9, A_salida);
                              
                pstm.execute();
                pstm.close();
        
                JOptionPane.showMessageDialog(null, "¡Los datos han sido guardados satisfactoriamente!");
           

            txt_primer_nombre.setText("");
            txt_segundo_nombre.setText("");
            txt_primer_apellido.setText("");
            txt_segundo_apellido.setText("");
            txt_anio_entrada.setText("");
            txt_anio_salida.setText("");
            String direccion = "/Imagenes/i3.png";  
            URL url = this.getClass().getResource(direccion);  
            ImageIcon icon = new ImageIcon(url);  
            lblFoto.setIcon(icon);
            CargarTabla();
            
            
            
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex);
        }
     
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_seleccionar_imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionar_imagenActionPerformed
             File archivo;
             JFileChooser cargar = new JFileChooser();
             cargar.setFileFilter(new FileNameExtensionFilter("Imagenes jpg", "jpg"));
             int respuesta=cargar.showOpenDialog(this);
             if(respuesta==JFileChooser.APPROVE_OPTION)
             {
             archivo=cargar.getSelectedFile();
             path=(archivo.getAbsolutePath());
             Image foto=getToolkit().getImage(path);
             foto=foto.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_AREA_AVERAGING);
             lblFoto.setIcon(new ImageIcon(foto));
             }
    }//GEN-LAST:event_btn_seleccionar_imagenActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
       CargarTabla();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busquedaActionPerformed
             String[] titulos = { "Id_alumno","Primer nombre","Segundo nombre","Apellido paterno","Apellido materno","Sexo","Carrera","Año de entrada","Año de salida"};
      String[] registro = new String[9];
   
     modelo = new DefaultTableModel(null, titulos);
      
     Conexion2 mysql=new Conexion2();
    Connection cn= mysql.Conectar();
     try{
    PreparedStatement consulta = cn.prepareStatement("SELECT * FROM Alumnos WHERE Pri_ap = ?");
    consulta.setString(1,txt_busqueda.getText());
    ResultSet res=consulta.executeQuery();
    if(res.next() )
    {
    
   registro[0] = res.getString("Id_alumno");
   registro[1] = res.getString("Pri_nom");
   registro[2] = res.getString("Seg_nom");
   registro[3] = res.getString("Pri_ap");
   registro[4] = res.getString("Seg_ap");
   registro[5] = res.getString("Sexo");
   registro[6] = res.getString("Carrera");
   registro[7] = res.getString("A_entrada");
   registro[8] = res.getString("A_salida");

                
                
                modelo.addRow(registro);
            
            tabla1.setModel(modelo);   
      }
    else{
        JOptionPane.showMessageDialog(null,"¡Alumno no encontrado!","Error",JOptionPane.ERROR_MESSAGE);             

    }
     }
catch(SQLException e){
 } 
    }//GEN-LAST:event_btn_busquedaActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        Conexion2 mysql=new Conexion2();
        Connection cn= mysql.Conectar();
             try{  
        PreparedStatement eliminar = cn.prepareStatement("DELETE FROM Alumnos WHERE Id_alumno = ?");
        eliminar.setString(1,txt_eliminar.getText());
        eliminar.execute();
        eliminar.close();
        JOptionPane.showMessageDialog(null, "El registro ha sido eliminado");
        CargarTabla();
             }
        catch(SQLException e){
             System.out.println(e);
             }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
      Conexion2 mysql=new Conexion2();
      Connection cn= mysql.Conectar();
      try {
            modificarimagen();
            PreparedStatement pst = cn.prepareStatement("UPDATE alumnos SET pri_nom='"+txt_primer_nombre.getText()+"',seg_nom='"+txt_segundo_nombre.getText()+"',pri_ap='"+txt_primer_apellido.getText()+"',seg_ap='"+txt_segundo_apellido.getText()+"',sexo='"+cbo_sexo.getSelectedItem().toString()+"',carrera='"+cbo_carrera.getSelectedItem().toString()+"',a_entrada='"+txt_anio_entrada.getText()+"',a_salida='"+txt_anio_salida.getText()+"'WHERE id_alumno='"+txt_cargar.getText()+"'");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"¡El registro se ha modificado correctamente!");
            CargarTabla();
             
                   
      }
        catch (SQLException | FileNotFoundException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
        }
     
    }//GEN-LAST:event_btn_modificarActionPerformed

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

    private void btn_menu_rarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_rarActionPerformed
       this.dispose();
       Administración_bases v=new Administración_bases();
       v.setVisible(true);
    }//GEN-LAST:event_btn_menu_rarActionPerformed

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
    Conexion2 mysql=new Conexion2();
    Connection cn= mysql.Conectar();
    String cod = txt_cargar.getText();
    Image dtCat = c.getfoto(cod);
    Image i = dtCat.getScaledInstance(189,179, Image.SCALE_AREA_AVERAGING);
    Icon icon = new ImageIcon(i);
    lblFoto.setIcon(icon);
     try{
    PreparedStatement Busqueda = cn.prepareStatement("SELECT * FROM Alumnos WHERE Id_alumno = ?");
    Busqueda.setString(1,txt_cargar.getText());
    ResultSet B=Busqueda.executeQuery();
    if(B.next() )
        
    {
   
    txt_primer_nombre.setText(B.getString(3).toString());
    txt_segundo_nombre.setText(B.getString(4).toString());
    txt_primer_apellido.setText(B.getString(5).toString());   
    txt_segundo_apellido.setText(B.getString(6).toString());
    cbo_sexo.setSelectedItem(B.getString(7).toString());
    cbo_carrera.setSelectedItem(B.getString(8).toString());
    txt_anio_entrada.setText(B.getString(9).toString());
    txt_anio_salida.setText(B.getString(10).toString());
    
    }
       }catch(SQLException e){
             System.out.println(e);
      }
    }//GEN-LAST:event_btn_cargarActionPerformed

    private void txt_primer_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_primer_nombreKeyTyped
    char tecla;
    tecla=evt.getKeyChar();
    if(!Character.isLetter(tecla)&&tecla!=KeyEvent.VK_SPACE&&tecla!=KeyEvent.VK_BACK_SPACE)
    {
        evt.consume();
        getToolkit().beep();
        JOptionPane.showMessageDialog(null, "Solo se pueden ingresar letras");
    }
    }//GEN-LAST:event_txt_primer_nombreKeyTyped

    private void txt_anio_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_anio_entradaActionPerformed
     
    }//GEN-LAST:event_txt_anio_entradaActionPerformed

    private void txt_segundo_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_segundo_nombreKeyTyped
    char tecla;
    tecla=evt.getKeyChar();
    if(!Character.isLetter(tecla)&&tecla!=KeyEvent.VK_SPACE&&tecla!=KeyEvent.VK_BACK_SPACE)
    {
        evt.consume();
        getToolkit().beep();
        JOptionPane.showMessageDialog(null, "Solo se pueden ingresar letras");
    }  
    }//GEN-LAST:event_txt_segundo_nombreKeyTyped

    private void txt_primer_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_primer_apellidoKeyTyped
    char tecla;
    tecla=evt.getKeyChar();
    if(!Character.isLetter(tecla)&&tecla!=KeyEvent.VK_SPACE&&tecla!=KeyEvent.VK_BACK_SPACE)
    {
        evt.consume();
        getToolkit().beep();
        JOptionPane.showMessageDialog(null, "Solo se pueden ingresar letras");
    }   
    }//GEN-LAST:event_txt_primer_apellidoKeyTyped

    private void txt_segundo_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_segundo_apellidoKeyTyped
    char tecla;
    tecla=evt.getKeyChar();
    if(!Character.isLetter(tecla)&&tecla!=KeyEvent.VK_SPACE&&tecla!=KeyEvent.VK_BACK_SPACE)
    {
        evt.consume();
        getToolkit().beep();
        JOptionPane.showMessageDialog(null, "Solo se pueden ingresar letras");
    }   
    }//GEN-LAST:event_txt_segundo_apellidoKeyTyped

    private void txt_anio_entradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_anio_entradaKeyTyped
    char tecla;
    tecla=evt.getKeyChar();
    if(!Character.isDigit(tecla)&&tecla!=KeyEvent.VK_SPACE&&tecla!=KeyEvent.VK_BACK_SPACE)
    {
        evt.consume();
        getToolkit().beep();
        JOptionPane.showMessageDialog(null, "Solo se pueden ingresar números");
    }   
    }//GEN-LAST:event_txt_anio_entradaKeyTyped

    private void txt_anio_salidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_anio_salidaKeyTyped
    char tecla;
    tecla=evt.getKeyChar();
    if(!Character.isDigit(tecla)&&tecla!=KeyEvent.VK_SPACE&&tecla!=KeyEvent.VK_BACK_SPACE)
    {
        evt.consume();
        getToolkit().beep();
        JOptionPane.showMessageDialog(null, "Solo se pueden ingresar números");
    }    
    }//GEN-LAST:event_txt_anio_salidaKeyTyped

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registros().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_busqueda;
    private javax.swing.JButton btn_cargar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JMenuItem btn_menu_galeria;
    private javax.swing.JMenuItem btn_menu_menu;
    private javax.swing.JMenuItem btn_menu_rar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_seleccionar_imagen;
    private javax.swing.JComboBox cbo_carrera;
    private javax.swing.JComboBox cbo_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txt_anio_entrada;
    private javax.swing.JTextField txt_anio_salida;
    private javax.swing.JTextField txt_busqueda;
    private javax.swing.JTextField txt_cargar;
    private javax.swing.JTextField txt_eliminar;
    private javax.swing.JTextField txt_primer_apellido;
    private javax.swing.JTextField txt_primer_nombre;
    private javax.swing.JTextField txt_segundo_apellido;
    private javax.swing.JTextField txt_segundo_nombre;
    // End of variables declaration//GEN-END:variables
}
