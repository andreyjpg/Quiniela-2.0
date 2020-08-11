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
//NodoLES = Nodo Lista Enlazada Simple

public class NodoLES {
    
    private Dato dato;
    private NodoLES siguiente;
    
    public NodoLES(){
        this.siguiente=null;
        this.dato=null;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public NodoLES getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLES siguiente) {
        this.siguiente = siguiente;
    }
    
}
