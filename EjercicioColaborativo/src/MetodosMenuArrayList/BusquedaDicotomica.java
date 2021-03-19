package MetodosMenuArrayList;

import Clases.Alumno;
import Metodos.EntradaDatos;
import static Metodos.Visualizacion.visualizacionCabeceraDatosAlumno;
import static Metodos.Visualizacion.visualizacionObjetoAlumno;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author marti
 */
public class BusquedaDicotomica {

    public static void buscarAlumno(ArrayList<Alumno> listadoAlumnos) throws IOException {

        ArrayList<Alumno> alumnosParaBusqueda = Ordenacion.ordenacionAscendente(listadoAlumnos);
        int posicionInicial = 0;
        int posicionMedia = 0;
        int posicionFinal = alumnosParaBusqueda.size() - 1;
        String nombreAlumnoBusqueda = EntradaDatos.pedirDatosString("Introduzca el nombre del Alumno que desea buscar");

        while (posicionInicial < posicionFinal) {
            posicionMedia = (int) (posicionInicial + posicionFinal) / 2;
            if (nombreAlumnoBusqueda.compareToIgnoreCase(alumnosParaBusqueda.get(posicionMedia).getNombre()) == 0) {
                posicionInicial = posicionMedia;
                posicionFinal = posicionMedia;
            } else if (nombreAlumnoBusqueda.compareToIgnoreCase(alumnosParaBusqueda.get(posicionMedia).getNombre()) > 0) {
                posicionInicial = posicionMedia + 1;
            } else if (nombreAlumnoBusqueda.compareToIgnoreCase(alumnosParaBusqueda.get(posicionMedia).getNombre()) < 0) {
                posicionFinal = posicionMedia - 1;
            }

        }
        if (nombreAlumnoBusqueda.compareToIgnoreCase(alumnosParaBusqueda.get(posicionInicial).getNombre()) == 0) {
            visualizacionCabeceraDatosAlumno();
            visualizacionObjetoAlumno(alumnosParaBusqueda.get(posicionInicial));
        } else {
            System.out.println("\n\nEl elemento no se encuentra en la busqueda");
        }

    }

}
