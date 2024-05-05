package cenario2;

public class Crianca extends Pessoa {
    private Adulto responsavel;

    public Crianca(String nome, Integer idade){
        super(nome, idade);
    }

    public Crianca(String nome, Integer idade, Adulto responsavel){
        super(nome, idade);
        this.responsavel = responsavel;
    }

    public Adulto getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Adulto responsavel) {
        this.responsavel = responsavel;
    }

    public void verificarIdade(Integer idade){
        if(idade <= 12 && responsavel == null){
            throw new CriancaException("Crianças menores de 12 anos só podem brincar acompanhadas dos pais!");
        }
    }
}
