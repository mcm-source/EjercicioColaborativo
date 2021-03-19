package MetodosMenuArrayList;

import Clases.Alumno;
import java.util.ArrayList;

/**
 *
 * @author marti
 */
public class Ordenacion {

    public static ArrayList<Alumno> ordenacionAscendente(ArrayList<Alumno> listadoAlumnos) {

        Alumno aux;
        for (int i = 0; i < listadoAlumnos.size(); i++) {
            for (int j = i + 1; j < listadoAlumnos.size(); j++) {
                if (listadoAlumnos.get(i).getNombre().compareTo(listadoAlumnos.get(j).getNombre()) > 0) {
                    aux = listadoAlumnos.get(i);
                    listadoAlumnos.set(i, listadoAlumnos.get(j));
                    listadoAlumnos.set(j, aux);

                }

            }
        }
        return listadoAlumnos;
    }

}
