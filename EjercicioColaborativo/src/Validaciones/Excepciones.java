/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;

/**
 *
 * @author marti
 */
public class Excepciones extends Exception {

    private String mensajeExcepcion;

    public Excepciones(String message) {
        super(message);
        this.mensajeExcepcion = message;
    }

    public String getMensajeExcepcion() {
        return mensajeExcepcion;
    }

}
