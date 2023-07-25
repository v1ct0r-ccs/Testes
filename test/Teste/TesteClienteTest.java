package Teste;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {


    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Victor");

        Assert.assertEquals("Victor", cli.getNome());
    }

}
