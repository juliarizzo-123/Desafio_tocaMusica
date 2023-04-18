package modelos;

import java.util.Scanner;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducao;
    private int curtidas;
    private int classificacao;
    private int desejaCutir = 0;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public void setTotalDeReproducao(int totalDeReproducao) {
        this.totalDeReproducao = totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int setCurtidas(int curtidas) {
        this.curtidas += curtidas;
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;

    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    public void curtir() {

        System.out.println("Deseja curtir?");
        Scanner like = new Scanner(System.in);
        System.out.println("1 - Sim ou 2 - Não");
        desejaCutir = like.nextInt();
        if (desejaCutir == 1) {
            this.curtidas += 1;
            System.out.println("Curtido");
        } else if (desejaCutir == 2) {
            System.out.println("Fica pra proxima!!");
        }else {
            System.out.println("Opçao invalida, tente novamente!!!");
            curtir();


        }



    }

}