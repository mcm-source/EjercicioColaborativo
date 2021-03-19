/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolaborativo;

import Clases.Alumno;
import static Metodos.MenusPrograma.menu;
import MetodosMenuArrayList.BusquedaDicotomica;
import static MetodosMenuArrayList.BusquedaDicotomica.buscarAlumno;
import MetodosMenuArrayList.InicializarArrayList;
import static MetodosMenuArrayList.InicializarArrayList.inicializarValoresListadoAlumno;
import static MetodosMenuArrayList.InsertarAlumnos.insertarAlumno;
import static MetodosMenuArrayList.Ordenacion.ordenacionAscendente;
import MetodosMenuArrayList.Visualizacion;
import static MetodosMenuArrayList.Visualizacion.visualizarListadoAlumnos;
import java.util.ArrayList;

/**
 *
 * @author marti
 */
public class EjercicioColaborativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Alumno> listadoAlumnos = null;

        byte opcion = 0;
        do {
            switch (menu()) {
                case 1:
                    listadoAlumnos = inicializarValoresListadoAlumno(listadoAlumnos);
                    break;
                case 2:
                    listadoAlumnos = insertarAlumno(listadoAlumnos);
                    break;
                case 3:
                    listadoAlumnos = ordenacionAscendente(listadoAlumnos);
                    break;

                case 4:
                    buscarAlumno(listadoAlumnos);
                    break;
                case 5:
                    visualizarListadoAlumnos(listadoAlumnos);
                    break;
                case 6:

                    break;
                default:
                    opcion = 1;
                    break;

            }

        } while (opcion != 1);

    }

}
