/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.UnsupportedEncodingException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import us.monoid.json.JSONException;
import us.monoid.json.JSONObject;

/**
 *
 * @author Innova
 */
public class UsuariosAppDAO {

//    Connection cn = Conexion.getConexion();
    PreparedStatement pstm;
    CallableStatement clstm;
    String sql;
    ResultSet rs;

    //Listar 
    public UsuariosApp getUsuariosApp(String usuario, String Password) throws SQLException, JSONException {
        UsuariosApp user = null;
        String[] json = ws.ws.obtener("SP", "", "", usuario + "," + Password, "existUser");

//        JSONObject obj2 = new JSONObject(json);
//        System.out.println("obj2.get(\"error\")" + obj2.get("error"));

        if (!json[0].contains("error")) {
            for (String string : json) {
                JSONObject obj = new JSONObject(string);
                user = new UsuariosApp((String) obj.get("id_usuario"),
                        Integer.parseInt((String) obj.get("id_tipo_identificacion")),
                        (String) obj.get("id_empresa"), Integer.parseInt((String) obj.get("id_rol")), (String) obj.get("password"), (String) obj.get("nombres"),
                        (String) obj.get("apellidos"), Integer.parseInt((String) obj.get("id_estado_usuario")), (String) obj.get("transacion"));
            }
        }
        return user;
    }

    //Listar 
    public List<UsuariosApp> getUsuariosAppList() throws SQLException, JSONException {
        List<UsuariosApp> list = new ArrayList<>();
        String[] json = ws.ws.obtener("SP", "", "", "", "");
        for (String string : json) {
            JSONObject obj = new JSONObject(string);
            UsuariosApp ua = new UsuariosApp((String) obj.get("id_usuario"), Integer.parseInt((String) obj.get("id_tipo_identificacion")),
                    (String) obj.get("id_empresa"), Integer.parseInt((String) obj.get("id_rol")), (String) obj.get("password"), (String) obj.get("nombres"),
                    (String) obj.get("apellidos"), Integer.parseInt((String) obj.get("id_estado_usuario")), (String) obj.get("transacion"));
            list.add(ua);
        }
        return list;
    }

    //Crear y editar 
    public String crearUsuarioApp(String id_usuario, int id_tipo_identificacion, String id_empresa, int id_rol, String password, String nombres, String apellidos, int id_estado_usuario, String transacion, String opc) throws SQLException, UnsupportedEncodingException {
        System.out.println(id_usuario + "," + id_tipo_identificacion + "," + id_empresa
                + "," + id_rol + "," + password
                + "," + nombres + "," + apellidos
                + "," + id_estado_usuario + "," + transacion
                + "," + opc
        );
        String creado = "";
        UsuariosApp ua = new UsuariosApp(id_usuario, id_tipo_identificacion, id_empresa, id_rol, password, nombres, apellidos, id_estado_usuario,
                transacion);
        String[] json = null;
        if (opc.equals("create")) {
            json = ws.ws.create(ua, "insertarUsuarioApp");
        } else {
            json = ws.ws.create(ua, "actualizarUsuarioApp");
        }
        for (String string : json) {
            System.out.println(string);
        }
        return creado;
    }

    //Eliminar 
//    public boolean eliminarUsuarioApp(String id_usuario) throws SQLException {
//        boolean creado = false;
//        try {
//            cn.setAutoCommit(false);
//            sql = "{call eliminarUsuarioApp(?)}";
//            clstm = cn.prepareCall(sql);
//            clstm.setString(1, id_usuario);
//            ResultSet rs = clstm.executeQuery();
//            String result = "";
//            if (rs.next()) {
//                result = rs.getString(1);
//            }
//            System.out.println("result = " + result);//pendiente mostrar en joptionpane
//            creado = true;
//            cn.commit();
//        } catch (Exception e) {
//            System.out.println("error " + e);
//        }
//        return creado;
////    }
}
