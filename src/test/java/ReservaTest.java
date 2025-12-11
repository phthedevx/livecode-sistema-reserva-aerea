import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class ReservaTest {
    private Passageiro passageiro;
    private Reserva reserva;
    private Voo voo;

    @BeforeEach
    public void setUp(){
        passageiro = new Passageiro(1, "Pedro", 19, "051.245.765-34");
        voo = new Voo(1, "Vegas", 100, 10);
    }

    @Test
    public void testarCriarVooDuplicado(){
        //Arrange
        Voo voo2 = new Voo(1, "Vegas", 100, 10);
        Reserva r = new Reserva(1, passageiro);
        r.adicionarVoo(voo);

        assertThrows(IllegalStateException.class, () -> {
            r.adicionarVoo(voo2);
        });
    }

    @Test
    public void testarConfirmarReservaSemVoo(){
        //Arrange
        Reserva r = new Reserva(1, passageiro);

        assertThrows(IllegalStateException.class, () -> {
            r.confirmarReserva();
        });
    }

    @Test
    public void confirmarReservaJaConfirmada(){
        //Arrange

        Reserva r = new Reserva(1, passageiro);
        voo = new Voo(1, "Vegas", 100, 10);
        r.adicionarVoo(voo);
        r.confirmarReserva();
        //Act
        //Assert
        assertThrows(IllegalStateException.class, () -> {
            r.confirmarReserva();
        });
    }
    /*
       @Test
       public void confirmarReservaComPassageiroInvalido(){
           //Arrange
           Passageiro p = new Passageiro(1, "Pedro", 19, "");
           Reserva r = new Reserva(1, p);
           voo = new Voo(1, "Vegas", 100, 10);
           r.adicionarVoo(voo);
           r.confirmarReserva();
           //Act
           //Assert
           assertThrows(IllegalArgumentException.class, () -> {
               reserva.confirmarReserva();
           });
       }
   */
    @Test
    public void testarValorTotalDaReserva(){
        //Arrange
        Reserva r = new Reserva(1, passageiro);
        r.adicionarVoo(voo);

        //Act
        //Assert
        assertEquals(100, r.retornaSomaTotal());
    }

    @Test
    public void testarTempoTotalDaViagem(){
        //Arrange
        Reserva r = new Reserva(1, passageiro);
        r.adicionarVoo(voo);

        //Act
        //Assert
        assertEquals(10, r.retornaDuracaoTotal());
    }

    @Test
    public void testarRemoverVooMesmoSeNaoExistir(){
        //Arrange
        Reserva r = new Reserva(1, passageiro);
        //Act
        r.removerVoo(1);
        // Assert
        assertEquals(0, r.getVoosReservados().size());
    }


    @Test
    public void testarQtdVoosNaListaConformeForAdicionando(){
        //Arrange
        Reserva r = new Reserva(1, passageiro);
        Voo voo1 = new Voo(2, "Michigan", 200, 20);
        Voo voo2 = new Voo(3, "Marsheville", 300, 30);
        //Act
        r.adicionarVoo(voo);
        r.adicionarVoo(voo1);
        r.adicionarVoo(voo2);
        //Assert
        assertEquals(3, r.getVoosReservados().size());
    }


}
