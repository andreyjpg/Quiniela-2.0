/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
 */
package Premios;


public class Dato {
    private int idPremio;
    private String descripcion;
    
    public Dato(String premio, int valorPremio){
        idPremio = 0;
        descripcion =""; 
    }

    public int getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(int idPremio) {
        this.idPremio = idPremio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
