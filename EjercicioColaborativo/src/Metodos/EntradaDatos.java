/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import NodoALumno.NodoAlumno;
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

    public static NodoAlumno pedirDatosAlumno() {

        String DNI;
        String nombreAlumno;
        String Modulo;
        int nota;

        do {
            DNI = pedirDatosString("Introduzca DNI del Alumno");
        } while (!validarDNI(DNI));
        nombreAlumno = pedirDatosString("Introduzca el nombre del alumno");

        do {
            Modulo = pedirDatosString("Introduzca el código del modulo del alumno");
        } while (!validarModulo(Modulo));
        nota = Integer.parseInt(pedirDatosString("Introduzca la nota del alumno"));

        return new NodoAlumno(Modulo, nombreAlumno, DNI);

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
