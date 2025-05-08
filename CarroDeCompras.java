/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Zuriel Ali Sampé Sánchez,Jesus Emmanuel Sánchez Bustamante y Jose Alberto Esteva Cabrera 
 */
public class CarroDeCompras {
    private List<Producto> productos;

    public CarroDeCompras() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void mostrarProductos() {
        System.out.println("Productos en el carrito:");
        for (Producto p : productos) {
            System.out.println(" - " + p);
        }
    }
}
