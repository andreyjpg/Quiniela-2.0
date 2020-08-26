/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
 */
package Estructuras;

//ESTRUCTURA PARA ALMACENAR TODAS LAS ESTRUCTURAS, ACTUA COMO ENCAPSULADOR

import MarcadoresUsuarios.ListaSimple;
import PartidosCreados.Cola;
import PartidosFinalizados.ListaCircularSimple;
import Premios.Pila;
import Posición.ListaDobleCircular;
import Usuarios.ListaDobleEnlazada;

public class Estructuras {
    private Usuarios.ListaDobleEnlazada listaUsuarios;
    private PartidosCreados.Cola colaPartidos;
    private PartidosFinalizados.ListaCircularSimple listaCS_partidosFinalizados;
    private MarcadoresUsuarios.ListaSimple listaSimple_marcadoresUsuario;
    private Premios.Pila pilaPremios;
    private Posición.ListaDobleCircular listaDC_Posiciones;
    
    public Estructuras(){
        listaUsuarios = new Usuarios.ListaDobleEnlazada();
        colaPartidos = new PartidosCreados.Cola();
        listaCS_partidosFinalizados = new PartidosFinalizados.ListaCircularSimple();
        listaSimple_marcadoresUsuario = new MarcadoresUsuarios.ListaSimple();
        listaDC_Posiciones = new Posición.ListaDobleCircular();
        pilaPremios = new Premios.Pila();
    }

    public ListaDobleEnlazada getListaUsuarios() {
        return listaUsuarios;
    }

    public Cola getColaPartidos() {
        return colaPartidos;
    }

    public ListaCircularSimple getListaCS_partidosFinalizados() {
        return listaCS_partidosFinalizados;
    }

    public ListaSimple getListaSimple_marcadoresUsuario() {
        return listaSimple_marcadoresUsuario;
    }

    public Pila getPilaPremios() {
        return pilaPremios;
    }

    public ListaDobleCircular getListaDC_Posiciones() {
        return listaDC_Posiciones;
    }

    
}
