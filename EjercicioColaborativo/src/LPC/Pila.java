package LPC;
import Metodos.EntradaDatos;
import Metodos.MenusPrograma;
import Metodos.Visualizacion;
import java.io.BufferedReader;
import java.io.IOException;

/**@author CECA */
public class Pila {

    public static NodoAlumno crear(NodoAlumno p,BufferedReader leer) throws IOException{
        System.out.println("Desea crear pila nueva?"
                +"\n1.si"
                +"\n2.no");
        byte op=Byte.parseByte(leer.readLine());

        if(op==1){
            p=null;
        }
        return p;
    }

    public void push(NodoAlumno raiz) throws IOException{
        NodoAlumno nuevoNodoAlumno=(NodoAlumno) EntradaDatos.pedirDatosAlumno();
                if(raiz ==null){
                    raiz= nuevoNodoAlumno;
                    raiz.setSiguiente(null);
                }else{
                    nuevoNodoAlumno.setSiguiente(raiz);
                    raiz= nuevoNodoAlumno;
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

    public void pop(NodoAlumno raiz){

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
