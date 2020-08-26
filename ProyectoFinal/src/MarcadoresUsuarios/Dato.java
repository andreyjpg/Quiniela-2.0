/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
 */
package MarcadoresUsuarios;


public class Dato {
    private int idMarcador;   
    private int idPartido;
    private String equipoL;
    private String equipoV;
    private int idUsuario;
    private int marcadorL;
    private int marcadorV;
    private int PuntosObtenidos;
    
    public Dato(String local, String visitante) {
        idMarcador = 0;
        idPartido = 0;
        idUsuario = 0;
        equipoL = local;
        equipoV = visitante;
        marcadorL = 0;
        marcadorV = 0;
        PuntosObtenidos = 0; 
    }
    
    public int getIdMarcador() {
        return idMarcador;
    }

    public void setIdMarcador(int idMarcador) {
        this.idMarcador = idMarcador;
    }
    public int getIdPartido() {
        return idPartido;
    }
    
    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public int getPuntosObtenidos() {
        return PuntosObtenidos;
    }

    public void setPuntosObtenidos(int PuntosObtenidos) {
        this.PuntosObtenidos = PuntosObtenidos;
    }

    public String getEquipoL() {
        return equipoL;
    }

    public void setEquipoL(String equipoL) {
        this.equipoL = equipoL;
    }

    public String getEquipoV() {
        return equipoV;
    }

    public void setEquipoV(String equipoV) {
        this.equipoV = equipoV;
    }    
    
}
