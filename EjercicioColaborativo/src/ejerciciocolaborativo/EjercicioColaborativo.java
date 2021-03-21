/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolaborativo;

import Clases.Alumno;
import Metodos.MenusPrograma;
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
        
        byte op=0;
        
        do{
            op=MenusPrograma.menuPrincipal();
            switch(op){
                case 1://Usar ArrayList"
                    trabajarArrayList();
                    break;
                case 2://Usar lista"
                    
                    break;
                case 3://Usar cola"
                    
                    break;
                case 4://Usar pila"
                    
                    break;
                default:
                    op = 0;
                    break;
            }
        }while (op!=0);
       

    }

    public static void trabajarArrayList(){
         ArrayList<Alumno> listadoAlumnos = null;

        byte opcion = 0;
        do {
            opcion = MenusPrograma.menu();
            switch (opcion) {
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
                case 0:
                    break;
                default:
                    opcion = 0;
                    break;

            }

        } while (opcion != 0);
    }
}
