

public class Main {
    public static void main(String[] args) {
        ArmazemConsole a = new ArmazemConsole();
        System.out.println(a.getArmazenamentoDisponivel());
        Jogo j1 = new Jogo("Gears of war",5.9,2);
        Jogo j2 = new Jogo("Assassin Creed",8.9,7);
        Jogo j3 = new Jogo("Call of Duty",3.7,5);
        Jogo j4 = new Jogo("Minecraft",11.0,15);
        Jogo j5 = new Jogo("Alan Wake",5.5,8);
        Jogo j6 = new Jogo("GTA",16.0,0);

        a.baixarJogo(j1);
        a.baixarJogo(j2);
        a.baixarJogo(j3);
        a.baixarJogo(j4);
        a.baixarJogo(j5);
        a.baixarJogo(j6);

        System.out.println(a.getArmazenamentoDisponivel());
        System.out.println();
        a.varrerLista();



    }
}