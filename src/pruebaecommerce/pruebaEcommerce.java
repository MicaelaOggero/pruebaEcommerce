/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaecommerce;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Usuario
 */
public class pruebaEcommerce {

    public static void main(String[] args) throws JSONException {
        ArrayList<UsuarioPrueba> user = new ArrayList<>();
        JSONParser parser = new JSONParser();

        try {

            Object json = parser.parse(new FileReader("ejemplo1.json"));
            String cadena=String.valueOf(json);
            System.out.println(cadena);
            JSONArray arregloJson = new JSONArray(cadena);

            for (int indice = 0; indice < arregloJson.length(); indice++) {
                JSONObject posibleUsuario = arregloJson.getJSONObject(indice);

                int id = posibleUsuario.getInt("id");
                String nombre = posibleUsuario.getString("nombre");
                String apellido=posibleUsuario.getString("apellido");
                boolean acepta=posibleUsuario.getBoolean("aceptaNovedades");
                String email=posibleUsuario.getString("email");
                
                if(acepta){
                    
                    UsuarioPrueba u= new UsuarioPrueba(id,email,acepta,nombre,apellido);
                    user.add(u);
                    
                }
                
            }
            
            for(int i=0;i<user.size();i++){
                System.out.println(user.get(i).toString());
            }
            

        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } catch (ParseException e) {
        }
    }
}
