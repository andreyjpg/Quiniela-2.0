/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarcadoresUsuarios;

public class NodoLS {
    private Dato dato;
    private NodoLS siguiente;
    
    public NodoLS(){
        siguiente = null;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public NodoLS getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLS siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
