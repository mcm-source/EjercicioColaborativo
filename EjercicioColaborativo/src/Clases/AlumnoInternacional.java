package Clases;


/**@author CECA*/
public class AlumnoInternacional extends Alumno{

    private String pais;

    public AlumnoInternacional(String codigo, String nombreModulo1, float notaModulo1, String nombreModulo2, float notaModulo2, String nombre, String dni, String numeroTelefono, String pais) {
        super(codigo, nombreModulo1, notaModulo1, nombreModulo2, notaModulo2, nombre, dni, numeroTelefono);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
