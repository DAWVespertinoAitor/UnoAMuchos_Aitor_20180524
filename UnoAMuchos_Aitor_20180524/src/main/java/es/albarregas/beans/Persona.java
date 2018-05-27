/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.util.List;

/**
 *
 * @author Daw2
 */
public class Persona {
    
    private int idPerso;
    private String nombre;
    private List<Libro> libros;

    public Persona() {
    }

    public Persona(int idPerso, String nombre, List<Libro> libros) {
        this.idPerso = idPerso;
        this.nombre = nombre;
        this.libros = libros;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public int getIdPerso() {
        return idPerso;
    }

    public void setIdPerso(int idPerso) {
        this.idPerso = idPerso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
