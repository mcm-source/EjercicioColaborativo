/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosMenuArrayList;

import Clases.Alumno;
import java.util.ArrayList;

/**
 *
 * @author marti
 */
public class CalculoNotaMedia {

    public static void calcularNotaMediaAsignaturas(ArrayList<Alumno> listadoAlumnos) {

        float notaModulo1 = 0;
        float notaModulo2 = 0;

        for (Alumno i : listadoAlumnos) {

            notaModulo1 += i.getNotaModulo1();
            notaModulo2 += i.getNotaModulo2();
        }

        System.out.printf("Nota media modulo 1 %.2f%n", (notaModulo1 / listadoAlumnos.size()));
        System.out.printf("Nota media modulo 2 %.2f ", (notaModulo2 / listadoAlumnos.size()));

    }

}
