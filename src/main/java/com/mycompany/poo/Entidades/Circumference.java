/* 
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:

a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).  
 */
package com.mycompany.poo.Entidades;

import java.util.Scanner;

public class Circumference {

    Scanner scanner = new Scanner(System.in);

    private Double radio;

    public Circumference() {
    }

    public Circumference(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double createCircumference() {

        System.out.println("Radio: ");
        setRadio(scanner.nextDouble());

        return getRadio();

    }

    public Double Area() {

        Double PI = Math.PI;
        return PI * (getRadio() * 2);

    }
    
    public Double perimetro(){
        Double PI = Math.PI;
        return 2*PI*getRadio();
        
        
    }

}
