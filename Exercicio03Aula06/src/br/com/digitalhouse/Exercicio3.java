package br.com.digitalhouse;

public class Exercicio3 {

    public static void main(String[] args) {

        Atleta atletaA = new Atleta();
        atletaA.setNome("Rodrigo");
        atletaA.setEnergia(100);
        atletaA.setNivel(50);

        Prova provaA = new Prova();
        provaA.setDificuldade(200);
        provaA.setEnergiaNecessaria(40);

        provaA.podeRealizar(atletaA);


    }




}
