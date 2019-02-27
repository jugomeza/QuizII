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
public class Manufacturer extends Identidad {

    public Manufacturer(String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
    }
    protected Producto productof1;
    protected Producto productof2;

    public void proceso(Farmer f1, Farmer f2, double precio, String fechaSalida, String clave) {
        productof1 = new Producto(f1.producto.getNombre(), f1.producto.getPrecio(), f1.producto.getFechaSalida(),"no aplica",f1.producto.getClave());
        productof2 = new Producto(f2.producto.getNombre(), f2.producto.getPrecio(), f2.producto.getFechaSalida(), "no aplica",f2.producto.getClave());
        producto = new Producto("Pan", precio, f1.producto.getFechaSalida(), fechaSalida, clave);
        listaP.put(producto.getClave(), producto);
    }
    
}
