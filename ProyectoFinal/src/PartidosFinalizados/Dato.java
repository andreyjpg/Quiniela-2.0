/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartidosFinalizados;

/**
 *
 * @author Andrey
 */
public class Dato {
    private int idPartido;
    private int marcadorL;
    private int marcadorV;
    
    public Dato(int id, int marcadorLocal, int marcadorVisitante){
        idPartido = id;
        marcadorL =marcadorLocal;
        marcadorV= marcadorVisitante;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public int getMarcadorL() {
        return marcadorL;
    }

    public void setMarcadorL(int marcadorL) {
        this.marcadorL = marcadorL;
    }

    public int getMarcadorV() {
        return marcadorV;
    }

    public void setMarcadorV(int marcadorV) {
        this.marcadorV = marcadorV;
    }
    
}
