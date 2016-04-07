package Clases_auxiliares;
import java.io.IOException;

public class cmd
{
    public  void exec(String cmd) 
    { 
        try 
        { 
            Runtime.getRuntime().exec(cmd); 
        }  
        catch (IOException e) 
        { 
            System.out.println("Failed");         
        } 
    } 
}
