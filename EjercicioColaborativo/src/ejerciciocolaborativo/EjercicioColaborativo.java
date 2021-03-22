/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolaborativo;

import Clases.Alumno;
import LPC.Cola;
import Metodos.MenusPrograma;
import static Metodos.MenusPrograma.menuArrayList;
import static Metodos.MenusPrograma.menuCola;
import static Metodos.MenusPrograma.menuPrincipal;
import MetodosMenuArrayList.BusquedaDicotomica;
import static MetodosMenuArrayList.BusquedaDicotomica.buscarAlumno;
import static MetodosMenuArrayList.CalculoNotaMedia.calcularNotaMediaAsignaturas;
import MetodosMenuArrayList.InicializarArrayList;
import static MetodosMenuArrayList.InicializarArrayList.inicializarValoresListadoAlumno;
import static MetodosMenuArrayList.InsertarAlumnos.insertarAlumno;
import static MetodosMenuArrayList.Ordenacion.ordenacionAscendente;
import MetodosMenuArrayList.Visualizacion;
import static MetodosMenuArrayList.Visualizacion.visualizarListadoAlumnos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marti
 */
public class EjercicioColaborativo {

    private static Cola cola = new Cola();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Alumno> listadoAlumnos = new ArrayList<Alumno>();
        byte op = 0;

        do {

            switch (menuPrincipal()) {
                case 1://Usar menuArrayList"
                    listadoAlumnos = menuArrayList(listadoAlumnos);
                    break;
                case 2://Usar lista"

                    break;
                case 3: {
                    try {
                        //Usar cola"
                        trabajarCola();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }

                case 4://Usar pila"

                    break;
                
                case 5://Informacion"
                    Informacion.Informacion();
                    break;
                    
                default:
                    op = 0;
                    break;
            }
        } while (op != 0);

    }

    public static ArrayList<Alumno> menuArrayList(ArrayList<Alumno> listadoAlumnos) {

        boolean ejecutarPrograma = true;
        do {

            switch (MenusPrograma.menuArrayList()) {
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
                    calcularNotaMediaAsignaturas(listadoAlumnos);
                    break;
                case 7:
                    System.out.println("Fin del programa");
                    ejecutarPrograma = false;
                    break;
                default:
                    System.out.println("\n\nOpcion no valida, selecciona una opcion valida");
                    break;

            }

        } while (ejecutarPrograma);
        return listadoAlumnos;
    }

    /**
     * @author Beatriz
     */
    public static void trabajarCola() throws IOException {
        byte op = 0;

        do {

            switch (menuCola()) {
                case 1://Insertar
                    cola.insertar();
                    break;
                case 2://Consultar
                    cola.consultar();
                    break;
                case 3://Borrar
                    cola.borrar();
                    break;
                default:
                    op = 0;
                    break;
            }
        } while (op != 0);
    }
}
