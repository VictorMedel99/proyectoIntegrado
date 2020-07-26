package inyeccion_dependencias;

/**
 *
 * @author flor
 */
public class MP3 implements IMedia{

    @Override
    public void beginplay() {
        System.out.println("Inicia Tocar MP3");
    }

    @Override
    public void stopplay() {
        System.out.println("Detiene Tocar MP3");
    }
    
}
