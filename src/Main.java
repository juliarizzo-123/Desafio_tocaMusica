import calculos.Classificavel;
import calculos.FiltroDeRecomendacoes;
import modelos.Audio;
import modelos.Musica;
import modelos.Podcast;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Musica musica1 = new Musica();
        musica1.setCantor("Gustavo Lima");
        musica1.setTitulo("milu");
        musica1.setDuracao(2);
        musica1.setCurtidas(1000);
        musica1.setTotalDeReproducao(5000);
        musica1.setClassificacao(4);


        Musica musica2 = new Musica();
        musica2.setCantor("fulano");
        musica2.setTitulo("sla");
        musica2.setDuracao(3);
        musica2.setCurtidas(100);
        musica2.setTotalDeReproducao(200);
        musica2.setClassificacao(2);


        Podcast podcast1 = new Podcast();
        podcast1.setCriador("Thiago Nigro");
        podcast1.setTitulo("Vivendo de renda");
        podcast1.setDuracao(180);
        podcast1.setCurtidas(100);
        podcast1.setTotalDeReproducao(200);
        podcast1.setClassificacao(3);

        Podcast podcast2 = new Podcast();
        podcast2.setCriador("cara");
        podcast2.setTitulo("algum podcast");
        podcast2.setDuracao(200);
        podcast2.setCurtidas(300);
        podcast2.setTotalDeReproducao(200);
        podcast2.setClassificacao(5);


        int reproduzir = 0;
        while (reproduzir != 5){

            System.out.println("Bem vindo ao toca musicas!!");
            FiltroDeRecomendacoes filtro = new FiltroDeRecomendacoes();
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - " + musica1.getTitulo() +"\n2 - " +  musica2.getTitulo() +"\n3 - " + podcast1.getCriador()+"\n4 - " + podcast2.getCriador()+"\n5 - Sair \nO que voce deseja reproduzir?" );
            reproduzir = scanner.nextInt();

            if (reproduzir == 1){
                musica1.mostraItensMusica();
                filtro.filtra( musica1);
                musica1.musicasPreferidas();
                musica1.curtir();
                musica1.setTotalDeReproducao(musica1.getTotalDeReproducao()+1);

            } else if (reproduzir == 2) {
                musica2.mostraItensMusica();
                filtro.filtra( musica2);
                musica2.musicasPreferidas();
                musica2.curtir();
                musica2.setTotalDeReproducao(musica2.getTotalDeReproducao()+1);
            } else if (reproduzir == 3) {
                podcast1.mostraItensPodcast();
                filtro.filtra( podcast1);
                podcast1.podcastPreferidos();
                podcast1.curtir();
                podcast1.setTotalDeReproducao(podcast1.getTotalDeReproducao()+1);
            } else if (reproduzir == 4) {
                podcast2.mostraItensPodcast();
                filtro.filtra( podcast2);
                podcast2.podcastPreferidos();
                podcast2.curtir();
                podcast2.setTotalDeReproducao(podcast2.getTotalDeReproducao()+1);
            }else {
                System.out.println("Volte sempre");
            }

        }


    }

}
