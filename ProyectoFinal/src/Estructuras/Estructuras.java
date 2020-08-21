/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

//ESTRUCTURA PARA ALMACENAR TODAS LAS ESTRUCTURAS, ACTUA COMO ENCAPSULADOR

import MarcadoresUsuarios.ListaSimple;
import PartidosCreados.Cola;
import PartidosFinalizados.ListaCircularSimple;
import Posición.Pila;
import Premios.ListaDobleCircular;
import Usuarios.ListaDobleEnlazada;

public class Estructuras {
    private Usuarios.ListaDobleEnlazada listaUsuarios;
    private PartidosCreados.Cola colaPartidos;
    private PartidosFinalizados.ListaCircularSimple listaCS_partidosFinalizados;
    private MarcadoresUsuarios.ListaSimple listaSimple_marcadoresUsuario;
    private Posición.Pila pilaPosiciones;
    private Premios.ListaDobleCircular listaDC_premios;
    
    public Estructuras(){
        listaUsuarios = new Usuarios.ListaDobleEnlazada();
        colaPartidos = new PartidosCreados.Cola();
        listaCS_partidosFinalizados = new PartidosFinalizados.ListaCircularSimple();
        listaSimple_marcadoresUsuario = new MarcadoresUsuarios.ListaSimple();
        pilaPosiciones = new Posición.Pila();
        listaDC_premios = new Premios.ListaDobleCircular();
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

    public Pila getPilaPosiciones() {
        return pilaPosiciones;
    }

    public ListaDobleCircular getListaDC_premios() {
        return listaDC_premios;
    }
    
    
}
