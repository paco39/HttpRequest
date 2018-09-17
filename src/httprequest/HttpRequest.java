/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httprequest;

import interfaz.TodosLosUsuarios;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONObject;
import pojos.Usuario;

/**
 *
 * @author Paco Miranda
 */
public class HttpRequest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TodosLosUsuarios usuariosV = new TodosLosUsuarios();
        usuariosV.setVisible(true);
        
        /*try{
            String url = "http://192.168.0.2:8080/api/usuarios";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            
            int responseCode = con.getResponseCode();
            System.out.println("Enviando solicitud GET a la url: " + url);
            System.out.println(" Response Code: " + responseCode);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }
            in.close();
            
            //System.out.println(response.toString());
            
            JSONObject myResponse = new JSONObject(response.toString());
        
            
            System.out.println(myResponse.length());
            
            ArrayList<Usuario> usuarios = new ArrayList<>();
            for (int i = 0; i<myResponse.length(); i++){
                JSONObject elementoJSON = new JSONObject(myResponse.getJSONObject(String.valueOf(i)).toString());                
                Usuario usuario = new Usuario();
                usuario.setId(elementoJSON.getInt("id"));
                usuario.setEmail(elementoJSON.getString("email"));
                usuario.setPassword(elementoJSON.getString("password"));
                usuario.setNombre(elementoJSON.getString("nombre"));
                usuario.setApellidos(elementoJSON.getString("apellidos"));
                
                usuarios.add(usuario);
            }
            
            
            
        }catch(Exception e){
            
        }*/
        
    }
    
}
