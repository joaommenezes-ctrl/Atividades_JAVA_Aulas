package Aplicação;

import Atletas_Olimpíadas.Atleta;
import Atletas_Olimpíadas.Pais;

public class TestaAtleta {
    public static void main(String[] args) {
        Pais brasil = new Pais("Brasil");
        Pais eua = new Pais("EUA");

        Atleta a1 = new Atleta("Anderson Silva", 84, brasil);
        Atleta a2 = new Atleta("Jon Jone", 55, eua);
        Atleta a3 = new Atleta("Vitor Belfort", 93, brasil);

        System.out.println("O atleta " + a1.getNome() + " " + a1.verificaSituacao());
        System.out.println("O atleta " + a2.getNome() + " " + a2.verificaSituacao());
        System.out.println("O atleta " + a3.getNome() + " " + a3.verificaSituacao());

        System.out.println("Total de Participantes: " + Atleta.getTotalParticipantes());
    }
}