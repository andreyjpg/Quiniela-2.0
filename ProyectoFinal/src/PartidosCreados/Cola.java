/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartidosCreados;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Estructuras.Estructuras;

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
    
    public void desencolar(Estructuras estructuras) {
        if(!esVacia()){
            estructuras.getListaCS_partidosFinalizados().agregar(frente.getDato());
            frente = frente.getSiguiente();
            
            
        } else {
           JOptionPane.showMessageDialog(null, "No se puede desencolar, Cola vacia");
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
    
    public DefaultTableModel ColaATabla(DefaultTableModel estructura, int fila){
        if(!esVacia()){
            NodoCola aux = frente;
            while(aux != null){
                estructura.insertRow(fila, new Object[]{ aux.getDato().getIdPartido(),
                aux.getDato().getEquipoL(),aux.getDato().getEquipoV(), aux.getDato().getMarcadorL(), 
                aux.getDato().getMarcadorV()});
                
                fila += 1;
                aux = aux.getSiguiente();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La Cola de partidos se encuentra vacía");
        }
        
        return estructura;
    }
    
    public void guardarCambios(int marcadorL, int marcadorV){
        frente.getDato().setMarcadorL(marcadorL);
        frente.getDato().setMarcadorV(marcadorV);
        
    }
    
}
