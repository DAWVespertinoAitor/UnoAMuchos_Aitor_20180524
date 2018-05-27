/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Persona;
import java.util.List;

/**
 *
 * @author aitor
 */
public interface IPersonaDAO {
    
    public void add(Persona persona);
    public List<Persona> get();
    public Persona getOne(int pk);
    public void update(Persona persona);
    public void delete(Persona persona);
    
}
