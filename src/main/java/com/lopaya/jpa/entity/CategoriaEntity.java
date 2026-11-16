package com.lopaya.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "CategoriaEntity")
@Table(name = "categorias")
@Getter
@Setter
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "color")
    private String color;

    public CategoriaEntity(Integer id, String nombre, String color) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
    }

    public CategoriaEntity(Integer id) {
        this.id = id;
    }

    public CategoriaEntity() {

    }
}
