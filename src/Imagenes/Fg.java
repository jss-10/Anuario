package Imagenes;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.Graphics;

public class Fg extends javax.swing.JPanel
{

public Fg() 
{
    this.setSize(870,680);
    
}
    
    @Override
    public void paintComponent(Graphics g)
    {
      Dimension tam = getSize();
      ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("f5.jpg")).getImage());
      g.drawImage(imagen.getImage(), 0, 0,tam.width,tam.height,null);
      setOpaque(false);
      super.paintComponent(g);
    }
}
