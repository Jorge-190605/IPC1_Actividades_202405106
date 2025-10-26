package logica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CI5
 */
import modelo.Pais;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class logica_juego {
    private ArrayList<Pais> paises = new ArrayList<>();
    private static final String CSV_FILE_PATH = "C:\\Users\\CI5\\Documents\\IPC1_Actividades_202405106\\Actividad 10-11\\Juego\\src\\main\\resources\\data.csv";

    public logica_juego() {
        this.paises = new ArrayList<>();
        cargarPaisesDesdeCSV();
    }

    private void cargarPaisesDesdeCSV() {
        
        File f = new File(CSV_FILE_PATH); 
        
        if (f.exists() && f.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                System.out.println("Cargando países desde la ruta definida: " + CSV_FILE_PATH);
                String linea;

                // Saltar la línea de encabezado ("Name,Code")
                br.readLine(); 
                
                while ((linea = br.readLine()) != null) {
                    
                    // Lógica para manejar el formato CSV con campos entre comillas
                    String[] datos;
                    if (linea.startsWith("\"")) {
                        int finCita = linea.indexOf("\",");
                        if (finCita != -1) {
                            String nombre = linea.substring(1, finCita);
                            String codigoConComa = linea.substring(finCita + 2);
                            datos = new String[]{nombre, codigoConComa};
                        } else {
                            datos = linea.split(","); // Fallback si el formato es inusual
                        }
                    } else {
                        datos = linea.split(",");
                    }

                    // Asume el formato: Nombre, Código
                    if (datos.length >= 2) {
                        String nombre = datos[0].trim();
                        String pista = datos[1].trim(); 
                        
                        if (!nombre.isEmpty()) {
                            paises.add(new Pais(nombre, pista));
                        }
                    }
                }
                System.out.println("Países cargados: " + paises.size());
            } catch (IOException ex) {
                System.err.println(" Error leyendo el archivo en la ruta definida: " + ex.getMessage());
                System.err.println("Asegúrese de que el archivo no esté abierto y que la ruta sea correcta.");
            }
        } else {
            System.err.println(" ERROR: No se encontró el archivo en la ruta ABSOLUTA definida:");
            System.err.println(CSV_FILE_PATH);
            System.err.println("Verifique que la ruta sea correcta y que el archivo se llame 'data.csv'.");
        }
    }

    // Método principal para iniciar el juego
public void iniciar() {
    if (paises.isEmpty()) {
        System.out.println("No hay países para jugar. Saliendo...");
        return;
    }

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("\n--- ¡Adivina el País! ---");
    System.out.println("Escribe el nombre del país y presiona Enter. Escribe 'salir' para terminar.");

    while (true) {
        int indiceAleatorio = random.nextInt(paises.size());
        Pais paisElegido = paises.get(indiceAleatorio);
        
        String respuestaEvaluada; // Variable para almacenar la última respuesta válida.

        // PRIMERA PREGUNTA Y PISTA
        System.out.println("\nPISTA 1: El país que elegí empieza con la letra: " + paisElegido.getPrimeraLetra());
        System.out.print("Tu respuesta (o 'salir'): ");
        String adivinanzaInicial = scanner.nextLine().trim();

        // Manejar comando de salir antes de la lógica principal
        if (adivinanzaInicial.equalsIgnoreCase("salir")) {
            System.out.println("Saliendo del juego. ¡Hasta luego!");
            break;
        }
        
        // Asumimos que la respuesta a evaluar es la inicial, a menos que pida pista.
        respuestaEvaluada = adivinanzaInicial; 

        // SEGUNDA PISTA (CICLO)
        System.out.print("¿Quieres una segunda pista? (s/n): ");  
        String respuestaPista = scanner.nextLine().trim();
        
        // Verifica si quiere la segunda pista
        if (respuestaPista.equalsIgnoreCase("s")) {
            System.out.print("PISTA 2: El código del país es: ");
            paisElegido.mostrarCodigo(); // Usa el método de tu clase Pais
            
            System.out.print("Tu nueva adivinanza (o código): ");
            String nuevaAdivinanza = scanner.nextLine().trim();
            respuestaEvaluada = nuevaAdivinanza;
        } 
        
    
        // VERIFICAR RESPUESTA FINAL
        // Permite adivinar por Nombre (getNombre) o por Código (getCodigo)
        if (respuestaEvaluada.equalsIgnoreCase(paisElegido.getNombre()) || 
            respuestaEvaluada.equalsIgnoreCase(paisElegido.getCodigo())) { 
            
            System.out.println("\n ¡CORRECTO! Adivinaste el país: " + paisElegido.getNombre() + " (Código: " + paisElegido.getCodigo() + ").");
        } else {
            System.out.println("\n INCORRECTO. El país que elegí era: " + paisElegido.getNombre() + " (Código: " + paisElegido.getCodigo() + ").");
        }

        // CICLO DE CONTINUACIÓN
        System.out.println("\nPresiona Enter para otra ronda o escribe 'salir' para terminar.");
        String linea = scanner.nextLine().trim();
        
        if (linea.equalsIgnoreCase("salir")) {
            System.out.println("Saliendo del juego. ¡Hasta luego!");
            break;
        }
    }

    scanner.close();
}
}