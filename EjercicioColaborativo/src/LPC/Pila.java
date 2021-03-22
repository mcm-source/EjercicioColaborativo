package LPC;
import Metodos.EntradaDatos;
import Metodos.MenusPrograma;
import Metodos.Visualizacion;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author CECA
 * */
public class Pila {

    public static NodoAlumno crear(NodoAlumno p,String leer) throws IOException{
        byte op=Byte.parseByte(leer);

        if(op==1){
            p=null;
        }
        return p;
    }

    public static void push(NodoAlumno raiz, NodoAlumno nodoInsertar) throws IOException{
                if(raiz ==null){
                    raiz= nodoInsertar;
                    raiz.setSiguiente(null);
                }else{
                    nodoInsertar.setSiguiente(raiz);
                    raiz= nodoInsertar;
                }
            }

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

    public static void pop(NodoAlumno raiz){

        NodoAlumno info=null;
        if(raiz==null){
            System.out.println("No existe el elemento");
        }else{
            raiz=raiz.getSiguiente();
        }
    }

    public NodoAlumno VerElementoSuperior(NodoAlumno top){
        NodoAlumno info=null;
        if(top==null){
            return null;
        }else{
            return top;
        }
    }

    public void verPila(NodoAlumno raiz){
        Visualizacion.visualizacionCabeceraDatosAlumno();
        Visualizacion.visualizacionObjetoAlumno(raiz);
    }
}
