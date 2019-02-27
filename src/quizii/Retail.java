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
public class Retail extends Identidad {

    public Retail(String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
    }

    public void proceso(DistributionCenter d, double precio, String clave) {
        listaI.put(clave, d);
        producto = new Producto(d.getProducto(clave).getNombre(), precio, d.getProducto(clave).getFechaEntrada(), d.getProducto(clave).getFechaSalida(), clave);

        listaP.put(clave, producto);

    }
}
