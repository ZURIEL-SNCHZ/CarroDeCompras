/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
/**
 *
 * @author Zuriel Ali Sampé Sánchez,Jesus Emmanuel Sánchez Bustamante y Jose Alberto Esteva Cabrera
 */
    public class Pedido {
    private Usuario usuario;
    private CarroDeCompras carro;
    private Cupon cupon;

    public Pedido(Usuario usuario, CarroDeCompras carro) {
        this.usuario = usuario;
        this.carro = carro;
    }

    public void aplicarCupon(Cupon cupon) {
        this.cupon = cupon;
    }

    public void mostrarResumen() {
        System.out.println("===== RESUMEN DEL PEDIDO =====");
        System.out.println(usuario);
        carro.mostrarProductos();

        double total = carro.calcularTotal();
        System.out.println("Subtotal: $" + total);

        if (cupon != null) {
            total = cupon.aplicarDescuento(total);
            System.out.println(cupon);
        }

        System.out.println("Total a pagar: $" + total);
        System.out.println("==============================");
    }
}

