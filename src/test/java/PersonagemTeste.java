import org.junit.Assert;
import org.junit.Test;

public class PersonagemTeste {
    @Test
    public void testeCalculoVida() {
        Personagem p1 = new Personagem(1 , 1 ,1);
        Assert.assertEquals(p1.getVida(), 1.5, 0);//1.5
    }
}
