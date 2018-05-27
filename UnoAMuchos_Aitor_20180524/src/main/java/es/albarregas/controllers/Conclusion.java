package es.albarregas.controllers;

import es.albarregas.beans.Libro;
import es.albarregas.beans.Persona;
import es.albarregas.dao.ILibroDAO;
import es.albarregas.daofactory.DAOFactory;
import es.albarregas.dao.IPersonaDAO;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

/**
 *
 * @author Jesus
 */
@WebServlet(name = "Conclusion", urlPatterns = {"/conclusion"})
public class Conclusion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAOFactory daof = DAOFactory.getDAOFactory();
        IPersonaDAO pdao = daof.getPersonaDAO();
        ILibroDAO ldao = daof.getLibroDAO();
//        IGenericoDAO gdao = daof.getGenericoDAO();
        Persona persona = new Persona();
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();

        List<Libro> libros = new ArrayList();

        String url = null;
        switch (request.getParameter("op")) {

//            case "delete":
//                profesor = adao.getOne(Integer.parseInt(request.getParameter("registro")));
//                adao.delete(profesor);
//                profesor = pdao.getOne(Integer.parseInt(request.getParameter("registro")));
//                pdao.delete(profesor);
//                url = "index.html";
//                break;
            case "update":
                try {
                    BeanUtils.populate(persona, request.getParameterMap());
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Conclusion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvocationTargetException ex) {
                    Logger.getLogger(Conclusion.class.getName()).log(Level.SEVERE, null, ex);
                }

                String[] titulos = request.getParameterValues("titulo");
                String[] idLibros = request.getParameterValues("idLibro");
                
                libro1.setIdLibro(Integer.valueOf(idLibros[0]));
                libro2.setIdLibro(Integer.valueOf(idLibros[1]));
                libro3.setIdLibro(Integer.valueOf(idLibros[2]));
                
                libro1.setTitulo(titulos[0]);
                libro2.setTitulo(titulos[1]);
                libro3.setTitulo(titulos[2]);
                
                libros.add(libro1);
                libros.add(libro2);
                libros.add(libro3);
                
                persona.setLibros(libros);
                pdao.update(persona);
                url = "index.html";
                break;
        }
        request.getRequestDispatcher(url).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
