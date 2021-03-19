/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosMenuArrayList;

import Clases.Alumno;
import Metodos.EntradaDatos;
import static Metodos.Visualizacion.visualizacionCabeceraDatosAlumno;
import static Metodos.Visualizacion.visualizacionObjetoAlumno;
import java.util.ArrayList;

/**
 *
 * @author marti
 */
public class Visualizacion {

    public static void visualizarListadoAlumnos(ArrayList<Alumno> listadoAlumnos) {
        
        visualizacionCabeceraDatosAlumno();
        for (Alumno i : listadoAlumnos) {
            visualizacionObjetoAlumno(i);
        }

    }

}
