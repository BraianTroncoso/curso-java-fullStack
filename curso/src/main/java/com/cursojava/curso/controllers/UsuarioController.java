package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioController {
    @Autowired
    private UsuarioDao usuarioDao; // Esto se llama inyeccion de dependencias

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
        public Usuario getUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Braian");
        usuario.setApellido("Troncoso");
        usuario.setEmail("troncosobraianaxel@gmail.com");
        usuario.setTelefono("019288382");
        usuario.setId(1L);
        return usuario;
    }
    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
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
    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);
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
   /* @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario>usuarios = new ArrayList<>();


        Usuario usuario = new Usuario();
        usuario.setNombre("Braian");
        usuario.setApellido("Troncoso");
        usuario.setEmail("troncosobraianaxel@gmail.com");
        usuario.setTelefono("019288382");
        usuario.setId(3L);

        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Javier");
        usuario2.setApellido("Troncoso");
        usuario2.setEmail("javier@gmail.com");
        usuario2.setTelefono("019288382");
        usuario2.setId(4L);

        Usuario usuario3 = new Usuario();
        usuario3.setNombre("Lautaro");
        usuario3.setApellido("Troncoso");
        usuario3.setEmail("Lautaro@gmail.com");
        usuario3.setTelefono("019288382");
        usuario3.setId(5L);

        Usuario usuario4 = new Usuario();
        usuario4.setNombre("Mia");
        usuario4.setApellido("Troncoso");
        usuario4.setEmail("Lautaro@gmail.com");
        usuario4.setTelefono("019288382");
        usuario4.setId(6L);

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        return usuarios;

    }
*/
}
/**
 * Googlear dudas sobre patch, super, y sintaxis con el mismo nombre de Usuario.
 * Practicar el mismo ejercicio en python(ponele creo que es con dyango)
 * Ver plugins para que me explique el codigo
 */
