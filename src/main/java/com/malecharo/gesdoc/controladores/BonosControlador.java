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

import com.malecharo.gesdoc.modelos.BonosModelo;
import com.malecharo.gesdoc.servicios.BonosServicio;

@RestController
@RequestMapping("/bonos")
public class BonosControlador {
    @Autowired
    BonosServicio bonosServicio;

    @GetMapping()
    public ArrayList<BonosModelo> obtenerBonoss() {
        return bonosServicio.obtenerBonoss();
    }

    @PostMapping()
    public BonosModelo guardarBonos(@RequestBody BonosModelo bonos) {
        return bonosServicio.guardarBonos(bonos);
    }

    @GetMapping(path = "/{id}")
    public Optional<BonosModelo> obtenerBonosPorId(@PathVariable("id") Long id) {
        return this.bonosServicio.obtenerPorId(id);
    }

    //@GetMapping(path = "/query")
    //public ArrayList<BonosModelo> obtenerBonosPorTipo(@RequestParam("tipo") Integer tipo) {
    //    return this.bonosServicio.obtenerPorTipo(tipo);
    //}

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.bonosServicio.eliminarBonos(id);
        if (ok) {
            return "Se elimino exitosamente el bonos id: " + id;
        } else {
            return "No se puso eliminar el bonos id: " + id;
        }
    }
}
