/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgalery;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Datos {
    protected WebGalery datos;
    
    public Datos(){
        this.datos= new WebGalery();
    }
    protected void cargar_Datos(WebGalery e) throws FileNotFoundException{
        this.datos= e;
        File archivo= new File("Compradores.txt");
        
        PrintStream escritura= new PrintStream(archivo);
        
        for(Persona p: this.datos.getPersonas()){
            if(p instanceof Compradore){
                 Compradore c= (Compradore)p;
                 escritura.print("Compradores:" + c.getNombre() + ":" + c.getApellido() +":");
            }
            if(p instanceof Artista){
             Artista a= (Artista)p;
             escritura.print("Artista:" + a.getNombre() + ":" + a.getApellido() + ":"  + a.getCurriculo() + ":"  + a.getDistinciones() + ":");
             
            }
        
    }
    }
    
    protected void imprimir() throws FileNotFoundException{
        File archivo= new File("Compradores.txt");
        Scanner leer = new Scanner(archivo);
        leer.useDelimiter(":");
        String tipo;
        while(leer.hasNext()){
            tipo=leer.next();
            if(tipo.equals("Comprador")){
                 System.out.println("Comprador" + leer.next() + leer.next());
            }
           if(tipo.equals("Artista")){
                 System.out.println("Artista" + leer.next() + leer.next() + leer.next() + leer.next());
            }
        }
        
    }
}

