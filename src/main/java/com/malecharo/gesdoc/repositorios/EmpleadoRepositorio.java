package com.malecharo.gesdoc.repositorios;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.malecharo.gesdoc.modelos.EmpleadoModelo;

@Repository
public interface EmpleadoRepositorio extends CrudRepository <EmpleadoModelo, Long>{
    public abstract ArrayList<EmpleadoModelo> findByTipo(Integer tipo);
}