package com.malecharo.gesdoc.repositorios;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.malecharo.gesdoc.modelos.DeduccionesModelo;

@Repository
public interface DeduccionesRepositorio extends CrudRepository <DeduccionesModelo, Long>{
    //public abstract ArrayList<DeduccionesModelo> findByTipo(Integer tipo);
}