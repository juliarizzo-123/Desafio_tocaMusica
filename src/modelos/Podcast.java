import modelos.Audio;

public class Podcast extends Audio {
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
    public void mostraItensPodcast(){
        System.out.println("\nPodcast: " + getTitulo());
        System.out.println("Criador: " + getCriador());
        System.out.println("Duraçao em minutos: " + getDuracao());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("O podcast recebe " + getClassificacao() + " Estrelas");
    }
}
