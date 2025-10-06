/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author CI5
 */
public class Operaciones {
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) throw new ArithmeticException("No se puede dividir entre 0");
        return a / b;
    }

    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public double raiz(double a) {
        if (a < 0) throw new ArithmeticException("No se puede calcular raíz negativa");
        return Math.sqrt(a);
    }
}
