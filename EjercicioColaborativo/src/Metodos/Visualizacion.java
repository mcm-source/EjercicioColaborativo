/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Clases.Alumno;

/**
 *
 * @author marti
 */
public class Visualizacion {

    public static void visualizacionCabeceraDatosAlumno() {

        System.out.printf("%n--Alumno--" + "%n%n   "
                + " Alumno    DNI     Modulo   Modulo 1   Nota    Modulo 1   Nota"
                + "%n____________________________________________________");

    }

    public static void visualizacionObjetoAlumno(Alumno alumno) {

        System.out.printf("%n%-10s %-10s %-10s %-10s %-10.2f %-10s %-10.2f", alumno.getNombre(), alumno.getDni(),
                alumno.getCodigo(), alumno.getNombreModulo1(), alumno.getNotaModulo1(),
                alumno.getNombreModulo2(), alumno.getNotaModulo2());

    }

}
