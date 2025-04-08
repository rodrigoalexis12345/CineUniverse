package com.cineuniverse.grupo1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "DetalleVenta")
public class DetalleVenta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_DetalleVenta")
    private Integer idDetalleVenta;

    @ManyToOne
    @JoinColumn(name = "Reservas_idReservas", nullable = false)
    private Reservas reserva;

    @ManyToOne
    @JoinColumn(name = "Productos_idProductos", nullable = false)
    private Productos producto;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "precioTotal", precision = 10, scale = 2)
    private java.math.BigDecimal precioTotal;

    // Getters y setters
    public Integer getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(Integer idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Reservas getReserva() {
        return reserva;
    }

    public void setReserva(Reservas reserva) {
        this.reserva = reserva;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public java.math.BigDecimal getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(java.math.BigDecimal precioTotal) {
        this.precioTotal = precioTotal;
    }
}
