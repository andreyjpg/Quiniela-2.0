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
public class NodoPila {
    private Dato dato;
    private NodoPila siguiente;
    
    public NodoPila(){
        this.siguiente=null;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
        
}
