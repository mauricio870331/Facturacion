/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
//import Model.*;
//import Controllers.*;

import Controllers.LoginController;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import java.io.IOException;
import java.util.Properties;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Mauricio
 */
public class Start {

//    private static CheckList ch = null;
//    private static Conexion cn = null;
    private static Login lg = null;

    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            Properties props = new Properties();
            props.put("logoString", "PymesApp");
            AcrylLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println("error  " + e);
        }
        lg = GetLogin.getLogin();
        lg.setLocationRelativeTo(null);
        lg.setVisible(true);
        LoginController loginController = new LoginController();

    }

}
