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

import com.malecharo.gesdoc.modelos.UsuarioModelo;
import com.malecharo.gesdoc.servicios.UsuarioServicio;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
    @Autowired
    UsuarioServicio usuarioServicio;

    @GetMapping()
    public ArrayList<UsuarioModelo> obtenerUsuarios() {
        return usuarioServicio.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModelo guardarUsuario(@RequestBody UsuarioModelo usuario) {
        return usuarioServicio.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModelo> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioServicio.obtenerPorId(id);
    }

    @GetMapping(path = "/query")
    public ArrayList<UsuarioModelo> obtenerUsuarioPorTipo(@RequestParam("tipo") Integer tipo) {
        return this.usuarioServicio.obtenerPorTipo(tipo);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.usuarioServicio.eliminarUsuario(id);
        if (ok) {
            return "Se elimino exitosamente el usuario id: " + id;
        } else {
            return "No se puso eliminar el usuario id: " + id;
        }
    }
}
