package com.tiendagmjjc.model;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int imagenResource;

    public Producto(String nombre, String descripcion, double precio, int imagenResource) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagenResource = imagenResource;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getImagenResource() {
        return imagenResource;
    }
}