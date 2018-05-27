/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;


import es.albarregas.beans.Libro;
import es.albarregas.beans.Persona;
import es.albarregas.dao.ILibroDAO;
import es.albarregas.daofactory.DAOFactory;
import es.albarregas.dao.IPersonaDAO;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesus
 */
@WebServlet(name = "Eleccion", urlPatterns = {"/eleccion"})
public class Eleccion extends HttpServlet {

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
        String url = null;
        int contador= 0;
        DAOFactory daof = DAOFactory.getDAOFactory();
//        IGenericoDAO gdao = daof.getGenericoDAO();
        IPersonaDAO pdao = daof.getPersonaDAO();
        ILibroDAO ldao = daof.getLibroDAO();
        switch(request.getParameter("op")){
            case "add":
                url = "JSP/formularioAlta.jsp";
                break;
            case "delete":
            case "update":
            case "list":
                url = "JSP/listado.jsp";
                contador = contador + contador;
                List<Persona> listaPersona = pdao.get();
                request.setAttribute("listadoPersona", listaPersona);
            break;
            
        }
        switch(request.getParameter("op")){
            case "delete":
                url = "JSP/borrado.jsp";
                List<Persona> listaPersona = pdao.get();
                request.setAttribute("listadoPersona", listaPersona);
                break;
            case "update":
                listaPersona = pdao.get();
                request.setAttribute("listadoPersona", listaPersona);
                url = "JSP/actual.jsp";
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
