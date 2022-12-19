
package Productos;

import Materiales.Electrodomesticos;
import java.util.Scanner;


public class Televisor extends Electrodomesticos{
    
    protected Double resolucion;
    protected Boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer precio, String color, String consumoelec, Integer peso, Double resolucion, Boolean sintonizador) {
        super(precio, color, consumoelec, peso);
        this.resolucion=resolucion;
        this.sintonizador=sintonizador;
        
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public String getConsumoelec() {
        return consumoelec;
    }

    public void setConsumoelec(String consumoelec) {
        this.consumoelec = consumoelec;
    }

    
    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    public Televisor crearTelevisor(){
        
        
        System.out.println("Bienvenido a Garbarino, Usted esta comprando un Televisor, Porfavor siga las intrucciones a continuacion: ");
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion de su televisor, recuerde que si supera las 40 pulgadas, el valor incremetara un 30%");
        resolucion=leer.nextDouble();
        System.out.println("Quiere el sintonizador TDT includio en le televisor, esto tiene un recargo de 500$ al valor final");
        sintonizador=leer.nextBoolean();
        
        preciofinal();
        
        return new Televisor();
    }
    
   public void preciofinal(){
       super.precioFinal();
       
       if(resolucion>40){
           int aux=30*precio/100;
           precio=aux+precio;
                      
       }if(sintonizador==true){
           precio=precio+500;
           
       }
       
  
}

    @Override
    public String toString() {
        return "Televisor{" + "Precio=" + precio + ", Color=" + color + ", Consumo=" + consumoelec + ", Peso=" + peso + ", Resolucion=" + resolucion + ", Sintonizador=" + sintonizador + '}';
    }
    
    
    
    
    
    
    
    
}
