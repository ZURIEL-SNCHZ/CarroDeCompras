/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
/**
 *
 * @author Zuriel Ali Sampé Sánchez,Jesus Emmanuel Sánchez Bustamante y Jose Alberto Esteva Cabrera 
 */
public class Cupon {
    private String codigo;
    private double descuento; // Ejemplo: 0.15 = 15%

    public Cupon(String codigo, double descuento) {
        this.codigo = codigo;
        this.descuento = descuento;
    }

    public double aplicarDescuento(double total) {
        return total * (1 - descuento);
    }

    @Override
    public String toString() {
        return "Cupón aplicado: " + codigo + " - Descuento: " + (descuento * 100) + "%";
    }
}
