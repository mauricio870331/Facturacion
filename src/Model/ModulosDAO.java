/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Innova
 */
public class ModulosDAO {

    Connection cn = Conexion.getConexion();
    PreparedStatement pstm;
    CallableStatement clstm;
    String sql;
    ResultSet rs;

    //Listar 
    public List<Modulos> getModulosList() throws SQLException {
        List<Modulos> list = new ArrayList<>();        
        try {
            sql = "{call listarModulo()}";
            clstm = cn.prepareCall(sql);
            rs = clstm.executeQuery();
            while (rs.next()) {
                Modulos m = new Modulos(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                list.add(m);
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return list;
    }

    //Crear y editar
    public boolean crearModulo(int id_modulo, String nombre, String descripcion, String transacion, String opc) throws SQLException {
        System.out.println("" + id_modulo + " " + nombre + " " + descripcion + " " + transacion + " " + opc);
        boolean creado = false;       
        try {
            cn.setAutoCommit(false);
            if (opc.equals("create")) {

                sql = "{call insertarModulo(?,?,?)}";
            } else {
                sql = "{call actualizarModulo(?,?,?,?)}";
            }
            clstm = cn.prepareCall(sql);
            if (opc.equals("update")) {
                clstm.setInt(1, id_modulo);
                clstm.setString(2, nombre);
                clstm.setString(3, descripcion);
                clstm.setString(4, transacion);
            } else {
                clstm.setString(1, nombre);
                clstm.setString(2, descripcion);
                clstm.setString(3, transacion);
            }

            rs = clstm.executeQuery();
            String result = "";
            while (rs.next()) {
                result = rs.getString(1);
            }
            System.out.println("result = " + result);//pendiente mostrar en joptionpane

            creado = true;
            cn.commit();
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return creado;
    }

    //Eliminar 
    public boolean eliminarModulo(int id_modulo) throws SQLException {
        boolean creado = false;        
        try {
            cn.setAutoCommit(false);
            sql = "{call eliminarModulo(?)}";
            clstm = cn.prepareCall(sql);
            clstm.setInt(1, id_modulo);
            ResultSet rs = clstm.executeQuery();
            String result = "";
            if (rs.next()) {
                result = rs.getString(1);
            }
            System.out.println("result = " + result);//pendiente mostrar en joptionpane

            creado = true;
            cn.commit();
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return creado;
    }

}
