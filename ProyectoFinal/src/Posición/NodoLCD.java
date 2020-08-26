/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
 */
package Posición;

//NodoLCD = Nodo Lista Circular Doblemente Enlazada


public class NodoLCD {
    private Dato dato;
    private NodoLCD siguiente;
    private NodoLCD anterior;
    
    public NodoLCD(){
        this.dato=null;
        this.siguiente=null;
        this.anterior=null;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public NodoLCD getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLCD siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLCD getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLCD anterior) {
        this.anterior = anterior;
    }    
}
