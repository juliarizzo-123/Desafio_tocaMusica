package calculos;

public class FiltroDeRecomendacoes {
    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Bombando no momento!! " );
        } else if (classificavel.getClassificacao() <= 2) {
            System.out.println("Para passar o tempo! ");
        }else {
            System.out.println("Experimente ");
        }
    }


}
