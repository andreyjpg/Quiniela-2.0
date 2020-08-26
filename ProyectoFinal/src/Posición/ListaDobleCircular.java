/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posición;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        } else if(dato.getPuntaje()< inicio.getDato().getPuntaje()){
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        } else if( dato.getPuntaje()>= fin.getDato().getPuntaje()){
            fin.setSiguiente(nuevo);
            fin = fin.getSiguiente();
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else {
            NodoLCD aux = inicio;
            while(aux.getSiguiente().getDato().getPuntaje()< dato.getPuntaje()){
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
    
    
    public void reiniciarPuntaje(){
        inicio = null;
    }
    
    public boolean existeUsuario(int id){
        NodoLCD aux = inicio;
        if( aux.getDato().getIdUsuario() == id) return true;
        aux = aux.getSiguiente();
        while(aux != inicio){
            if( aux.getDato().getIdUsuario() == id) return true;
            aux = aux.getSiguiente();
        }
        return false;
    }
    
    public void sumarPuntos(MarcadoresUsuarios.Dato dato, Estructuras.Estructuras estructura){
        if(esVacia()){
            Dato posicion = new Dato();
            posicion.setIdUsuario(dato.getIdUsuario());
            String usuario = estructura.getListaUsuarios().obtenerCorreoUsuario(dato.getIdUsuario());
            posicion.setNombre(usuario);
            posicion.setPuntaje(dato.getPuntosObtenidos());
            estructura.getListaDC_Posiciones().agregar(posicion);
        } else if(existeUsuario(dato.getIdUsuario())) {
            NodoLCD aux = inicio;
            if( aux.getDato().getIdUsuario() == dato.getIdUsuario()){
                int nuevoPuntaje = aux.getDato().getPuntaje() + dato.getPuntosObtenidos();
                aux.getDato().setPuntaje(nuevoPuntaje);
                ordenar(aux);
            }
            aux = aux.getSiguiente();
            while(aux != inicio){
                if( aux.getDato().getIdUsuario() == dato.getIdUsuario()){
                    int nuevoPuntaje = aux.getDato().getPuntaje() + dato.getPuntosObtenidos();
                    aux.getDato().setPuntaje(nuevoPuntaje);
                    ordenar(aux);
                }
                aux = aux.getSiguiente();
            }

        } else {
            Dato posicion = new Dato();
            posicion.setIdUsuario(dato.getIdUsuario());
            String usuario = estructura.getListaUsuarios().obtenerCorreoUsuario(dato.getIdUsuario());
            posicion.setNombre(usuario);
            posicion.setPuntaje(dato.getPuntosObtenidos());
            estructura.getListaDC_Posiciones().agregar(posicion);
        }
    }
    
    public void ordenar(NodoLCD aux){
        NodoLCD datoActualizado = aux;
        while(aux.getSiguiente().getDato().getPuntaje()< datoActualizado.getDato().getPuntaje()){
            aux = aux.getSiguiente();
        }
        datoActualizado.setSiguiente(aux.getSiguiente());
        datoActualizado.setAnterior(aux);
        aux.setSiguiente(aux);
        aux.getSiguiente().setAnterior(datoActualizado);
        
    }
    
    public DefaultTableModel listaATabla(DefaultTableModel estructura, int fila, Estructuras.Estructuras datos){
        if(!esVacia()){
            NodoLCD aux = fin;
            while(aux != fin){
                estructura.insertRow(fila, new Object[]{ fila + 1, aux.getDato().getNombre(), 
                    aux.getDato().getPuntaje(), });
                
                fila += 1;
                aux = aux.getAnterior();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La lista de tabla de posiciones está vacía");
        }
        
        return estructura;
    }
    
}
