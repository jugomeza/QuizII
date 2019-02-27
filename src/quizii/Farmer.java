/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates                   
 * and open the template in the editor.
 */
package quizii;



/**
 *
 * @author INTEL
 */
public class Farmer extends Identidad {
 
    public Farmer(String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
    }

    public void proceso(String nombre, double precio, String fechaSalida, String clave) {
        producto = new Producto(nombre, precio, fechaSalida, clave);
        listaP.put(clave, producto);   
    }
    
        public String toString() {
        return ", Nombre: " + nombre + ", Direccion: " + direccion + ", Telefono: " + telefono;
    }

}
