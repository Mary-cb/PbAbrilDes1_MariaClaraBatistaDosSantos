package cenario2;

public class Programa {
    public static void main(String[] args) {

        RodaGigante rodaGigante = new RodaGigante();

        Adulto paulo = new Adulto("Paulo", 42);
        Crianca joao = new Crianca("Joao", 5, paulo);
        Crianca maria = new Crianca("Maria", 12, paulo);

        Crianca pedro = new Crianca("Pedro", 12);
        Crianca henrique = new Crianca("Henrique", 12);

        rodaGigante.embarque(2, joao, maria);
        rodaGigante.embarque(2, joao, paulo);
        rodaGigante.embarque(3, maria, null);
        rodaGigante.embarque(13, pedro, null);
        rodaGigante.embarque(16, henrique, null);

        rodaGigante.status();

    }
}
