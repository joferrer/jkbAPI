package com.malecharo.gesdoc.servicios;

import com.malecharo.gesdoc.modelos.NominaModelo;
import com.malecharo.gesdoc.repositorios.NominaRepositorio;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NominaServicio {
    @Autowired
    NominaRepositorio nominaRepositorio;

    public ArrayList<NominaModelo> obtenerNominas() {
        return (ArrayList<NominaModelo>) nominaRepositorio.findAll();
    }

    public NominaModelo guardarNomina(NominaModelo nomina) {
        return nominaRepositorio.save(nomina);
    }

    public Optional<NominaModelo> obtenerPorId(Long id) {
        return nominaRepositorio.findById(id);

    }

    //public ArrayList<NominaModelo> obtenerPorTipo(Integer tipo) {
    //    return nominaRepositorio.findByTipo(tipo);
    //}

    public boolean eliminarNomina(Long id) {
        try {
            nominaRepositorio.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
