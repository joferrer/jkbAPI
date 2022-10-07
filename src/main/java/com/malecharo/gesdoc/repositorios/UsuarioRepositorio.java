package com.malecharo.gesdoc.repositorios;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.malecharo.gesdoc.modelos.UsuarioModelo;

@Repository
public interface UsuarioRepositorio extends CrudRepository <UsuarioModelo, Long>{
    public abstract ArrayList<UsuarioModelo> findByTipo(Integer tipo);
}
