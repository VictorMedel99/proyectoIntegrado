package observer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.awt.windows.ThemeReader;
/**
 *
 * @author victorm
 */
public class ClienteSocket extends Observable implements Runnable{
    private boolean isStoped = false;
    private Socket cliente=null;
    private BufferedReader receptor = null;
    private PrintWriter emisor=null;
    
    public ClienteSocket(Socket cliente){
        
        try {
            this.cliente = cliente;
            InputStreamReader isr;
            isr = new InputStreamReader(cliente.getInputStream());
            receptor = new BufferedReader(isr);
            emisor = new PrintWriter(cliente.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void escribir(String mensaje){ 
        emisor.write("Mensaje: "+mensaje+"\n");
        emisor.flush();
    }
    
    public synchronized void stoped(){
        isStoped = true;
    }
    
    @Override
    public void run() {
        while(!isStoped){
            try {
                setChanged();
                notifyObservers("Cliente activo");
                Thread.sleep(60000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
