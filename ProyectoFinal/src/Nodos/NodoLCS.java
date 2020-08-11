/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

import Datos.Dato;

/**
 *
 * @author dfallasm
 */

//NodoLCS = Nodo Lista Circular Simplemente Enlazada
public class NodoLCS {

    private Dato dato;
    private NodoLCS siguiente;

    public NodoLCS(){
        this.dato = null;
        this.siguiente = null;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public NodoLCS getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLCS siguiente) {
        this.siguiente = siguiente;
    }    
}
