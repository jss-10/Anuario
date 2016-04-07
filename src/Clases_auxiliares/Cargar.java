package Clases_auxiliares;
import javax.swing.JProgressBar;


public class Cargar extends Thread
{
    JProgressBar progreso;
    
    
    public Cargar(JProgressBar progreso)
    {
        super();
        this.progreso=progreso;
    }
    
    @Override
    
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            progreso.setValue(i);
            pausa(90);
        }
    }
     
    public void pausa(int mlseg)
    {
        try
        {
            Thread.sleep(mlseg);
        }
        catch(Exception e)
                {
                    
                }
    }

}
