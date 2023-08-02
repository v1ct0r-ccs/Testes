package Teste;

import Teste.dao.ContratoDao;
import Teste.dao.IContratoDao;
import Teste.dao.mocks.ContratoDaoMock;
import Teste.service.ContratoService;
import Teste.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {
    //Salvar
    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    // Bucar
    @Test
    public void buscar() {
        IContratoDao busc = new ContratoDaoMock();
        IContratoService service = new ContratoService(busc);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void esperadoErroContratoInexistente() {
        IContratoDao busc = new ContratoDao();
        IContratoService service = new ContratoService(busc);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }

    // Excluir

    @Test
    public void excluir() {
        IContratoDao excl = new ContratoDaoMock();
        IContratoService service = new ContratoService(excl);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void esperodoErroContratoNaoEncontradoParaExclusao() {
        IContratoDao excl = new ContratoDao();
        IContratoService service = new ContratoService(excl);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }

    //Atualizar
    @Test
    public void Atualizar() {
        IContratoDao att = new ContratoDaoMock();
        IContratoService service = new ContratoService(att);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void falhaAoAtualizar() {
        IContratoDao att = new ContratoDao();
        IContratoService service = new ContratoService(att);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
