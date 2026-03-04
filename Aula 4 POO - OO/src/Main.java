 public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "João";
        z2.nome = "Maria";

        z1.velocidade = 50;
        z2.velocidade = 30;

        z1.gritar();
        z2.gritar();

        z1.correr();
        z2.correr();
    }
