/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosMenuArrayList;

import Clases.Alumno;
import Metodos.EntradaDatos;
import static Metodos.EntradaDatos.pedirDatosAlumno;
import static Metodos.MenusPrograma.pedirValidacion;
import java.util.ArrayList;

/**
 *
 * @author marti
 */
public class InsertarAlumnos {

    
    public static ArrayList<Alumno> insertarAlumno(ArrayList<Alumno> listadoAlumnos) {

        do{
          listadoAlumnos.add(pedirDatosAlumno());
  
        }while(pedirValidacion("¿ Desea introducir un nuevo alumno ?"));
      
        return listadoAlumnos;
    }

}
