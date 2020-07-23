package proyectointegrado.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import proyectointegrado.utils.ConexionDB;



/**
 *
 * @author victor
 */
public class DAOPersona implements IDAOGeneral<Persona> {
    private ConexionDB con = ConexionDB.getInstace();
    private String sql;
    private boolean res;
    
    
    
    @Override
    public boolean guardar(Persona pojo) {
        res  = false;
        ConexionDB con = ConexionDB.getInstace();
        String sql ="insert into persona (Clave, Nombre, Direccion, Telefono) values "
                +"('"+pojo.getClave()+"','"+pojo.getNombre()+"','"+pojo.getDireccion()+"','"+
                pojo.getTelefono()+"')";  
        res = con.execute(sql);
        return res;
    }

    @Override
    public boolean borrar(Persona pojo) {
        res = false;
        sql = "delete from persona where(clave = '" + pojo.getClave() + "');";
        res = con.execute(sql);
        return res;
    }

    @Override
    public boolean actualizar(Persona pojo) {
        res = false;
        sql = "UPDATE persona SET nombre = '" + pojo.getNombre() + "', direccion = '" + pojo.getDireccion()+ "', telefono = '" + pojo.getTelefono()+ "' WHERE (Clave = '" + pojo.getClave()+ "');";
        res = con.execute(sql);
        return res;
    }

    @Override
    public DefaultTableModel MostrarUno(Persona pojo, DefaultTableModel modelo) {
        try {
            modelo.setRowCount(0);
            sql = "SELECT * FROM persona WHERE (Clave = '" + pojo.getClave() + "');";
            ResultSet datos = con.executeQuery(sql);
            while(datos.next()){
                modelo.addRow(new Object[]{datos.getString(1),datos.getString(2),datos.getString(3),datos.getString(4)});
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(DAOdepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public DefaultTableModel MostrarTodos(Persona pojo, DefaultTableModel modelo) {
         try {
             modelo.setRowCount(0);
            sql = "SELECT * FROM persona;";
            ResultSet datos = con.executeQuery(sql);
            while(datos.next()){
                modelo.addRow(new Object[]{datos.getString(1),datos.getString(2),datos.getString(3),datos.getString(4)});
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(DAOdepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
    
    
}
