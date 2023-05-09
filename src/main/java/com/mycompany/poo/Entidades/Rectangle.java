/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/
package com.mycompany.poo.Entidades;

import java.util.Scanner;

public class Rectangle {

    private Integer base;
    private Integer height;
    public Scanner scanner = new Scanner(System.in);

    public Rectangle() {
    }

    public Rectangle(Integer base, Integer height) {
        this.base = base;
        this.height = height;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Rectangle crearRectangle() {

        Rectangle rectangle = new Rectangle();

        System.out.println("Base: ");
        setBase(scanner.nextInt());
        System.out.println("Height: ");
        setHeight(scanner.nextInt());

        return rectangle;
    }

    public Integer calculatesurface() {

        Integer surface = getBase() * getHeight();
        System.out.println("Surface: " + surface);
        return surface;

    }
    
    public Integer calculatePerimeter(){
        
        Integer perimeter = (getBase() + getHeight()) *2;
        
        System.out.println("Perimeter: "+perimeter);
        
        return perimeter;

    }
    
    public  void drawRectangle(){
        // Recorre las filas del rectángulo
        for (int i = 1; i <= getHeight(); i++) {
        // Recorre las columnas del rectángulo
        for (int j = 1; j <= getBase(); j++) {
        // Si está en el borde del rectángulo, imprime un asterisco
        if (i == 1 || i == getBase() || j == 1 || j == getHeight()) {   
        System.out.print("*");
        } else {
        // Si no está en el borde del rectángulo, imprime un espacio vacío    
        System.out.print(" ");
        }
        }
        // Salto de línea al final de cada fila
        System.out.println();    
        }  
    }

}
