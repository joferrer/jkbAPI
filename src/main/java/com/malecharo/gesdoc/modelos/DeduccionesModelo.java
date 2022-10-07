package com.malecharo.gesdoc.modelos;

import javax.persistence.*;

@Entity
@Table(name="deducciones")
public class DeduccionesModelo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private Integer deduccion;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getDeduccion() {
        return deduccion;
    }
    public void setDeduccion(Integer deduccion) {
        this.deduccion = deduccion;
    }
    

    

}
