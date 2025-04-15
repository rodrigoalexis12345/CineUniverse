package com.cineuniverse.grupo1.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Reservas")
public class Reservas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReservas")
    private Long idReserva;

    @ManyToOne
    @JoinColumn(name = "Funciones_idFunciones", nullable = false)
    private Funciones funcion;

    @ManyToOne
    @JoinColumn(name = "Usuarios_idUsuarios", nullable = false)
    private Usuarios usuario;

    @Column(name = "numeroAsiento", length = 45)
    private String numeroAsiento;

    @Column(name = "fechaHoraReserva", columnDefinition = "TIMESTAMP")
    private LocalDateTime fechaHoraReserva;

    // Getters y setters
    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public Funciones getFuncion() {
        return funcion;
    }

    public void setFuncion(Funciones funcion) {
        this.funcion = funcion;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public LocalDateTime getFechaHoraReserva() {
        return fechaHoraReserva;
    }

    public void setFechaHoraReserva(LocalDateTime fechaHoraReserva) {
        this.fechaHoraReserva = fechaHoraReserva;
    }
}
