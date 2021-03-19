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
public class ValidacionesModulos {

    public static boolean validarModulo(String codigoModulo) {

        return validarLongitudString(codigoModulo, 20, "Longitud incorrecta del codigo del modulo")
                && validarDatosEnString(codigoModulo, 0, 17, "[A-Za-z]*", "Letras incorrectos en codigo de modulo")
                && validarDatosEnString(codigoModulo, 18, 19, "[0-9]*", "Numero incorrecta en codigo del modulo");
    }

    

}
