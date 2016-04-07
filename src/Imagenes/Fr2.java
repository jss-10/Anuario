package Imagenes;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.Graphics;

public class Fr2 extends javax.swing.JPanel
{
    public Fr2() 
{
    this.setSize(700,500);
    
}
    
    @Override
    public void paintComponent(Graphics g)
    {
      Dimension tam = getSize();
      ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("f4.jpg")).getImage());
      g.drawImage(imagen.getImage(), 0, 0,tam.width,tam.height,null);
      setOpaque(false);
      super.paintComponent(g);
    }
}
