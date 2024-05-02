package cenario1;

public class Programa {
    public static void main(String[] args) {
        Pessoa lily = new Pessoa("Lily", null);
        lily.addConjuge(new Pessoa("Wilhelm", null));

        Pessoa opa = new Pessoa("Opa", null);
        opa.addConjuge(new Pessoa("Oma", lily));

        Pessoa reinhold = new Pessoa("Reinhold", opa);
        Pessoa wilma = new Pessoa("Wilma", opa);
        Pessoa sigrid = new Pessoa("Sigrid", opa);

        reinhold.addConjuge(new Pessoa("Sonia", null));
        Pessoa christian = new Pessoa("Christian", reinhold);
        Pessoa gabrielle = new Pessoa("Gabrielle", reinhold);
        Pessoa sabine = new Pessoa("Sabine", reinhold);

        wilma.addConjuge(new Pessoa("Rodolfo", null));
        Pessoa ricardo = new Pessoa("Ricardo", wilma);
        Pessoa rodrigo = new Pessoa("Rodrigo", wilma);

        ricardo.addConjuge(new Pessoa("Debora", null));

        christian.addConjuge(new Pessoa("Monica", null));
        Pessoa oscar = new Pessoa("Oscar", christian);
        Pessoa lorena = new Pessoa("Lorena", christian);

        sigrid.addConjuge(new Pessoa("Peter", null));
        Pessoa martin = new Pessoa("Martin", sigrid);
        Pessoa thomas = new Pessoa("Thomas", sigrid);
        Pessoa claudia = new Pessoa("Claudia", sigrid);
        martin.addConjuge(new Pessoa("Carla", null));

        lily.printFamilyTree();

    }
}
