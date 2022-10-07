package com.malecharo.gesdoc.servicios;

import com.malecharo.gesdoc.modelos.BonosModelo;
import com.malecharo.gesdoc.repositorios.BonosRepositorio;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BonosServicio {
    @Autowired
    BonosRepositorio bonosRepositorio;

    public ArrayList<BonosModelo> obtenerBonoss() {
        return (ArrayList<BonosModelo>) bonosRepositorio.findAll();
    }

    public BonosModelo guardarBonos(BonosModelo bonos) {
        return bonosRepositorio.save(bonos);
    }

    public Optional<BonosModelo> obtenerPorId(Long id) {
        return bonosRepositorio.findById(id);

    }

    //public ArrayList<BonosModelo> obtenerPorTipo(Integer tipo) {
    //    return bonosRepositorio.findByTipo(tipo);
    //}

    public boolean eliminarBonos(Long id) {
        try {
            bonosRepositorio.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
