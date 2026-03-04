public class Zumbi {

    String nome;
    double vida;

    public void mostraVida() {
        System.out.println("Vida de "+nome+": " + vida);
    }
    public void transfereVida (Zumbi zumbiAlvo, double quantia) {
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
}
