package LPC;

import Clases.Alumno;

public class NodoAlumno extends Alumno{

    private NodoAlumno siguiente;
    public NodoAlumno(String codigo, String nombreModulo1, float notaModulo1, String nombreModulo2, float notaModulo2, String nombreAlumno, String dni, String numeroTelefono) {
        super(codigo, nombreModulo1, notaModulo1, nombreModulo2, notaModulo2, nombreAlumno, dni, numeroTelefono);
    }

    public NodoAlumno getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAlumno siguiente) {
        this.siguiente = siguiente;
    }
}
