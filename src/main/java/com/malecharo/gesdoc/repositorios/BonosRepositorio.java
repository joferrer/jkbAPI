package com.malecharo.gesdoc.repositorios;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.malecharo.gesdoc.modelos.BonosModelo;

@Repository
public interface BonosRepositorio extends CrudRepository <BonosModelo, Long>{
    //public abstract ArrayList<BonosModelo> findByTipo(Integer tipo);
}
