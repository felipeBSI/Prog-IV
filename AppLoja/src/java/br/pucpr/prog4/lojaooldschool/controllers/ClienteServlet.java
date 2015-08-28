/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojaooldschool.controllers;

import br.pucpr.prog4.lojaoldschool.models.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chaves.felipe
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/Cliente/Cadastro"})
public class ClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/ClienteForm.jsp");
        rd.forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Cliente cliente = new Cliente();
        cliente.setTipoPessoa(request.getParameter("Pessoa"));
        cliente.setNome(request.getParameter("nome"));
        String CPFAux;
        CPFAux = request.getParameter("cpf");
        int CPF;
        CPF = Integer.parseInt(CPFAux);
        cliente.setCPF(CPF);
        cliente.setSexo(request.getParameter("sexo"));
        cliente.setComentario("cmt");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data;      
            data = sdf.parse(request.getParameter("dtN"));
            cliente.setDataNascimento(data);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
}
