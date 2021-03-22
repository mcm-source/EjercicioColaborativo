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
                
        NodoAlumno nuevoNodoAlumno=(NodoAlumno) EntradaDatos.pedirDatosAlumno();
    //quiero añadir bucle para insertar más alumnos

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
