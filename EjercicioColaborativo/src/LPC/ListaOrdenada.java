import NodoALumno.NodoAlumno;

public class ListaOrdenada {

    public static NodoAlumno insertarEnListaOrdenada(NodoAlumno p, NodoAlumno nodoInsertar) {

        NodoAlumno q;
        NodoAlumno actual = p;
        NodoAlumno anterior = p;

        if (p == null) {
            p = nodoInsertar;
        } else {
            while (actual != null && nodoInsertar.getNombreAlumno().compareToIgnoreCase(actual.getNombreAlumno()) > 0) {
                anterior = actual;
                actual = actual.getSiguiente();
            }
            if (anterior == actual) {
                nodoInsertar.setSiguiente(p);
                p = nodoInsertar;
            } else {
                nodoInsertar.setSiguiente(actual);
                anterior.setSiguiente(nodoInsertar);
            }
        }
        return p;

    }



}
