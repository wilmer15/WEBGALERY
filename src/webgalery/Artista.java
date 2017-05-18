/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgalery;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Artista extends Persona{
    protected String Curriculo;
    protected String Distinciones;
    protected  ArrayList<Obras> obras;

    public String getCurriculo() {
        return Curriculo;
    }

    public void setCurriculo(String Curriculo) {
        this.Curriculo = Curriculo;
    }

    public String getDistinciones() {
        return Distinciones;
    }

    public void setDistinciones(String Distinciones) {
        this.Distinciones = Distinciones;
    }

    public ArrayList<Obras> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obras> obras) {
        this.obras = obras;
    }
    
    public Artista(String Nom, String ape){
        super(Nom,ape);
    }
    
    protected void AgregarObras(Obras b){
        this.obras.add(b);
    }
    
}
