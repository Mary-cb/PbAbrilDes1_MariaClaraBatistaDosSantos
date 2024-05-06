package cenario2;

public class Programa {
    public static void main(String[] args) {

        RodaGigante rodaGigante = new RodaGigante();
        Adulto paulo = new Adulto("Paulo", 42);

        Crianca joao = new Crianca("Joao", 5, paulo);
        Crianca maria = new Crianca("Maria", 12, paulo);

        Crianca pedro = new Crianca("Pedro", 13);
        Crianca henrique = new Crianca("Henrique", 10);

        rodaGigante.embarque(2, joao, paulo);
        rodaGigante.embarque(3, maria);
        rodaGigante.embarque(13, pedro);
        rodaGigante.embarque(16, henrique);
        rodaGigante.status();

    }
}
