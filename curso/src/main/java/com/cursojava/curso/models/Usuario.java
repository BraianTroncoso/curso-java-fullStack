package com.cursojava.curso.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
// Lombok es una Libreria que hace anotaciones para resumir código, get, set, toStr, Equal...
@Entity // Indicamos que es una entidad que hace referencia a la base de datos
@ToString @EqualsAndHashCode
@Table(name = "usuarios") //Indicamos que tabla tiene que utilizar EntityManager
public class Usuario {

    @Id // Indicamos que es la primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Long id;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter @Column(name = "apellido")
    private String apellido;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "telefono")
    private String telefono;

    @Getter @Setter @Column(name = "password")
    private String password;


}
