package cenario1;

public class Programa {
    public static void main(String[] args) {
        Pessoa lily = new Pessoa("Lily");
        lily.addConjuge(new Pessoa("Wilhelm"));

        Pessoa opa = new Pessoa("Opa");
        opa.addConjuge(new Pessoa("Oma"));
        lily.addFilho(opa);

        Pessoa reinhold = new Pessoa("Reinhold");
        Pessoa wilma = new Pessoa("Wilma");
        Pessoa sigrid = new Pessoa("Sigrid");
        opa.addFilho(reinhold);
        opa.addFilho(wilma);
        opa.addFilho(sigrid);;

        reinhold.addConjuge(new Pessoa("Sonia"));

        Pessoa christian = new Pessoa("Christian");
        christian.addConjuge(new Pessoa("Monica"));
        Pessoa gabrielle = new Pessoa("Gabrielle");
        Pessoa sabine = new Pessoa("Sabine");
        Pessoa oscar = new Pessoa("Oscar");
        Pessoa lorena = new Pessoa("Lorena");
        reinhold.addFilho(christian);
        christian.addFilho(oscar);
        christian.addFilho(lorena);
        christian.addFilho(gabrielle);
        christian.addFilho(sabine);

        wilma.addConjuge(new Pessoa("Rodolfo"));
        Pessoa ricardo = new Pessoa("Ricardo");
        ricardo.addConjuge(new Pessoa("Debora"));
        Pessoa rodrigo = new Pessoa("Rodrigo");
        wilma.addFilho(ricardo);
        wilma.addFilho(rodrigo);


        sigrid.addConjuge(new Pessoa("Peter"));
        Pessoa martin = new Pessoa("Martin");
        martin.addConjuge(new Pessoa("Carla"));
        Pessoa Nicolas = new Pessoa("Nicolas");
        Pessoa thomas = new Pessoa("Thomas");
        Pessoa claudia = new Pessoa("Claudia");
        sigrid.addFilho(martin);
        sigrid.addFilho(Nicolas);
        sigrid.addFilho(thomas);
        sigrid.addFilho(claudia);

        lily.imprimirArvore();

    }
}
