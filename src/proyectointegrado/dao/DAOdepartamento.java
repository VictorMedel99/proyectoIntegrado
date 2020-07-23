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
public class DAOdepartamento implements IDAOGeneral<Departamento> {

    private ConexionDB con = ConexionDB.getInstace();
    private String sql;
    private boolean res;

    @Override
    public boolean guardar(Departamento pojo) {
        res = false;
        sql = "insert into departamento (clave, nombre) values "
                + "('" + pojo.getClave() + "','" + pojo.getNombre() + "')";
        res = con.execute(sql);
        return res;
    }

    @Override
    public boolean borrar(Departamento pojo) {
        res = false;
        sql = "delete from departamento where(clave = '" + pojo.getClave() + "');";
        res = con.execute(sql);
        return res;
    }
 

    @Override
    public boolean actualizar(Departamento pojo) {
        res = false;
        sql = "update departamento SET nombre = '" + pojo.getNombre() + "'WHERE (clave = '" + pojo.getClave() + "');";
        res = con.execute(sql);
        return res;
    }

    @Override
    public DefaultTableModel MostrarUno(Departamento pojo, DefaultTableModel modelo) {
        modelo.setRowCount(0);
        try {
            sql = "SELECT * FROM departamento WHERE (Clave = '" + pojo.getClave() + "');";
            ResultSet datos = con.executeQuery(sql);
            while(datos.next()){
                modelo.addRow(new Object[]{datos.getString(1),datos.getString(2)});
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(DAOdepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public DefaultTableModel MostrarTodos(Departamento pojo, DefaultTableModel modelo) {
        modelo.setRowCount(0);
        try {
            sql = "SELECT * FROM departamento;";
            ResultSet datos = con.executeQuery(sql);
            while(datos.next()){
                modelo.addRow(new Object[]{datos.getString(1),datos.getString(2)});
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(DAOdepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }


}
