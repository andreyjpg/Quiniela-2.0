/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
 */
package Usuarios;

public class Dato {
    private int idUsuario;
    private String correo;
    private String contraseña;
    private boolean isAdmin;
    
    public Dato(String correo, String contraseña ) {
        this.idUsuario = 0;
        this.correo = correo;
        this.contraseña = contraseña;
        this.isAdmin = false;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    
}
