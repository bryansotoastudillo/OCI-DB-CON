/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoytsmarkplanet.model;

/**
 *
 * @author marco
 */
public class PeliculaDAO {
    private int id;
    private String titulo;
    private String director;
    private int annio;
    private int duracion;
    private String genero;

    public PeliculaDAO() {
    }

    public PeliculaDAO(int id, String titulo, String director, int annio, int duracion, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.annio = annio;
        this.duracion = duracion;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "PeliculaDAO{" + "id=" + id + ", titulo=" + titulo + ", director=" + director + ", annio=" + annio + ", duracion=" + duracion + ", genero=" + genero + '}';
    }
    
    
}
