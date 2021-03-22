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
public class InicializarArrayList {

    public  static  ArrayList<Alumno> inicializarValoresListadoAlumno(ArrayList<Alumno> listadoAlumno) {

        if (listadoAlumno!=null) {
             listadoAlumno.clear();
        }
       
        return listadoAlumno;

    }

}
