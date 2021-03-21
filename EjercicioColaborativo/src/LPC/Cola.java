package LPC;

import Metodos.EntradaDatos;
import Metodos.Visualizacion;
import java.io.*;

/** @author Beatriz*/
public class Cola {
    NodoAlumno raiz;
    int numElementos;

    public Cola() {
    }

    public Cola(NodoAlumno raiz) {
        this.raiz = raiz;
    }

    public NodoAlumno getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoAlumno raiz) {
        this.raiz = raiz;
    }

    public int getNumElementos() {
        return numElementos;
    }
    
    public void insertar()throws IOException{
        
        String dni, codigo, nombreAlumno, numeroTelefono, nombreModulo1, nombreModulo2;
        float notaModulo1, notaModulo2;
        
        NodoAlumno nuevoNodoAlumno;
    //quiero añadir bucle para insertar más alumnos
        dni=EntradaDatos.pedirDatosString("Introduzca DNI del alumno");
        codigo=EntradaDatos.pedirDatosString("Introduzca el código del alumno");
        nombreAlumno=EntradaDatos.pedirDatosString("Introduzca el nombre del alumno");
        numeroTelefono=EntradaDatos.pedirDatosString("Introduzca el número de teléfono");
        nombreModulo1=EntradaDatos.pedirDatosString("Introduzca el nombre del módulo 1");
        notaModulo1=Float.parseFloat(EntradaDatos.pedirDatosString("Introduzca la nota del módulo 1"));
        nombreModulo2=EntradaDatos.pedirDatosString("Introduzca el nombre del módulo 2");
        notaModulo2=Float.parseFloat(EntradaDatos.pedirDatosString("Introduzca la nota del módulo 2"));

        nuevoNodoAlumno=new NodoAlumno(codigo,nombreModulo1,notaModulo1,nombreModulo2,notaModulo2,nombreAlumno,dni,numeroTelefono);
        
        if(raiz==null){     //si  vacia
            raiz=nuevoNodoAlumno;
        }else{  //si cola con elementos
            NodoAlumno it=raiz;
            while(it.getSiguiente()!=null){
                it=it.getSiguiente();
            }
            it.setSiguiente(nuevoNodoAlumno);
        }
        numElementos++;
    }
    
    public void consultar(){
        Visualizacion.visualizacionCabeceraDatosAlumno();
        Visualizacion.visualizacionObjetoAlumno(raiz);
    }
    
    public NodoAlumno borrar(){
                
        if(raiz==null){     //si cola vacia
            System.out.println("Alumno borrado");
            return null;
        }else if(raiz.getSiguiente()==null){
            NodoAlumno primero=raiz;
            raiz=null;
            
            numElementos--;
            System.out.println("Alumno borrado");
            return primero;
        }else{
            NodoAlumno primero=raiz;
            raiz=raiz.getSiguiente();
            
            numElementos--;
            System.out.println("Alumno borrado");
            return primero;
        }        
    }
    
    public int size(){
        return numElementos;
    }
}
