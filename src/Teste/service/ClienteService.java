package Teste.service;

import Teste.dao.IClienteDao;

public class ClienteService implements IClienteService {

    private IClienteDao clienteDao;

    public ClienteService (IClienteDao clienteDao) {

        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }
    public String salvarCli() {
        clienteDao.salvarCli();
        return "Sucesso";
    }

    public String buscarCli() {
        clienteDao.buscarCli();
        return "Sucesso";
    }

    public String excluirCli() {
        clienteDao.excluirCli();
        return "Sucesso";
    }

    public String atualizarCli() {
        clienteDao.atualizarCli();
        return "Sucesso";
    }
}
