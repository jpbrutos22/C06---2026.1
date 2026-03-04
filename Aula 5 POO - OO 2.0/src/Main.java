//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main() {

    Zumbi z1 = new Zumbi();
    Zumbi z2 = new Zumbi();

    z1.nome = "João";
    z2.nome = "Maria";

    z1.vida = 100;
    z2.vida = 70;

    z1.mostraVida();
    z2.mostraVida();

    z1 = z2; //EXERCICIO 3

    //z1.transfereVida(z2, 50); EXERCICIO 2

    z1.mostraVida();
    z2.mostraVida();

    z1.vida = 123;

    z1.mostraVida();
    z2.mostraVida();
    //EXERCICIO 3
}
