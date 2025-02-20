package com.example;

public class jogo {

    protected Monte monte = nem Monte();
    protected Jogador jogador = new Jogador();
    protected Computado computador = new Computador();

    public Jogo (){
        monte.embaralhar();
    }

    public Carta distribuirCartaParaJogador(Jogador jogador){
        if (jogador.parou()) retunr null;
        var carta = monte.virar();
        jogador.receberCarta(carta);
        return carta;
    }

    public String resultado(){
        //  Empatou
        // Você ganhou 
        // Você perdeu

        if(jogadorEstourou() && computadorEstourou() || jogador.getPontos() == computador.getPontos()){
            return "Empatou";
        }

        if( compuntadorEstourou() || (jogador.getPontos() > computador.getPontos() && !jogadorEstourou())){
        return "Voceê ganhou";
        }

        return "Você perdeu";

    }

    public boolean acabou(){
        // alguem estourou
        //os dois pararam

        return alguemEstorou() || jogador.parou() && computador.parou();
    }

    private boolean jogadorEstourou(){
        return jogador.getPontos() > 21;
    }

    private boolean compuntadorEstourou(){
        return compuntado.getPontos() > 21;
    }

    private boolean alguemEstourou(){
        return jogadorEstourou() || computadorEstourou();
    }

}