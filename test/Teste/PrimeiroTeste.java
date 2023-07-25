package Teste;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {
    @Test
    public void test() {
        String nome = "Victor";
        Assert.assertEquals("Victor", nome);
    }

    @Test
    public void testNotEquals() {
        String nome = "Victor";
        Assert.assertNotEquals("Victor1", nome);
    }
}
