/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaecommerce;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class UsuarioPrueba {
    
    private int id;
    private String email;
    private boolean aceptaNovedades;
    private String nombre;
    private String apellido;
    public ArrayList<UsuarioPrueba> listaUsuarios=new ArrayList<UsuarioPrueba>();
    
    public UsuarioPrueba() {
    }

    public UsuarioPrueba(int id, String email, boolean aceptaNovedades, String nombre, String apellido) {
        this.id = id;
        this.email = email;
        this.aceptaNovedades = aceptaNovedades;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getAceptaNovedades() {
        return aceptaNovedades;
    }

    public void setAceptaNovedades(boolean aceptaNovedades) {
        this.aceptaNovedades = aceptaNovedades;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", email=" + email + ", aceptaNovedades=" + aceptaNovedades + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    
   
}
