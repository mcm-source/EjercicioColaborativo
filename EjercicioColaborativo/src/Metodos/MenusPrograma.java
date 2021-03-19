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

    public static byte menu() throws IOException {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n******** Menu programa ***********");
        System.out.println("1.Insertar alumnos en pila ");
        System.out.println("2.Borrado de un alumno.");
        System.out.println("3.Visualiar la pila completa de alumnos");
        System.out.println("4.Modificacion de la nota de un alumno.");
        System.out.println("5.Listar los alumnos con nota mayor de 6.");
        System.out.println("6.Salir.");
        System.out.println("\nIntroduce la opcion deseada:");
        byte opcionMenu = Byte.parseByte(leer.readLine());
        return opcionMenu;

    }

    public static boolean pedirValidacion(String textoAMostrar)  {

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
