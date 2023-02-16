package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
        public Usuario getUsuario(@PathVariable String id){
        Usuario usuario = new Usuario();
        usuario.setNombre("Braian");
        usuario.setApellido("Troncoso");
        usuario.setEmail("troncosobraianaxel@gmail.com");
        usuario.setTelefono("019288382");
        return usuario;
    }
    @RequestMapping(value = "usuario")
    public Usuario modificar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Braian");
        usuario.setApellido("Troncoso");
        usuario.setEmail("troncosobraianaxel@gmail.com");
        usuario.setTelefono("019288382");
        return usuario;
    }
    @RequestMapping(value = "usuario")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Braian");
        usuario.setApellido("Troncoso");
        usuario.setEmail("troncosobraianaxel@gmail.com");
        usuario.setTelefono("019288382");
        return usuario;
    }
    @RequestMapping(value = "usuario")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Braian");
        usuario.setApellido("Troncoso");
        usuario.setEmail("troncosobraianaxel@gmail.com");
        usuario.setTelefono("019288382");
        return usuario;
    }
}
