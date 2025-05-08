/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
/**
 *
 * @author Zuriel Ali Sampé Sánchez,Jesus Emmanuel Sánchez Bustamante y Jose Alberto Esteva Cabrera 
 */
public class Main {
    public static void main(String[] args) {
        // Crear usuario
        Usuario usuario = new Usuario("Zuriel Ali", "sampesanchezzurielali@gmail.com");

        // Crear carrito y agregar productos
        CarroDeCompras carrito = new CarroDeCompras();
        carrito.agregarProducto(new Producto("Celular", 350.00));
        carrito.agregarProducto(new Producto("Cargador", 25.00));
        carrito.agregarProducto(new Producto("Funda", 10.00));

        // Crear cupón de descuento
        Cupon cupon = new Cupon("DESCUENTO15", 0.15);

        // Crear pedido y aplicar cupón
        Pedido pedido = new Pedido(usuario, carrito);
        pedido.aplicarCupon(cupon);

        // Mostrar resumen del pedido
        pedido.mostrarResumen();
    }
}
