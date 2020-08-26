
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
    
    public int cuentaElementos(){
        int cont = 0;
            if(!esVacia()){
                NodoLS aux = inicio;
                while(aux != null){
                    cont +=1;
                    aux = aux.getSiguiente();
                }
            }
        return cont;
    }
    
    public void verificarMarcadorFinal(PartidosCreados.Dato partido){
        if(!esVacia()){
            NodoLS aux = inicio;
            while(aux != null){
                if(partido.getIdPartido() == aux.getDato().getIdPartido()){
                    if(partido.getMarcadorL() == aux.getDato().getMarcadorL()
                            && partido.getMarcadorV() == aux.getDato().getMarcadorV()){
                        aux.getDato().setPuntosObtenidos(3);
                    } else if(partido.getMarcadorL() > partido.getMarcadorV()
                            && aux.getDato().getMarcadorL() > aux.getDato().getMarcadorV()){
                        aux.getDato().setPuntosObtenidos(1);
                    } else if(partido.getMarcadorL() < partido.getMarcadorV()
                            && aux.getDato().getMarcadorL() < aux.getDato().getMarcadorV()){
                        aux.getDato().setPuntosObtenidos(1);
                    } else if(partido.getMarcadorL() == partido.getMarcadorV()
                            && aux.getDato().getMarcadorL() == aux.getDato().getMarcadorV()){
                        aux.getDato().setPuntosObtenidos(1);
                    } else {
                        aux.getDato().setPuntosObtenidos(0);
                    }
                }
                aux = aux.getSiguiente();
            }
        }
    }
    
    public void crearTablaPosiciones(Estructuras.Estructuras estructuras){
        if(!esVacia()){
            NodoLS aux = inicio;
            while(aux != null){
                estructuras.getListaDC_Posiciones().sumarPuntos(aux.getDato(), estructuras);
            }
        }
    }
}
