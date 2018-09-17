/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httprequest;

import interfaz.TodosLosUsuarios;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paco Miranda
 */
public class Conexion {
    
    private String url;
    
    public Conexion(){
        url="http://192.168.0.2:8080/";
    }
    
    public HttpURLConnection obtenerConexion(String recurso){
        url+=recurso;
        HttpURLConnection con= null;
        try{
            URL obj = new URL(url);
            con = (HttpURLConnection) obj.openConnection();
        }catch(ConnectException ex){
            Logger.getLogger(TodosLosUsuarios.class.getName()).log(Level.SEVERE, null, ex);            
        } catch (MalformedURLException ex) {
            Logger.getLogger(TodosLosUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TodosLosUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;        
    }
    
}
