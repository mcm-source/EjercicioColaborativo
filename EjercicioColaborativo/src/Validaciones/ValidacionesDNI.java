/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;

import static Validaciones.ValidacionesGenerales.validarDatosEnString;
import static Validaciones.ValidacionesGenerales.validarLongitudString;

/**
 *
 * @author marti
 */
public class ValidacionesDNI {

    public static boolean validarDNI(String DNIValidar) {

        return validarLongitudString(DNIValidar, 9, "Longitud DNI incorrecta")
                && validarDatosEnString(DNIValidar, 0, 8, "[0-9]*", "Numeros incorrectos en DNI")
                && validarDatosEnString(DNIValidar,8,9, "[A-Za-z]*", "Letra incorrecta en DNI");

    }

}
