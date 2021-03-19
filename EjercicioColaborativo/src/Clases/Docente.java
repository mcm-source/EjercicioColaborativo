package Clases;

public class Docente extends Persona{

    private String materia;

    public Docente(String nombre, String dni, String numeroTelefono) {
        super(nombre, dni, numeroTelefono);
    }

    public Docente(String nombre, String dni, String numeroTelefono, String materia) {
        super(nombre, dni, numeroTelefono);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}
