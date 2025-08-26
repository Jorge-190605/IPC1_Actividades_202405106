/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Calculadora {
 static Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
       
        String opcion;
        
        do {
        System.out.println("----------------------------------");
        System.out.println("Bienvenido a la Calculadora");
        System.out.println("----------------------------------");
        System.out.println("Uno. Suma"); 
        System.out.println("Dos. Resta");
        System.out.println("Tres. Multiplicacion");
        System.out.println("Cuatro. Division");
        System.out.println("Cinco. Potencia");
        System.out.println("Seis. Raiz");  
        System.out.println("Siete. Salir"); 
        System.out.println("Seleccione una opcion sin espacio (Uno ~ siete)");

        opcion = sc.nextLine().trim().toLowerCase();
       

        switch(opcion){
            case "uno" -> {
                System.out.println("Escriba un numero");
                double a = sc.nextDouble();
               
                System.out.println("Escriba un numero");
                double b = sc.nextDouble();
    
               double suma = a + b;
                System.out.println("La suma de " + a + " + " + b + " = " + suma);
            sc.nextLine();
            }
            case "dos" -> {
                System.out.println("Escriba un numero");
                double a = sc.nextDouble();
               
                System.out.println("Escriba un numero");
                double b = sc.nextDouble();
    
               double resta = a - b;
                System.out.println("La resta de " + a + " - " + b + " = " + resta);
            sc.nextLine();
            }
            case "tres" -> {
                System.out.println("Escriba un numero");
                double a = sc.nextDouble();
               
                System.out.println("Escriba un numero");
                double b = sc.nextDouble();
    
               double multiplicacion = a * b;
                System.out.println("La multiplicacion de " + a + " * " + b + " = " + multiplicacion);
            sc.nextLine();
            }
            case "cuatro" -> {
                System.out.println("Escriba un numero");
                
                double a = sc.nextDouble();
                
                System.out.println("Escriba un numero");
                double b = sc.nextDouble();
                
            while (b == 0){
                System.out.println("La division es indeterminada");
                System.out.println("Escriba un numero diferente de cero");
                 b = sc.nextDouble();
                }
                double division = a / b;
                System.out.println("La division de " + a + " / " + b + " = " + division);
        sc.nextLine();
            }
            case "cinco" -> {
                System.out.println("Escriba un numero");
                double a = sc.nextDouble();
               
                System.out.println("Escriba a que numero lo quiere elevar");
                double b = sc.nextDouble();
   
                int resultado = 1;
                if (b >= 0){
                    for (int i = 1; i <=b; i++){
                        resultado *= a; // resultado = resultado*a
                    }
                    System.out.println("El resultado es: " + resultado);
                }else {
                    for(int i = 1; i<= -b; i++){
                        resultado *=a;
                    }
                    System.out.println("El resultado es: 1/" + resultado + (1/resultado));
                }
                sc.nextLine();
               
            }
            case "seis" -> {
                 System.out.println("Escriba un numero");
    double a = sc.nextDouble();
    
    while (a < 0) {
        System.out.println("Escriba un numero positivo");
        a = sc.nextDouble(); // necesita volver a leer el valor
    }

    System.out.println("Escriba el indice de la raiz");
    double b = sc.nextDouble();

    while (b <= 0) {
        System.out.println("Escriba un numero positivo mayor a cero");
        b = sc.nextDouble(); // volver a leer
    }

    double raiz = Math.pow(a, 1.0 / b);
    System.out.println("La raiz de " + a + " con indice " + b + " = " + raiz);

    sc.nextLine();
}
            case "siete" -> System.out.println("Saliendo...");
    default -> System.out.println("Escriba una opcion de uno ~ siete");
        }
    } while(!opcion.equals("siete"));

    sc.close(); 
        
    }
}
