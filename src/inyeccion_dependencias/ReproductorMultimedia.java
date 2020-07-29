package inyeccion_dependencias;
/**
 *
 * @author flor
 */
public class ReproductorMultimedia {
    public void play(IMedia medio){
        medio.beginplay();
    }
    
    public void stop(IMedia medio){
        medio.stopplay();
    }
}
