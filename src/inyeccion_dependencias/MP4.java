package inyeccion_dependencias;

/**
 *
 * @author flor
 */
public class MP4 implements IMedia {

    @Override
    public void beginplay() {
        System.out.println("Inicia Play MP4");
    }

    @Override
    public void stopplay() {
        System.out.println("Detener Play MP4");
    }
    
}
