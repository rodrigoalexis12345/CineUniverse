package com.cineuniverse.grupo1.models;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Funciones")
public class Funciones {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFuncion")
    private Integer idFuncion;

    @ManyToOne
    @JoinColumn(name = "Peliculas_idPeliculas", nullable = false)
    private Peliculas pelicula;

    @ManyToOne
    @JoinColumn(name = "Salas_idSalas", nullable = false)
    private Salas sala;

    @Column(name = "fecha", columnDefinition = "DATE")
    private LocalDate fecha;

    @Column(name = "hora", columnDefinition = "TIME")
    private LocalTime hora;

    @Column(name = "precio", precision = 10, scale = 2)
    private java.math.BigDecimal precio;

    // Getters y setters
    public Integer getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(Integer idFuncion) {
        this.idFuncion = idFuncion;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public Salas getSala() {
        return sala;
    }

    public void setSala(Salas sala) {
        this.sala = sala;
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

    public java.math.BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(java.math.BigDecimal precio) {
        this.precio = precio;
    }
}
