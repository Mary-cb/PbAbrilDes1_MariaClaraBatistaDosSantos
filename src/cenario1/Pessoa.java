package cenario1;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Pessoa conjuge;
    private List<Pessoa> filho;

    public Pessoa(String nome, Pessoa filho) {
        this.nome = nome;
        this.filho = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getConjuge() {
        return conjuge;
    }

    public void setConjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
    }

    public List<Pessoa> getFilho() {
        return filho;
    }

    public void setFilho(List<Pessoa> filho) {
        this.filho = filho;
    }

    public void addFilho(List<Pessoa> filho) {
        filho.add((Pessoa) filho);
    }

    public void addConjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
        conjuge.conjuge = this;
    }

    public void printFamilyTree(){
        System.out.print(nome);
        if(conjuge != null){
            System.out.print(" -- Casado(a) com: " + conjuge.getNome());
        }
        else{
            System.out.print(" -- Solteiro(a)");
        }
        if(filho != null){
            for(Pessoa p : filho){
                System.out.print(" -- Filho(a)" + p.getNome());
            }

        }
        else{
            System.out.print(" Não tem filhos.");
        }

    }
}
