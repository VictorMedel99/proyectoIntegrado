/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiebernate;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Luis Alberto
 */
public class DAOEmpleados {

    public void guardar(Empleados emp, JTextField cmpId, JTextField cmpNombre, JTextField cmpApellidos, JTextField cmpDireccion, JTextField cmpTelefono) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        emp.setId(cmpId.getText().trim());
        emp.setNombre(cmpNombre.getText().trim());
        emp.setApellidos(cmpApellidos.getText().trim());
        emp.setDireccion(cmpDireccion.getText().trim());
        emp.setTelefono(cmpTelefono.getText().trim());

        session.save(emp);
        transaction.commit();

        session.close();
    }

    public void borrar(Empleados emp, JTextField cmpId, JTextField cmpNombre, JTextField cmpApellidos, JTextField cmpDireccion, JTextField cmpTelefono) {

        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        emp.setId(JOptionPane.showInputDialog(null, "Ingrese el Id del empleado a borrar"));
        session.delete(emp);
        transaction.commit();

        session.close();
    }

    public void actualizar(Empleados emp, JTextField cmpId, JTextField cmpNombre, JTextField cmpApellidos, JTextField cmpDireccion, JTextField cmpTelefono) {
        if (cmpNombre.getText().trim() == "" && cmpApellidos.getText().trim() == "" && cmpDireccion.getText().trim() == "" && cmpTelefono.getText().trim() == "") {
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        } else {
            Session session = HibernateUtils.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            emp.setId(cmpId.getText().trim());
            emp.setNombre(cmpNombre.getText().trim());
            emp.setApellidos(cmpApellidos.getText().trim());
            emp.setDireccion(cmpDireccion.getText().trim());
            emp.setTelefono(cmpTelefono.getText().trim());

            session.update(emp);
            transaction.commit();

            session.close();
        }
    }


   
    public DefaultTableModel MostrarUno(Empleados emp, DefaultTableModel modelo) {

        modelo.setRowCount(0);
        Session session = HibernateUtils.getSessionFactory().openSession();
        Empleados empleado = (Empleados) session.createQuery("SELECT em FROM Empleados em WHERE id = '" + emp.getId() + "'").uniqueResult();
        modelo.addRow(new Object[]{empleado.getId(), empleado.getNombre(), empleado.getApellidos(), empleado.getDireccion(), empleado.getTelefono()});
        return modelo;
    }

    public DefaultTableModel MostrarTodos(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        Session session = HibernateUtils.getSessionFactory().openSession();
        Query query = session.createQuery("SELECT em FROM Empleados em");
        List<Empleados> empleados = query.list();

        for (Empleados empleado : empleados) {
            modelo.addRow(new Object[]{empleado.getId(), empleado.getNombre(), empleado.getApellidos(), empleado.getDireccion(), empleado.getTelefono()});
        }

        return modelo;
    }

}
