import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassageiroTest {
    private Passageiro passageiro;

    @Test
    public void testarCriacaoPassageiro(){
        //Arrange
        passageiro = new Passageiro(1, "Pedro", 19, "051.245.765-34");
        //Act
        //Assert
        assertEquals(1, passageiro.getId());
        assertEquals("Pedro", passageiro.getNome());
        assertEquals(19, passageiro.getIdade());
        assertEquals("051.245.765-34", passageiro.getDocumento());
    }

    @Test
    public void testarSetters(){
        //Arrange
        passageiro = new Passageiro(1, "Pedro", 19, "051.245.765-34");
        //Act
        passageiro.setId(2);
        passageiro.setNome("PH");
        passageiro.setIdade(20);
        passageiro.setDocumento("051.245.765-36");
        //Assert
        assertEquals(2, passageiro.getId());
        assertEquals("PH", passageiro.getNome());
        assertEquals(20, passageiro.getIdade());
        assertEquals("051.245.765-36", passageiro.getDocumento());
    }
}
