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
public  class Berserker extends Soldado {
    
    
    private int identificador;
    private String apodo;
    private String nombre;
    private float puntajeFuerza;
    private Arma[] armas;
    
    
  
    public  Berserker(){
    
    
    }
    
    public Berserker(int identificador,String apodo,String nombre, float puntajeFuerza)
    {
     this.identificador = identificador;
     this.apodo =apodo;
     this.nombre = nombre;
     this.puntajeFuerza = puntajeFuerza;
     this.armas = new Arma[5];
     llenadoDeArmas();
        
        
    
    }
    
    
    
    
    
    
    @Override
    public float atacar(){
        float m;
        float sumaTotalArmasAtaque=0.0f;
        for (int i = 0; i < armas.length; i++) {
            sumaTotalArmasAtaque = sumaTotalArmasAtaque + this.armas[i].getPuntajeAtaque();
        }
        m = this.puntajeFuerza*sumaTotalArmasAtaque;
        
        
    return m;    
    }
    
    
    public void llenadoDeArmas(){
    Arma arm1 = new Arma(10,"Lanza",200.30f, 5f);
    armas[0] = arm1;
    Arma arm2 = new Arma(11,"Stone",100.50f, 0f);
    armas[1] = arm2;
    Arma arm3 = new Arma(12,"Sword",20.50f, 100f);
    armas[2] = arm3;
    Arma arm4 = new Arma(13,"Arco",1000.0f, 40.50f);
    armas[3] = arm4;
    Arma arm5 = new Arma(14,"Ballestas",9999.80f, -100f);
    armas[4] = arm5;
   
    
    }
    
    
    
    

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPuntajeFuerza() {
        return puntajeFuerza;
    }

    public void setPuntajeFuerza(float puntajeFuerza) {
        this.puntajeFuerza = puntajeFuerza;
    }

    public Arma[] getArmas() {
        return armas;
    }

    public void setArmas(Arma[] armas) {
        this.armas = armas;
    }
    
}
