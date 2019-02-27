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
public abstract class Identidad {

    protected Producto producto;
    protected String nombre;
    protected String direccion;
    protected int telefono;
    TreeMap<String, Identidad> listaI = new TreeMap<>();
    TreeMap<String, Producto> listaP = new TreeMap<>();

    public Identidad(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Producto getProducto(String clave) {
        return listaP.get(clave);
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String toString(String clave) {
        return listaP.get(clave) + ", nombre identidad: " + nombre + ", Direccion: " + direccion + ", Telefono: " + telefono+ "\n " + listaI.get(clave).toString(clave);
    }

    

}
                                                      