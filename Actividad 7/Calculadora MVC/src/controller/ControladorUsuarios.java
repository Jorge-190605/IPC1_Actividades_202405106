/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.usuario;
import view.Usuarios;
import javax.swing.JOptionPane;

public class ControladorUsuarios {
    private Usuarios vistaUsuarios;
    private usuario modeloUsuario;

    public ControladorUsuarios(Usuarios vistaUsuarios) {
        this.vistaUsuarios = vistaUsuarios;
        iniciarEventos();
    }

    private void iniciarEventos() {
        vistaUsuarios.getAcceder().addActionListener(e -> acceder());
    }

    public void mostrarUsuarios() {
        vistaUsuarios.getTxtNombre().setText(""); // Limpia el campo
        vistaUsuarios.setVisible(true);
    }
    
    private void acceder() {
        String nombre = vistaUsuarios.getTxtNombre().getText().trim();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(vistaUsuarios,
                "Por favor, ingrese su nombre.",
                "Error de Login",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        modeloUsuario = new usuario(nombre);
        vistaUsuarios.setVisible(false);

        new ControladorCalculadora(modeloUsuario, this).mostrarCalculadora();
    }
}