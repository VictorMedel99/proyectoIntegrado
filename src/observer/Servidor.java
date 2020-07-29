package observer;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author victorm
 */
public class Servidor extends Thread{
    private ServerSocket server = null;
    private static List<ClienteSocket> lstClientes=new ArrayList<ClienteSocket>();
    private boolean isStoped =false;
    private Observer observer;
    
    public Servidor(Observer observer) throws IOException{
        server = new ServerSocket(7000);
        this.observer = observer;
    }
    
    public static List<ClienteSocket> getlstClientes(){
        return lstClientes;
    }
    
    public synchronized void stoped(){
        isStoped = true;
    }
    
    @Override
    public void run() {
        Socket cliente = null;
        while(!isStoped){
            try {
                cliente = server.accept();
                ClienteSocket hc = new ClienteSocket(cliente);
                lstClientes.add(hc);
                hc.addObserver(observer);
                Thread hilo = new Thread(hc);
                hilo.start();
            } catch (IOException ex) {
                stoped();
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
        
        super.run(); //To change body of generated methods, choose Tools | Templates.
    }
}
