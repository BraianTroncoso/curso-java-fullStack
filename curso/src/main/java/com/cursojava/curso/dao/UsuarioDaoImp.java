package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    private EntityManager entityManager; // Nos sirve para hacer la conexión la BDD

    @Transactional
    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario"; // Hacemos la consulta, usuario vendria ser el nombre de la clase en Java
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminar(Long id) {
        Usuario usuario = entityManager.find(Usuario.class, id);
        entityManager.remove(usuario);
    }
}
