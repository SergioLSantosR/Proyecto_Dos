
package proyecto_dos;


public class Nodo {

Nodo izquierda;
Nodo derecha;
String palabra;
int posicion;

    public Nodo(String palabra, int posicion){
        
        this.izquierda = null;
        this.derecha = null;
        this.palabra = palabra;
        this.posicion = posicion;
    }
}
