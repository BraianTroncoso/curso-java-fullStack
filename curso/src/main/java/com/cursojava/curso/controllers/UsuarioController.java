package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
        public Usuario getUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Braian");
        usuario.setApellido("Troncoso");
        usuario.setEmail("troncosobraianaxel@gmail.com");
        usuario.setTelefono("019288382");
        usuario.setId(1L);
        return usuario;
    }
    @RequestMapping(value = "usuario123")
    public Usuario modificar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Braian");
        usuario.setApellido("Troncoso");
        usuario.setEmail("troncosobraianaxel@gmail.com");
        usuario.setTelefono("019288382");
        return usuario;
    }
    @RequestMapping(value = "usuario432")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Braian");
        usuario.setApellido("Troncoso");
        usuario.setEmail("troncosobraianaxel@gmail.com");
        usuario.setTelefono("019288382");
        return usuario;
    }
    @RequestMapping(value = "usuario654")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Braian");
        usuario.setApellido("Troncoso");
        usuario.setEmail("troncosobraianaxel@gmail.com");
        usuario.setTelefono("019288382");
        return usuario;
    }
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(@PathVariable Long id){
        List<Usuario>usuarios = new ArrayList<>();


        Usuario usuario = new Usuario();
        usuario.setNombre("Braian");
        usuario.setApellido("Troncoso");
        usuario.setEmail("troncosobraianaxel@gmail.com");
        usuario.setTelefono("019288382");
        usuario.setId(3L);

        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Javier");
        usuario2.setApellido("Troncosso");
        usuario2.setEmail("javier@gmail.com");
        usuario2.setTelefono("019288382");
        usuario2.setId(4L);

        Usuario usuario3 = new Usuario();
        usuario3.setNombre("Lautaro");
        usuario3.setApellido("Troncose");
        usuario3.setEmail("Lautaro@gmail.com");
        usuario3.setTelefono("019288382");
        usuario3.setId(5L);


        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;

    }

}
