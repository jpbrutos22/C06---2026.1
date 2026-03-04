//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main() {

    Zumbi z1 = new Zumbi();
    Zumbi z2 = new Zumbi();

    z1.nome = "João";
    z2.nome = "Maria";

    z1.vida = 30;
    z2.vida = 10;

    z1.mostraVida();
    z2.mostraVida();

    if (z1.transfereVida(z2, 30) == true) {
        System.out.println("Transferência conclúida! Vida de "+z2.nome+":"+ z2.vida);
        System.out.println("Vida de "+z1.nome+":"+ z1.vida);
    }
    else {
        System.out.println("Não foi possível transferir, pois a quantia que quer usar não é suficiente");
    }

}
