/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Clases;

/**
 *
 * @author Cochy
 */

public class Usuario {
    private int Id;
    private String Nombre;
    private String Clave;
    private String Perfil;
    private String Estado;
    private String RutPersona;

    public Usuario() {
    }

    public Usuario(int Id, String Nombre, String Clave, String Perfil, String Estado, String RutPersona) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Clave = Clave;
        this.Perfil = Perfil;
        this.Estado = Estado;
        this.RutPersona = RutPersona;
    }

    public String getRutPersona() {
        return RutPersona;
    }

    public void setRutPersona(String RutPersona) {
        this.RutPersona = RutPersona;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getPerfil() {
        return Perfil;
    }

    public void setPerfil(String Perfil) {
        this.Perfil = Perfil;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
