/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartidosFinalizados;

import javax.swing.JOptionPane;
import PartidosCreados.Dato;
import Estructuras.Estructuras;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrey
 */
public class ListaCircularSimple {
    private Nodo inicio;
    private Nodo fin;

    public ListaCircularSimple(){
        inicio= null;
        fin = null;
    }

    public boolean esVacia(){
        return inicio == null;
    }

    public void agregar(Dato dato){

        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);

        if(esVacia()){
            inicio = nuevo;
            fin= nuevo;
            fin.setSiguiente(inicio);
        } else if(dato.getIdPartido() < inicio.getDato().getIdPartido()){
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            fin.setSiguiente(inicio);
        } else if(dato.getIdPartido() >= inicio.getDato().getIdPartido() ){
            fin.setSiguiente(nuevo);
            fin = fin.getSiguiente();
            fin.setSiguiente(inicio);
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente().getDato().getIdPartido()<dato.getIdPartido()){
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
            fin.setSiguiente(inicio);
        }
    }   

    public int contar(){
        int cant = 0;
        if(!esVacia()){
            Nodo aux = inicio;
            cant += 1;
            aux = aux.getSiguiente();
            while(aux != inicio){
                cant += 1;
                aux = aux.getSiguiente();
            }
        }
        return cant;
    }
    
    public DefaultTableModel ListaATabla(DefaultTableModel estructura, int fila){
        if(!esVacia()){
            Nodo aux = inicio;
            estructura.insertRow(fila, new Object[]{ aux.getDato().getIdPartido(),
            aux.getDato().getEquipoL(),aux.getDato().getEquipoV(), aux.getDato().getMarcadorL(), 
            aux.getDato().getMarcadorV()});

            fila += 1;
            aux = aux.getSiguiente();
            while(aux != inicio){
                estructura.insertRow(fila, new Object[]{ aux.getDato().getIdPartido(),
                aux.getDato().getEquipoL(),aux.getDato().getEquipoV(), aux.getDato().getMarcadorL(), 
                aux.getDato().getMarcadorV()});
                
                fila += 1;
                aux = aux.getSiguiente();
            }
        } 
        
        return estructura;
    }
    
    public void sumaPuntos(Estructuras estructuras){
        if(!esVacia()){
            Nodo aux = inicio;
            estructuras.getListaSimple_marcadoresUsuario().verificarMarcadorFinal(aux.getDato());
            aux = aux.getSiguiente();
            while(aux != inicio){
                estructuras.getListaSimple_marcadoresUsuario().verificarMarcadorFinal(aux.getDato());
                aux = aux.getSiguiente();
            }
        }
    }
}
