package Clases_auxiliares;
import Conexiones_mysql.Conexion2;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
public class Convertir_I {
    
 private Image data;
        public Convertir_I (){
    
   
  } 
      
 public Image getfoto(String id_foto){         
   Conexion2 mysql=new Conexion2(); /*Aqui llamamos a la clase ConexionMySQL*/
    Connection cn=mysql.Conectar();
     try{    
         PreparedStatement pstm = cn.prepareStatement("SELECT " +
            " imagen " +
            " FROM Alumnos " +
            " where Id_Alumno = ? ");
         pstm.setString(1, id_foto);
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            //se lee la cadena de bytes de la base de datos
            byte[] b = res.getBytes("imagen");
            // esta cadena de bytes sera convertida en una imagen
            data = ConvertirImagen(b);            
            i++;
         }
         res.close();
          } catch (IOException ex) {
            Logger.getLogger(Convertir_I.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException e){
         System.out.println(e);
    }        
    return data;     
 }
 
 //metodo que dada una cadena de bytes la convierte en una imagen con extension jpeg
 private Image ConvertirImagen(byte[] bytes) throws IOException {
    ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
    Iterator readers = ImageIO.getImageReadersByFormatName("jpeg");
    ImageReader reader = (ImageReader) readers.next();
    Object source = bis; // File or InputStream
    ImageInputStream iis = ImageIO.createImageInputStream(source);
    reader.setInput(iis, true);
    ImageReadParam param = reader.getDefaultReadParam();
    return reader.read(0, param);
 } 
}

