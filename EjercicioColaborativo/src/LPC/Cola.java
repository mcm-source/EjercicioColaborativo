package LPC;

import Metodos.EntradaDatos;
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
        
        String dni, nombreAlumno, codigo, nombreModulo1, nombreModulo2, telefono;
        float notaModulo1, notaModulo2;
        
        NodoAlumno nuevoNodoAlumno;
        
        codigo=EntradaDatos.pedirDatosString("Introduce nombre");
        nombreModulo1=EntradaDatos.pedirDatosString("Introduce nombre del modulo 1");
        notaModulo1=Float.parseFloat(EntradaDatos.pedirDatosString("Introduce nota del modulo 1"));
        nombreModulo2=EntradaDatos.pedirDatosString("Introduce nombre del modulo 2");
        notaModulo2=Float.parseFloat(EntradaDatos.pedirDatosString("Introduce nota del modulo 2"));
        nombreAlumno=EntradaDatos.pedirDatosString("Introduce nombre del alumno");
        dni=EntradaDatos.pedirDatosString("Introduce nombre del alumno");
        telefono=EntradaDatos.pedirDatosString("Introdice telefono");

        nuevoNodoAlumno=new NodoAlumno(codigo,nombreModulo1,notaModulo1,nombreModulo2,notaModulo2,nombreAlumno,dni,telefono);
        
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
    
    public NodoAlumno consultar(){
        return raiz;
    }
    
    public NodoAlumno borrar(){
        if(raiz==null){     //si cola vacia
            return null;
        }else if(raiz.getSiguiente()==null){
            NodoAlumno primero=raiz;
            raiz=null;
            
            numElementos--;
            return primero;
        }else{
            NodoAlumno primero=raiz;
            raiz=raiz.getSiguiente();
            
            numElementos--;
            return primero;
        }        
    }
    
    public int size(){
        return numElementos;
    }
}
