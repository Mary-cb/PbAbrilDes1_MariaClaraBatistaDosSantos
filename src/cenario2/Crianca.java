package cenario2;

public class Crianca extends Pessoa {
    private Pessoa responsavel;

    public Crianca (){super();}

    public Crianca(String resposavel){
        this.responsavel = new Pessoa(getNome(), getIdade());
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }
}
