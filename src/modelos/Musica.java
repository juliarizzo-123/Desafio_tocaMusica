package modelos;

import calculos.Classificavel;
import modelos.Audio;

public class Musica extends Audio implements Classificavel {
    private String cantor;

    public String getCantor() {
        return cantor;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
    public void musicasPreferidas(){
        if (getCurtidas() >= 500){
            System.out.println("Uma das mais curtidas!!");
        } else if (getCurtidas() <= 200) {
            System.out.println("Virou hit!!");
        }else{
            System.out.println("Valem a pena!!");
        }
    }
    public void mostraItensMusica(){
        System.out.println("\nMusica: " + getTitulo());
        System.out.println("Cantor: " + getCantor());
        System.out.println("Duraçao em minutos: " + getDuracao());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("A musica recebe " + getClassificacao() + " Estrelas");
        System.out.println("Total de reproduções: " + getTotalDeReproducao());

    }

//    public String toString(){
//        String retorno = "\nMusica: " + getTitulo()+ "\n"+
//       "Cantor: " + getCantor()+"\n"+
//       "Duraçao em minutos: " + getDuracao()+"\n"+
//       "Curtidas: " + getCurtidas()+"\n"+
//       "A musica recebe " + getClassificacao() + " Estrelas \n"+
//       "Total de reproduções" + getTotalDeReproducao();
//        return retorno;
//    }

}
