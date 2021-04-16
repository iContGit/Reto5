/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto5;

/**
 *
 * @author Sebastian
 */
public class Arma {
    
    private int indentificador;
    private String nombre;
    private float puntajeAtaque;
    private float puntajeDefensa;
    
   
public Arma(){



}

public Arma(int identificador, String nombre, float puntajeAtaque,float puntajeDefensa){

    this.indentificador = identificador;
    this.nombre = nombre;
    this.puntajeAtaque =puntajeAtaque;
    this.puntajeDefensa =puntajeDefensa;


}

    public int getIndentificador() {
        return indentificador;
    }

    public void setIndentificador(int indentificador) {
        this.indentificador = indentificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPuntajeAtaque() {
        return puntajeAtaque;
    }

    public void setPuntajeAtaque(float puntajeAtaque) {
        this.puntajeAtaque = puntajeAtaque;
    }

    public float getPuntajeDefensa() {
        return puntajeDefensa;
    }

    public void setPuntajeDefensa(float puntajeDefensa) {
        this.puntajeDefensa = puntajeDefensa;
    }


    
    
    
}
