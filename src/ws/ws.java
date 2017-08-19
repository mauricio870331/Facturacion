/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import Model.UsuariosApp;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import us.monoid.json.JSONException;
import us.monoid.json.JSONObject;

/**
 *
 * @author clopez
 */
public class ws {

    public static String[] obtener(String OPC, String user, String pass, String valor) throws JSONException {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        String m = null;
        String[] json = null;
        HttpGet getRequest = null;
        try {
            // specify the host, protocol, and port
            HttpHost target = new HttpHost("localhost", 80, "http");
            // specify the get request

            switch (OPC) {
                case "SP":
                    getRequest = procedure("listarUsuarioApp");
                    break;

                case "LOGIN":
                    getRequest = new HttpGet("/SampleWS/ws.php?tabla=&id_usuario=" + user + "&password=" + pass + "");
                    break;

                case "CIUDADES":
                    getRequest = new HttpGet("/SampleWS/ws.php?tabla=ciudades&campo=" + user + "&consulta=" + pass + "&valor= " + valor);
                    break;

            }
            System.out.println("executing request to " + target);//http://localhost/dashboard/

            HttpResponse httpResponse = httpclient.execute(target, getRequest);
            HttpEntity entity = httpResponse.getEntity();

            System.out.println(httpResponse.getStatusLine());
            Header[] headers = httpResponse.getAllHeaders();
            for (Header header : headers) {
                System.out.println(header);
            }

            if (entity != null) {
                m = EntityUtils.toString(entity);

                json = m.replace("[", "").replace("]", "").replace("},{", "}space{").split("space");
            }
        } catch (IOException | ParseException e) {
            System.out.println("error " + e);
        } finally {
            // When HttpClient instance is no longer needed,
            // shut down the connection manager to ensure
            // immediate deallocation of all system resources
            httpclient.getConnectionManager().shutdown();
        }
        return json;
    }

    public static void update() throws UnsupportedEncodingException {
        /* Create object of CloseableHttpClient */
        DefaultHttpClient httpclient = new DefaultHttpClient();
//     
        try {
            HttpHost target = new HttpHost("192.168.10.200", 9990, "http");
            /* Prepare put request */
            HttpPut httpPut = new HttpPut("/SampleWS/peoples/5");
            /* Add headers to get request */
//        httpPut.addHeader("Authorization", "value");

            /* Prepare StringEntity from JSON */
            StringEntity jsonData = new StringEntity("{\"name\":\"Vick ******\"}", "UTF-8");
            /* Body of request */
            httpPut.setEntity(jsonData);
            // specify the host, protocol, and port               // specify the get request

            System.out.println("executing request to " + target);

            HttpResponse httpResponse = httpclient.execute(target, httpPut);
            HttpEntity entity = httpResponse.getEntity();

            System.out.println("----------------------------------------");
            System.out.println(httpResponse.getStatusLine());
            Header[] headers = httpResponse.getAllHeaders();
            for (Header header : headers) {
                System.out.println(header);
            }
            System.out.println("----------------------------------------");

            if (entity != null) {
                System.out.println(EntityUtils.toString(entity));
            }

        } catch (IOException | ParseException e) {
            System.out.println("error " + e);
        } finally {
            // When HttpClient instance is no longer needed,
            // shut down the connection manager to ensure
            // immediate deallocation of all system resources
            httpclient.getConnectionManager().shutdown();
        }
    }

    public static String[] create(Object obj, String SP) throws UnsupportedEncodingException {
        System.out.println("mas datos" + SP);
        StringEntity jsonData = null;
        String m = null;
        String[] json = null;
        /* Create object of CloseableHttpClient */
        DefaultHttpClient httpclient = new DefaultHttpClient();
//     
        try {
            HttpHost target = new HttpHost("localhost", 80, "http");
            /* Prepare put request */

            HttpPost httpPost = new HttpPost("/SampleWS/ws.php?tabla=SP&SP=" + SP);

            /* Add headers to get request */
//        httpPut.addHeader("Authorization", "value");
            switch (SP) {
                case "insertarUsuarioApp":
                    jsonData = new StringEntity("{\"id_usuario\":\"" + ((UsuariosApp) obj).getIdUsuario() + "\","
                            + "\"id_tipo_identificacion\":\"" + ((UsuariosApp) obj).getTipoIdentiicacion().getIdTipoIdentificacion() + "\","
                            + "\"id_empresa\":\"" + ((UsuariosApp) obj).getVendedor().getIdEmpresa() + "\","
                            + "\"id_rol\":\"" + ((UsuariosApp) obj).getRol().getIdRol() + "\","
                            + "\"password\":\"" + ((UsuariosApp) obj).getPassword() + "\","
                            + "\"nombres\":\"" + ((UsuariosApp) obj).getNombres() + "\","
                            + "\"apellidos\":\"" + ((UsuariosApp) obj).getApellidos() + "\","
                            + "\"estado_usuario\":\"" + ((UsuariosApp) obj).getEstadoUsuario().getIdEstadoUsuario() + "\","
                            + "\"transacion\":\"" + ((UsuariosApp) obj).getTransacion() + "\"}", "UTF-8");

//                    jsonData = new StringEntity("{\"id_usuario\":\\" + ((UsuariosApp) obj).getIdUsuario()+ "\","
//                            + "\"id_tipo_identificacion\":\\" + ((UsuariosApp) obj).getTipoIdentiicacion().getIdTipoIdentificacion() + "\","
//                            + "\"id_empresa\":\\" + ((UsuariosApp) obj).getVendedor().getIdEmpresa() + "\", "
//                            + "\"id_rol\":\\" + ((UsuariosApp) obj).getRol().getIdRol() + "\","
//                            + "\"password\":\\" + ((UsuariosApp) obj).getPassword() + "\","
//                            + "\"nombres\":\\" + ((UsuariosApp) obj).getNombres() + "\","
//                            + "\"apellidos\":\\" + ((UsuariosApp) obj).getApellidos() + "\","
//                            + "\"estado_usuario\":\\" + ((UsuariosApp) obj).getEstadoUsuario().getIdEstadoUsuario() + "\","
//                            + "\"transicion\":\\" + ((UsuariosApp) obj).getTransacion() + "\","
//                            + "" + "}", "UTF-8");
                    break;
            }
            System.out.println(" datos " + jsonData);


            /* Prepare StringEntity from JSON */
 /* Body of request */
            httpPost.setEntity(jsonData);
            // specify the host, protocol, and port               // specify the get request

            HttpResponse httpResponse = httpclient.execute(target, httpPost);
            HttpEntity entity = httpResponse.getEntity();
            Header[] headers = httpResponse.getAllHeaders();
            for (Header header : headers) {
                System.out.println(header);
            }
            if (entity != null) {
                m = EntityUtils.toString(entity);
                json = m.replace("[", "").replace("]", "").replace("},{", "}space{").split("space");
            }

        } catch (IOException | ParseException e) {
            System.out.println("error " + e);
        } finally {
            // When HttpClient instance is no longer needed,
            // shut down the connection manager to ensure
            // immediate deallocation of all system resources
            httpclient.getConnectionManager().shutdown();
        }
        return json;
    }

    private static HttpGet procedure(String SP) {
        HttpGet getRequest = null;
        switch (SP) {
            case "listarUsuarioApp":
                getRequest = new HttpGet("/SampleWS/ws.php?tabla=SP&SP=listarUsuarioApp");
                break;
        }
        return getRequest;
    }
}
