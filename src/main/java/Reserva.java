import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private int id;
    private Passageiro passageiro;
    private String situacao = "ABERTA";
    private List<Voo> voosReservados = new ArrayList<>();
    private double precoTotal = 0;
    private double minutagenTotal = 0;

    public Reserva(int id, Passageiro passageiro) {
        this.id = id;
        this.passageiro = passageiro;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int buscaIDNaLista(int id){
        for(Voo v : voosReservados){
            if(id == v.getId()){
                throw new IllegalStateException("Este voo ja contem na lista!");
            }
        }
        return -1;
    }
    public List<Voo> getVoosReservados(){
        return voosReservados;
    }

    public void adicionarVoo(Voo voo){
        if(buscaIDNaLista(voo.getId()) == -1){
            voosReservados.add(voo);
        }
    }

    public void removerVoo(int idVoo){
        voosReservados.removeIf(v -> v.getId() == idVoo);
    }

    public void confirmarReserva(){
        if(getVoosReservados().size() < 1){
            throw new IllegalStateException("Deve haver pelo menos um voo para confirmar reserva");
        }
        if(passageiro.getId() < 1 || passageiro.getIdade() < 1 || passageiro.getDocumento() == null){
            throw new IllegalStateException("Verifique o ID, idade e documentos do passageiro!");
        }
        if(situacao.equals("CONFIRMADA")){
            throw new IllegalStateException("Essa reserva ja foi confirmada!");
        }
        this.situacao = "CONFIRMADA";
    }

    public double retornaSomaTotal(){
        double somaTotal = 0;

        for(Voo v : voosReservados){
            somaTotal += v.getPrecoPassagem();
        }
        precoTotal = somaTotal;
        return precoTotal;
    }

    public double retornaDuracaoTotal(){
        double somaTotal = 0;

        for(Voo v : voosReservados){
            somaTotal += v.getDuracaoMinutos();
        }
        minutagenTotal = somaTotal;
        return minutagenTotal;
    }


}