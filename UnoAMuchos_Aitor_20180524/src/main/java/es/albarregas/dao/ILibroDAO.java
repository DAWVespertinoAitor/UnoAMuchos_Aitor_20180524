/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Libro;
import java.util.List;

/**
 *
 * @author aitor
 */
public interface ILibroDAO {
    
    public void add(Libro libro);
    public List<Libro> get();
    public Libro getOne(int pk);
    public void update(Libro libro);
    public void delete(Libro libro);
}
