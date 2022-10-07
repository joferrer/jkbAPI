package com.malecharo.gesdoc.modelos;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="nomina")
public class NominaModelo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private Long id_empleado;
    private Long id_cargo;
    private Long id_deducciones;
    private Long id_bonos;
    private Date fecha;
    private Integer total;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId_empleado() {
        return id_empleado;
    }
    public void setId_empleado(Long id_empleado) {
        this.id_empleado = id_empleado;
    }
    public Long getId_cargo() {
        return id_cargo;
    }
    public void setId_cargo(Long id_cargo) {
        this.id_cargo = id_cargo;
    }
    public Long getId_deducciones() {
        return id_deducciones;
    }
    public void setId_deducciones(Long id_deducciones) {
        this.id_deducciones = id_deducciones;
    }
    public Long getId_bonos() {
        return id_bonos;
    }
    public void setId_bonos(Long id_bonos) {
        this.id_bonos = id_bonos;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    
    
    
    

    

}
