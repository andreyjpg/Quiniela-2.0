/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartidosCreados;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrey
 */
public class Cola {
    private NodoCola frente;
    private NodoCola ultimo;
    
    public Cola () {
        frente = null;
        ultimo = null;
    }
    
    private boolean esVacia() {
        return frente == null;
    }
    
    public void encolar(Dato dato){
        dato.setIdPartido(cantidadPartidos() + 1);
        
        NodoCola nuevoNodo = new NodoCola();
        nuevoNodo.setDato(dato);
        
        if(esVacia()){
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
           ultimo.setSiguiente(nuevoNodo);
           ultimo = nuevoNodo;
        }
    }
    
    public void desencolar(String elementosEliminados) {
        if(!esVacia()){
            frente = frente.getSiguiente();
            
            JOptionPane.showMessageDialog(null, "El elemento fue eliminado");
            
        } else {
           JOptionPane.showMessageDialog(null, "No se puede desencolar, Pila vacia");
        }
    }
    
    public int cantidadPartidos(){
        int count = 0;
        if(!esVacia()){
            NodoCola aux = frente;
            while(frente != null){
                count ++;
                aux = aux.getSiguiente();
            }
        }
        return count;
    }
}
