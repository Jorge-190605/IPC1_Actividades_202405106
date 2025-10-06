/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad7;

import controller.ControladorUsuarios;
import view.Usuarios;

public class Actividad7 {
    public static void main(String[] args) {
        Usuarios vistaUsuarios = new Usuarios();
        new ControladorUsuarios(vistaUsuarios);
        vistaUsuarios.setVisible(true);
    }
}
