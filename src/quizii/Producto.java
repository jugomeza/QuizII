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
public class Producto {

    private String nombre;
    private double precio;
    private String fechaEntrada;
    private String fechaSalida;
    private String clave;

    public Producto() {
    }

    public Producto(String nombre, double precio, String fechaSalida, String clave) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaEntrada = "no aplica";
        this.fechaSalida = fechaSalida;
        this.clave = clave;
    }

    public Producto(String nombre, double precio, String fechaEntrada, String fechaSalida, String clave) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Datos Producto" + ", Nombre: " + nombre + ", Precio: " + precio + ", Fecha Entrada: " + fechaEntrada + ", fecha de Salida: " + fechaSalida + ", Clave: " + clave;
    }

}
