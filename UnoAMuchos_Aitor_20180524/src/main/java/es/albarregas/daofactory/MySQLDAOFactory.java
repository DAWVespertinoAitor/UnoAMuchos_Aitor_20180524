package es.albarregas.daofactory;


import es.albarregas.dao.LibroDAO;
import es.albarregas.dao.ILibroDAO;
import es.albarregas.dao.PersonaDAO;
import es.albarregas.dao.IPersonaDAO;


public class MySQLDAOFactory extends DAOFactory{

    @Override
    public IPersonaDAO getPersonaDAO() {
        return new PersonaDAO();
    }
    @Override
    public ILibroDAO getLibroDAO() {
        return new LibroDAO();
    }

}
