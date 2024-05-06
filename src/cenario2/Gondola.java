package cenario2;

public class Gondola {
    private Integer numero;
    private Pessoa assento1;
    private Pessoa assento2;

    public Gondola() {}

    public Gondola(Integer numero, Pessoa assento1, Pessoa assento2) {
        this.numero = numero;
        this.assento1 = assento1;
        this.assento2 = assento2;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Pessoa getAssento1() {
        return assento1;
    }
    public void setAssento1(Pessoa assento1) {
        this.assento1 = assento1;
    }
    public Pessoa getAssento2() {
        return assento2;
    }
    public void setAssento2(Pessoa assento2) {
        this.assento2 = assento2;
    }

    public void embarcar(Pessoa pessoa) {
        if (this.assento1 == null) {
            this.assento1 = pessoa;
        } else if (this.assento2 == null) {
            this.assento2 = pessoa;
        } else {
            System.out.println("Gôndola cheia.");
        }
    }

    public void printOcupantes() {
        if (assento1 != null) {
            System.out.print(assento1.getNome());
            if (assento2 != null) {
                System.out.print(" e " + assento2.getNome());
            }
        }
        System.out.println();
    }

}

