/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materiales;

/**
 *
 * @author Admin
 */
public class Metodos {
   
    public static int generadordenum (int minimo , int max){
        int num = (int) Math.floor(Math.random() * (max - minimo + 1) + (minimo));
        return num;
    
}
}

