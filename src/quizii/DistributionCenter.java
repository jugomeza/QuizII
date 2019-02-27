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
public class DistributionCenter extends Identidad {

    public DistributionCenter(String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
    }

    public void proceso(Manufacturer m, String fechaSalida, String clave) {
        producto = new Producto(m.getProducto(clave).getNombre(), m.getProducto(clave).getPrecio(), m.getProducto(clave).getFechaSalida(), fechaSalida, m.getProducto(clave).getClave());
        listaP.put(clave, producto);
        listaI.put(clave, m);
    }

}
