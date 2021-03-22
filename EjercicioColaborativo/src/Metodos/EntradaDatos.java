/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Clases.Alumno;
import static Validaciones.ValidacionesDNI.validarDNI;
import static Validaciones.ValidacionesModulos.validarModulo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class EntradaDatos {

    public static Alumno pedirDatosAlumno() {

        String DNI;
        String nombreAlumno;
        String codigo;
        String numeroTelefono;
        String nombreModulo1;
        float notaModulo1;
        String nombreModulo2;
        float notaModulo2;
        do {
            DNI = pedirDatosString("Introduzca DNI del Alumno");
        } while (!validarDNI(DNI));
        nombreAlumno = pedirDatosString("Introduzca el nombre del alumno");

        do {
            codigo = pedirDatosString("Introduzca el código  del alumno");
        } while (!validarModulo(codigo));
        numeroTelefono = pedirDatosString("Introduzca el numero de telefono");
        nombreModulo1 = pedirDatosString("Introduzca el nombre del modulo 1");
        notaModulo1 = Integer.parseInt(pedirDatosString("Introduzca la nota del modulo 1"));
        nombreModulo2 = pedirDatosString("Introduzca el nombre del modulo 2");
        notaModulo2 = Integer.parseInt(pedirDatosString("Introduzca la nota del modulo 2"));

        return new Alumno(codigo, nombreModulo1, notaModulo1, nombreModulo2, notaModulo2, nombreAlumno, DNI, numeroTelefono);

    }

    public static String pedirDNI() {
        String DNI;
        do {
            DNI = pedirDatosString("Introduzca DNI del Alumno");
        } while (!validarDNI(DNI));
        return DNI;

    }

    public static String pedirDatosString2(String textoInformativo) {

        Scanner leer = new Scanner(System.in);
        System.out.println(textoInformativo);
        return leer.nextLine();

    }

    public static String pedirDatosString(String textoInformativo) {

        try {
            System.out.println(textoInformativo);
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            return leer.readLine();
        } catch (IOException e) {
            System.out.println("El dato introducido no es válido");
            return null;
        }

    }



}
