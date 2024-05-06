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

    public void embarque(int numero, Pessoa... pessoas) {
        if (numero >= 1 && numero <= this.gondolas.size()) {
            Gondola gondola = this.gondolas.get(numero - 1);
            for (Pessoa pessoa : pessoas) {
                gondola.embarcar(pessoa);
            }
        } else {
            System.out.println("Gondola numero " + numero + " não encontrada.");
        }
    }


    public void status() {
        System.out.println("Roda gigante:");
        for (int i = 0; i < this.gondolas.size(); i++) {
            System.out.print("Gondola " + (i + 1) + ": ");
            this.gondolas.get(i).printOcupantes();
        }
    }
}





