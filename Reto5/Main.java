
package Reto5;


public class Main {

    
    public static void main(String[] args) throws Batallon.ExcepcionFueraDelArregloBatallon, Batallon.ExcepcionBerserkerNoExistente {
    
        // MANEJO CLASE ABSTRACTA Y FUNCIONALIDAD
        
        Berserker soldado1 = new Berserker(1700001,"Neux","Renato",500.80f);
        soldado1.atacar();
        System.out.println("La Potencia de ataque del berserker de id " + soldado1.getIdentificador() + " de apodo  " + soldado1.getApodo() + " es:");
        System.out.println(soldado1.atacar());
        System.out.println("");
        
        
        
        
        // MANEJO DE EXCEPCIONES E INTERFAZ
        Berserker obj1 = new Berserker(1700002,"Ragnar","Jose",500.80f); //armas
        Berserker obj2 = new Berserker(1700003,"Lagherta","Juana",240.30f);
        Berserker obj3 = new Berserker(1700004,"Dixarc","Pedro",300.80f);
        
        Batallon batallon1 = new Batallon();
        // Creamos sólo 3 berserkers para notar el comportamiento 
        
        batallon1.agregarBerserker(obj2);//  pos 0
                                                           
        
        batallon1.agregarBerserker(obj3);//  pos 1         
        
        batallon1.agregarBerserker(obj1); // pos 2       
        
        System.out.println("LISTA ORIGINAL DE LOS BERSERKERS CREADOS (3)");
        batallon1.mostrarBerserkerObtenido(batallon1.obtenerBerserker(0));
        System.out.println("");
        batallon1.mostrarBerserkerObtenido(batallon1.obtenerBerserker(1));
        System.out.println("");
        batallon1.mostrarBerserkerObtenido(batallon1.obtenerBerserker(2));
        System.out.println("");
        
        
        System.out.println("PRUEBA DE EXCEPCIONES (arreglo batallón 5 elementos)");
        System.out.println("");
        System.out.print("Eliminar berserker pos 3: ");batallon1.eliminarBerserker(3);
        System.out.print("Eliminar berserker pos 10: ");batallon1.eliminarBerserker(10);
        System.out.print("Obtener berserker pos 4: ");batallon1.obtenerBerserker(4);
        System.out.print("Obtener berserker pos 3: ");batallon1.obtenerBerserker(10);
        System.out.println("");
        
        System.out.println("ELIMINAR BERSERKES Y  BERSERKES");
        System.out.println("");
        System.out.println("Eliminar berserker pos 0");batallon1.eliminarBerserker(0); // eliminamos el de la Pos 0
        System.out.println("El Berserker en posicion 0 es:");
        batallon1.mostrarBerserkerObtenido(batallon1.obtenerBerserker(0));
        System.out.println("El Berserker en posicion 1 es:");
        batallon1.mostrarBerserkerObtenido(batallon1.obtenerBerserker(1));
        System.out.println("El Berserker en posicion 2 es:");
        batallon1.mostrarBerserkerObtenido(batallon1.obtenerBerserker(2));
        System.out.println("El Berserker en posicion 20 es:");
        batallon1.mostrarBerserkerObtenido(batallon1.obtenerBerserker(20));
        System.out.println("");
        
        System.out.println("AGREGAR BERSERKER");
        batallon1.agregarBerserker(obj2); // Se agregó el berserker obj2(El que se habia eliminado anteriormente)
        // Se agrega al final  
        System.out.println("LISTA DEL BATALLON MODIFICADO:");
        System.out.println("");
        batallon1.mostrarBerserkerObtenido(batallon1.obtenerBerserker(0));
        System.out.println("");
        batallon1.mostrarBerserkerObtenido(batallon1.obtenerBerserker(1));
        System.out.println("");
        batallon1.mostrarBerserkerObtenido(batallon1.obtenerBerserker(2));
        System.out.println("");
        batallon1.mostrarBerserkerObtenido(batallon1.obtenerBerserker(3));
        System.out.println("");
        batallon1.mostrarBerserkerObtenido(batallon1.obtenerBerserker(4));
        
        
        

        
        
       
        
        
       
        
       
        
        
    
        
        
        
    }
    
 
    

   
        
     
}
   
