/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
 */
package Usuarios;

import javax.swing.JOptionPane;

public class ListaDobleEnlazada {
    private NodoLED inicio;
    
    public ListaDobleEnlazada(){
        this.inicio = null;
    }
    
    private boolean esVacia(){
        return inicio == null;
    }
    
    public void agregar(Dato dato){
        dato.setIdUsuario(contarElementos() + 1);
        
        NodoLED nuevoNodo = new NodoLED();
        nuevoNodo.setDato(dato);

        if(esVacia()){
            inicio = nuevoNodo;
        } else if(dato.getIdUsuario() < inicio.getDato().getIdUsuario()){
            nuevoNodo.setSiguiente(inicio);
            inicio.setAnterior(nuevoNodo);
            inicio = nuevoNodo;
        } else if(inicio.getSiguiente() == null){
            inicio.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(inicio);
        } else {
            NodoLED aux = inicio;
            while((aux.getSiguiente() != null ) &&
                    (aux.getSiguiente().getDato().getIdUsuario()< dato.getIdUsuario()) ){
                aux = aux.getSiguiente();
            }

            nuevoNodo.setSiguiente(aux.getSiguiente());
            if(aux.getSiguiente() != null) aux.getSiguiente().setAnterior(nuevoNodo);
            nuevoNodo.setAnterior(aux);
            aux.setSiguiente(nuevoNodo);

            JOptionPane.showMessageDialog(null, "Correo Registrado");
        }
  
        
    }
    
    public void extraer(){
        if(!esVacia()){
            inicio = inicio.getSiguiente();
        } else {
            JOptionPane.showMessageDialog(null, "no se puede extraer, No existen usuarios creados");
        }
    }

    
    public boolean BuscarElemento(String correo){
        if(!esVacia()){
            NodoLED aux = inicio;
            while(aux != null){
                if(aux.getDato().getCorreo().equals(correo)){
                    return true;
                } else {
                   aux = aux.getSiguiente();
                }
            }
        }
        return false;
    }
    
    public Dato inicioSesión(String correo, String contra){
        if(!esVacia()){
            NodoLED aux = inicio;
            while(aux != null){
                if(aux.getDato().getCorreo().equals(correo)
                   && aux.getDato().getContraseña().equals(contra)){
                    return aux.getDato();
                } else {
                   aux = aux.getSiguiente();
                }
            }
        }
        return null;
    }
    
    public int contarElementos(){
        int cont =0;
        if(!esVacia()){
            NodoLED aux = inicio;
            while(aux != null){
                cont += 1;
                aux = aux.getSiguiente();
            }
        } else {
            return 0;
        }
        return cont;
    }
    
    public void agregarPartidosXUsario(PartidosCreados.Dato partido, int contMarcadores, Estructuras.Estructuras objetoEstructuras){
        if(!esVacia()){
            NodoLED aux = inicio;
            while(aux != null){
                if(!aux.getDato().isIsAdmin()){
                    MarcadoresUsuarios.Dato nuevoPartido = new MarcadoresUsuarios.Dato();
                    nuevoPartido.setIdUsuario(aux.getDato().getIdUsuario());
                    nuevoPartido.setIdMarcador(contMarcadores + 1);
                    nuevoPartido.setIdPartido(partido.getIdPartido());
                    nuevoPartido.setEquipoL(partido.getEquipoL());
                    nuevoPartido.setEquipoV(partido.getEquipoV());
                    objetoEstructuras.getListaSimple_marcadoresUsuario().enlazar(nuevoPartido);

                }
                aux = aux.getSiguiente();
            }
        }
        
    }
    
    public String obtenerCorreoUsuario(int id){
        String resultado = "";
        if(!esVacia()){
            NodoLED aux = inicio;
            while(aux != null){
                if(id == aux.getDato().getIdUsuario()){
                    resultado = aux.getDato().getCorreo();
                    aux = null;
                } else {
                   aux = aux.getSiguiente(); 
                }
                
            }
        }
        return resultado;
    }
    
}
