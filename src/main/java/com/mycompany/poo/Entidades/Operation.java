/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:

a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package com.mycompany.poo.Entidades;

import java.util.Scanner;

public class Operation {

    Scanner scanner = new Scanner(System.in);
    private Integer number1;
    private Integer number2;

    public Operation() {
    }

    public Operation(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public Operation createOperation() {

        Operation operation = new Operation();

        System.out.println("Number One: ");
        setNumber1(scanner.nextInt());
        System.out.println("Number Two: ");
        setNumber2(scanner.nextInt());

        return operation;

    }

    public Integer sumar() {
        
        Integer sumar =getNumber1() + getNumber2();
        System.out.println("Suma: " +sumar);

        return sumar;  

    }

    public Integer restar() {
        
        Integer restar = getNumber1() - getNumber2();
        System.out.println("Resta: " +restar);

        return restar;
        

    }

    public Integer multiplicar() {

        if (getNumber1() == 0 && getNumber2() == 0) {
            System.out.println("Se intenta multiplicar por cero");
            return 0;
        } else {
            
        Integer multiplicar = getNumber1() * getNumber2();
        System.out.println("Multiplicacion: "+multiplicar);
        return multiplicar;
        }
    }
    
    public Integer dividir(){
         if (getNumber1() == 0 && getNumber2() == 0) {
         System.out.println("Se intenta Dividir por cero");
         return 0;
         }else{                
         Integer dividir = getNumber1() / getNumber2();
         System.out.println("Dividir: " + dividir);
         return dividir;
         }
    }

}
