package Teste;

public class TesteCliente {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarNome(String nome) {
        setNome(nome);
    }
}