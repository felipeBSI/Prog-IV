
package br.pucpr.prog4.lojaoldschool.models;

import br.pucpr.prog4.lojaoldschool.dao.ClienteDAO;
import br.pucpr.prog4.lojaoldschool.dao.IDaoManager;
import br.pucpr.prog4.lojaoldschool.dao.JdbcDaoManager;


public class ClienteManagerImpl implements ClienteManager {

    @Override
    public Cliente cadastrar(Cliente cliente) { //fazer validações
        IDaoManager manager;
        manager = new JdbcDaoManager();
        try{
        manager.iniciar();
        ClienteDAO dao = manager.getClienteDao();
        Cliente c;
        c = dao.Inserir(cliente);
        manager.confirmarTransação();
        manager.encerrar();
        return c;
        }catch(Exception ex){
            manager.abortarTransação();
            throw ex;
        }
    }
    
}
