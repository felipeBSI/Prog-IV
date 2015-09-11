package br.pucpr.prog4.lojaoldschool.dao;
public interface IDaoManager 
{
    void iniciar() throws DaoException;
    void encerrar();
    void confirmarTransação();
    void abortarTransação();
   // IClienteDao getClienteDao();
    ClienteDAO getClienteDao();
}
