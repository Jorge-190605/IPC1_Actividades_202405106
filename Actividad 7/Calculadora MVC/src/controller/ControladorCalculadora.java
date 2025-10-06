/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.usuario;
import model.Operaciones;
import view.Calculadora;
import javax.swing.JOptionPane;

public class ControladorCalculadora {
    private usuario modeloUsuario;
    private Operaciones modeloOperaciones;
    private Calculadora vistaCalculadora;
    private ControladorUsuarios controladorAnterior; 

    public ControladorCalculadora(usuario modeloUsuario, ControladorUsuarios controladorUsuarios) {
        this.modeloUsuario = modeloUsuario;
        this.controladorAnterior = controladorUsuarios;
        this.modeloOperaciones = new Operaciones();
        this.vistaCalculadora = new Calculadora();
        iniciarEventos();
    }

    public void mostrarCalculadora() {
        vistaCalculadora.getVerNombre().setText(modeloUsuario.getNombre());
        vistaCalculadora.setVisible(true);
        vistaCalculadora.setLocationRelativeTo(null);
    }

    private void iniciarEventos() {
        vistaCalculadora.getCalcSuma().addActionListener(e -> calcularSuma());
        vistaCalculadora.getCalcResta().addActionListener(e -> calcularResta());
        vistaCalculadora.getCalcMultiplicacion().addActionListener(e -> calcularMultiplicacion());
        vistaCalculadora.getCalcDivision().addActionListener(e -> calcularDivision());
        vistaCalculadora.getCalcPotencia().addActionListener(e -> calcularPotencia());
        vistaCalculadora.getCalcRaiz().addActionListener(e -> calcularRaiz());
        vistaCalculadora.getSalir().addActionListener(e -> System.exit(0));
     vistaCalculadora.getAtras().addActionListener(e -> volverAtras()); 
    }

    private double obtenerNumeroA() throws NumberFormatException {
        return Double.parseDouble(vistaCalculadora.getNumA().getText());
    }

    private double obtenerNumeroB() throws NumberFormatException {
        return Double.parseDouble(vistaCalculadora.getNumB().getText());
    }

    private void calcularSuma() {
        try {
            double resultado = modeloOperaciones.sumar(obtenerNumeroA(), obtenerNumeroB());
            vistaCalculadora.getVerResultado().setText(String.valueOf(resultado));
        } catch (Exception e) {
            mostrarError("Ingrese números válidos.");
        }
    }

    private void calcularResta() {
        try {
            double resultado = modeloOperaciones.restar(obtenerNumeroA(), obtenerNumeroB());
            vistaCalculadora.getVerResultado().setText(String.valueOf(resultado));
        } catch (Exception e) {
            mostrarError("Ingrese números válidos.");
        }
    }

    private void calcularMultiplicacion() {
        try {
            double resultado = modeloOperaciones.multiplicar(obtenerNumeroA(), obtenerNumeroB());
            vistaCalculadora.getVerResultado().setText(String.valueOf(resultado));
        } catch (Exception e) {
            mostrarError("Ingrese números válidos.");
        }
    }

    private void calcularDivision() {
        try {
            double resultado = modeloOperaciones.dividir(obtenerNumeroA(), obtenerNumeroB());
            vistaCalculadora.getVerResultado().setText(String.valueOf(resultado));
        } catch (ArithmeticException e) {
            mostrarError(e.getMessage());
        } catch (Exception e) {
            mostrarError("Ingrese números válidos.");
        }
    }

    private void calcularPotencia() {
        try {
            double resultado = modeloOperaciones.potencia(obtenerNumeroA(), obtenerNumeroB());
            vistaCalculadora.getVerResultado().setText(String.valueOf(resultado));
        } catch (Exception e) {
            mostrarError("Ingrese números válidos.");
        }
    }

    private void calcularRaiz() {
        try {
            double resultado = modeloOperaciones.raiz(obtenerNumeroA());
            vistaCalculadora.getVerResultado().setText(String.valueOf(resultado));
        } catch (ArithmeticException e) {
            mostrarError(e.getMessage());
        } catch (Exception e) {
            mostrarError("Ingrese un número válido.");
        }
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(vistaCalculadora, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void volverAtras() {
        // 1. Oculta la ventana actual (Calculadora)
        vistaCalculadora.setVisible(false);
        
        // 2. Llama al método público del controlador anterior para que muestre la vista de Login
        controladorAnterior.mostrarUsuarios();
    }
}