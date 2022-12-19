
package Materiales;

import java.util.Scanner;

public class Electrodomesticos {
    
    public Scanner leer= new Scanner (System.in);
    protected Integer precio;
    protected String color;
    protected String consumoelec;
    protected Integer peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(Integer precio, String color, String consumoelec,Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoelec = consumoelec;
        this.peso=peso;
    }

    public Integer getPrecio() {
//    if(getPeso()>=1 && getPeso()<=19){
//    precio=precio+100;
//    }else if(getPeso()>=20 && getPeso()<=49){
//    precio=precio+500;        
//    }else if(getPeso()>=50 && getPeso()<=79){
//    precio=precio+800; 
//    }else   
//    precio=precio+1000;
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

    public Integer getPeso() {
        
        return peso;
    }
    

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    

    public void setConsumoelec(String consumoelec) {
        this.consumoelec = consumoelec;
    }
    
    
    public void comprobarConsumoEnergetico(String letra){
        
    if(letra.equalsIgnoreCase("a")){
    setConsumoelec("A");    
    }else if(letra.equalsIgnoreCase("b")){
    setConsumoelec("B");        
    }else if(letra.equalsIgnoreCase("c")){
    setConsumoelec("B");
    }else if(letra.equalsIgnoreCase("d")){
    setConsumoelec("D");
    }else if(letra.equalsIgnoreCase("e")){
    setConsumoelec("E");
    }else
    setConsumoelec("F");
    //System.out.println("Elegiste un consumo que no esta en nuestra lista, por defecto te enviaremos menor consumo (F)");
   

}
    public void comprobarColor(String color){

    if(color.equalsIgnoreCase("Negro")){
    setColor("NEGRO");    
    }else if(color.equalsIgnoreCase("Rojo")){
    setColor("ROJO");        
    }else if(color.equalsIgnoreCase("Azul")){
    setColor("Azul");
    }else if(color.equalsIgnoreCase("Gris")){
    setColor("GRIS");
    }else
    setColor("BLANCO"); 
    //System.out.println("Elegiste un color que no esta en nuestra lista, por defecto te enviaremos blanco!");
    }
    
    public Electrodomesticos crearElectrodomestico(){

        setPrecio(1000);
        System.out.println("Elige el color de tu Electrodomestico, los colores disponibles son: (BLANCO-NEGRO-AZUL-GRIS-ROJO)");
        setColor(leer.next());
        comprobarColor(getColor());
        System.out.println("Elige el consumo Electrico de tu electrodomestico! (A-B-C-D-E-F)");
        System.out.println("A=1000$");
        System.out.println("B=800$");
        System.out.println("C=600$");
        System.out.println("D=500$");
        System.out.println("E=300$");
        System.out.println("F=100$");
        setConsumoelec(leer.next());        
        comprobarConsumoEnergetico(getConsumoelec());
        peso=Metodos.generadordenum(1, 80);
        System.out.println("El peso de su producto adquirido es de " +peso+ "  KG esto tiene un valor adicional dependiendo la lista de precios");
        System.out.println("Entre 1 y 19KG = 100$");
        System.out.println("Entre 20 y 49KG = 500$");
        System.out.println("Entre 50 y 79KG = 800$");
        System.out.println("Mayor a  89KG = 1000$");
        
        
        
        return new Electrodomesticos();
        
        
    }
    
    
    public void precioFinal(){
        
    if(getPeso()>=1 && getPeso()<=19){
    precio=precio+100;
    }else if(getPeso()>=20 && getPeso()<=49){
    precio=precio+500;        
    }else if(getPeso()>=50 && getPeso()<=79){
    precio=precio+800; 
    }else   
    precio=precio+1000;{   
       
        
    }if(getConsumoelec().equalsIgnoreCase("A")){
           precio=precio+1000;
    }else if(getConsumoelec().equalsIgnoreCase("B")){
        precio=precio+800;
    }else if(getConsumoelec().equalsIgnoreCase("C")){
        precio=precio+600;    
    }else if(getConsumoelec().equalsIgnoreCase("D")){
        precio=precio+500;
    }else if(getConsumoelec().equalsIgnoreCase("E")){
        precio=precio+300;    
    }else if(getConsumoelec().equalsIgnoreCase("F")){
        precio=precio+100;    
        
    }    
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumoelec=" + consumoelec + ", peso=" + peso + '}';
    }
    
    
    
    
    }



