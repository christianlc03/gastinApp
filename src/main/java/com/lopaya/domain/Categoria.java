package com.lopaya.domain;

import java.util.Objects;

public class Categoria {

    private Integer id;
    private String nombre;
    private String color;

    public Categoria(Integer id, String nombre, String color) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
