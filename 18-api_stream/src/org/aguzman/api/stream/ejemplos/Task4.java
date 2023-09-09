package org.aguzman.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.List;

class Producto {
    private double precio;
    private int cantidad;

    public Producto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}

public class Task4 {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(10.0, 2));
        productos.add(new Producto(15.0, 3));
        productos.add(new Producto(20.0, 1));

        double granTotal = productos.stream()
                .mapToDouble(producto -> producto.getPrecio() * producto.getCantidad())
                .sum();

        System.out.println("El gran total es: " + granTotal);
    }
}
