package TarefaTeste;

import org.junit.Assert;
import org.junit.Test;

public class NomesFemininosTeste {

    @Test
    public void TesteNomesFemininos() {
        Empregados empFemi = new Empregados();
        empFemi.adicionarNomeGen("Amanda Teixeira", "Feminino");
        empFemi.adicionarNomeGen("Daniele Pinho", "Feminino");
        empFemi.adicionarNomeGen("Luana Vargas", "Feminino");
        empFemi.adicionarNomeGen("Bianca Crocetti", "Feminino");
        empFemi.adicionarNomeGen("Thainara Prado", "Feminino");
        empFemi.adicionarNomeGen("Angela dos Santos", "Feminino");
        empFemi.adicionarNomeGen("Fernanda Neiva", "Feminino");
        empFemi.adicionarNomeGen("Alexandra Amorim", "Feminino");
        empFemi.adicionarNomeGen("Karen Jorgensen", "Feminino");

        Assert.assertEquals("Feminino", empFemi.getGenero());
    }

    @Test
    public void TesteNaoContemFeminino() {
        Empregados empFemi = new Empregados();
        empFemi.adicionarNomeGen("Amanda Teixeira", "Feminino");
        empFemi.adicionarNomeGen("Daniele Pinho", "Feminino");
        empFemi.adicionarNomeGen("Luana Vargas", "Feminino");
        empFemi.adicionarNomeGen("Bianca Crocetti", "Feminino");
        empFemi.adicionarNomeGen("Thainara Prado", "Feminino");
        empFemi.adicionarNomeGen("Angela dos Santos", "Feminino");
        empFemi.adicionarNomeGen("Fernanda Neiva", "Feminino");
        empFemi.adicionarNomeGen("Alexandra Amorim", "Feminino");
        empFemi.adicionarNomeGen("Karen Jorgensen", "Feminino");

        Assert.assertNotEquals("Masculino", empFemi.getGenero());
    }
}
