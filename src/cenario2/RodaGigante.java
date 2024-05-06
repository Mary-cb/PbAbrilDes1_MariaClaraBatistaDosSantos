package cenario2;

import java.util.ArrayList;
import java.util.List;

public class RodaGigante {
    private List<Gondola> gondolas = new ArrayList<>();

    public RodaGigante() {
    }

    public RodaGigante(List<Gondola> gondolas) {
        this.gondolas = gondolas;
        for (int i = 0; i < 18; i++) {
            this.gondolas.add(new Gondola());
        }
    }

    public List<Gondola> getGondolas() {
        return gondolas;
    }

    public void setGondolas(List<Gondola> gondolas) {
        this.gondolas = gondolas;
    }

    public void embarque(Integer numero, Pessoa assento1, Pessoa assento2) {
        for (int i = 1; i <= numero; i++) {
            Gondola gondola = new Gondola(numero, assento1, assento2);
            gondolas.add(gondola);
        }
    }

    public void status() {
        System.out.println("Roda Gigante:");
        try {
            for (int num = 1; num <= gondolas.size(); num++) {
                Gondola gondola = new Gondola();
                gondola.setNumero(num);
                if (gondola.getAssento1() == null && gondola.getAssento2() == null) {
                    System.out.println("*" + gondola.getNumero() + "(Gôndola vazia)");
                } else if (gondola.getAssento1() != null && gondola.getAssento2() != null) {
                    System.out.println("*" + gondola.getNumero() + "(" + gondola.getAssento1().getNome() + " - " + gondola.getAssento2().getNome() + ")");
                } else if (gondola.getAssento1() == null) {
                    System.out.println("*" + gondola.getNumero() + "(" + gondola.getAssento2().getNome() + ")");
                } else if (gondola.getAssento2() == null) {
                    System.out.println("*" + gondola.getNumero() + "(" + gondola.getAssento1().getNome() + ")");
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}





