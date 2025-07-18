public class Pessoa{
    private String nome;
    private int idade;
    private int corDecabelo;
    private int corDosOlhos;
    private double altura;
  

    Pessoa(){
        this.nome = nome;
        this.idade = 0;
        this.corDecabelo = corDecabelo;
        this.corDosOlhos = corDosOlhos;
        this.altura = 0;
       
    }

    public int getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

      public int getCorDeCabelo() {
        return corDecabelo;
    }

    public void setCorDeCabelo(int corDecabelo) {
        this.corDecabelo = corDecabelo;
    }

     public int getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(int corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

      public int getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
     
     //fazer overrite de exibit informações

}