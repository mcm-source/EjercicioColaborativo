package LPC;

import static Metodos.MenusPrograma.pedirValidacion;

public class ListaOrdenada {

    public static NodoAlumno insertarEnListaOrdenada(NodoAlumno p, NodoAlumno nodoInsertar) {

        NodoAlumno q;
        NodoAlumno actual = p;
        NodoAlumno anterior = p;

        if (p == null) {
            p = nodoInsertar;
        } else {
            while (actual != null && nodoInsertar.getNombre().compareToIgnoreCase(actual.getNombre()) > 0) {
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
    public static NodoAlumno borrarNodo(NodoAlumno p, String nombreAlumnoBorrar) {

        NodoAlumno q;
        NodoAlumno actual = p;
        NodoAlumno anterior = p;

        if (p == null) {
            System.out.println("La lista se encuentra vacia");
        } else {
            while (actual != null && !nombreAlumnoBorrar.equals(actual.getNombre())) {
                anterior = actual;
                actual = actual.getSiguiente();
            }
            if (actual == null) {
                System.out.println("El elemento no se encuentra en la lista");
            } else {
                if (pedirValidacion("Desea eliminar al alumno " + actual.getNombre())) {

                    if (anterior != actual) {
                        anterior.setSiguiente(actual.getSiguiente());
                    } else {
                        p = p.getSiguiente();
                    }
                    System.out.println("Alumno eliminado ");
                } else {
                    System.out.println("Alumno no eliminado");
                }

            }

        }
        return p;

    }
    
}
