package Teste.dao;

public class ClienteDao implements IClienteDao {

    public void salvarCli() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
        //return "Sucesso";
    }

    public void buscarCli() {
        throw new UnsupportedOperationException("Cliente inexistente");
    }

    public void excluirCli() {
        throw new UnsupportedOperationException("Cliente não encontrado para exclusão");
    }

    public void atualizarCli() {
        throw new UnsupportedOperationException("Falha ao atualizar os dados do cliente");
    }

}
