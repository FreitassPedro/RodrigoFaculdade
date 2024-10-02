package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Atleta;
import model.Equipe;
import model.Medalha;
import model.Modalidade;
import model.Pais;
import model.Placar;

public class Hub {
	
	public static void main(String[] args) {
        // Criando atletas
        Atleta atleta1 = new Atleta(1, "Bruno Rezende");
        Atleta atleta2 = new Atleta(2, "Leal");
        Atleta atleta3 = new Atleta(3, "Wallace Souza");

        Atleta atleta4 = new Atleta(4, "Hugo Calderano");
        Atleta atleta5 = new Atleta(5, "Ma Long");

        Atleta atleta6 = new Atleta(6, "Inna Deriglazova");
        Atleta atleta7 = new Atleta(7, "Lee Kiefer");

        // Criando lista de atletas para a equipe de vôlei (Brasil)
        List<Atleta> atletasBrasil = new ArrayList<>();
        atletasBrasil.addAll(Arrays.asList(atleta1, atleta2, atleta3));

        List<Atleta> atletasChina = new ArrayList<>();
        atletasChina.addAll(Arrays.asList(atleta4, atleta5));
        // Criando modalidades
        Modalidade volei = new Modalidade(1, "Vôlei", true);
        Modalidade tenisMesa = new Modalidade(2, "Tênis de Mesa", false);
        Modalidade esgrima = new Modalidade(3, "Esgrima", false);
 
        // Criando equipes modalidade grupo
        Equipe equipeBrasilTenisMesa = new Equipe(3, new Pais(1, "Brasil"), atletasBrasil, tenisMesa);
        Equipe equipeChinaTenisMesa = new Equipe(2, new Pais(2, "China"), atletasChina, tenisMesa); // Equipe de um jogador no Tênis de Mesa
        // Criando equipes modalidade individual
        Equipe equipeRussiaEsgrima = new Equipe(4, new Pais(3, "Russia"), List.of(atleta6), esgrima);
        Equipe equipeUsaEsgrima = new Equipe(5, new Pais(4, "Estados Unidos"), List.of(atleta7), esgrima);

        // Define medalhas para as equipes
        equipeBrasilTenisMesa.setMedalha(Medalha.OURO);
        equipeChinaTenisMesa.setMedalha(Medalha.PRATA);
        equipeRussiaEsgrima.setMedalha(Medalha.BRONZE);
        equipeUsaEsgrima.setMedalha(Medalha.PRATA);

        // Criando placares
        Placar placarVoleiFinal = new Placar(equipeUsaEsgrima, equipeRussiaEsgrima, 3, 2);
        Placar placarTenisMesaFinal = new Placar(equipeChinaTenisMesa, equipeBrasilTenisMesa, 3, 4);
        Placar placarEsgrimaFinal = new Placar(equipeRussiaEsgrima, equipeUsaEsgrima, 15, 15);

        // Exibindo informações
        imprimirEquipeAndAltetas(List.of(equipeBrasilTenisMesa, equipeChinaTenisMesa, equipeRussiaEsgrima, equipeUsaEsgrima));
        imprimirModalidades(List.of(volei, tenisMesa, esgrima));
        imprimirPlacares(List.of(placarVoleiFinal, placarTenisMesaFinal, placarEsgrimaFinal));
    }

    
    // Métodos para imprimir informações
    public static void imprimirEquipeAndAltetas(List<Equipe> equipes) {
        System.out.println("=== Equipes e Atletas ===");
        equipes.forEach(equipe -> equipe.exibirInformacoes());
    }

    public static void imprimirModalidades(List<Modalidade> modalidades) {
        System.out.println("=== Modalidades ===");
        modalidades.forEach(modalidade -> modalidade.exibirInformacoes());
        System.out.println();
    }

    public static void imprimirPlacares(List<Placar> placares) {
        System.out.println("=== Placares ===");
        placares.forEach(placar -> placar.exibirInformacoes());
        System.out.println();
    }

}
