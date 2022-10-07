package com.malecharo.gesdoc.controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.malecharo.gesdoc.modelos.DeduccionesModelo;
import com.malecharo.gesdoc.servicios.DeduccionesServicio;

@RestController
@RequestMapping("/deducciones")
public class DeduccionesControlador {
    @Autowired
    DeduccionesServicio deduccionesServicio;

    @GetMapping()
    public ArrayList<DeduccionesModelo> obtenerDeduccioness() {
        return deduccionesServicio.obtenerDeduccioness();
    }

    @PostMapping()
    public DeduccionesModelo guardarDeducciones(@RequestBody DeduccionesModelo deducciones) {
        return deduccionesServicio.guardarDeducciones(deducciones);
    }

    @GetMapping(path = "/{id}")
    public Optional<DeduccionesModelo> obtenerDeduccionesPorId(@PathVariable("id") Long id) {
        return this.deduccionesServicio.obtenerPorId(id);
    }

    //@GetMapping(path = "/query")
    //public ArrayList<DeduccionesModelo> obtenerDeduccionesPorTipo(@RequestParam("tipo") Integer tipo) {
    //    return this.deduccionesServicio.obtenerPorTipo(tipo);
    //}

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.deduccionesServicio.eliminarDeducciones(id);
        if (ok) {
            return "Se elimino exitosamente el deducciones id: " + id;
        } else {
            return "No se puso eliminar el deducciones id: " + id;
        }
    }
}
