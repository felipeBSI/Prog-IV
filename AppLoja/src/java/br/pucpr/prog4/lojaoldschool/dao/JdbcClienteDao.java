/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojaoldschool.dao;

import br.pucpr.prog4.lojaoldschool.models.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author chaves.felipe
 */
public class JdbcClienteDao implements ClienteDAO{
    
    private Connection conexão;
    

    
    public JdbcClienteDao(Connection conexão){
        this.conexão = conexão;
    }
    @Override
    public Cliente Inserir(Cliente cliente) {
        String sql;
        sql = "Insert into cliente("
                +"nome,"
                +"dataNascimento,"
                +"tipo,"
                +"sexo)"
                +" values (?,?,?,?)";
        
        PreparedStatement ps;
        try{
            ps = conexão.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setDate(2, new java.sql.Date(cliente.getDataNascimento().getTime()));
            ps.setString(3, cliente.getTipoPessoa());
            ps.setString(4,cliente.getSexo());
            
            return cliente;
            
        }catch (Exception ex){
            throw new DaoException("Ocorreu um erro ao inserir");
        }
    }
    
}
