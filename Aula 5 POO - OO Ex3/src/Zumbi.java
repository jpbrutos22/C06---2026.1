public class Zumbi {

    String nome;
    double vida;

    public void mostraVida() {
        System.out.println("Vida de "+nome+": " + vida);
    }
    public boolean transfereVida (Zumbi zumbiAlvo, double quantia) {

        if (vida > quantia) {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }
        else {
            return false;
        }

    }
}
