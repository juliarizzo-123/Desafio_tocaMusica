package modelos;

import calculos.Classificavel;
import modelos.Audio;

public class Podcast extends Audio implements Classificavel {
    //titulo
    //duraçao
    //total de reproduçoes
    //curtidas
    //classificaçao

    private String criador;

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }
    public void podcastPreferidos(){
        if (getCurtidas() >= 500){
            System.out.println("Um dos mais curtidos!!");
        } else if (getCurtidas() <= 200) {
            System.out.println("Virou moda!!");
        }else{
            System.out.println("Valem a pena!!");
        }
    }
    public void mostraItensPodcast(){
        System.out.println("\nPodcast: " + getTitulo());
        System.out.println("Criador: " + getCriador());
        System.out.println("Duraçao em minutos: " + getDuracao());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("O podcast recebe " + getClassificacao() + " Estrelas");
        System.out.println("Total de reproduções: " + getTotalDeReproducao());
    }

//    public String toString(){
//        String retorno = "\nMusica: " + getTitulo()+ "\n"+
//                "Cantor: " + getCriador()+"\n"+
//                "Duraçao em minutos: " + getDuracao()+"\n"+
//                "Curtidas: " + getCurtidas()+"\n"+
//                "A musica recebe " + getClassificacao() + " Estrelas \n"+
//                "Total de reproduções" + getTotalDeReproducao();
//        return retorno;
//    }
}
