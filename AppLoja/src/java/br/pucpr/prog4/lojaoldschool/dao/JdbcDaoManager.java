package br.pucpr.prog4.lojaoldschool.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcDaoManager implements IDaoManager 
{
    private Connection conexão;
    private JdbcClienteDao clienteDAO;
   // JdbcClienteDao clienteDao;
    
    public JdbcDaoManager()
    {
       // clienteDao = new JdbcClienteDao();
    }
    
    
    @Override
    public void iniciar() throws DaoException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url;
            url = "jdbc:mysql://localhost:3306/loja";
            conexão = DriverManager.getConnection(url, "root", "root");
            conexão.setAutoCommit(false);
            clienteDAO =  new JdbcClienteDao(conexão);
           // clienteDao.setConexão(conexão);
            
        }
        catch( Exception ex )
        {
            throw new DaoException("Ocorreu um erro ao conectar ao banco de dados:" + 
                    ex.getMessage());
        }
    }

    @Override
    public void encerrar() 
    {
        try {
            if(!conexão.isClosed())
                conexão.close();
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public void confirmarTransação() {
        try{
            conexão.commit();
        }catch (SQLException ex){
            throw new DaoException("Ocorreu um erro ao confirmar a transação"); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public void abortarTransação() {
        try{
            conexão.rollback();
        }catch(SQLException ex){
        
            throw new DaoException("Ocorreu um erro ao abortar a operação."); //To change body of generated methods, choose Tools | Templates.
       
        }
    }

  //  @Override
  //  public IClienteDao getClienteDao() 
   // {
   //     return clienteDao;
   // }

    @Override
    public ClienteDAO getClienteDao() {
       return clienteDAO;
    }
    
}
