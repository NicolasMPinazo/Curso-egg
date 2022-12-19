
package A_Gabarino;

import Materiales.Electrodomesticos;
import Productos.Lavadora;
import Productos.Televisor;
import java.util.ArrayList;

public class Garbarino {

    public static void main(String[] args) {
        
        ArrayList<Electrodomesticos> electrodomesticos= new ArrayList();
        
        Lavadora l1 = new Lavadora (1000, "Blanco", "A", 30, 25);
        Lavadora l2 = new Lavadora (1000, "Azul", "A", 30, 25);
        Televisor t1 = new Televisor (0, "Azul", "B", 30, 42.0, true);
        Televisor t2 = new Televisor (1000, "Rojo", "C", 21, 32.0, true);
        
        electrodomesticos.add(l1);
        electrodomesticos.add(l2);
        electrodomesticos.add(t1);
        electrodomesticos.add(t2);
        
        
        for (Electrodomesticos aux : electrodomesticos) {
            
           
            System.out.println(electrodomesticos.size());
 
        }
        
//        System.out.println("Descripcion de Producto Adquirido: " + t2.toString());
//        System.out.println("Descripcion de Producto Adquirido: " + t1.toString());
//        System.out.println("Descripcion de Producto Adquirido: " + l1.toString()); 
//        System.out.println("Descripcion de Producto Adquirido: " + l2.toString());
        
        
        
        
        
        
        
        
        
        
        
        /* EJERCICIO TERMINADO
        Lavadora e1 = new Lavadora();       
        Televisor t1 = new Televisor();
        e1.crearLavadora();
        t1.crearTelevisor();
        System.out.println("Descripcion de Producto Adquirido: " + e1.toString());
        System.out.println("Descripcion de Producto Adquirido: " + t1.toString());
        */
        
        
    }
    
}
