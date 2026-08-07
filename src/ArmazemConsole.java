import java.util.ArrayList;
import java.util.Comparator;

public class ArmazemConsole{
    ArrayList<Jogo> jogosArmazenados = new ArrayList<>();
    private Double armazenamentoDisponivel = 50.0;


    public void varrerLista(){

        for(int i =0 ;i<=jogosArmazenados.size()-1;i++){
            System.out.println(jogosArmazenados.get(i));
        }
    }

    public void baixarJogo(Jogo j){

        if (this.armazenamentoDisponivel >= j.getPesoGB()){

            this.jogosArmazenados.add(j);
            armazenamentoDisponivel -= j.getPesoGB();
            System.out.println("Jogo instalado com sucesso!");


        }else{
            this.jogosArmazenados.sort(Comparator.comparing(Jogo::getDiasSemJogar).reversed());
            System.out.println("Espaço insufiente! Você tem "+this.armazenamentoDisponivel+" e o jogo pesa "+j.getPesoGB()+" . Eu irei remover alguns jogos antigos...");

            do {
                Jogo jogoAntigo = this.jogosArmazenados.getFirst();
                this.jogosArmazenados.remove(jogoAntigo);
                this.armazenamentoDisponivel += jogoAntigo.getPesoGB();

            }while(this.armazenamentoDisponivel < j.getPesoGB());

            this.jogosArmazenados.add(j);
            this.armazenamentoDisponivel -= j.getPesoGB();
            System.out.println("Pronto! o jogo "+j.getNome()+" foi instalado com sucesso!");

        }
    }

    public Double getArmazenamentoDisponivel() {
        return armazenamentoDisponivel;
    }
}
