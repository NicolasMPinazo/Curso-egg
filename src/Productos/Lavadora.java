/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Materiales.Electrodomesticos;
import Materiales.Metodos;

/**
 *
 * @author Admin
 */
public class Lavadora extends Electrodomesticos {

    protected Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer precio, String color, String consumoelec, Integer peso, Integer carga) {
        super(precio, color, consumoelec, peso);
        this.carga = carga;

    }

    public Lavadora crearLavadora() {

        System.out.println("Bienvenido a Garbarino, Usted esta comprando un Lavarropas, Porfavor siga las intrucciones a continuacion: ");
        super.crearElectrodomestico();
        System.out.println("Ingrese la cantidad de carga de Lavarropas que soporta su lavarropas! ");
        carga = leer.nextInt();

        precioFinal();
        return new Lavadora();

    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if (carga >= 30) {
            precio = precio + 500;
        }

    }

    @Override
    public String toString() {
        return "Lavadora{" + "precio=" + precio + ", color=" + color + ", consumoelec=" + consumoelec + ", peso=" + peso + ", carga=" + carga + '}';
    }

}
