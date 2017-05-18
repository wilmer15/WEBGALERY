/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgalery;

/**
 *
 * @author Estudiante
 */
public abstract class  Persona {
    protected String Nombre;
    protected String apellido;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public Persona(String Nom, String ape){
        this.Nombre = Nom;
        this.apellido= ape;
    }
    
}

