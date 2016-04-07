package Imagenes;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Auxiliar_galeria 
{
  private ArrayList<ImageIcon>fotos=new ArrayList<>();
  private ImageIcon nofoto;
  
  public Auxiliar_galeria()
  {   
      nofoto = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nofoto.jpg"));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f6.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f7.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f8.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f9.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f10.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f11.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f12.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f13.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f14.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f15.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f16.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f17.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f18.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f19.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f20.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f21.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f22.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f23.jpg")));
      fotos.add(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f24.jpg")));
      
      
  }
  
  public Icon getPreview(int num)
  {
      if(num>=0 & num<fotos.size())
      {
          Image mini=fotos.get(num).getImage().getScaledInstance(100,100,Image.SCALE_AREA_AVERAGING);
          return new ImageIcon(mini);
      }
      
      else
      {
            Image mini = nofoto.getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING);
            return new ImageIcon(mini);
      }
      
  }
  
  public Icon getFoto(int num, Dimension d){
        if( num>=0 & num<fotos.size() )
        {
            
            if(fotos.get(num).getIconWidth()>d.getWidth()){
                float v = getValor(fotos.get(num).getIconWidth(),d.width);
                return Disminuir(fotos.get(num),v);
            }else if(fotos.get(num).getIconHeight()>d.getHeight()){
                float v = getValor(fotos.get(num).getIconHeight(),d.height);
                return Disminuir(fotos.get(num),v);
            }else{
                return fotos.get(num);
            }
        }
        else
        {
            Image mini = nofoto.getImage().getScaledInstance(400, 400, Image.SCALE_AREA_AVERAGING);
            return new ImageIcon(mini);
        }
    }
  
  private ImageIcon Disminuir(ImageIcon i, float v){
        int valEscalaX =  (int) (i.getIconWidth() * v );
        int valEscalaY =  (int) (i.getIconHeight() * v );
        Image mini = i.getImage().getScaledInstance(valEscalaX, valEscalaY, Image.SCALE_AREA_AVERAGING);
        return new ImageIcon(mini);
     }
  
  private float getValor(int a, int b){                
        return Math.abs((a/new Float(b))-2f);
    }
}
