package Teste;

import org.junit.Assert;
import org.junit.Test;

public class SegundoTeste {
    @Test
    public void testSeg() {
        String nome = "Bruno";
        Assert.assertEquals("Bruno", nome);
    }
}
