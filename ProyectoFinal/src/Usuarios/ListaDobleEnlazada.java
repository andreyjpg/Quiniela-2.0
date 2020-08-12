/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrey
 */
public class ListaDobleEnlazada {
    private NodoLED inicio;
    private NodoLED fin;
    
    public ListaDobleEnlazada(){
        this.inicio = null;
        this.fin = null;
    }
    
    private boolean esVacia(){
        return inicio == null;
    }
    
    public void agregar(Dato dato){        
        NodoLED nuevo = new NodoLED();
        nuevo.setDato(dato);
        if(esVacia()){
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if(dato.getIdUsuario()< inicio.getDato().getIdUsuario()){
            nuevo.setSiguiente(inicio);
            inicio = nuevo;            
        } else if( dato.getIdUsuario() >= fin.getDato().getIdUsuario()){
            fin.setSiguiente(nuevo);
            fin = fin.getSiguiente();
            inicio.setAnterior(fin);
        } else {
            NodoLED aux = inicio;
            while(aux.getSiguiente().getDato().getIdUsuario()< dato.getIdUsuario()){
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
            NodoLED aux = inicio;
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
            
        }
    }
}
