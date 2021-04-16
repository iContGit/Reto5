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
public interface ListaSoldados {  

    
    
    public abstract void  agregarBerserker(Berserker o);
    public abstract void eliminarBerserker(int i ) throws Batallon.ExcepcionFueraDelArregloBatallon, Batallon.ExcepcionBerserkerNoExistente;
    public abstract Berserker obtenerBerserker( int i) throws Batallon.ExcepcionFueraDelArregloBatallon,Batallon.ExcepcionBerserkerNoExistente;
}
