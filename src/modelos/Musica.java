import modelos.Audio;

public class Musica extends Audio {
    private String cantor;
    //titulo
    //duraçao
    //total de reproduçoes
    //curtidas
    //classificaçao


    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public void mostraItensMusica(){
        System.out.println("\nMusica: " + getTitulo());
        System.out.println("Cantor: " + getCantor());
        System.out.println("Duraçao em minutos: " + getDuracao());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("A musica recebe " + getClassificacao() + " Estrelas");
    }


}
