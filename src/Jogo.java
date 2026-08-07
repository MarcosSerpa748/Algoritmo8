public class Jogo {
    private String nome;
    private Double pesoGB;
    private Integer diasSemJogar;

    public Jogo(String nome,Double pesoGB,Integer diasSemJogar){
        this.nome = nome;
        this.pesoGB = pesoGB;
        this.diasSemJogar = diasSemJogar;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPesoGB() {
        return this.pesoGB;
    }

    public void setPesoGB(Double pesoGB) {
        this.pesoGB = pesoGB;
    }

    public Integer getDiasSemJogar() {
        return this.diasSemJogar;
    }

    public void setDiasSemJogar(Integer diasSemJogar) {
        this.diasSemJogar = diasSemJogar;
    }

    @Override
    public String toString() {
        return  "Nome:"+this.nome+"\n"+
                "Peso em GigaBytes:"+this.pesoGB+"\n"+
                "Dias sem jogar:"+this.diasSemJogar+"\n";
    }
}
