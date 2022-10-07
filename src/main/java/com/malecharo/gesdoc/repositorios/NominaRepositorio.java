package com.malecharo.gesdoc.repositorios;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.malecharo.gesdoc.modelos.NominaModelo;

@Repository
public interface NominaRepositorio extends CrudRepository <NominaModelo, Long>{
    //public abstract ArrayList<NominaModelo> findByTipo(Integer tipo);
}