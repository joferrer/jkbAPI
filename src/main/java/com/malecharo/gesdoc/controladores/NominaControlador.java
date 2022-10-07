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

import com.malecharo.gesdoc.modelos.NominaModelo;
import com.malecharo.gesdoc.servicios.NominaServicio;

@RestController
@RequestMapping("/nomina")
public class NominaControlador {
    @Autowired
    NominaServicio nominaServicio;

    @GetMapping()
    public ArrayList<NominaModelo> obtenerNominas() {
        return nominaServicio.obtenerNominas();
    }

    @PostMapping()
    public NominaModelo guardarNomina(@RequestBody NominaModelo nomina) {
        return nominaServicio.guardarNomina(nomina);
    }

    @GetMapping(path = "/{id}")
    public Optional<NominaModelo> obtenerNominaPorId(@PathVariable("id") Long id) {
        return this.nominaServicio.obtenerPorId(id);
    }

    //@GetMapping(path = "/query")
    //public ArrayList<NominaModelo> obtenerNominaPorTipo(@RequestParam("tipo") Integer tipo) {
    //    return this.nominaServicio.obtenerPorTipo(tipo);
    //}

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.nominaServicio.eliminarNomina(id);
        if (ok) {
            return "Se elimino exitosamente el nomina id: " + id;
        } else {
            return "No se puso eliminar el nomina id: " + id;
        }
    }
}
