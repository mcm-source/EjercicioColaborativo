package LPC;
import Metodos.EntradaDatos;
import Metodos.MenusPrograma;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;

public class Pila {
    public static NodoAlumno crear(NodoAlumno p,BufferedReader leer) throws IOException{
        System.out.println("Desea crear lista nueva?"
                +"\n1.si"
                +"\n2.no");
        byte op=Byte.parseByte(leer.readLine());

        if(op==1){
            p=null;
        }
        return p;
    }

    public static NodoAlumno insertar(NodoAlumno raiz,BufferedReader leer) throws IOException{
        String dni,nombreAlumno,codigo,nombreModulo1,nombreModulo2,telefono;
        float notaModulo1,notaModulo2;
        boolean annadirmas=false;
        NodoAlumno nuevoNodoAlumno;

        //En caso de dar de alta masiva de alumnos
      /*  System.out.printf("Introducir nombre de alumno, pulse/escribir fin para finalizacion");
        nombreAlumno=leer.readLine();
        while(nombreAlumno.compareToIgnoreCase("fin")!=0){
            codigo=EntradaDatos.pedirDatosString("Introduce codigo");
            nombreModulo1=EntradaDatos.pedirDatosString("Introduce nombre del Modulo 1");

            nuevoNodoAlumno=new NodoAlumno(codigo,nombreModulo1,notaModulo1,nombreModulo2,notaModulo2,nombreAlumno,dni,telefono);
            nuevoNodoAlumno.setSiguiente(raiz);
            raiz=nuevoNodoAlumno;

            System.out.println("alumno creado");
        }*/

        do{
            codigo=EntradaDatos.pedirDatosString("Introduce nombre");
            nombreModulo1=EntradaDatos.pedirDatosString("Introduce nombre del modulo 1");
            notaModulo1=Float.parseFloat(EntradaDatos.pedirDatosString("Introduce nota del modulo 1"));
            nombreModulo2=EntradaDatos.pedirDatosString("Introduce nombre del modulo 2");
            notaModulo2=Float.parseFloat(EntradaDatos.pedirDatosString("Introduce nota del modulo 2"));
            nombreAlumno=EntradaDatos.pedirDatosString("Introduce nombre del alumno");
            dni=EntradaDatos.pedirDatosString("Introduce nombre del alumno");
            telefono=EntradaDatos.pedirDatosString("Introdice telefono");
            nuevoNodoAlumno=new NodoAlumno(codigo,nombreModulo1,notaModulo1,nombreModulo2,notaModulo2,nombreAlumno,dni,telefono);
            if(MenusPrograma.pedirValidacion("Finalizar?")){
            annadirmas=true;
            }
        }while(annadirmas==false);
    return nuevoNodoAlumno;
    }
}
