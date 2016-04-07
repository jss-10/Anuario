package Conexiones_mysql;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion0 
{
  public String url="jdbc:mysql://localhost/";
  public String user="root";
  public String pass="1234";

  public Connection Conectar()
{
   Connection link=null;
   try
   {
      //Cargamos el driver my sql
       Class.forName("org.gjt.mm.mysql.Driver");
      //Creamos un enlace hacia la Base de Datos
       link=DriverManager.getConnection(this.url,this.user,this.pass);
   }
   catch(ClassNotFoundException | SQLException e)
   {
       JOptionPane.showMessageDialog(null,e);
   }
   return link;
}
}