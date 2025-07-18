public class Aluno extends Pessoa {

    private String escolaOndeEstuda;
    private String materiaFavorita;
    private int serieEmQueEsta;


    Aluno(){}
    Aluno(String nome,
            int idade, 
            int corDosOlhos,
            int corDecabelo,
            double altura, 
            String escolaOndeEstuda,
            String materiaFavorita,
            int serieEmQueEsta){


    public String getEscolaOndeEstuda() {
        return escolaOndeEstuda;
    }

    public void setEscolaOndeEstuda(String EscolaOndeEstuda) {
        this.escolaOndeEstuda = escolaOndeEstuda;
    }


    public String getMateriaFavorita() {
        return materiaFavorita;
    }

    public void setMateriaFavorita(String materiaFavorita) {
        this.materiaFavorita = materiaFavorita;
    }

    public String getSerieEmQueEsta() {
        return serieEmQueEsta;
    }

    public void setMateriaFavorita(String materiaFavorita) {
        this.materiaFavorita = materiaFavorita;
    }




        
    
}