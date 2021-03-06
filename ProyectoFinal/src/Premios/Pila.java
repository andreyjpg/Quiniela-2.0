/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
*/
package Premios;

import Posición.Dato;
import Premios.NodoPila;
import javax.swing.JOptionPane;


public class Pila {
    private NodoPila cima;
    
    public Pila(){
        this.cima = null;
    }
    
    private boolean esVacia(){
        return cima == null;
    }
    
    public void apilar (Dato dato){
        
        NodoPila nuevo = new NodoPila();
        nuevo.setDato(dato);
        if(esVacia()){
           cima = nuevo;
        } else {
            nuevo.setSiguiente(cima );
            cima = nuevo;
        }
    }
    
    public void desapilar () {
        if(!esVacia()){
            cima = cima.getSiguiente();
            JOptionPane.showMessageDialog(null, "El elemento fue extraido");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extraer porque, la pila está vacía");
        }
    }
    
    
}
