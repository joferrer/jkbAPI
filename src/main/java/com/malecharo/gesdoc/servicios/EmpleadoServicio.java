package com.malecharo.gesdoc.servicios;

import com.malecharo.gesdoc.modelos.EmpleadoModelo;
import com.malecharo.gesdoc.repositorios.EmpleadoRepositorio;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServicio {
    @Autowired
    EmpleadoRepositorio empleadoRepositorio;

    public ArrayList<EmpleadoModelo> obtenerEmpleados() {
        return (ArrayList<EmpleadoModelo>) empleadoRepositorio.findAll();
    }

    public EmpleadoModelo guardarEmpleado(EmpleadoModelo empleado) {
        return empleadoRepositorio.save(empleado);
    }

    public Optional<EmpleadoModelo> obtenerPorId(Long id) {
        return empleadoRepositorio.findById(id);

    }

    public ArrayList<EmpleadoModelo> obtenerPorTipo(Integer tipo) {
        return empleadoRepositorio.findByTipo(tipo);
    }

    public boolean eliminarEmpleado(Long id) {
        try {
            empleadoRepositorio.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
