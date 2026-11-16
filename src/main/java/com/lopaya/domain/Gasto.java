package com.lopaya.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class Gasto {

    private Integer id;
    private String titulo;
    private Integer categoriaId;
    private Double cantidadImporte;
    private String establecimiento;
    private String ubicacionNombre;
    private Double latitud;
    private Double longitud;
    private LocalDate fecha;
    private LocalTime hora;
    private String metodoPago;
    private String descripcion;
    private LocalDateTime creadoEn;

    //Constructor para registrar un gasto con datos basicos
    public Gasto(Integer id, String titulo, Integer categoriaId, Double cantidadImporte, String establecimiento, String ubicacionNombre, LocalDate fecha, LocalTime hora, String metodoPago, LocalDateTime creadoEn) {
        this.id = id;
        this.titulo = titulo;
        this.categoriaId = categoriaId;
        this.cantidadImporte = cantidadImporte;
        this.establecimiento = establecimiento;
        this.ubicacionNombre = ubicacionNombre;
        this.fecha = fecha;
        this.hora = hora;
        this.metodoPago = metodoPago;
        this.creadoEn = creadoEn;
    }

    //Constructor completo
    public Gasto(Integer id, String titulo, Integer categoriaId, Double cantidadImporte, String establecimiento, String ubicacionNombre, Double latitud, Double longitud, LocalDate fecha, LocalTime hora, String metodoPago, String descripcion, LocalDateTime creadoEn) {
        this.id = id;
        this.titulo = titulo;
        this.categoriaId = categoriaId;
        this.cantidadImporte = cantidadImporte;
        this.establecimiento = establecimiento;
        this.ubicacionNombre = ubicacionNombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.fecha = fecha;
        this.hora = hora;
        this.metodoPago = metodoPago;
        this.descripcion = descripcion;
        this.creadoEn = creadoEn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Double getCantidadImporte() {
        return cantidadImporte;
    }

    public void setCantidadImporte(Double cantidadImporte) {
        this.cantidadImporte = cantidadImporte;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getUbicacionNombre() {
        return ubicacionNombre;
    }

    public void setUbicacionNombre(String ubicacionNombre) {
        this.ubicacionNombre = ubicacionNombre;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(LocalDateTime creadoEn) {
        this.creadoEn = creadoEn;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Gasto gasto = (Gasto) o;
        return Objects.equals(id, gasto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Gasto{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", categoriaId=" + categoriaId +
                ", cantidadImporte=" + cantidadImporte +
                ", establecimiento='" + establecimiento + '\'' +
                ", creadoEn=" + creadoEn +
                '}';
    }
}
