package com.example.api.clases.root.modelos;

import com.example.api.clases.root.ayudas.TipoUsuario;
import jakarta.persistence.Entity;



@Entity
public class Usuario {


    private Integer id;
    private String nombre;
    private  String corerro;
    private  String contraseña;
    private  String telefono;

    private TipoUsuario tipoUsuario;


    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String corerro, String contraseña, String telefono, TipoUsuario tipoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.corerro = corerro;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorerro() {
        return corerro;
    }

    public void setCorerro(String corerro) {
        this.corerro = corerro;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


}
