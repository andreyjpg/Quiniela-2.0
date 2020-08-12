/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Premios;

import javax.swing.JOptionPane;

public class ListaDobleCircular {
    private NodoLCD inicio;
    private NodoLCD fin;
    
    public ListaDobleCircular(){
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public void agregar(Dato dato){        
        NodoLCD nuevo = new NodoLCD();
        nuevo.setDato(dato);
        if(esVacia()){
            inicio = nuevo;
            fin = nuevo;
        } else if(dato.getIdPremio() < inicio.getDato().getIdPremio()){
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        } else if( dato.getIdPremio() >= fin.getDato().getIdPremio()){
            fin.setSiguiente(nuevo);
            fin = fin.getSiguiente();
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else {
            NodoLCD aux = inicio;
            while(aux.getSiguiente().getDato().getIdPremio()< dato.getIdPremio()){
               aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        }
    }
    
    public int contarElementos(){
        int cant = 0;
        if(!esVacia()){
            NodoLCD aux = inicio;
            cant +=1;
            aux = aux.getSiguiente();
            while(aux != inicio){
                cant +=1;
                aux = aux.getSiguiente();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se puede contar, la lista está vacía!");
        }   
        
        return cant;
    }
    
    public void extraer(){
        int cant = contarElementos();
        
        if(cant == 1){
            inicio = null;
            fin = null;
        } else if((!esVacia()) && (cant < 1)){
            inicio = inicio.getSiguiente();
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        }
    }
}
