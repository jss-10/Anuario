package Interfaz;
import Imagenes.Fg;
import Imagenes.Auxiliar_galeria;

public class Galería extends javax.swing.JFrame {
    Auxiliar_galeria Mi_Galeria = new Auxiliar_galeria();
    private int a = 0;
    private int b = 1;
    private int c = 2;
    private int d = 3;
    
    public Galería() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(870,680);
        this.setTitle("Galería-Anuario 2.0");
        this.setResizable(false);
        lbl_A.setIcon(Mi_Galeria.getPreview(0));
        lbl_B.setIcon(Mi_Galeria.getPreview(1));
        lbl_C.setIcon(Mi_Galeria.getPreview(2));
        lbl_D.setIcon(Mi_Galeria.getPreview(3));
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btn_anterior = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();
        lbl_principal = new javax.swing.JLabel();
        lbl_A = new javax.swing.JLabel();
        lbl_B = new javax.swing.JLabel();
        lbl_C = new javax.swing.JLabel();
        lbl_D = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_menu_menu = new javax.swing.JMenuItem();
        btn_menu_registros = new javax.swing.JMenuItem();
        btn_menu_rar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visor de imágenes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i10.png"))); // NOI18N
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i11.png"))); // NOI18N
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        lbl_principal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl_principal.setPreferredSize(new java.awt.Dimension(414, 310));

        lbl_A.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl_A.setPreferredSize(new java.awt.Dimension(100, 100));
        lbl_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_AMouseClicked(evt);
            }
        });

        lbl_B.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl_B.setPreferredSize(new java.awt.Dimension(100, 100));
        lbl_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_BMouseClicked(evt);
            }
        });

        lbl_C.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl_C.setPreferredSize(new java.awt.Dimension(100, 100));
        lbl_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CMouseClicked(evt);
            }
        });

        lbl_D.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl_D.setPreferredSize(new java.awt.Dimension(100, 100));
        lbl_D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_DMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(lbl_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lbl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jMenu1.setText("Ventanas");

        btn_menu_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        btn_menu_menu.setText("Regresar al menú");
        btn_menu_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_menuActionPerformed(evt);
            }
        });
        jMenu1.add(btn_menu_menu);

        btn_menu_registros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        btn_menu_registros.setText("Ir a registros");
        btn_menu_registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_registrosActionPerformed(evt);
            }
        });
        jMenu1.add(btn_menu_registros);

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
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       Fg a=new Fg();
       panel.add( a );
       panel.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        a-=1;b-=1;c-=1;d-=1;
        lbl_A.setIcon(Mi_Galeria.getPreview(a));
        lbl_B.setIcon(Mi_Galeria.getPreview(b));
        lbl_C.setIcon(Mi_Galeria.getPreview(c));
        lbl_D.setIcon(Mi_Galeria.getPreview(d));
        
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        a+=1;b+=1;c+=1;d+=1;
        lbl_A.setIcon(Mi_Galeria.getPreview(a));
        lbl_B.setIcon(Mi_Galeria.getPreview(b));
        lbl_C.setIcon(Mi_Galeria.getPreview(c));
        lbl_D.setIcon(Mi_Galeria.getPreview(d));
        
    }//GEN-LAST:event_btn_siguienteActionPerformed

    private void lbl_AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AMouseClicked
     lbl_principal.setIcon(Mi_Galeria.getFoto(a,lbl_principal.getSize()));
    }//GEN-LAST:event_lbl_AMouseClicked

    private void lbl_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BMouseClicked
     lbl_principal.setIcon(Mi_Galeria.getFoto(b,lbl_principal.getSize()));
    }//GEN-LAST:event_lbl_BMouseClicked

    private void lbl_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CMouseClicked
     lbl_principal.setIcon(Mi_Galeria.getFoto(c,lbl_principal.getSize()));  
    }//GEN-LAST:event_lbl_CMouseClicked

    private void lbl_DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_DMouseClicked
     lbl_principal.setIcon(Mi_Galeria.getFoto(d,lbl_principal.getSize()));  
    }//GEN-LAST:event_lbl_DMouseClicked

    private void btn_menu_registrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_registrosActionPerformed
       this.dispose();
       Registros v=new Registros();
       v.setVisible(true);
    }//GEN-LAST:event_btn_menu_registrosActionPerformed

    private void btn_menu_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_menuActionPerformed
       this.dispose();
       Menú v=new Menú();
       v.setVisible(true); 
    }//GEN-LAST:event_btn_menu_menuActionPerformed

    private void btn_menu_rarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_rarActionPerformed
       this.dispose();
       Administración_bases v=new Administración_bases();
       v.setVisible(true);
    }//GEN-LAST:event_btn_menu_rarActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Galería().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anterior;
    private javax.swing.JMenuItem btn_menu_menu;
    private javax.swing.JMenuItem btn_menu_rar;
    private javax.swing.JMenuItem btn_menu_registros;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_A;
    private javax.swing.JLabel lbl_B;
    private javax.swing.JLabel lbl_C;
    private javax.swing.JLabel lbl_D;
    private javax.swing.JLabel lbl_principal;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
