package com.malecharo.gesdoc.servicios;

import com.malecharo.gesdoc.modelos.DeduccionesModelo;
import com.malecharo.gesdoc.repositorios.DeduccionesRepositorio;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeduccionesServicio {
    @Autowired
    DeduccionesRepositorio deduccionesRepositorio;

    public ArrayList<DeduccionesModelo> obtenerDeduccioness() {
        return (ArrayList<DeduccionesModelo>) deduccionesRepositorio.findAll();
    }

    public DeduccionesModelo guardarDeducciones(DeduccionesModelo deducciones) {
        return deduccionesRepositorio.save(deducciones);
    }

    public Optional<DeduccionesModelo> obtenerPorId(Long id) {
        return deduccionesRepositorio.findById(id);

    }

    //public ArrayList<DeduccionesModelo> obtenerPorTipo(Integer tipo) {
    //    return deduccionesRepositorio.findByTipo(tipo);
    //}

    public boolean eliminarDeducciones(Long id) {
        try {
            deduccionesRepositorio.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
