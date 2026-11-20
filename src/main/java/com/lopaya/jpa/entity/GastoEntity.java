package com.lopaya.jpa.entity;

import com.lopaya.domain.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity(name = "GastoEntity")
@Table(name = "gastos")
@Getter
@Setter
public class GastoEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEntity categoriaEntity;

    @Column(name = "cantidad_importe")
    private BigDecimal cantidadImporte;

    @Column(name = "establecimiento")
    private String establecimiento;

    @Column(name = "ubicacion_nombre")
    private String ubicacionNombre;

    @Column(name = "latitud")
    private Double latitud;

    @Column(name = "longitud")
    private Double longitud;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "hora")
    private LocalTime hora;

    @Column(name = "metodo_pago")
    private String metodoPago;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "creado_en")
    private LocalDateTime creadoEn;

    //Constructor para registrar un gasto con datos basicos
    public GastoEntity(Integer id, String titulo, CategoriaEntity categoriaEntity, BigDecimal cantidadImporte, String establecimiento, String ubicacionNombre, LocalDate fecha, LocalTime hora, String metodoPago, LocalDateTime creadoEn) {
        this.id = id;
        this.titulo = titulo;
        this.categoriaEntity = categoriaEntity;
        this.cantidadImporte = cantidadImporte;
        this.establecimiento = establecimiento;
        this.ubicacionNombre = ubicacionNombre;
        this.fecha = fecha;
        this.hora = hora;
        this.metodoPago = metodoPago;
        this.creadoEn = creadoEn;
    }

    //Constructor completo
    public GastoEntity(Integer id, String titulo, CategoriaEntity categoriaEntity, BigDecimal cantidadImporte, String establecimiento, String ubicacionNombre, Double latitud, Double longitud, LocalDate fecha, LocalTime hora, String metodoPago, String descripcion, LocalDateTime creadoEn) {
        this.id = id;
        this.titulo = titulo;
        this.categoriaEntity = categoriaEntity;
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

    public GastoEntity() {

    }

    @Override
    public String toString() {
        return "GastoEntity{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", categoriaEntity=" + categoriaEntity +
                ", cantidadImporte=" + cantidadImporte +
                ", establecimiento='" + establecimiento + '\'' +
                ", ubicacionNombre='" + ubicacionNombre + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", metodoPago='" + metodoPago + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", creadoEn=" + creadoEn +
                '}';
    }
}
