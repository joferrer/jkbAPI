package com.malecharo.gesdoc.modelos;

import javax.persistence.*;

@Entity
@Table(name="bonos")
public class BonosModelo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private Long id_cargo;
    private Integer bono;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId_cargo() {
        return id_cargo;
    }
    public void setId_cargo(Long id_cargo) {
        this.id_cargo = id_cargo;
    }
    public Integer getBono() {
        return bono;
    }
    public void setBono(Integer bono) {
        this.bono = bono;
    }
    
    

}
