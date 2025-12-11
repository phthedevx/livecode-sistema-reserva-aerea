public class Voo {
    private int id;
    private String destino;
    private double precoPassagem;
    private int duracaoMinutos;

    public Voo(int id, String destino, double precoPassagem,int duracaoMinutos) {
        setId(id);
        setDestino(destino);
        setPrecoPassagem(precoPassagem);
        setDuracaoMinutos(duracaoMinutos);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 1 ){
            throw new IllegalArgumentException("Id deve ser maior que zero");
        }else {
            this.id = id;
        }
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        if(destino == null || destino.isEmpty()){
            throw new IllegalArgumentException("Destino não pode estar vazia");
        }
        else{
            this.destino = destino;
        }
    }

    public double getPrecoPassagem() {
        return precoPassagem;
    }

    public void setPrecoPassagem(double precoPassagem) {
        if(precoPassagem < 0){
            throw new IllegalArgumentException("Preco não pode ser negativo!");
        } else {
            this.precoPassagem = precoPassagem;
        }
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        if(duracaoMinutos > 0){
            this.duracaoMinutos = duracaoMinutos;
        } else{
            throw new IllegalArgumentException("Duração deve ser maior que zero!");
        }
    }
}
