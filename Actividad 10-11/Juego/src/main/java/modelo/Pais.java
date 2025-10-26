/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author CI5
 */
import java.io.Serializable;

public class Pais implements Serializable {
    private String nombre;
    private String pista;
    private String codigo;

    public Pais(String nombre, String pista) {
        this.nombre = nombre;
        this.pista = pista;
        this.codigo = pista; // Asignar el código al campo pista
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    // Método para obtener la primera letra del nombre
    public char getPrimeraLetra() {
        if (nombre != null && !nombre.isEmpty()) {
            // Convierte el nombre a mayúsculas para la pista
            return nombre.toUpperCase().charAt(0);
        }
        return ' ';
    }

    public void mostrarCodigo() {
        System.out.println("Código del país: " + (codigo != null ? codigo : ""));
    }

    

    @Override
    public String toString() {
        return nombre;
    }
}
