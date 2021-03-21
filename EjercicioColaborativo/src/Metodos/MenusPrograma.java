/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author marti
 */
public class MenusPrograma {

     public static byte menuPrincipal() {

        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\n******** Menu principal ***********"
                    + "Selecciona como quieres gestionar al alumnado: "
                    + "\n1. Usar ArrayList"
                    + "\n2. Usar lista"
                    + "\n3. Usar cola"
                    + "\n4. Usar pila"
                    + "\n0. Salir"
                    + "\nIntroduce la opcion deseada: ");
            byte opcionMenu = Byte.parseByte(leer.readLine());
            return opcionMenu;
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
            return 0;
        }

    }
    
    
    
    public static byte menu() {

        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\n******** Menu programa ***********");
            System.out.println("1.Inicializar el listado de los alumnos ");
            System.out.println("2.Insertar alumnos en el ArrayList");
            System.out.println("3.Ordenar los alumnos por nombre");
            System.out.println("4.Busqueda de alumno por nombre");
            System.out.println("5.Visualizacion del arrayList de alumnos");
            System.out.println("0.Salir.");
            System.out.println("\nIntroduce la opcion deseada:");
            byte opcionMenu = Byte.parseByte(leer.readLine());
            return opcionMenu;
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
            return 0;
        }

    }

    public static boolean pedirValidacion(String textoAMostrar) {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                System.out.println(textoAMostrar);
                System.out.println("Si -s  No -n");
                char i = leer.readLine().charAt(0);

                switch (i) {
                    case 's':
                    case 'S':
                        return true;
                    case 'n':
                    case 'N':
                        System.out.println("false");
                        return false;
                    default:
                        System.out.println("Opcion no valida");
                        break;

                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("El valor introducido no es valido");
        }

        return false;
    }

}
