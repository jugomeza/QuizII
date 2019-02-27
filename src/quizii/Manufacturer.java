/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizii;

import java.util.TreeMap;

/**
 *
 * @author INTEL
 */
public class Manufacturer extends Identidad {
    protected Identidad asociado2;
    TreeMap<String, Producto> listaMf1 = new TreeMap<>();
    TreeMap<String, Producto> listaMf2 = new TreeMap<>();

    public Manufacturer(String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
    }
    protected Producto productof1;
    protected Producto productof2;

    public void proceso(Farmer f1, Farmer f2, double precio, String fechaSalida, String clave) {
        productof1 = new Producto(f1.producto.getNombre(), f1.producto.getPrecio(), f1.producto.getFechaSalida(),"no aplica",clave);
        productof2 = new Producto(f2.producto.getNombre(), f2.producto.getPrecio(), f2.producto.getFechaSalida(), "no aplica",clave);
        producto = new Producto("Pan", precio, "no aplica", fechaSalida, clave);
        asociado = f1;
        asociado2 = f2;
        listaP.put(clave, producto);
        listaMf1.putIfAbsent(clave, productof1);
        listaMf2.putIfAbsent(clave, productof2);
        
    }
    @Override
    public String toString(String clave) {
        return listaP.get(clave) + ", Nombre: " + nombre + ", Direccion: " + direccion + ", Telefono: " + telefono+ "\n " +listaMf1.get(clave)+" " +asociado.toString() +"\n"+listaMf2.get(clave)+" " +asociado2.toString();
    }
}
    
  
