package com.malecharo.gesdoc.modelos;

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class EmpleadoModelo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String celular;
    private Integer tipo;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public Integer getTipo() {
        return tipo;
    }
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    
    
}
