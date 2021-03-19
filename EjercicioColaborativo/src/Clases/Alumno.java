/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author marti
 */
public class Alumno extends Persona {

    private String codigo;
    private String nombreModulo1;
    private float notaModulo1;
    private String nombreModulo2;
    private float notaModulo2;

    public Alumno(String codigo, String nombreModulo1, float notaModulo1, String nombreModulo2,
            float notaModulo2, String nombre, String dni, String numeroTelefono) {
        super(nombre, dni, numeroTelefono);
        this.codigo = codigo;
        this.nombreModulo1 = nombreModulo1;
        this.notaModulo1 = notaModulo1;
        this.nombreModulo2 = nombreModulo2;
        this.notaModulo2 = notaModulo2;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreModulo1() {
        return nombreModulo1;
    }

    public void setNombreModulo1(String nombreModulo1) {
        this.nombreModulo1 = nombreModulo1;
    }

    public float getNotaModulo1() {
        return notaModulo1;
    }

    public void setNotaModulo1(float notaModulo1) {
        this.notaModulo1 = notaModulo1;
    }

    public String getNombreModulo2() {
        return nombreModulo2;
    }

    public void setNombreModulo2(String nombreModulo2) {
        this.nombreModulo2 = nombreModulo2;
    }

    public float getNotaModulo2() {
        return notaModulo2;
    }

    public void setNotaModulo2(float notaModulo2) {
        this.notaModulo2 = notaModulo2;
    }

}
