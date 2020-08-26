/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
 */
package PartidosCreados;


public class Dato {
    private int idPartido;
    private String equipoL;
    private int marcadorL;
    private String equipoV;
    private int marcadorV;
    
    public Dato(String local, String visitante) {
        idPartido = 0;
        equipoL = local;
        marcadorL = 0;
        equipoV = visitante;
        marcadorV = 0;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public String getEquipoL() {
        return equipoL;
    }

    public void setEquipoL(String equipoL) {
        this.equipoL = equipoL;
    }

    public int getMarcadorL() {
        return marcadorL;
    }

    public void setMarcadorL(int marcadorL) {
        this.marcadorL = marcadorL;
    }

    public String getEquipoV() {
        return equipoV;
    }

    public void setEquipoV(String equipoV) {
        this.equipoV = equipoV;
    }

    public int getMarcadorV() {
        return marcadorV;
    }

    public void setMarcadorV(int marcadorV) {
        this.marcadorV = marcadorV;
    }
    
}

