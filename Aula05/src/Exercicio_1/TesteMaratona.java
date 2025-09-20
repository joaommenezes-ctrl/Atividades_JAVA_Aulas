package Exercicio_1;

public class TesteMaratona {
    public static void main(String[] args) {
    
        AtletaAmador atleta1 = new AtletaAmador("João", 17, 1.75, "Futebol");
        AtletaProfissional atleta2 = new AtletaProfissional("Maria", 20, 1.70, "Nike");
        AtletaProfissional atleta3 = new AtletaProfissional("Carlos", 16, 1.85, "Adidas");

        System.out.println(atleta1.toString());
        atleta1.verificaSituacao();

        System.out.println(atleta2.toString());
        atleta2.verificaSituacao();

        System.out.println(atleta3.toString());
        atleta3.verificaSituacao();
    }
}