public class Passageiro {
    private int id;
    private String nome;
    private int idade;
    private String documento;

    public Passageiro(int id, String nome, int idade, String documento) {
        setId(id);
        this.id = id;
        this.nome = nome;
        setIdade(idade);
        setDocumento(documento);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0){
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("Id deve ser maior que zero");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        }
        else{
            throw new IllegalArgumentException("Idade deve ser maior que zero");
        }
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if(documento == null || documento.equals("")) {
            throw new IllegalArgumentException("Documento não pode ser nulo");
        }
    else{
            this.documento = documento;
        }
    }
}
