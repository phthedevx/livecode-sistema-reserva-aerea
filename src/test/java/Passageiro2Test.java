import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Passageiro2Test {
    private Passageiro passageiro;

    @Test
    public void testarcriarPassageiroComIdadeMenorQue1(){
        //Arrange
        //Act
        //Assert
        assertThrows(IllegalArgumentException.class, () -> {
            passageiro = new Passageiro(1, "Pedro", 0, "051.245.765-34");
        });
    }
    @Test
    public void testarCriacaoPassageiroComDocumentoVazio(){
        //Arrange
        //Act
        //Assert
        assertThrows(IllegalArgumentException.class, () -> {
            passageiro = new Passageiro(1, "Pedro", 19, null);
        });

    }

    @Test
    public void testarSetterIdadeInvalida(){
        //Arrange
        passageiro = new Passageiro(1, "Pedro", 19, "051.245.765-34");
        //Act
        //Assert
        assertThrows(IllegalArgumentException.class, () -> {
            passageiro.setIdade(0);
        });
    }

}
