package com.malecharo.gesdoc.modelos;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class UsuarioModelo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private String password;
    private Integer tipo;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getTipo() {
        return tipo;
    }
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    

}
