/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;

import Metodos.MenusPrograma;
import java.io.IOException;

/**
 *
 * @author marti
 */
public class ValidacionesGenerales {

    /**
     * Comprueba que la longitud de un string sea igual a la enviada
     *
     * @param datos String a valudar
     * @param longitudAValidar
     * @param mesajeFallo
     * @return
     */
    protected static boolean validarLongitudString(String datos, int longitudAValidar, String mesajeFallo) {
        boolean validacionCorrecta = true;

        try {
            if (datos.length() != longitudAValidar) {
                validacionCorrecta = false;
                throw new Excepciones(mesajeFallo);

            }

        } catch (Excepciones e) {
            System.err.println(e.getMessage());
            validacionCorrecta = false;
        }
        return validacionCorrecta;

    }

    /**
     * Método que comprueba si en una cadena substring está presenta el
     * parametro de la expresion regular
     *
     * @param datoValidar cadena String en la que deseamos realizar la
     * comprobación
     * @param posicionInicialString posicion donde empezamos la subcadena
     * @param posicionFinalString posicion donde finaliza la subcadena
     * @param condicionValidacion expresion regular a comprobar
     * @param mensajeCasoFallo texto para lanzar excepsion
     * @return
     */
    protected static boolean validarDatosEnString(String datoValidar, int posicionInicialString, int posicionFinalString,
            String condicionValidacion, String mensajeCasoFallo) {
        boolean validacionCorrecta = true;
        try {
            if (datoValidar.substring(posicionInicialString, posicionFinalString).matches(condicionValidacion)) {
                return validacionCorrecta;
            } else {
                validacionCorrecta = false;
                throw new Excepciones(mensajeCasoFallo);

            }

        } catch (Excepciones e) {
           System.err.println(e.getMessage());
            System.out.println(e.getMessage());
            validacionCorrecta = false;

        }
        return validacionCorrecta;

    }

}
