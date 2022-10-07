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

import com.malecharo.gesdoc.modelos.EmpleadoModelo;
import com.malecharo.gesdoc.servicios.EmpleadoServicio;

@RestController
@RequestMapping("/empleado")
public class EmpleadoControlador {
    @Autowired
    EmpleadoServicio empleadoServicio;

    @GetMapping()
    public ArrayList<EmpleadoModelo> obtenerEmpleados() {
        return empleadoServicio.obtenerEmpleados();
    }

    @PostMapping()
    public EmpleadoModelo guardarEmpleado(@RequestBody EmpleadoModelo empleado) {
        return empleadoServicio.guardarEmpleado(empleado);
    }

    @GetMapping(path = "/{id}")
    public Optional<EmpleadoModelo> obtenerEmpleadoPorId(@PathVariable("id") Long id) {
        return this.empleadoServicio.obtenerPorId(id);
    }

    @GetMapping(path = "/query")
    public ArrayList<EmpleadoModelo> obtenerEmpleadoPorTipo(@RequestParam("tipo") Integer tipo) {
        return this.empleadoServicio.obtenerPorTipo(tipo);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.empleadoServicio.eliminarEmpleado(id);
        if (ok) {
            return "Se elimino exitosamente el empleado id: " + id;
        } else {
            return "No se puso eliminar el empleado id: " + id;
        }
    }
}
