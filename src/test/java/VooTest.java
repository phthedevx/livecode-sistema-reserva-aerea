import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VooTest {
    private Voo voo;

    @Test
    public void testarCriarVooComPrecoNegativo(){
        //Arrange
        //Act
        //Assert
        assertThrows(IllegalArgumentException.class, () -> {
            voo = new Voo(1, "Vegas", -1, 10);
        });
    }

    @Test
    public void testarCriarVooComDuracaoMenorIgualAZero(){
        //Arrange
        //Act
        //Assert
        assertThrows(IllegalArgumentException.class, () -> {
            voo = new Voo(1, "Vegas", 100, 0);
        });
    }

    @Test
    public void testarCriarVooComDestinoVazio(){
        //Arrange
        //Act
        //Assert
        assertThrows(IllegalArgumentException.class, () -> {
            voo = new Voo(1, "", 100, 10);
        });
    }

}
