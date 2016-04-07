package Imagenes;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.Graphics;

public class Fvp extends javax.swing.JPanel
{
    public Fvp() {
        
        this.setSize(1500,750);
    }
    @Override
    public void paintComponent(Graphics g)
    {
      Dimension tam = getSize();
      ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("f1.jpg")).getImage());
      g.drawImage(imagen.getImage(), 0, 0,tam.width,tam.height,null);
      setOpaque(false);
      super.paintComponent(g);
    }
}