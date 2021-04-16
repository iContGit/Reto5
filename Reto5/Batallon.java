
package Reto5;

/**
 *  @author Sebastian Gómez
 *  @author Andrés Peña
 */
public class Batallon  extends Berserker implements ListaSoldados {
    
    
    private Berserker[] arregloBatallon;

    
    
    
    public Batallon(){  
        
    this.arregloBatallon = new Berserker[5]; // Máximo  de berserker en un batallon

    }  
    
    
    @Override
    public void agregarBerserker(Berserker o) {
        
        
        for (int i = 0; i < arregloBatallon.length; i++) {
            if(arregloBatallon[i]== null ){
                arregloBatallon[i] = o;
                break;
                
            }
        }
        
               
 
    }

    @Override
    public void eliminarBerserker(int i) throws ExcepcionFueraDelArregloBatallon, ExcepcionBerserkerNoExistente   {
        try{ int j = i;
            if (j < 0 || j >=5){
            throw new ExcepcionFueraDelArregloBatallon();
            }
            if (arregloBatallon[j]==null){
            throw new ExcepcionBerserkerNoExistente();
            }
           
            
            else{
                arregloBatallon[j]=null;
                for (int k = j;  k < arregloBatallon.length-1; k++) {
                    arregloBatallon[k]= arregloBatallon[k+1];       
                    arregloBatallon[k+1] = null;

                }
            }

        }
        catch(ExcepcionFueraDelArregloBatallon e){           
            
            System.out.println("Posicion no existente");
        }
        catch(ExcepcionBerserkerNoExistente e){ // esta excepcion adicional la hicimos para que no me muestre un null
            
            System.out.println("Esta posicion no tiene Solado asignado");
        }
        
            
    }
    
    public  class  ExcepcionBerserkerNoExistente extends Exception {
        
        public ExcepcionBerserkerNoExistente(){
            super("Berserker no existente");
        }

    }
     public  class  ExcepcionFueraDelArregloBatallon extends Exception {
        
        public ExcepcionFueraDelArregloBatallon(){
            super("Este inidice está fuera del arreglo Batallon");
        }

    }   

    @Override
    public Berserker obtenerBerserker(int i) throws ExcepcionFueraDelArregloBatallon,ExcepcionBerserkerNoExistente {
        try{
            int j = i;        

            if (j < 0 || j >=5){
            throw new ExcepcionFueraDelArregloBatallon();
            
            }
            if (arregloBatallon[j]==null){
            throw new ExcepcionBerserkerNoExistente();// esta excepcion adicional la hicimos para que no me muestre un null
            }
            
            else{
                return arregloBatallon[j];
            }
            
            
        }catch(ExcepcionFueraDelArregloBatallon e){
            System.out.println("Este soldado no existe en el Batallon");
        }catch(ExcepcionBerserkerNoExistente e){           
            
            System.out.println("En esta posicion no existe un Berserker");
        }
        return null;
      
              
    }  
    
    
    public void mostrarArregloBatallon (){
        for (int i = 0; i < arregloBatallon.length; i++) {
            
            System.out.println(arregloBatallon[i]);
            
        }    
    }
    
    public void mostrarBerserkerObtenido(Berserker n){
        if (n == null) {
            
        }
        else{
        
        System.out.println(n.getIdentificador());
        System.out.println(n.getNombre());
        System.out.println(n.getPuntajeFuerza());
        System.out.println(n.getApodo());        
      
        
        }
    
    
    
    
 
    
    
    
    }
}
