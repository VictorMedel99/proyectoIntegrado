package proyectointegrado.dao;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victor
 */
public interface IDAOGeneral<T> {

    public boolean guardar(T pojo);

    public boolean borrar(T pojo);

    public boolean actualizar(T pojo);
    
    public DefaultTableModel MostrarUno(T pojo, DefaultTableModel modelo);
    
   public DefaultTableModel MostrarTodos(T pojo, DefaultTableModel modelo);
}
