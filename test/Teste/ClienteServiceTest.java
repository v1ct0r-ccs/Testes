package Teste;

import Teste.dao.ClienteDao;
import Teste.dao.mocks.ClienteDaoMock;
import Teste.dao.IClienteDao;
import Teste.service.ClienteService;
import Teste.service.IClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    //Salvar
    @Test
    public void salvarCli() {
        IClienteDao mockDao = new ClienteDaoMock();
        IClienteService service = new ClienteService(mockDao);
        String retorno = service.salvarCli();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void espereadoErroAoSalvarTeste() {
        IClienteDao mockDao = new ClienteDao();
        IClienteService service = new ClienteService(mockDao);
        String retorno = service.salvarCli();
        Assert.assertEquals("Sucesso", retorno);
    }

    //Buscar
    @Test
    public void buscarCli() {
        IClienteDao buscCli = new ClienteDaoMock();
        IClienteService service = new ClienteService(buscCli);
        String retorno = service.buscarCli();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void erroAoEncontrarCliente() {
        IClienteDao buscCliEr = new ClienteDao();
        IClienteService service = new ClienteService(buscCliEr);
        String retorno = service.buscarCli();
        Assert.assertEquals("Sucesso", retorno);
    }

    //Excluir
    @Test
    public void excluirCli() {
        IClienteDao exclCli = new ClienteDaoMock();
        IClienteService service = new ClienteService(exclCli);
        String retorno = service.excluirCli();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void erroAoExcluirCliente() {
        IClienteDao exclCli = new ClienteDao();
        IClienteService service = new ClienteService(exclCli);
        String retorno = service.excluirCli();
        Assert.assertEquals("Sucesso", retorno);
    }

    //Atualizar
    @Test
    public void atualizarCli() {
        IClienteDao attCli = new ClienteDaoMock();
        IClienteService service = new ClienteService(attCli);
        String retorno = service.atualizarCli();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void erroAoAtualizarCliente() {
        IClienteDao attCli = new ClienteDao();
        IClienteService service = new ClienteService(attCli);
        String retorno = service.atualizarCli();
        Assert.assertEquals("Sucesso", retorno);
    }
}
