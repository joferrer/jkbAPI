package com.malecharo.gesdoc.servicios;

import com.malecharo.gesdoc.modelos.UsuarioModelo;
import com.malecharo.gesdoc.repositorios.UsuarioRepositorio;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    public ArrayList<UsuarioModelo> obtenerUsuarios() {
        return (ArrayList<UsuarioModelo>) usuarioRepositorio.findAll();
    }

    public UsuarioModelo guardarUsuario(UsuarioModelo usuario) {
        return usuarioRepositorio.save(usuario);
    }

    public Optional<UsuarioModelo> obtenerPorId(Long id) {
        return usuarioRepositorio.findById(id);

    }

    public ArrayList<UsuarioModelo> obtenerPorTipo(Integer tipo) {
        return usuarioRepositorio.findByTipo(tipo);
    }

    public boolean eliminarUsuario(Long id) {
        try {
            usuarioRepositorio.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
