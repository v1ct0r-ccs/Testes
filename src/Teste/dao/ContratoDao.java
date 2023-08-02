package Teste.dao;

public class ContratoDao implements IContratoDao {
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funcina com o banco");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Contrato inexistente");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Contrato não encontrado para exclusão");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Falha ao atulaizar o contrato");
    }


}
