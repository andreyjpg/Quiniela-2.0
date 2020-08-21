
package MarcadoresUsuarios;


public class ListaSimple {
   private NodoLS inicio;
    
    public ListaSimple(){
        inicio = null;
    }
    
    private boolean esVacia(){
        return inicio == null;
    }
    
    public void enlazar(Dato dato){        
        NodoLS nuevoNodo = new NodoLS();
        nuevoNodo.setDato(dato);
        
         if(esVacia()){
            inicio = nuevoNodo;
        } else if(dato.getIdMarcador() < inicio.getDato().getIdMarcador()){
            nuevoNodo.setSiguiente(inicio);
            inicio = nuevoNodo;
        } else if(inicio.getSiguiente() == null){
             inicio.setSiguiente(nuevoNodo);
        } else {
            NodoLS aux = inicio;
            while((aux.getSiguiente() != null ) &&
                    (aux.getSiguiente().getDato().getIdUsuario()< dato.getIdMarcador()) ){
                aux = aux.getSiguiente();
            }
            
            nuevoNodo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevoNodo);    
        }
    } 
}
