/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;


//NodoLED = Nodo Lista Enlazada Doble
public class NodoLED {
    private Dato dato;
    private NodoLED siguiente;
    private NodoLED anterior;
    
    public NodoLED(){
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

    public NodoLED getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLED siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLED getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLED anterior) {
        this.anterior = anterior;
    }    
}
